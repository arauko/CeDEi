/**
 * Partida.java  
 */
package es.plexus.cedei.patdis.granjuego;




/**
 * es.plexus.cedei.patdis.granjuego.Partida
 *
 *
 */
public class Partida {

	public static Turno turnoActual;
  private Equipo[] equipos;
  private int nextTurno;
  private Tablero tablero; 
  
  private static Partida instancia;

  private Partida() {
    super();
  }
  
  public static final Partida getInstancia() {
    if (instancia == null) {
      instancia = new Partida();
    }
    return instancia;
  }
  
  public Partida init(int numEquipos) {
    validarNumEquipos(numEquipos);
    equipos = new Equipo[numEquipos];
    nextTurno = 0;
    tablero = new Tablero(numEquipos * 10);
    generarEquipos(numEquipos);
    ponerNidosEnTablero();
    return this;
  }

  private void validarNumEquipos(int numEquipos) {
    if (numEquipos < 2) {
      throw new RuntimeException("Deben ser al menos 2 equipos");
    }
  }

  private void generarEquipos(int numEquipos) {
    for (int i = 1; i <= numEquipos; i++) {
      equipos[i - 1] = new Equipo("equipo " + i, tablero);
    }
  }

  public Turno nuevoTurno() {
    if (nextTurno >= equipos.length) {
      nextTurno = 0;
    }
    Equipo nextEquipo = equipos[nextTurno++];
    return new Turno(nextEquipo);
  }

  private void ponerNidosEnTablero() {
    int size = tablero.size();
    int distancia = size / equipos.length;
    int posIni = distancia / 2;
    int nextPos = posIni;
    for (int i = 0; i < equipos.length; i++) {
      tablero.addPieza(equipos[i].getNido(), nextPos);
      nextPos += distancia;
    }
  }

  
  /**
   * @return the tablero
   */
  public Tablero getTablero() {
    return tablero;
  }

}
