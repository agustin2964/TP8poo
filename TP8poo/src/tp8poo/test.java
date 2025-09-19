package tp8poo;

import java.util.Arrays;

class test {
	public static void main(String[]args){
		//EJ1
		/*Ej1Thread t1=new Ej1Thread("A");
		t1.start();		
		Ej1Thread t2=new Ej1Thread("B");
		t2.start();*/
		
		/*Ej1Runnable tarea1=new Ej1Runnable("C");
		Ej1Runnable tarea2=new Ej1Runnable("D");
		Thread t1=new Thread(tarea1,"C");
		Thread t2=new Thread(tarea2,"D");
		t1.start();
		t2.start();*/
		//Al usar implements Runnable, todavia se puede heredar de otra clase y no es  necesario implementar un try, catch
		
		double[][] A= {
				{1.0,2.0,3.0},
				{4.0,5.0,6.0}
		};
		double[][] B= {
				{1.0,2.0},
				{3.0,4.0},
				{5.0,6.0}
		};
		System.out.println(Arrays.deepToString(Multiplicar.mult(A,B)));
	}
}
