package tp8poo;

public class Ej1Thread extends Thread{
	public Ej1Thread(String nombre) {
		super(nombre);
	}
	public void run() {
		for (int i=0;i<1000;i++) {
			System.out.println(i+" "+getName());
			try {
				sleep((int)(Math.random()*1000));
			}
			catch(InterruptedException e) {
				Thread.currentThread().interrupt();
				System.err.println("Hilo interrumpido: "+e.getMessage());
			}
		}
		System.out.println("Hecho "+getName());
	}
}