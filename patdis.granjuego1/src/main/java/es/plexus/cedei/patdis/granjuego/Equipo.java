/**
 * Equipo.java  
 */
package es.plexus.cedei.patdis.granjuego;

import es.plexus.cedei.patdis.granjuego.piezas.Construccion;
import es.plexus.cedei.patdis.granjuego.piezas.TipoPieza;
import es.plexus.cedei.patdis.granjuego.piezas.UnidadMovil;


/**
 * es.plexus.cedei.patdis.granjuego.Equipo
 *
 *
 */
public class Equipo {

  private String nombre;
  private Pieza nido;
  
  public Equipo(String nombre, Tablero tablero) {
    super();
    this.nombre = nombre;
    System.out.println("Generando " + nombre);
    this.nido = Construccion.crear(TipoPieza.NIDO, this);
  }
  
  public String getNombre() {
    return nombre;
  }

  @Override
  public String toString() {
    return nombre;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
    return result;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Equipo other = (Equipo) obj;
    if (nombre == null) {
      if (other.nombre != null)
        return false;
    } else if (!nombre.equals(other.nombre))
      return false;
    return true;
  }

  
  /**
   * @return the nido
   */
  public Pieza getNido() {
    return nido;
  }

  public Construccion crearConstruccion(TipoPieza tipoPieza) {
    return Construccion.crear(tipoPieza, this);
  }

  public UnidadMovil crearUnidadMovil(TipoPieza tipoPieza) {
    return UnidadMovil.crear(tipoPieza, this);
  }

}
