package Taller;

import java.awt.*;
import javax.swing.*;
import java.util.HashMap;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class application extends JFrame{
	
	JDialog taller;
	
	
	HashMap <String, Vehiculo> lista = new HashMap<String, Vehiculo>();
	HashMap <String, Cliente> client = new HashMap<String,Cliente>();
	HashMap <Vehiculo, Cliente> general = new HashMap<Vehiculo, Cliente>();

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				new application();
			}
		});
	}

	/**
	 * Create the application.
	 */
	public application() {
		setBounds(new Rectangle(600, 600, 600, 600));
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("Ejemplo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JDialog.setDefaultLookAndFeelDecorated(true);
		taller = new JDialog(this, "Esto es titulo", true);
		taller.getContentPane().setBounds(new Rectangle(250, 250, 250, 250));
		
		taller.setSize(400, 400);
		
		taller.getContentPane().setLayout(new FlowLayout());
		
		setSize(458,204);
		getContentPane().setLayout(null);
		
		JButton btn_Taller = new JButton("Taller");
		btn_Taller.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taller.setVisible(true);
			}
		});
		btn_Taller.setBounds(30, 55, 86, 36);
		getContentPane().add(btn_Taller);
		
		JButton btn_Tienda = new JButton("Tienda");
		btn_Tienda.setBounds(180, 55, 86, 36);
		getContentPane().add(btn_Tienda);
		
		JButton btn_Consulta = new JButton("Consulta");
		btn_Consulta.setBounds(331, 55, 86, 36);
		getContentPane().add(btn_Consulta);
		
		JButton btn_Exit = new JButton("Salir");
		btn_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btn_Exit.setBounds(331, 123, 86, 36);
		getContentPane().add(btn_Exit);
		setVisible(true);
		
	}
}