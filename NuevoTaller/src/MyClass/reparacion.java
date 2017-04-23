package MyClass;


public class reparacion {

	protected cliente cliente;
	protected vehiculo vehiculo;
	protected String fecha;
	protected String tiempo;
	protected double totalReparacion;
	
	public reparacion(cliente client, vehiculo veh, String date, String time, Double cost){
	
		this.cliente = client;
		this.vehiculo = veh;
		this.fecha = date;
		this.tiempo = time;
		this.totalReparacion = cost;
		
	}

	public cliente getCliente() {
	
		return cliente;
	}
	
	public vehiculo getVehiculo() {
	
		return vehiculo;
	}
	
	public String getFecha() {
	
		return fecha;
	}
	
	public String getTiempo() {
	
		return tiempo;
	}
	
	public double getTotalReparacion() {
	
		return totalReparacion;
	}
	
	public void setCliente(cliente cliente) {
	
		this.cliente = cliente;
	}
	
	public void setVehiculo(vehiculo vehiculo) {
	
		this.vehiculo = vehiculo;
	}

	public void setFecha(String fecha) {
	
		this.fecha = fecha;
	}
	
	public void setTiempo(String tiempo) {
	
		this.tiempo = tiempo;
	}
	
	public void setTotalReparacion(double totalReparacion) {
	
		this.totalReparacion = totalReparacion;
	}
}
