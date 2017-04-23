package MyFrames;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class frameTaller extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txt_mat;
	private JTextField txt_np;
	private JTextField txt_nr;
	private JTextField txt_mod;
	private JTextField txt_vm;
	private JTextField txt_cm;
	private JTextField txt_date;
	private JTextField txt_time;
	private JTextField txt_cost;
	private JTextField txt_DNI;
	private JTextField txt_name;
	private JTextField txt_SurName;
	private JTextField txt_age;
	private JTextField txt_BusMat;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public frameTaller() {
		setModal(true);
		setBounds(100, 100, 770, 490);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 95, 734, 343);
		contentPanel.add(layeredPane);
		layeredPane.setLayout(null);
		
		JPanel pnlConsulta = new JPanel();
		pnlConsulta.setVisible(false);
		pnlConsulta.setBounds(0, 0, 734, 343);
		layeredPane.add(pnlConsulta);
		pnlConsulta.setLayout(null);
		
		JLabel lblMatrcula_1 = new JLabel("Matrícula:");
		lblMatrcula_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMatrcula_1.setBounds(191, 11, 76, 19);
		pnlConsulta.add(lblMatrcula_1);
		
		txt_BusMat = new JTextField();
		txt_BusMat.setBounds(277, 12, 156, 20);
		pnlConsulta.add(txt_BusMat);
		txt_BusMat.setColumns(10);
		
		JButton btnBuscar = new JButton("buscar");
		btnBuscar.setBounds(539, 11, 89, 23);
		pnlConsulta.add(btnBuscar);
		
		JTextPane txt_result = new JTextPane();
		txt_result.setBackground(SystemColor.menu);
		txt_result.setBounds(10, 60, 714, 272);
		pnlConsulta.add(txt_result);
		
		JPanel pnlAddVehi = new JPanel();
		pnlAddVehi.setVisible(false);
		pnlAddVehi.setBounds(0, 0, 734, 343);
		layeredPane.add(pnlAddVehi);
		pnlAddVehi.setLayout(null);
		
		JLabel lblMatrcula = new JLabel("Matrícula:");
		lblMatrcula.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMatrcula.setBounds(23, 68, 107, 14);
		pnlAddVehi.add(lblMatrcula);
		
		JLabel lblNPuertas = new JLabel("Nº Puertas:");
		lblNPuertas.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNPuertas.setBounds(23, 93, 107, 14);
		pnlAddVehi.add(lblNPuertas);
		
		JLabel lblNRuedas = new JLabel("Nº Ruedas:");
		lblNRuedas.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNRuedas.setBounds(23, 118, 107, 14);
		pnlAddVehi.add(lblNRuedas);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblModelo.setBounds(23, 143, 107, 14);
		pnlAddVehi.add(lblModelo);
		
		JLabel lblCapMotor = new JLabel("Cap. Motor:");
		lblCapMotor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCapMotor.setBounds(23, 181, 107, 14);
		pnlAddVehi.add(lblCapMotor);
		
		JLabel lblVelMxima = new JLabel("Vel. Máxima:");
		lblVelMxima.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblVelMxima.setBounds(23, 206, 107, 14);
		pnlAddVehi.add(lblVelMxima);
		
		JCheckBox chkDepor = new JCheckBox("Es Deportivo");
		chkDepor.setBounds(87, 38, 97, 23);
		pnlAddVehi.add(chkDepor);
		
		JCheckBox chkAirbag = new JCheckBox("¿Airbags?");
		chkAirbag.setBounds(198, 104, 97, 23);
		pnlAddVehi.add(chkAirbag);
		
		txt_mat = new JTextField();
		txt_mat.setBounds(140, 67, 155, 20);
		pnlAddVehi.add(txt_mat);
		txt_mat.setColumns(10);
		
		txt_np = new JTextField();
		txt_np.setColumns(10);
		txt_np.setBounds(140, 92, 41, 20);
		pnlAddVehi.add(txt_np);
		
		txt_nr = new JTextField();
		txt_nr.setColumns(10);
		txt_nr.setBounds(140, 117, 41, 20);
		pnlAddVehi.add(txt_nr);
		
		txt_mod = new JTextField();
		txt_mod.setColumns(10);
		txt_mod.setBounds(140, 142, 155, 20);
		pnlAddVehi.add(txt_mod);
		
		txt_vm = new JTextField();
		txt_vm.setEnabled(false);
		txt_vm.setColumns(10);
		txt_vm.setBounds(140, 205, 155, 20);
		pnlAddVehi.add(txt_vm);
		
		txt_cm = new JTextField();
		txt_cm.setEnabled(false);
		txt_cm.setColumns(10);
		txt_cm.setBounds(140, 180, 155, 20);
		pnlAddVehi.add(txt_cm);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDni.setBounds(375, 59, 107, 14);
		pnlAddVehi.add(lblDni);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setBounds(375, 93, 107, 14);
		pnlAddVehi.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblApellidos.setBounds(375, 118, 107, 14);
		pnlAddVehi.add(lblApellidos);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEdad.setBounds(375, 148, 107, 14);
		pnlAddVehi.add(lblEdad);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFecha.setBounds(10, 280, 62, 14);
		pnlAddVehi.add(lblFecha);
		
		JLabel lblTiempo = new JLabel("Tiempo:");
		lblTiempo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTiempo.setBounds(171, 280, 62, 14);
		pnlAddVehi.add(lblTiempo);
		
		JLabel lblReparacin = new JLabel("Total Reparación:");
		lblReparacin.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblReparacin.setBounds(10, 318, 132, 14);
		pnlAddVehi.add(lblReparacin);
		
		txt_date = new JTextField();
		txt_date.setColumns(10);
		txt_date.setBounds(74, 279, 87, 20);
		pnlAddVehi.add(txt_date);
		
		txt_time = new JTextField();
		txt_time.setColumns(10);
		txt_time.setBounds(243, 279, 87, 20);
		pnlAddVehi.add(txt_time);
		
		txt_cost = new JTextField();
		txt_cost.setColumns(10);
		txt_cost.setBounds(152, 317, 178, 20);
		pnlAddVehi.add(txt_cost);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 244, 697, 2);
		pnlAddVehi.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(23, 29, 272, 2);
		pnlAddVehi.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(371, 29, 319, 2);
		pnlAddVehi.add(separator_2);
		
		txt_DNI = new JTextField();
		txt_DNI.setColumns(10);
		txt_DNI.setBounds(492, 58, 155, 20);
		pnlAddVehi.add(txt_DNI);
		
		txt_name = new JTextField();
		txt_name.setColumns(10);
		txt_name.setBounds(492, 92, 155, 20);
		pnlAddVehi.add(txt_name);
		
		txt_SurName = new JTextField();
		txt_SurName.setColumns(10);
		txt_SurName.setBounds(492, 117, 155, 20);
		pnlAddVehi.add(txt_SurName);
		
		txt_age = new JTextField();
		txt_age.setColumns(10);
		txt_age.setBounds(492, 147, 155, 20);
		pnlAddVehi.add(txt_age);
		
		JLabel lblDatosVehiculo = new JLabel("Datos Vehículo");
		lblDatosVehiculo.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosVehiculo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDatosVehiculo.setBounds(23, 0, 272, 27);
		pnlAddVehi.add(lblDatosVehiculo);
		
		JLabel lblDatosCliente = new JLabel("Datos Cliente");
		lblDatosCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosCliente.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDatosCliente.setBounds(375, 0, 315, 27);
		pnlAddVehi.add(lblDatosCliente);
		
		JButton btnAadir = new JButton("Añadir");
		btnAadir.setBounds(443, 278, 89, 23);
		pnlAddVehi.add(btnAadir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(586, 278, 89, 23);
		pnlAddVehi.add(btnCancelar);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(337, 21, 1, 212);
		pnlAddVehi.add(separator_3);
		
		JLabel lblTaller = new JLabel("Taller");
		lblTaller.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaller.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblTaller.setBounds(10, 32, 734, 33);
		contentPanel.add(lblTaller);
		
		JButton btnAadirVehculo = new JButton("Añadir Vehículo");
		btnAadirVehculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pnlAddVehi.setVisible(true);
				pnlConsulta.setVisible(false);
			}
		});
		btnAadirVehculo.setBounds(111, 39, 105, 23);
		contentPanel.add(btnAadirVehculo);
		
		JButton btnConsulta = new JButton("Consulta");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlAddVehi.setVisible(false);
				pnlConsulta.setVisible(true);
			}
		});
		btnConsulta.setBounds(536, 39, 105, 23);
		contentPanel.add(btnConsulta);
	}
}
