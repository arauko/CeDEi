package Taller;

public class Cliente extends Reparacion {

	protected String apellidos;
	protected String dni;
	protected int edad;
	protected String nombre;
	
	public Cliente(Vehiculo coch, String date, String time, double repair, String dNI, String name, String surName, int age){
	
		super(coch, date, time, repair);
		setDni(dNI);
		setNombre(name);
		setApellidos(surName);
		setEdad(age);
		
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getDni() {
		return dni;
	}
	public int getEdad() {
		return edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
