package tp8poo;

public class Ej1Runnable implements Runnable{
	private String nombre;
	
	public Ej1Runnable(String nombre) {
		super();
		this.nombre=nombre;
	}
	public String getName() {
		return nombre;
	}
	public void setName(String nombre) {
		this.nombre=nombre;
	}
	@Override
	public void run() {
		for (int i=0;i<1000;i++) {
			System.out.println(i+" "+getName());
		}
		System.out.println("Hecho "+getName());
	}
}