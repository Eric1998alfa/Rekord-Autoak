package car1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JComboBox;

/**
 * @author Grupo_4
 * @version 5.1.2
 */
public class AnadirCuenta extends JFrame implements ActionListener, ListSelectionListener, WindowListener {
	
	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial correcto funcionamiento de los calculos
	 */
	private JPanel Menu;
	private JPanel panel_Botones;
	private Panel panel_Datos_2;
	private JTextField txtEmail;
	private JTextField txtCod_P;
	private JTextField txtDia;
	public JButton btnVolver;
	public JButton btnA�adir;
	public static JTextField txtDNI;
	public static JTextField txtNombre;
	public static JTextField txtApellidos;
	public static JTextField txtTelf;
	public JLabel lblNombre_1;
	private JTextField txtCalle;
	private JTextField txtPortal;
	private JTextField txtPiso;
	private JTextField txtPuerta;
	private JTextField txtMes;
	private JTextField txtAno;
	private JPanel panel;
	private JTextField txtPassword;
	
	private JComboBox cmbCuenta;
	/**
	 * JLabel: declarados public se da uso en clases externas y son
	 * modeficadas desde otras clases
	 */

	/**
	 * Crea frame de la clase.
	 */
	public AnadirCuenta() {
		setResizable(false);
		setTitle("A\u00D1ADIR NUEVO CLIENTE");
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(this);
		
		setBounds(100, 100, 657, 491);
		Menu = new JPanel();
		Menu.setBackground(Color.DARK_GRAY);
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(null);

		panel_Datos_2 = new Panel();
		panel_Datos_2.setBackground(Color.DARK_GRAY);
		panel_Datos_2.setBounds(303, 0, 340, 263);
		Menu.add(panel_Datos_2);
		panel_Datos_2.setLayout(null);

		txtEmail = new JTextField();
		txtEmail.setBounds(111, 10, 219, 31);
		panel_Datos_2.add(txtEmail);
		txtEmail.setColumns(10);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(65, -5, 48, 56);
		panel_Datos_2.add(lblEmail);

		JLabel lblCod_P = new JLabel("Codigo Postal:");
		lblCod_P.setForeground(Color.WHITE);
		lblCod_P.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCod_P.setBounds(111, 47, 94, 49);
		panel_Datos_2.add(lblCod_P);

		txtCod_P = new JTextField();
		txtCod_P.setColumns(10);
		txtCod_P.setBounds(212, 54, 118, 31);
		panel_Datos_2.add(txtCod_P);
		
		txtCalle = new JTextField();
		txtCalle.setColumns(10);
		txtCalle.setBounds(212, 93, 118, 31);
		panel_Datos_2.add(txtCalle);
		
		JLabel lblCalle = new JLabel("Calle:");
		lblCalle.setForeground(Color.WHITE);
		lblCalle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCalle.setBounds(164, 78, 48, 56);
		panel_Datos_2.add(lblCalle);
		
		txtPortal = new JTextField();
		txtPortal.setColumns(10);
		txtPortal.setBounds(212, 135, 118, 31);
		panel_Datos_2.add(txtPortal);
		
		JLabel lblPortal = new JLabel("N\u00BA Portal:");
		lblPortal.setForeground(Color.WHITE);
		lblPortal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPortal.setBounds(134, 120, 71, 56);
		panel_Datos_2.add(lblPortal);
		
		JLabel lblPiso = new JLabel("Piso:");
		lblPiso.setForeground(Color.WHITE);
		lblPiso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPiso.setBounds(164, 162, 40, 56);
		panel_Datos_2.add(lblPiso);
		
		txtPiso = new JTextField();
		txtPiso.setColumns(10);
		txtPiso.setBounds(212, 177, 118, 31);
		panel_Datos_2.add(txtPiso);
		
		JLabel lblPuerta = new JLabel("Puerta:");
		lblPuerta.setForeground(Color.WHITE);
		lblPuerta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPuerta.setBounds(150, 207, 64, 56);
		panel_Datos_2.add(lblPuerta);
		
		txtPuerta = new JTextField();
		txtPuerta.setColumns(10);
		txtPuerta.setBounds(212, 222, 118, 31);
		panel_Datos_2.add(txtPuerta);

		panel_Botones = new JPanel();
		panel_Botones.setBackground(Color.DARK_GRAY);
		panel_Botones.setBounds(105, 411, 338, 42);
		Menu.add(panel_Botones);
		panel_Botones.setLayout(null);
		/**
		 * buttones implementados con ActionListeners
		 */
		btnVolver = new JButton("VOLVER");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVolver.addActionListener(this);
		btnVolver.setBounds(0, 0, 108, 42);
		panel_Botones.add(btnVolver);
		btnA�adir = new JButton("A\u00D1ADIR CLIENTE");
		btnA�adir.addActionListener(this);
		btnA�adir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnA�adir.setBounds(150, 0, 188, 42);
		panel_Botones.add(btnA�adir);

		Panel panel_Datos_1 = new Panel();
		panel_Datos_1.setBackground(Color.DARK_GRAY);
		panel_Datos_1.setLayout(null);
		panel_Datos_1.setBounds(10, 0, 279, 263);
		Menu.add(panel_Datos_1);

		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(151, 5, 118, 31);
		panel_Datos_1.add(txtDNI);

		lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setForeground(Color.WHITE);
		lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre_1.setBounds(76, 32, 65, 56);
		panel_Datos_1.add(lblNombre_1);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(151, 47, 118, 31);
		panel_Datos_1.add(txtNombre);

		JLabel lblDNI_1 = new JLabel("DNI:");
		lblDNI_1.setForeground(Color.WHITE);
		lblDNI_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDNI_1.setBounds(86, -10, 55, 56);
		panel_Datos_1.add(lblDNI_1);

		JLabel lblApellido1_1 = new JLabel("Apellidos:");
		lblApellido1_1.setForeground(Color.WHITE);
		lblApellido1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblApellido1_1.setBounds(0, 76, 65, 49);
		panel_Datos_1.add(lblApellido1_1);

		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(64, 87, 205, 31);
		panel_Datos_1.add(txtApellidos);

		JLabel lblTelf_1 = new JLabel("Tel\u00E9fono:");
		lblTelf_1.setForeground(Color.WHITE);
		lblTelf_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblTelf_1.setBounds(75, 117, 66, 46);
		panel_Datos_1.add(lblTelf_1);

		txtTelf = new JTextField();
		txtTelf.setColumns(10);
		txtTelf.setBounds(151, 127, 118, 31);
		panel_Datos_1.add(txtTelf);
		
		txtDia = new JTextField();
		txtDia.setBounds(124, 174, 34, 31);
		panel_Datos_1.add(txtDia);
		txtDia.setColumns(10);
				
		JLabel lblFecha_N = new JLabel("Fecha Nacimiento:");
		lblFecha_N.setBounds(0, 159, 142, 56);
		panel_Datos_1.add(lblFecha_N);
		lblFecha_N.setForeground(Color.WHITE);
		lblFecha_N.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtMes = new JTextField();
		txtMes.setColumns(10);
		txtMes.setBounds(162, 174, 34, 31);
		panel_Datos_1.add(txtMes);
		
		txtAno = new JTextField();
		txtAno.setColumns(10);
		txtAno.setBounds(199, 174, 70, 31);
		panel_Datos_1.add(txtAno);
		
		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 269, 530, 132);
		Menu.add(panel);
		panel.setLayout(null);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(101, 16, 211, 31);
		txtPassword.setColumns(10);
		panel.add(txtPassword);
		
		JLabel lblCuenta = new JLabel("Tipo de Cuenta:");
		lblCuenta.setBounds(10, 62, 116, 46);
		lblCuenta.setForeground(Color.WHITE);
		lblCuenta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblCuenta);
		
		JLabel lblPassword = new JLabel("Contrase\u00F1a:");
		lblPassword.setBounds(10, 6, 94, 46);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblPassword);
		
		cmbCuenta = new JComboBox();
		cmbCuenta.setBounds(125, 72, 169, 31);
		panel.add(cmbCuenta);
		cmbCuenta.addActionListener(this);
		
		cmbCuenta.addItem("Mec�nico");
		cmbCuenta.addItem("Atenci�n Cliente");

	}

	@Override

	public void actionPerformed(ActionEvent e) {

		Object o = e.getSource();
		
		if (o == btnVolver) {
			
			this.setVisible(false);
			
		} else if (o == btnA�adir) {

			String dni;
			String nombre;
			String apellidos;
			int telefono;
			String email;
			int codigo_postal;
			String calle;
			int portal;
			int piso;
			String puerta;
			
			Fecha fecha_nacimiento;
			int diaN;
			int mesN;
			int anoN;
			
			Fecha fecha_alta;
		    Calendar now = Calendar.getInstance();
		    int ano = now.get(Calendar.YEAR);
		    int mes = (now.get(Calendar.MONTH) + 1);
		    int dia = now.get(Calendar.DATE);
		    
		  String password;
		  int codigo = 0;
		    
		  
		    
		    dni = txtDNI.getText();
		    nombre = txtNombre.getText();
		    apellidos = txtApellidos.getText();
		    telefono = Integer.parseInt(txtTelf.getText());
		    diaN = Integer.parseInt(txtDia.getText());
		    mesN = Integer.parseInt(txtMes.getText());
		    anoN = Integer.parseInt(txtAno.getText());
		    email = txtEmail.getText();
		    codigo_postal = Integer.parseInt(txtCod_P.getText());
		    calle = txtCalle.getText();
		    portal = Integer.parseInt(txtPortal.getText());
		    piso = Integer.parseInt(txtPiso.getText());
		    puerta = txtPuerta.getText();
		    
		    fecha_nacimiento = new Fecha(diaN,mesN,anoN);
		    fecha_alta = new Fecha(dia,mes,ano);
		    
		    password = txtPassword.getText();
		    
		    
		    String opcion = (String) this.cmbCuenta.getSelectedItem();
				 
				switch (opcion) {

				 	case "Mec�nico":
				 		codigo = 1;
				 		break;
				 		
				 	case "Atenci�n Cliente":
				 		codigo = 2;
				 		break;
				}
				
				
		    Cuenta cu = new Cuenta(dni,nombre,apellidos,telefono,fecha_nacimiento,email,codigo_postal,calle,portal,piso,puerta,password,codigo);
			
			File f = new File("C:\\tmp\\cuentas\\" + dni + ".dat");
			FileOutputStream fos;
			ObjectOutputStream oos;
			
			try {
				
				fos = new FileOutputStream(f);
				oos = new ObjectOutputStream (fos);
				
				// lo grabo
				oos.writeObject(cu);
				
				// cierro el fichero
				oos.close();
				fos.close();
				
			} catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
				
			} catch (IOException e1) {
				
				e1.printStackTrace();
				
			}
			
			
			this.setVisible(false);

		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
			
		int opcion = JOptionPane.showConfirmDialog(this,(String)"Si sale, los datos no ser�n guardados. �Desea volver a la p�gina anterior?","INFO",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null);
		
		switch(opcion){
			case JOptionPane.YES_OPTION:
				this.setVisible(false);
				break;
		}
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}