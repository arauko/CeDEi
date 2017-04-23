package MyClass;


public class coche extends vehiculo {

	private boolean airbags;
	
	public coche(String mat, int np, int nr, String mod){
		super(mat, np, nr, mod);
	}
	
	public void setAirbags(Boolean ab) {
	
		airbags = ab;
	}
	
	public boolean isAirbags() {
	
		return airbags;
	}

}
