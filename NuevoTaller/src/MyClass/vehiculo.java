package MyClass;


public class vehiculo {

	
	private String matricula;
	private int noPuertas; 
	private int noRuedas; 
	private String modelo; 
	
	
	public vehiculo(String mat, int np, int nr, String mod){
		this.matricula = mat;
		this.noPuertas = np;
		this.noRuedas = nr;
		this.modelo = mod;
	} 
	
	
	
	public String getMatricula() {
	
		return matricula;
	}
	
	public int getNoPuertas() {
	
		return noPuertas;
	}
	
	public int getNoRuedas() {
	
		return noRuedas;
	}

	public String getModelo() {
	
		return modelo;
	}
	
	public void setMatricula(String matricula) {
	
		this.matricula = matricula;
	}
	
	public void setNoRuedas(int noRuedas) {
	
		this.noRuedas = noRuedas;
	}
	
	public void setModelo(String modelo) {
	
		this.modelo = modelo;
	}

	public void setNoPuertas(int np) {
	 noPuertas = np; 
	} 
		
}
