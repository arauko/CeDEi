/**
 * Pieza.java  
 */
package es.plexus.cedei.patdis.granjuego;



/**
 * es.plexus.cedei.patdis.granjuego.Pieza
 *
 *
 */
public abstract class Pieza {

  private Equipo equipo;
  private String descripcion;
  private int salud;
  
  private int pos;
  
  /**
   * 
   */
  public Pieza(Equipo equipo, String descripcion) {
    super();
    this.equipo = equipo;
    this.descripcion = descripcion;
    this.salud = 100;
    this.pos = Tablero.POS_FUERA;
    System.out.println("Creado " + descripcion + " de " + equipo.getNombre());
  }
  
  /**
   * @return the equipo
   */
  public Equipo getEquipo() {
    return equipo;
  }
  
  /**
   * @return the descripcion
   */
  public String getDescripcion() {
    return descripcion;
  }
  
  /**
   * @return the salud
   */
  public int getSalud() {
    return salud;
  }

  public void setPos(int pos) {
    this.pos = pos;
  }

  
  /**
   * @return the pos
   */
  public int getPos() {
    return pos;
  }

  public Pieza mover(Movimiento movimiento, int cantidad) {
    Partida.getInstancia().getTablero().moverPieza(this, movimiento, cantidad);
    return this;
  }

}
