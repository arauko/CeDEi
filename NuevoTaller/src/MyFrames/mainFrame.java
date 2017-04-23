package MyFrames;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;


public class mainFrame {

	private JFrame frmTaller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {
					mainFrame window = new mainFrame();
					window.frmTaller.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmTaller = new JFrame();
		frmTaller.setTitle("Taller");
		frmTaller.setBounds(100, 100, 402, 164);
		frmTaller.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTaller.getContentPane().setLayout(null);
		
		JButton btnExit = new JButton("Salir");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(148, 91, 89, 23);
		frmTaller.getContentPane().add(btnExit);
		
		JButton btnTaller = new JButton("Taller");
		btnTaller.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameTaller t = new frameTaller();
				t.setVisible(true);
			}
		});
		btnTaller.setBounds(10, 42, 89, 23);
		frmTaller.getContentPane().add(btnTaller);
		
		JButton btnTienda = new JButton("Tienda");
		btnTienda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameTienda t = new frameTienda();
				t.setVisible(true);
			}
		});
		btnTienda.setBounds(148, 42, 89, 23);
		frmTaller.getContentPane().add(btnTienda);
		
		JButton btnConsulta = new JButton("Consulta");
		btnConsulta.setBounds(287, 42, 89, 23);
		frmTaller.getContentPane().add(btnConsulta);
		frmTaller.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmTaller.getContentPane(), btnTaller, btnTienda, btnConsulta, btnExit}));
	}
}
