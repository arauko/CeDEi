/**
 * WindowIterator.java  
 */
package es.plexus.cedei.patdis.granjuego;

import java.util.Iterator;


/**
 * es.plexus.cedei.patdis.granjuego.WindowIterator
 *
 * @author OTP-PLATINO (2017).
 *
 */
public class WindowIterator {

  private int marginRight;
  
  private int casillaActual;
  private Iterator<Pieza> iteradorDeCasilla;

  public WindowIterator(int marginLeft, int marginRight) {
    super();
    this.marginRight = marginRight;
    casillaActual = marginLeft;
    iteradorDeCasilla = Partida.getInstancia().getTablero().getPiezasAt(marginLeft).iterator();
  }
  
  public boolean hasNext() {
    if (iteradorDeCasilla.hasNext()) {
      return true;
    } else {
      boolean encontradoSiguiente = false;
      final Tablero tablero = Partida.getInstancia().getTablero();
      while ( ! encontradoSiguiente && casillaActual < marginRight) {
        casillaActual++;
        int casillaAdaptada = tablero.adaptarATableroInfinito(casillaActual);
        iteradorDeCasilla = tablero.getPiezasAt(casillaAdaptada).iterator();
        if (iteradorDeCasilla.hasNext()) {
          return true;
        }
      }
      return false;
    }
  }
  
  public Pieza next() {
    if (iteradorDeCasilla.hasNext()) {
      return iteradorDeCasilla.next();
    } else {
      boolean encontradoSiguiente = false;
      final Tablero tablero = Partida.getInstancia().getTablero();
      while ( ! encontradoSiguiente && casillaActual < marginRight) {
        casillaActual++;
        int casillaAdaptada = tablero.adaptarATableroInfinito(casillaActual);
        iteradorDeCasilla = tablero.getPiezasAt(casillaAdaptada).iterator();
        if (iteradorDeCasilla.hasNext()) {
          encontradoSiguiente = true;
        }
      }
      if (encontradoSiguiente) {
        return iteradorDeCasilla.next();
      } else {
        throw new RuntimeException("El iterador de ventana no tiene más elementos");
      }
    }
  }
}
