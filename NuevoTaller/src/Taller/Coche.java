package Taller;

public class Coche extends Vehiculo {

	protected boolean airbags;
	
	public Coche(String mat, int np, int nr, String mod, boolean ab){
		super(mat, np, nr, mod);
		this.airbags = ab;
	}

	public boolean isAirbags() {
		return airbags;
	}

	public void setAirbags(boolean a) {
		this.airbags = a;
	}
	
	
	
}
