package MyClass;


public class cocheDeportivo extends vehiculo{

	private String capacidadMotor;
	private int maxVelocidad;
	
	
	
	public cocheDeportivo(String mat, int np, int nr, String mod){
	super(mat, np, nr, mod);
	}
	
	public void setCapacidadMotor(String cm) {
	
		this.capacidadMotor = cm;
		
	}
	
	public void setVelocidadMaxima(int vm){
		
		this.maxVelocidad = vm;
	}
	
	public String getCapacidadMotor(){
		return capacidadMotor;
	}
	
	public int getVelocidadMaxima(){
		return maxVelocidad;
	}
	
}
