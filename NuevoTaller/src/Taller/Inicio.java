package Taller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

public class Inicio {
	
	//////////-ATRIBUTOS-////////////////////-ATRIBUTOS-////////////////////-ATRIBUTOS-////////////////////-ATRIBUTOS-//////////////////////////
	
	private int elec, elec2, elec3, elec4;
	private int opc;
	
	HashMap <String, Vehiculo> lista = new HashMap<String, Vehiculo>();
	HashMap <String, Cliente> client = new HashMap<String,Cliente>();
	HashMap <Vehiculo, Cliente> general = new HashMap<Vehiculo, Cliente>();
	
	private String[] tall = {"Añadir Vehiculo", "Buscar Vehiculo", "Volver"};
	private String[] menu = {"Tienda" , "Taller" , "Consulta" , "Salir"};
	private String[] edit = {"Modificar", "Eliminar", "Volver"};
	private String[] consulta = {"Buscar Cliente", "Lista clientes", "Volver"};
	private String result, result2 = "";
	private String[] opciones = {"Añadir Vehiculo", "Buscar Vehiculo", "Listar todo", "Salir", "TEST"};
	private String[] sino = {"Si","No"};
	
	//////////-INICIO-////////////////////-INICIO-////////////////////-INICIO-////////////////////-INICIO-////////////////////-INICIO-//////////

	public static void main(String[] args) {
		
		Inicio obj = new Inicio();
		
		//obj.menuPrincipal();
		
	}
	
	//////////-MENU-//////////////////////-MENU-//////////////////////-MENU-//////////////////////-MENU-//////////////////////-MENU-////////////
	/*
	public void menuPrincipal(){
		
		do{
			elec2 = JOptionPane.showOptionDialog(null, "¿Qué desea hacer?", "Gestor", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
			switch(elec2){
			case 0:
				menuTienda();
				break;
			case 1:
				menuTaller();
				break;
			case 2:
				consult();
				break;
			}
			
		}while (elec2 != 3);
	}
	
	public void menuTienda(){
		do{
			result ="";
			result2 = "___Deportivos___\n";
			opc = JOptionPane.showOptionDialog(null, "¿Qué operación desea realizar?", "Gestor", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
			switch (opc){
			case 0:
				addCoche();
				break;
			case 1:
				buscarCoche();
				break;
			case 2:
				listaCoches();
				break;
			case 3:
				break;
			}
		}while (opc !=3 );
	}
	
	public void menuTaller() {

		do{
			elec3 = JOptionPane.showOptionDialog(null, "Que desea hacer?", "Taller", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tall, tall[0]);
			switch(elec3){
			case 0:
				addCocTal();
				break;
			case 1:
				busTalCoc();
				break;
			}
		}while(elec3 != 2);
		
	}
	
	public void consult(){
		do{
			elec4 = JOptionPane.showOptionDialog(null, "¿Qué desea realizar?", "Consulta", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, consulta, consulta[0]);
			switch (elec4){
			case 0:
				busClientes();
				break;
			case 1:
				verClientes();
				break;
			}
		}while (elec4 != 2);
	}
	*/
	//////////-TALLER-////////////////////-TALLER-////////////////////-TALLER-////////////////////-TALLER-////////////////////-TALLER-//////////

	protected void addCocTal(){
		
				String mat = 	JOptionPane.showInputDialog("Inserte Matrícula");
				int np = 		Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de puertas"));
				int nr = 		Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de ruedas"));
				String mod =	JOptionPane.showInputDialog("Inserte el modelo");
				String date =	JOptionPane.showInputDialog("Inserte la fecha");
				String time =	JOptionPane.showInputDialog("Inserte el tiempo");
				double repair =	Double.parseDouble(JOptionPane.showInputDialog("Inserte el coste"));
				
				JOptionPane.showMessageDialog(null, "Ahora se le pedirán datos del cliente");
				
				String dNI =	JOptionPane.showInputDialog("Inserte el DNI");
				String name =	JOptionPane.showInputDialog("Inserte el nombre");
				String surName =	JOptionPane.showInputDialog("Inserte los apellidos");
				int age =	Integer.parseInt(JOptionPane.showInputDialog("Inserte la edad"));
				
				Vehiculo car = new Vehiculo(mat, np, nr, mod);
				Cliente nuevo = new Cliente(car, date, time, repair, dNI, name, surName, age);
				client.put(dNI, nuevo);
				lista.put(mat, car);
				general.put(car, nuevo);
	}

	protected void busTalCoc(){
		
		String buscar = JOptionPane.showInputDialog("Introduzca la matrícula del Vehículo a buscar");
		
		if (lista.containsKey(buscar)){
			Vehiculo value = lista.get(buscar);
			if(general.containsKey(value)){
				result = "Matricula: " +  value.getMatricula() + "\nDNI: " + general.get(value).getDni() + "\nNombre: " + general.get(value).getNombre() + "   Apellidos: " + general.get(value).getApellidos();
			}else{
				result = "No hay vehículos en el taller con esa matrícula";
			}
		}else{
			result = "No hay vehículos en el taller/tienda con esa metrícula";
		}
		
		JOptionPane.showMessageDialog(null, result);
	}
	
	protected void verClientes(){
		result = "_____Clientes_____";
		Set set = client.entrySet();
		Iterator itClient = set.iterator();
		while(itClient.hasNext()){
			Map.Entry clientEntry = (Map.Entry)itClient.next();
			Cliente persona = (Cliente) clientEntry.getValue();
			result += "\nNombre: " + persona.getNombre() + "\nApellidos: " + persona.getApellidos() + "\nDNI: " + persona.getDni() + "    Edad: " + persona.getEdad() + "\n";	
		}
		JOptionPane.showMessageDialog(null, result);
	}

	protected String busClientes(String buscar){
		Set clientSet = general.entrySet();
		Iterator itCliente = clientSet.iterator();
		while(itCliente.hasNext()){
			Map.Entry cliente = (Map.Entry)itCliente.next();
			Cliente value = (Cliente) cliente.getValue();
			if (value.getDni().equals(buscar)){
				result += "Matrícula: " + value.getVehiculo().getMatricula();
			}
		}
		
		return result;
		
	}
	
	//////////-TIENDA-////////////////////-TIENDA-////////////////////-TIENDA-////////////////////-TIENDA-////////////////////-TIENDA-//////////
	
	/*private void addCoche(){
		elec = JOptionPane.showOptionDialog(null, "¿Deseas introducir un coche Deportivo o no?", "Añadir Vehículo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, sino, sino[0]);
		
		switch (elec){
		case 0:
			String mat = 	JOptionPane.showInputDialog("Inserte Matrícula");
			int np = 		Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de puertas"));
			int nr = 		Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de ruedas"));
			String mod =	JOptionPane.showInputDialog("Inserte el modelo");
			String cm = 	JOptionPane.showInputDialog("Inserte la capacidad Máxima");
			int vm = 		Integer.parseInt(JOptionPane.showInputDialog("Inserte la Velocidad Máxima"));
			CocheDeportivo dep = new CocheDeportivo(mat, np, nr, mod, cm, vm);
			
			lista.put(mat, dep);
			break;
		case 1:
			String mat2 	=	JOptionPane.showInputDialog("Inserte Matrícula");
			int np2 		=	Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de puertas"));
			int nr2 		=	Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de ruedas"));
			String mod2 	= 	JOptionPane.showInputDialog("Inserte el modelo");
			boolean ab;
			if (JOptionPane.showOptionDialog(null, "¿Tiene Airbags?", "¿Airbags?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, sino, sino[0]) == JOptionPane.YES_OPTION){
				ab = true;
			}else{
				ab = false;
			}
						
			
			Coche coch = new Coche(mat2, np2, nr2, mod2, ab);
			
			lista.put(mat2, coch);
			break;
		}
		
	}*/

	private void buscarCoche(){
		String buscar = JOptionPane.showInputDialog("Introduzca la matrícula que desea buscar");
		
		if (lista.containsKey(buscar)){
			//Comprueba si pertenece a "Coche"
			if (lista.get(buscar) instanceof Coche){
				result = "___NO DEPORTIVO___\nMatrícula: " + lista.get(buscar).getMatricula() + "\nModelo: " + lista.get(buscar).getModelo();
				switch (JOptionPane.showOptionDialog(null, "Resultado", "resultado", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, edit, edit[0])){
				case 0:
					modificar(lista.get(buscar).getMatricula(), (Coche) lista.get(buscar));
				case 1:
					borrar(lista.get(buscar).getMatricula(), lista.get(buscar));
					break;
				case 2:
					break;
				};
				//Si lo otro da falso, Comprueba si pertenece a "CocheDeportivo"
			}else{
				result = "___DEPORTIVO___\nMatricula: " + lista.get(buscar).getMatricula() + "\nModelo: " + lista.get(buscar).getModelo();
				switch (JOptionPane.showOptionDialog(null, "Resultado", "resultado", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, edit, edit[0])){
				case 0:
					modificar(lista.get(buscar).getMatricula(), (CocheDeportivo) lista.get(buscar));
				case 1:
					borrar(lista.get(buscar).getMatricula(), lista.get(buscar));
					break;
				case 2:
					break;
				};
			}
		}else{
			result = "No existe ningún coche con la matrícula seleccionada";
		}
		
		JOptionPane.showMessageDialog(null, result);
	}

	private void modificar(String clave, CocheDeportivo object){
		
		String tempMat = JOptionPane.showInputDialog("Inserte Matrícula");
		int tempNp = Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de Puertas"));
		int tempNr = Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de ruedas"));
		String tempMod = JOptionPane.showInputDialog("Inserte el modelo");
		String tempCm = JOptionPane.showInputDialog("Inserte la capacidad del motor");
		int tempVm = Integer.parseInt(JOptionPane.showInputDialog("Inserte la velocidad máxima"));
			
		if (JOptionPane.showOptionDialog(null, "¿Quiere sustituir estos datos por los nuevos?\n" + 
																"Matricula: " + object.getMatricula() + " --> " + tempMat + 
																"\nNº de Puertas: " + object.getNoPuertas() + " --> " + tempNp +
																"\nNº de Ruedas: " + object.getNoRuedas() + " --> " + tempNr + 
																"\nModelo: " + object.getModelo() + " --> " + tempMod + 
																"\nCapacidad del Motor: " + object.getCapacidadMotor() + " --> " + tempCm + 
																"\nVelocidad Máxima: " + object.getVelocidadMaxima() + " --> " + tempVm,
																"CAMBIAR", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, sino, sino[1]) == JOptionPane.YES_OPTION){

			if (lista.containsKey(tempMat)){
				JOptionPane.showMessageDialog(null, "Ya existe un Coche con esa matrícula");
			}else{
				object.setMatricula(tempMat);
				object.setNoPuertas(tempNp);
				object.setNoRuedas(tempNr);
				object.setModelo(tempMod);
				object.setCapacidadMotor(tempCm);
				object.setVelocidadMaxima(tempVm);
			}
		}
	}

	private void modificar(String clave, Coche object){
		String tempMat = JOptionPane.showInputDialog("Inserte Matrícula");
		int tempNp = Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de Puertas"));
		int tempNr = Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de ruedas"));
		String tempMod = JOptionPane.showInputDialog("Inserte el modelo");
		boolean tempAb;
		if (JOptionPane.showOptionDialog(null, "¿Tiene Airbags?", "¿Airbags?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, sino, sino[0]) == JOptionPane.YES_OPTION){
			tempAb = true;
		}else{
			tempAb = false;
		}
		if (JOptionPane.showOptionDialog(null, "¿Quiere sustituir estos datos por los nuevos?\n" + 
				"Matricula: " + object.getMatricula() + " --> " + tempMat + 
				"\nNº de Puertas: " + object.getNoPuertas() + " --> " + tempNp +
				"\nNº de Ruedas: " + object.getNoRuedas() + " --> " + tempNr + 
				"\nModelo: " + object.getModelo() + " --> " + tempMod +
				"\nAirbags: " + object.isAirbags() + " --> " + tempAb,
				"CAMBIAR", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, sino, sino[1]) == JOptionPane.YES_OPTION){

		
			if (lista.containsKey(tempMat) && !object.getMatricula().equals(tempMat)){
				JOptionPane.showMessageDialog(null, "Ya existe un Coche con esa matrícula");
			}else{
				object.setMatricula(tempMat);
				object.setNoPuertas(tempNp);
				object.setNoRuedas(tempNr);
				object.setModelo(tempMod);
				object.setAirbags(tempAb);
			}
		}
		
	}
	
	private void borrar(String clave, Vehiculo object){
		
		if (JOptionPane.showConfirmDialog(null, "Se procederá a eliminar los siguientes datos:\nMatricula: " + object.getMatricula() + "\nModelo: " + object.getModelo() + "\n    ¿ESTÁS SEGURO?") == JOptionPane.YES_OPTION){
			lista.remove(clave);
		}
		
	}
	
	private void listaCoches(){
		result = "____No Deportivos____";
		Set set = lista.entrySet();
		Iterator it2 = set.iterator();
		while (it2.hasNext()){
			Map.Entry me = (Map.Entry)it2.next();
			Vehiculo element = (Vehiculo)me.getValue();
			if (me.getValue().getClass().getName().equals("Taller.Coche")){
				result += "\nMatricula: " + element.getMatricula() + "   Modelo: " + element.getModelo() + "\n";
			}else{
				result2 += "\nMatricula: " + element.getMatricula() + "   Modelo: " + element.getModelo() + "\n";
			}
		}if (result.equals("")){
			result="No hay ningún vehículo en la categoría No Deportivos";
		}
		if (result2.equals("Deportivos")){
			result="No hay ningún vehículo la categoría Deportivos";
		}
		JOptionPane.showMessageDialog(null, result);
		JOptionPane.showMessageDialog(null, result2);
	}
	
}
