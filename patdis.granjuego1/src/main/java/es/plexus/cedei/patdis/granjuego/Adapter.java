package es.plexus.cedei.patdis.granjuego;

import patdis.es.FomatText.FormatoTexto;

public class Adapter extends FormatoTexto{
	
	private static Adapter instance;

	private Adapter(Object cosa, String msg){
		adapterPrint(cosa, msg);
	}
	
	public static Adapter getInstance(Object equipo){
		/*if (instance == null){
			instance = new Adapter(equipo.toString(), "Te toca");
		}*/
		if (equipo instanceof Equipo){
			instance = new Adapter(equipo.toString(), "Te toca");
		}
		return instance;
	}
	
}
