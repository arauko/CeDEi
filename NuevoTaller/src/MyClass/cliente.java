package MyClass;


public class cliente extends reparacion{

	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	
	
	
	public cliente(cliente client, vehiculo car, String date, String time, Double cost,String dNI, String name, String surName, int age){
		super(client, car, date, time, cost);
		
	}



	
	public String getDni() {
	
		return dni;
	}



	
	public String getNombre() {
	
		return nombre;
	}



	
	public String getApellidos() {
	
		return apellidos;
	}



	
	public int getEdad() {
	
		return edad;
	}



	
	public void setDni(String dni) {
	
		this.dni = dni;
	}



	
	public void setNombre(String nombre) {
	
		this.nombre = nombre;
	}



	
	public void setApellidos(String apellidos) {
	
		this.apellidos = apellidos;
	}



	
	public void setEdad(int edad) {
	
		this.edad = edad;
	}
	
}
