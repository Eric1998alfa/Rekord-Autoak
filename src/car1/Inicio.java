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
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;

/**
 * 
 * @author Grupo_4
 * @version 5.1.2
 *
 */
public class Inicio extends JFrame implements ActionListener, ListSelectionListener, WindowListener{
	
	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial correcto funcionamiento de los calculos
	 */
	private JPanel Menu;
	private JPanel AccesoCliente;
	private JLabel lblContrasena;
	public JButton btnAceptarLogin;
	private JPanel AccesoVehiculos;
	private JLabel lblDni;
	private JTextField txtDni;
	private JPasswordField txtContrasena;
	FileInputStream fis; 
	ObjectInputStream ois;
	
	// He modificado el INICIO
	// Testeo
	
	/**
	 * Crea frame de la clase.
	 */
	public Inicio() {
		
		setBackground(new Color(255, 255, 255));
		setResizable(false);
		setTitle("LOGIN");
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(this);
		
		setBounds(100, 100, 497, 296);
		Menu = new JPanel();
		Menu.setBackground(Color.DARK_GRAY);
		Menu.setForeground(Color.WHITE);
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(null);

		AccesoCliente = new JPanel();
		AccesoCliente.setBackground(Color.DARK_GRAY);
		AccesoCliente.setForeground(Color.BLUE);
		AccesoCliente.setBounds(101, 85, 308, 49);
		Menu.add(AccesoCliente);
		AccesoCliente.setLayout(null);

		lblContrasena = new JLabel("Contraseña:");
		lblContrasena.setForeground(Color.WHITE);
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblContrasena.setBounds(10, 17, 98, 13);
		AccesoCliente.add(lblContrasena);

		txtContrasena = new JPasswordField();
		txtContrasena.addActionListener(this);
		txtContrasena.setBounds(118, 7, 165, 34);
		AccesoCliente.add(txtContrasena);

		AccesoVehiculos = new JPanel();
		AccesoVehiculos.setBackground(Color.DARK_GRAY);
		AccesoVehiculos.setForeground(Color.RED);
		AccesoVehiculos.setLayout(null);
		AccesoVehiculos.setBounds(101, 26, 308, 49);
		Menu.add(AccesoVehiculos);

		lblDni = new JLabel("DNI:");
		lblDni.setForeground(Color.WHITE);
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDni.setBounds(10, 18, 96, 13);
		AccesoVehiculos.add(lblDni);

		txtDni = new JTextField();
		txtDni.setText("");
		txtDni.setBounds(116, 7, 167, 34);
		AccesoVehiculos.add(txtDni);
		txtDni.setColumns(10);
		/**
		 * buttones implementados con ActionListeners
		 */

		btnAceptarLogin = new JButton("ACCEDER");
		btnAceptarLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAceptarLogin.setBounds(191, 162, 120, 36);
		Menu.add(btnAceptarLogin);
		btnAceptarLogin.addActionListener(this);
		

	}
	
	

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		
		String txtcontrasena;
		String txtdni;
		
		txtdni = txtDni.getText();
		txtcontrasena = new String(txtContrasena.getPassword());
		
		Object o = ae.getSource();
		
		if (o == btnAceptarLogin || o == txtContrasena) {
			
			FileInputStream fis; 
			ObjectInputStream ois;
			
			File f = new File("C:\\tmp\\cuentas\\" + txtdni + ".dat");
			
			
			Cuenta cu = new Cuenta();
			
			try {
				
				// Abro el fichero
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);
				
				cu = (Cuenta) ois.readObject();
				
					
				String dni = cu.getDNI();
				String password = cu.getPassword();
				int codigo = cu.getCodigo();
					
				
				if (txtdni.equals(dni) && txtcontrasena.equals(password)) {
					
					if (codigo == 1) {
						//Mecánico
						ListaOrdenesPrim abrir = new ListaOrdenesPrim();
						this.setVisible(false);
						abrir.setVisible(true);
						abrir.setLocationRelativeTo(null);
						
						
					} else {
						//Atención Cliente (admin)
						MenuAtc abrir = new MenuAtc();
						this.setVisible(false);
						abrir.setVisible(true);
						abrir.setLocationRelativeTo(null);
					}
					
				} else {
					
					JOptionPane.showMessageDialog(this, (String) "DNI o contraseña erroneos", "ERROR",JOptionPane.ERROR_MESSAGE);
				}
				
				
				// Lo cierra
				ois.close();
				fis.close();
				
			} catch (IOException e) {

				e.printStackTrace();
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
				
			}

		}
		
		
	}
		

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub

	}



	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowClosing(WindowEvent e) {

		int opcion = JOptionPane.showConfirmDialog(this,(String)"¿Deseas salir?","INFO",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null);
		
		switch(opcion){
			case JOptionPane.YES_OPTION:
				System.exit(0);
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