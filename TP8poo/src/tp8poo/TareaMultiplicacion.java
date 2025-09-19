package tp8poo;

import java.util.ArrayList;

public class TareaMultiplicacion implements Runnable{
	private double[][] A;
	private double[][] B;
	private double[][] C;
	private int fila;
	private int col;
	
	public TareaMultiplicacion(double[][] A,double[][] B,double[][] C,int fila,int col) {
		this.A=A;
		this.B=B;
		this.C=C;
		this.fila=fila;
		this.col=col;
	}
	
	@Override
	public void run() {
		double c=0.0;
		for(int i=0;i<A[0].length;i++) {
			c+=A[fila][i]*B[i][col];
		}
		C[fila][col]=c;
	}	
}
