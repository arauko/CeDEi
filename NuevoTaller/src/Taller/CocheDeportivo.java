package Taller;

public class CocheDeportivo extends Vehiculo{
	
	protected String capacidadMotor;
	protected int velocidadMaxima;
	
	public CocheDeportivo(String mat, int np, int nr, String mod, String cm, int vm){
		super(mat, np, nr, mod);
		this.capacidadMotor = cm;
		this.velocidadMaxima = vm;
	}
	
	public String getCapacidadMotor() {
		return capacidadMotor;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setCapacidadMotor(String cm) {
		this.capacidadMotor = cm;
	}
	public void setVelocidadMaxima(int vm) {
		this.velocidadMaxima = vm;
	}

}
