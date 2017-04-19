/**
 * Tablero.java  
 */
package es.plexus.cedei.patdis.granjuego;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * es.plexus.cedei.patdis.granjuego.Tablero
 *
 *
 */
public class Tablero {

  List<Set<Pieza>> piezas;
  
  public static final int POS_FUERA = -1;
  
  /**
   * 
   */
  public Tablero(int numCasillas) {
    super();
    validarNumCasillas(numCasillas);
    System.out.println("Se crea tablero de " + numCasillas + " casillas.");
    piezas = new ArrayList<Set<Pieza>>();
    rellenarPiezas(numCasillas);
  }

  private void validarNumCasillas(int numCasillas) {
    if (numCasillas < 1) {
      throw new RuntimeException("El tablero debe tener al menos 1 casilla");
    }
  }

  private void rellenarPiezas(int numCasillas) {
    for (int i = 0; i < numCasillas; i++) {
      piezas.add(new HashSet<Pieza>());
    }
  }

  public void addPieza(Pieza pieza, int pos) {
    piezas.get(pos).add(pieza);
    pieza.setPos(pos);
    System.out.println("Se añade " + pieza.getDescripcion() + " de " + 
                      pieza.getEquipo().getNombre() + " en casilla " + pos);
  }
  
  public void quitarPieza(Pieza pieza) {
    int pos = pieza.getPos();
    if (pos == POS_FUERA) {
      throw new RuntimeException("Pieza ya está fuera");
    }
    validarPos(pos);    
    final Set<Pieza> piezasEnEsaPos = piezas.get(pos);
    if ( ! piezasEnEsaPos.contains(pieza)) {
      throw new RuntimeException("Error interno: no existe pieza en la posición indicada por la pieza");
    }
    piezasEnEsaPos.remove(pieza);
    pieza.setPos(POS_FUERA);
    System.out.println("Se quita " + pieza.getDescripcion() + " de " + 
        pieza.getEquipo().getNombre());
  }
  
  public void moverPieza(Pieza pieza, Movimiento movimiento, int cantidad) {
    int pos = pieza.getPos();
    if (pos == POS_FUERA) {
      throw new RuntimeException("Pieza estaba fuera. No se puede mover");
    }
    final Set<Pieza> piezasPosActual = piezas.get(pos);
    if (! piezasPosActual.contains(pieza)) {
      throw new RuntimeException("Error interno: no existe pieza en la posición indicada por la pieza");
    }
    cantidad = cantidad % size();
    validarCantidadMovimiento(cantidad);
    int movimientoAbsoluto;
    if (movimiento.equals(Movimiento.IZQ)) {
      movimientoAbsoluto = - cantidad;
    } else {
      movimientoAbsoluto = cantidad;
    }
    int nuevaPos = pos + movimientoAbsoluto;
    moverPieza(pieza, nuevaPos);
  }

  public void moverPieza(Pieza pieza, int nuevaPos) {
    int pos = pieza.getPos();
    if (pos == POS_FUERA) {
      throw new RuntimeException("Pieza estaba fuera. No se puede mover");
    }
    final Set<Pieza> piezasPosActual = piezas.get(pos);
    if (! piezasPosActual.contains(pieza)) {
      throw new RuntimeException("Error interno: no existe pieza en la posición indicada por la pieza");
    }
    nuevaPos = adaptarATableroInfinito(nuevaPos);
    piezasPosActual.remove(pieza);
    final Set<Pieza> piezasNuevaPos = piezas.get(nuevaPos);
    piezasNuevaPos.add(pieza);
    pieza.setPos(nuevaPos);
    System.out.println("Se mueve " + pieza.getDescripcion() + " de " + 
        pieza.getEquipo().getNombre() + " de casilla " + pos + " a " + nuevaPos);
  }

  public int adaptarATableroInfinito(int nuevaPos) {
    if (nuevaPos < 0) {
      return size() + nuevaPos;
    } else if (nuevaPos >= size()) {
      return nuevaPos - size();
    } else {
      return nuevaPos;
    }
  }

  private void validarCantidadMovimiento(int cantidad) {
    if (cantidad < 0) {
      throw new RuntimeException("No puede haber un movimiento negativo: " + cantidad);
    }
  }

  public Set<Pieza> getPiezasAt(int pos) {
    validarPos(pos);
    return piezas.get(pos);
  }

  private void validarPos(int pos) {
    if (pos < 0 || pos > piezas.size() - 1) {
      throw new RuntimeException("No existe la posición " + pos + ". Debe estar entre 0 y " + (piezas.size() - 1));
    }
  }
  
  public int size() {
    return piezas.size();
  }

  public WindowIterator iterador(int marginLeft, int marginRight) {
    return new WindowIterator(marginLeft, marginRight);
  }
}
