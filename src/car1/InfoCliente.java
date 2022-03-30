package car1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Panel;

/**
 * 
 * @author Grupo_4
 * @version 5.1.2
 *
 */
public class InfoCliente extends JFrame implements ActionListener, ListSelectionListener {
	
	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial correcto funcionamiento de los calculos
	 */
	private JPanel Menu;
	private JPanel panel_Botones;
	private Panel panel_Datos_2;
	private JButton btnAceptarInfoCli;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblTelf;/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblEmail;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblCod_P;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblCalle;
	
	public JLabel lblPortal;
	
	public JLabel lblPiso;
	
	public JLabel lblPuerta;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public static JLabel lblNombre;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblDNI;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblApellidos;
	
	public JLabel lblFecha_N;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public static DefaultListModel<String> dlm;
	private JLabel lblFechaA_1;
	public JLabel lblFecha_A;
	/**
	 * DefaultListModel: public se da uso en clases extenas y son modificadas desde fuera
	 */

	/**
	 * Create the frame.
	 */
	public InfoCliente() {
		setResizable(false);
		setTitle("INFO_Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 779, 440);
		Menu = new JPanel();
		Menu.setBackground(Color.DARK_GRAY);
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(null);

		panel_Datos_2 = new Panel();
		panel_Datos_2.setBackground(Color.DARK_GRAY);
		panel_Datos_2.setBounds(466, 0, 299, 307);
		Menu.add(panel_Datos_2);
		panel_Datos_2.setLayout(null);

		lblEmail = new JLabel("");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(0, 0, 289, 43);
		panel_Datos_2.add(lblEmail);

		lblCod_P = new JLabel("");
		lblCod_P.setForeground(Color.WHITE);
		lblCod_P.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCod_P.setBounds(0, 54, 160, 38);
		panel_Datos_2.add(lblCod_P);

		lblCalle = new JLabel("");
		lblCalle.setForeground(Color.WHITE);
		lblCalle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCalle.setBounds(0, 100, 239, 38);
		panel_Datos_2.add(lblCalle);
		
		lblPortal = new JLabel("");
		lblPortal.setForeground(Color.WHITE);
		lblPortal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPortal.setBounds(0, 142, 160, 38);
		panel_Datos_2.add(lblPortal);
		
		lblPiso = new JLabel("");
		lblPiso.setForeground(Color.WHITE);
		lblPiso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPiso.setBounds(0, 191, 160, 38);
		panel_Datos_2.add(lblPiso);
		
		lblPuerta = new JLabel("");
		lblPuerta.setForeground(Color.WHITE);
		lblPuerta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPuerta.setBounds(0, 241, 160, 38);
		panel_Datos_2.add(lblPuerta);

		panel_Botones = new JPanel();
		panel_Botones.setBackground(Color.DARK_GRAY);
		panel_Botones.setBounds(118, 327, 363, 73);
		Menu.add(panel_Botones);
		panel_Botones.setLayout(null);

		btnAceptarInfoCli = new JButton("ACEPTAR");
		btnAceptarInfoCli.addActionListener(this);
		btnAceptarInfoCli.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAceptarInfoCli.setBounds(117, 11, 127, 39);
		panel_Botones.add(btnAceptarInfoCli);

		Panel panel_Datos_1 = new Panel();
		panel_Datos_1.setBackground(Color.DARK_GRAY);
		panel_Datos_1.setLayout(null);
		panel_Datos_1.setBounds(154, 0, 157, 307);
		Menu.add(panel_Datos_1);

		lblNombre = new JLabel("");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(10, 43, 65, 34);
		panel_Datos_1.add(lblNombre);

		lblDNI = new JLabel("");
		lblDNI.setForeground(Color.WHITE);
		lblDNI.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDNI.setBounds(10, 10, 76, 34);
		panel_Datos_1.add(lblDNI);

		lblApellidos = new JLabel("");
		lblApellidos.setForeground(Color.WHITE);
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblApellidos.setBounds(10, 88, 137, 34);
		panel_Datos_1.add(lblApellidos);

		lblTelf = new JLabel("");
		lblTelf.setForeground(Color.WHITE);
		lblTelf.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblTelf.setBounds(10, 163, 137, 34);
		panel_Datos_1.add(lblTelf);
		
		lblFecha_N = new JLabel("");
		lblFecha_N.setForeground(Color.WHITE);
		lblFecha_N.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblFecha_N.setBounds(10, 210, 137, 34);
		panel_Datos_1.add(lblFecha_N);
		
		lblFecha_A = new JLabel("");
		lblFecha_A.setForeground(Color.WHITE);
		lblFecha_A.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblFecha_A.setBounds(10, 255, 137, 41);
		panel_Datos_1.add(lblFecha_A);

		Panel panel_Datos_1_1 = new Panel();
		panel_Datos_1_1.setBackground(Color.DARK_GRAY);
		panel_Datos_1_1.setLayout(null);
		panel_Datos_1_1.setBounds(10, 0, 138, 307);
		Menu.add(panel_Datos_1_1);

		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setForeground(Color.WHITE);
		lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre_1.setBounds(62, 43, 65, 34);
		panel_Datos_1_1.add(lblNombre_1);

		JLabel lblDNI_1 = new JLabel("DNI:");
		lblDNI_1.setForeground(Color.WHITE);
		lblDNI_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDNI_1.setBounds(88, 11, 39, 34);
		panel_Datos_1_1.add(lblDNI_1);

		JLabel lblApellido1_1 = new JLabel("Apellidos:");
		lblApellido1_1.setForeground(Color.WHITE);
		lblApellido1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblApellido1_1.setBounds(62, 81, 65, 49);
		panel_Datos_1_1.add(lblApellido1_1);

		JLabel lblTelf_1 = new JLabel("Telefono:");
		lblTelf_1.setForeground(Color.WHITE);
		lblTelf_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblTelf_1.setBounds(62, 160, 66, 46);
		panel_Datos_1_1.add(lblTelf_1);
		
		JLabel lblFechaN_1 = new JLabel("Fecha nacimiento:");
		lblFechaN_1.setForeground(Color.WHITE);
		lblFechaN_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblFechaN_1.setBounds(10, 203, 128, 46);
		panel_Datos_1_1.add(lblFechaN_1);
		
		lblFechaA_1 = new JLabel("Fecha de alta:");
		lblFechaA_1.setForeground(Color.WHITE);
		lblFechaA_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblFechaA_1.setBounds(37, 250, 101, 46);
		panel_Datos_1_1.add(lblFechaA_1);

		Panel panel_Datos_2_1 = new Panel();
		panel_Datos_2_1.setBackground(Color.DARK_GRAY);
		panel_Datos_2_1.setLayout(null);
		panel_Datos_2_1.setBounds(329, 0, 131, 307);
		Menu.add(panel_Datos_2_1);

		JLabel lblEmail_1 = new JLabel("Email:");
		lblEmail_1.setForeground(Color.WHITE);
		lblEmail_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail_1.setBounds(74, 0, 47, 49);
		panel_Datos_2_1.add(lblEmail_1);

		JLabel lblCod_P_1 = new JLabel("Codigo Postal:");
		lblCod_P_1.setForeground(Color.WHITE);
		lblCod_P_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCod_P_1.setBounds(23, 47, 98, 49);
		panel_Datos_2_1.add(lblCod_P_1);

		JLabel lblCalle_1 = new JLabel("Calle:");
		lblCalle_1.setForeground(Color.WHITE);
		lblCalle_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCalle_1.setBounds(74, 95, 47, 41);
		panel_Datos_2_1.add(lblCalle_1);
		
		JLabel lblPortal_1 = new JLabel("Portal:");
		lblPortal_1.setForeground(Color.WHITE);
		lblPortal_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPortal_1.setBounds(74, 140, 47, 41);
		panel_Datos_2_1.add(lblPortal_1);
		
		JLabel lblPiso_1 = new JLabel("Piso:");
		lblPiso_1.setForeground(Color.WHITE);
		lblPiso_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPiso_1.setBounds(74, 186, 47, 41);
		panel_Datos_2_1.add(lblPiso_1);
		
		JLabel lblPuerta_1 = new JLabel("Puerta:");
		lblPuerta_1.setForeground(Color.WHITE);
		lblPuerta_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPuerta_1.setBounds(66, 237, 55, 41);
		panel_Datos_2_1.add(lblPuerta_1);
		dlm = new DefaultListModel<String>();

	}

	@Override

	public void actionPerformed(ActionEvent e) {
		/**
		 * @override 
		 * instanciar o de la clase object java para la reaccion de los objetos
		 * en fase contstuccion a futura implementacion
		 */
		Object o = e.getSource();
		

		if (o == btnAceptarInfoCli) {
			/**
			 * cierra la actual ventana
			 */
			this.setVisible(false);
		}

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

	}
}