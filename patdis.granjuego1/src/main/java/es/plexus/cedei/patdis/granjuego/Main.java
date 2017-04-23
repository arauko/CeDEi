/**
 * Main.java  
 */
package es.plexus.cedei.patdis.granjuego;

import es.plexus.cedei.patdis.granjuego.piezas.ConjuntoDeUnidadesMoviles;
import es.plexus.cedei.patdis.granjuego.piezas.TipoPieza;
import es.plexus.cedei.patdis.granjuego.piezas.UnidadMovil;


/**
 * es.plexus.cedei.patdis.granjuego.Main
 *
 *
 */
public class Main {

  public Main() {
    super();
  }

  public static void main(String[] args) {
    final Partida partida = Partida.getInstancia().init(4);
    
    Turno turno = partida.nuevoTurno();
    System.out.println("Este es el " + turno.getEquipo().getNombre());
    turno.getEquipo().crearUnidadMovil(TipoPieza.MINERO).nacer();
    
    turno = partida.nuevoTurno();
    //System.out.println("Este es el " + turno.getEquipo().getNombre());
    
    turno = partida.nuevoTurno();
    
    final UnidadMovil jinete1 = turno.getEquipo().crearUnidadMovil(TipoPieza.JINETE).nacer();
    final UnidadMovil jinete2 = turno.getEquipo().crearUnidadMovil(TipoPieza.JINETE).nacer();
    final ConjuntoDeUnidadesMoviles conjunto = new ConjuntoDeUnidadesMoviles(turno.getEquipo());
    conjunto.add(jinete1);
    conjunto.add(jinete2);
    conjunto.desplazarseA(Movimiento.IZQ, 3);
    
    final WindowIterator iterador = partida.getTablero().iterador(0, 10);
    while (iterador.hasNext()) {
      System.out.println("Pieza en ventana: " + iterador.next().getDescripcion());
    }
  }
}
