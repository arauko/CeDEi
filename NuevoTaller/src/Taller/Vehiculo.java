package Taller;

public class Vehiculo {
	
	protected String matricula, modelo;
	protected int noPuertas, noRuedas;
	
	public Vehiculo(String mat, int np, int nr, String mod){
		this.matricula = mat;
		this.noPuertas = np;
		this.noRuedas = nr;
		this.modelo = mod;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public String getModelo() {
		return modelo;
	}
	
	public int getNoPuertas() {
		return noPuertas;
	}
	
	public int getNoRuedas() {
		return noRuedas;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setNoPuertas(int noPuertas) {
		this.noPuertas = noPuertas;
	}

	public void setNoRuedas(int noRuedas) {
		this.noRuedas = noRuedas;
	}
	
	
	

}
