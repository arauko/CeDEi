/**
 * UnidadMovil.java  
 */
package es.plexus.cedei.patdis.granjuego.piezas;

import es.plexus.cedei.patdis.granjuego.Equipo;
import es.plexus.cedei.patdis.granjuego.Movimiento;
import es.plexus.cedei.patdis.granjuego.Partida;
import es.plexus.cedei.patdis.granjuego.Pieza;


/**
 * es.plexus.cedei.patdis.granjuego.UnidadMovil
 *
 * @author OTP-PLATINO (2017).
 *
 */
public class UnidadMovil extends Pieza {

  public UnidadMovil(Equipo equipo, String descripcion) {
    super(equipo, descripcion);
  }

  public UnidadMovil nacer() {
    Partida.getInstancia().getTablero().addPieza(this, getEquipo().getNido().getPos());
    return this;
  }

  public static UnidadMovil crear(TipoPieza tipo, Equipo equipo) {
    if (tipo.equals(TipoPieza.MINERO)) {
      return new Minero(equipo);
    } else if (tipo.equals(TipoPieza.JINETE)) {
        return new Jinete(equipo);
    } else {
      throw new RuntimeException("Error interno: tipo de unidad móvil desconocida al crear");
    }
  }
  

  public void desplazarseA(Movimiento movimiento, int cantidad) {
    for (int i = 0; i < cantidad; i++) {
      mover(movimiento, 1);
    }
  }
}
