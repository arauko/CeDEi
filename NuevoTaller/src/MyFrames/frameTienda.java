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
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import java.awt.Color;


public class frameTienda extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txt_mat;
	private JTextField txt_np;
	private JTextField txt_nr;
	private JTextField txt_mod;
	private JTextField txt_cm;
	private JTextField txt_vm;
	private JTextField txt_busq;
	private JTextField txt_NewCm;
	private JTextField txt_NewVm;
	private JTextField txt_NewMod;
	private JTextField txt_NewNr;
	private JTextField txt_NewNp;
	private JTextField txt_NewMat;
	private JTextField txt_busqMat;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the dialog.
	 */
	public frameTienda() {
		setBounds(100, 100, 770, 490);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 116, 734, 324);
		contentPanel.add(layeredPane);
		layeredPane.setLayout(null);
		
		JPanel pnlAddVeh = new JPanel();
		pnlAddVeh.setVisible(false);
		
		JPanel pnlModVeh = new JPanel();
		pnlModVeh.setVisible(false);
		
		JPanel pnlElimVeh = new JPanel();
		pnlElimVeh.setVisible(false);
		pnlElimVeh.setBounds(0, 0, 734, 324);
		layeredPane.add(pnlElimVeh);
		pnlElimVeh.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Matrícula:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(196, 11, 76, 14);
		pnlElimVeh.add(lblNewLabel_4);
		
		txt_busqMat = new JTextField();
		txt_busqMat.setBounds(299, 10, 137, 20);
		pnlElimVeh.add(txt_busqMat);
		txt_busqMat.setColumns(10);
		
		JButton btn_busq = new JButton("Buscar");
		btn_busq.setBounds(465, 9, 89, 23);
		pnlElimVeh.add(btn_busq);
		
		JTextPane txt_resultBusq = new JTextPane();
		txt_resultBusq.setBounds(10, 39, 440, 274);
		pnlElimVeh.add(txt_resultBusq);
		
		JButton btnNewButton_4 = new JButton("Confirmar");
		btnNewButton_4.setForeground(new Color(0, 128, 0));
		btnNewButton_4.setBounds(548, 180, 89, 23);
		pnlElimVeh.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Cancelar");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_resultBusq.setText("");
				txt_busqMat.setText("");
			}
		});
		btnNewButton_5.setForeground(new Color(255, 0, 0));
		btnNewButton_5.setBounds(548, 113, 89, 23);
		pnlElimVeh.add(btnNewButton_5);
		pnlModVeh.setBounds(0, 0, 734, 324);
		layeredPane.add(pnlModVeh);
		pnlModVeh.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Matrícula:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 11, 76, 14);
		pnlModVeh.add(lblNewLabel_2);
		
		txt_busq = new JTextField();
		txt_busq.setBounds(96, 10, 95, 20);
		pnlModVeh.add(txt_busq);
		txt_busq.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Buscar");
		btnNewButton_3.setBounds(201, 9, 89, 23);
		pnlModVeh.add(btnNewButton_3);
		
		JTextPane txt_result = new JTextPane();
		txt_result.setBackground(SystemColor.menu);
		txt_result.setBounds(10, 36, 280, 277);
		pnlModVeh.add(txt_result);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(315, 23, 1, 290);
		pnlModVeh.add(separator);
		
		JLabel lblNewLabel_3 = new JLabel("Nuevos Datos:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(451, 11, 108, 19);
		pnlModVeh.add(lblNewLabel_3);
		
		JLabel lblNewMat = new JLabel("Matrícula:");
		lblNewMat.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewMat.setBounds(353, 54, 76, 14);
		pnlModVeh.add(lblNewMat);
		
		JLabel lblNewPuertas = new JLabel("Nº Puertas:");
		lblNewPuertas.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewPuertas.setBounds(353, 90, 89, 14);
		pnlModVeh.add(lblNewPuertas);
		
		JLabel lblNewRuedas = new JLabel("Nª Ruedas:");
		lblNewRuedas.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewRuedas.setBounds(353, 123, 89, 14);
		pnlModVeh.add(lblNewRuedas);
		
		JLabel lblNewModelo = new JLabel("Modelo: ");
		lblNewModelo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewModelo.setBounds(353, 156, 76, 14);
		pnlModVeh.add(lblNewModelo);
		
		JLabel lblCapMotro_1 = new JLabel("Cap. Motor:");
		lblCapMotro_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCapMotro_1.setBounds(353, 234, 89, 14);
		pnlModVeh.add(lblCapMotro_1);
		
		JLabel lblVelMxima_1 = new JLabel("Vel. Máxima:");
		lblVelMxima_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblVelMxima_1.setBounds(353, 268, 108, 14);
		pnlModVeh.add(lblVelMxima_1);
		
		JCheckBox chkNewAirbag = new JCheckBox("¿Airbags?");
		chkNewAirbag.setBounds(595, 88, 97, 23);
		pnlModVeh.add(chkNewAirbag);
		
		JCheckBox chkNewDepor = new JCheckBox("Es Deportivo");
		chkNewDepor.setBounds(595, 195, 97, 23);
		pnlModVeh.add(chkNewDepor);
		
		txt_NewCm = new JTextField();
		txt_NewCm.setEnabled(false);
		txt_NewCm.setBounds(451, 233, 123, 20);
		pnlModVeh.add(txt_NewCm);
		txt_NewCm.setColumns(10);
		
		txt_NewVm = new JTextField();
		txt_NewVm.setEnabled(false);
		txt_NewVm.setColumns(10);
		txt_NewVm.setBounds(451, 267, 123, 20);
		pnlModVeh.add(txt_NewVm);
		
		txt_NewMod = new JTextField();
		txt_NewMod.setColumns(10);
		txt_NewMod.setBounds(451, 155, 123, 20);
		pnlModVeh.add(txt_NewMod);
		
		txt_NewNr = new JTextField();
		txt_NewNr.setColumns(10);
		txt_NewNr.setBounds(451, 122, 123, 20);
		pnlModVeh.add(txt_NewNr);
		
		txt_NewNp = new JTextField();
		txt_NewNp.setColumns(10);
		txt_NewNp.setBounds(451, 89, 123, 20);
		pnlModVeh.add(txt_NewNp);
		
		txt_NewMat = new JTextField();
		txt_NewMat.setColumns(10);
		txt_NewMat.setBounds(451, 53, 123, 20);
		pnlModVeh.add(txt_NewMat);
		
		JButton btn_Mod = new JButton("Modificar");
		btn_Mod.setBounds(635, 232, 89, 23);
		pnlModVeh.add(btn_Mod);
		pnlAddVeh.setBounds(0, 0, 734, 324);
		layeredPane.add(pnlAddVeh);
		pnlAddVeh.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Matrícula:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(44, 75, 76, 19);
		pnlAddVeh.add(lblNewLabel);
		
		JLabel lblNPuertas = new JLabel("Nº Puertas:");
		lblNPuertas.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNPuertas.setBounds(44, 115, 96, 19);
		pnlAddVeh.add(lblNPuertas);
		
		JLabel lblNRuedas = new JLabel("Nº Ruedas:");
		lblNRuedas.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNRuedas.setBounds(44, 145, 84, 19);
		pnlAddVeh.add(lblNRuedas);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblModelo.setBounds(44, 181, 76, 19);
		pnlAddVeh.add(lblModelo);
		
		JLabel lblCapMotro = new JLabel("Cap. Motor:");
		lblCapMotro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCapMotro.setBounds(391, 115, 96, 19);
		pnlAddVeh.add(lblCapMotro);
		
		JLabel lblVelMxima = new JLabel("Vel. Máxima:");
		lblVelMxima.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblVelMxima.setBounds(391, 145, 96, 19);
		pnlAddVeh.add(lblVelMxima);
		
		txt_mat = new JTextField();
		txt_mat.setBounds(155, 76, 159, 20);
		pnlAddVeh.add(txt_mat);
		txt_mat.setColumns(10);
		
		txt_np = new JTextField();
		txt_np.setColumns(10);
		txt_np.setBounds(155, 116, 70, 20);
		pnlAddVeh.add(txt_np);
		
		txt_nr = new JTextField();
		txt_nr.setColumns(10);
		txt_nr.setBounds(155, 146, 70, 20);
		pnlAddVeh.add(txt_nr);
		
		txt_mod = new JTextField();
		txt_mod.setColumns(10);
		txt_mod.setBounds(155, 182, 159, 20);
		pnlAddVeh.add(txt_mod);
		
		txt_cm = new JTextField();
		txt_cm.setEnabled(false);
		txt_cm.setColumns(10);
		txt_cm.setBounds(497, 116, 131, 20);
		pnlAddVeh.add(txt_cm);
		
		txt_vm = new JTextField();
		txt_vm.setEnabled(false);
		txt_vm.setColumns(10);
		txt_vm.setBounds(497, 146, 131, 20);
		pnlAddVeh.add(txt_vm);
		
		JCheckBox chk_Airbag = new JCheckBox("¿Airbags?");
		chk_Airbag.setBounds(240, 128, 97, 23);
		pnlAddVeh.add(chk_Airbag);
		
		JCheckBox chk_Depor = new JCheckBox("Es Deportivo");
		chk_Depor.setBounds(391, 75, 97, 23);
		pnlAddVeh.add(chk_Depor);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setBounds(391, 267, 89, 23);
		pnlAddVeh.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setBounds(497, 267, 89, 23);
		pnlAddVeh.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setBounds(596, 267, 89, 23);
		pnlAddVeh.add(btnNewButton_2);
		
		JButton btnAddVeh = new JButton("Añadir Vehículo");
		btnAddVeh.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
					pnlAddVeh.setVisible(true);
					pnlElimVeh.setVisible(false);
					pnlModVeh.setVisible(false);
				}
		});
		btnAddVeh.setBounds(92, 82, 105, 23);
		contentPanel.add(btnAddVeh);
		
		JButton btnModVeh = new JButton("Modificar Vehículo");
		btnModVeh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlAddVeh.setVisible(false);
				pnlElimVeh.setVisible(false);
				pnlModVeh.setVisible(true);
			}
		});
		btnModVeh.setBounds(323, 82, 117, 23);
		contentPanel.add(btnModVeh);
		
		JButton btnElimVeh = new JButton("Eliminar Vehículo");
		btnElimVeh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlAddVeh.setVisible(false);
				pnlElimVeh.setVisible(true);
				pnlModVeh.setVisible(false);
			}
		});
		btnElimVeh.setBounds(557, 82, 111, 23);
		contentPanel.add(btnElimVeh);
		
		JLabel lblNewLabel_1 = new JLabel("Tienda");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Palatino Linotype", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 21, 734, 35);
		contentPanel.add(lblNewLabel_1);
	}

}
