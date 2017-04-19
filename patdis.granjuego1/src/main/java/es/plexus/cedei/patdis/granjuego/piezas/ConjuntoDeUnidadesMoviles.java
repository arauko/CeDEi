/**
 * ConjuntoDeUnidadesMoviles.java  
 */
package es.plexus.cedei.patdis.granjuego.piezas;

import java.util.HashSet;
import java.util.Set;

import es.plexus.cedei.patdis.granjuego.Equipo;
import es.plexus.cedei.patdis.granjuego.Movimiento;


/**
 * es.plexus.cedei.patdis.granjuego.piezas.ConjuntoDeUnidadesMoviles
 *
 * @author OTP-PLATINO (2017).
 *
 */
public class ConjuntoDeUnidadesMoviles extends UnidadMovil {

  Set<UnidadMovil> unidadesMoviles;
  
  /**
   * @param equipo
   * @param descripcion
   */
  public ConjuntoDeUnidadesMoviles(Equipo equipo) {
    super(equipo, "conjunto de unidades");
    unidadesMoviles = new HashSet<UnidadMovil>();
  }

  public void add(UnidadMovil unidadMovil) {
    unidadesMoviles.add(unidadMovil);
  }
  
  @Override
  public void desplazarseA(Movimiento movimiento, int cantidad) {
    for (int i = 0; i < cantidad; i++) {
      for (UnidadMovil unidadMovil : unidadesMoviles) {
        unidadMovil.mover(movimiento, 1);
      }
    }
  }
}
