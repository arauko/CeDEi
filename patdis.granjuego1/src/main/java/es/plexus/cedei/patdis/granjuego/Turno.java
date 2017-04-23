/**
 * Turno.java  
 */
package es.plexus.cedei.patdis.granjuego;


/**
 * es.plexus.cedei.patdis.granjuego.Turno
 *
 *
 */
public class Turno {

  private Equipo equipo;
  
  public Turno(Equipo equipo) {
    super();
    this.equipo = equipo;
    Adapter.getInstance(equipo);
    //System.out.println("Turno para " + equipo.getNombre());
  }

  public Equipo getEquipo() {
    return equipo;
  }
  
}
