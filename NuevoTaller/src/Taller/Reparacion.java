package Taller;

public class Reparacion{

	public Vehiculo vehiculo;
	public String fecha;
	public String tiempo;
	public double totalReparacion;
	
	public Reparacion(Vehiculo coch, String date, String time, double repair){
		
		setVehiculo(coch);
		setFecha(date);
		setTiempo(time);
		setTotalReparacion(repair);
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
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	
	public void setTotalReparacion(double totalReparacion) {
		this.totalReparacion = totalReparacion;
	}

	
	public Vehiculo getVehiculo() {
	
		return vehiculo;
	}

	
	public void setVehiculo(Vehiculo coch) {
	
		this.vehiculo = coch;
	}
	
	
	
}
