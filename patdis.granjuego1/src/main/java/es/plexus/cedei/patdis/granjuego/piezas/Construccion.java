/**
 * Construccion.java  
 */
package es.plexus.cedei.patdis.granjuego.piezas;

import es.plexus.cedei.patdis.granjuego.Equipo;
import es.plexus.cedei.patdis.granjuego.Pieza;


/**
 * es.plexus.cedei.patdis.granjuego.Construccion
 *
 * @author OTP-PLATINO (2017).
 *
 */
public class Construccion extends Pieza {

  int nivelConstruido;
  
  /**
   * @param equipo
   * @param descripcion
   */
  public Construccion(Equipo equipo, String descripcion) {
    super(equipo, descripcion);
  }

  public static Construccion crear(TipoPieza tipo, Equipo equipo) {
    if (tipo.equals(TipoPieza.NIDO)) {
      return new Nido(equipo);
    } else {
      throw new RuntimeException("Error interno: tipo de construcción desconocida al crear");
    }
  }
  
  /**
   * @return the nivelConstruido
   */
  public int getNivelConstruido() {
    return nivelConstruido;
  }

  
  /**
   * @param nivelConstruido the nivelConstruido to set
   */
  public void setNivelConstruido(int nivelConstruido) {
    this.nivelConstruido = nivelConstruido;
  }

}
