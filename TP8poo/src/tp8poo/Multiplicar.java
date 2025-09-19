package tp8poo;

import java.util.ArrayList;
import java.util.Arrays;

public class Multiplicar {
	public static double[][] C;
	private ArrayList<Thread> hilos;
	
	public Multiplicar(){
		super();
	}
	
	public static double[][] mult(double[][] A,double[][] B){
		if (A[0].length!=B.length) {
			System.out.println("Matrizes no validas para multiplicacion");
			return null;
		}	
		double[][] C=new double[A.length][B[0].length];
		ArrayList<Thread> hilos= new ArrayList<>();
		for (int i=0;i<C.length;i++) {
			for (int j=0;j<C[i].length;j++) {
				hilos.add(new Thread(new TareaMultiplicacion(A,B,C,i,j)));
			}
		}
		
		for (Thread hilo:hilos) {
			hilo.start();
		}
		
		for (Thread hilo:hilos) {
			try {
				hilo.join();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return C;
	}
	
}