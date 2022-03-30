package car1;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

/**
 * 
 * @author Grupo_4
 * @version 5.1.2
 *
 */
public class CrearOrdenPend extends JFrame implements ActionListener, WindowListener {

	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial correcto funcionamiento de los calculos
	 */
	
	private JButton btnVolver;
	
	private JButton btnCrear;
	
	
	public JLabel lblMatricula_txt;
	public JLabel lblDNI_txt;
	public JLabel lblNBastidor_txt;
	public JLabel lblModelo_txt;
	public JLabel lblMarca_txt;
	public JLabel lblTipo_txt;
	public JLabel lblCilindrada_txt;
	public JLabel lblColor_txt;
	public JLabel lblKMRecorridos_txt;
	public JLabel lblFechaITV_txt;
	public JLabel lblNombre_txt;
	public JLabel lblApellidos_txt;
	public JLabel lblTelefono_txt;
	public JLabel lblFecha_nacimiento_txt;
	public JPanel Menu;
	public JPanel DatosVehiculo;
	public JPanel DatosCliente;
	public JPanel panel_ListasMat;
	public JLabel lblEmail_txt;
	public JLabel lblCodigo_postal_txt;
	public JLabel lblDireccion_txt;
	
	
	public JLabel lblDNI;
	public JLabel lblNombre;
	public JLabel lblApellidos;
	public JLabel lblTelefono;
	public JLabel lblFecha_nacimiento;
	public JLabel lblEmail;
	public JLabel lblCodigo_postal;
	public JLabel lblCalle;
	public JLabel lblPortal;
	public JLabel lblPiso;
	public JLabel lblPuerta;
	
	public JLabel lblMatricula;
	public JLabel lblNBastidor;
	public JLabel lblModelo;
	public JLabel lblMarca;
	public JLabel lblTipo;
	public JLabel lblFechaITV;
	public JLabel lblColor;
	public JLabel lblKMRecorridos;
	public JLabel lblComentario;
	public JLabel lblCilindrada;
	private JLabel lblCodigo_txt;
	public JLabel lblCodigo;


	/**
	 * Crea el frame de la clase.
	 */
	public CrearOrdenPend() {
		/**
		 * @param constructor 
		 * encargado de crear frame de la ventana 
		 */
		setBackground(new Color(255, 255, 255));
		setResizable(false);
		setTitle("CREAR ORDEN PENDIENTE");
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(this);
		
		setBounds(100, 100, 843, 827);
		Menu = new JPanel();
		Menu.setBackground(Color.DARK_GRAY);
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(null);

		DatosVehiculo = new JPanel();
		DatosVehiculo.setBackground(Color.DARK_GRAY);
		DatosVehiculo.setLayout(null);
		DatosVehiculo.setBounds(466, 10, 367, 238);
		Menu.add(DatosVehiculo);

		lblMatricula_txt = new JLabel("Matricula:");
		lblMatricula_txt.setForeground(Color.WHITE);
		lblMatricula_txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMatricula_txt.setBounds(10, 10, 66, 13);
		DatosVehiculo.add(lblMatricula_txt);

		lblNBastidor_txt = new JLabel("N\u00BA bastidor:");
		lblNBastidor_txt.setForeground(Color.WHITE);
		lblNBastidor_txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNBastidor_txt.setBounds(10, 33, 82, 13);
		DatosVehiculo.add(lblNBastidor_txt);

		lblModelo_txt = new JLabel("Modelo:");
		lblModelo_txt.setForeground(Color.WHITE);
		lblModelo_txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblModelo_txt.setBounds(10, 57, 54, 13);
		DatosVehiculo.add(lblModelo_txt);

		lblMarca_txt = new JLabel("Marca:");
		lblMarca_txt.setForeground(Color.WHITE);
		lblMarca_txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMarca_txt.setBounds(10, 80, 54, 13);
		DatosVehiculo.add(lblMarca_txt);

		lblTipo_txt = new JLabel("Tipo:");
		lblTipo_txt.setForeground(Color.WHITE);
		lblTipo_txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipo_txt.setBounds(10, 103, 39, 19);
		DatosVehiculo.add(lblTipo_txt);

		lblCilindrada_txt = new JLabel("Cilindrada:");
		lblCilindrada_txt.setForeground(Color.WHITE);
		lblCilindrada_txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCilindrada_txt.setBounds(10, 132, 82, 13);
		DatosVehiculo.add(lblCilindrada_txt);

		lblFechaITV_txt = new JLabel("ITV:");
		lblFechaITV_txt.setForeground(Color.WHITE);
		lblFechaITV_txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaITV_txt.setBounds(10, 155, 39, 13);
		DatosVehiculo.add(lblFechaITV_txt);

		lblColor_txt = new JLabel("Color:");
		lblColor_txt.setForeground(Color.WHITE);
		lblColor_txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblColor_txt.setBounds(10, 178, 47, 13);
		DatosVehiculo.add(lblColor_txt);

		lblKMRecorridos_txt = new JLabel("KM Recorridos:");
		lblKMRecorridos_txt.setForeground(Color.WHITE);
		lblKMRecorridos_txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKMRecorridos_txt.setBounds(10, 202, 102, 19);
		DatosVehiculo.add(lblKMRecorridos_txt);
		
		lblMatricula = new JLabel("");
		lblMatricula.setForeground(Color.WHITE);
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMatricula.setBounds(86, 12, 203, 13);
		DatosVehiculo.add(lblMatricula);
		
		lblNBastidor = new JLabel("");
		lblNBastidor.setForeground(Color.WHITE);
		lblNBastidor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNBastidor.setBounds(96, 35, 203, 13);
		DatosVehiculo.add(lblNBastidor);
		
		lblModelo = new JLabel("");
		lblModelo.setForeground(Color.WHITE);
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblModelo.setBounds(66, 53, 203, 19);
		DatosVehiculo.add(lblModelo);
		
		lblMarca = new JLabel("");
		lblMarca.setForeground(Color.WHITE);
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMarca.setBounds(55, 80, 203, 13);
		DatosVehiculo.add(lblMarca);
		
		lblTipo = new JLabel("");
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipo.setBounds(47, 108, 197, 13);
		DatosVehiculo.add(lblTipo);
		
		lblCilindrada = new JLabel("");
		lblCilindrada.setForeground(Color.WHITE);
		lblCilindrada.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCilindrada.setBounds(86, 134, 203, 13);
		DatosVehiculo.add(lblCilindrada);
		
		lblFechaITV = new JLabel("");
		lblFechaITV.setForeground(Color.WHITE);
		lblFechaITV.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaITV.setBounds(47, 157, 203, 13);
		DatosVehiculo.add(lblFechaITV);
		
		lblColor = new JLabel("");
		lblColor.setForeground(Color.WHITE);
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblColor.setBounds(55, 178, 203, 13);
		DatosVehiculo.add(lblColor);
		
		lblKMRecorridos = new JLabel("");
		lblKMRecorridos.setForeground(Color.WHITE);
		lblKMRecorridos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKMRecorridos.setBounds(117, 202, 203, 19);
		DatosVehiculo.add(lblKMRecorridos);

		DatosCliente = new JPanel();
		DatosCliente.setBackground(Color.DARK_GRAY);
		DatosCliente.setLayout(null);
		DatosCliente.setBounds(10, 10, 446, 196);
		Menu.add(DatosCliente);

		lblDNI_txt = new JLabel("DNI:");
		lblDNI_txt.setForeground(Color.WHITE);
		lblDNI_txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDNI_txt.setBounds(10, 10, 45, 19);
		DatosCliente.add(lblDNI_txt);

		lblNombre_txt = new JLabel("Nombre:");
		lblNombre_txt.setForeground(Color.WHITE);
		lblNombre_txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre_txt.setBounds(10, 32, 68, 19);
		DatosCliente.add(lblNombre_txt);

		lblApellidos_txt = new JLabel("Apellidos:");
		lblApellidos_txt.setForeground(Color.WHITE);
		lblApellidos_txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblApellidos_txt.setBounds(10, 49, 68, 31);
		DatosCliente.add(lblApellidos_txt);

		lblTelefono_txt = new JLabel("Tel\u00E9fono:");
		lblTelefono_txt.setForeground(Color.WHITE);
		lblTelefono_txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTelefono_txt.setBounds(10, 73, 68, 31);
		DatosCliente.add(lblTelefono_txt);

		lblFecha_nacimiento_txt = new JLabel("Fecha nacimiento:");
		lblFecha_nacimiento_txt.setForeground(Color.WHITE);
		lblFecha_nacimiento_txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFecha_nacimiento_txt.setBounds(10, 103, 123, 15);
		DatosCliente.add(lblFecha_nacimiento_txt);
		
		lblEmail_txt = new JLabel("Email:");
		lblEmail_txt.setForeground(Color.WHITE);
		lblEmail_txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail_txt.setBounds(10, 124, 51, 15);
		DatosCliente.add(lblEmail_txt);
		
		lblCodigo_postal_txt = new JLabel("C\u00F3digo postal:");
		lblCodigo_postal_txt.setForeground(Color.WHITE);
		lblCodigo_postal_txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCodigo_postal_txt.setBounds(10, 142, 95, 19);
		DatosCliente.add(lblCodigo_postal_txt);
		
		lblDireccion_txt = new JLabel("Direcci\u00F3n:");
		lblDireccion_txt.setForeground(Color.WHITE);
		lblDireccion_txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDireccion_txt.setBounds(10, 163, 68, 19);
		DatosCliente.add(lblDireccion_txt);
		
		lblDNI = new JLabel("");
		lblDNI.setForeground(Color.WHITE);
		lblDNI.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDNI.setBounds(46, 10, 123, 20);
		DatosCliente.add(lblDNI);
		
		lblNombre = new JLabel("");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(79, 32, 152, 20);
		DatosCliente.add(lblNombre);
		
		lblApellidos = new JLabel("");
		lblApellidos.setForeground(Color.WHITE);
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblApellidos.setBounds(79, 49, 187, 31);
		DatosCliente.add(lblApellidos);
		
		lblTelefono = new JLabel("");
		lblTelefono.setForeground(Color.WHITE);
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTelefono.setBounds(79, 73, 123, 31);
		DatosCliente.add(lblTelefono);
		
		lblFecha_nacimiento = new JLabel("");
		lblFecha_nacimiento.setForeground(Color.WHITE);
		lblFecha_nacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFecha_nacimiento.setBounds(133, 98, 152, 25);
		DatosCliente.add(lblFecha_nacimiento);
		
		lblEmail = new JLabel("");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(57, 114, 230, 33);
		DatosCliente.add(lblEmail);
		
		lblCodigo_postal = new JLabel("");
		lblCodigo_postal.setForeground(Color.WHITE);
		lblCodigo_postal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCodigo_postal.setBounds(108, 136, 123, 31);
		DatosCliente.add(lblCodigo_postal);
		
		lblCalle = new JLabel("");
		lblCalle.setForeground(Color.WHITE);
		lblCalle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCalle.setBounds(79, 163, 142, 20);
		DatosCliente.add(lblCalle);
		
		lblPortal = new JLabel("");
		lblPortal.setForeground(Color.WHITE);
		lblPortal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPortal.setBounds(231, 163, 33, 20);
		DatosCliente.add(lblPortal);
		
		lblPiso = new JLabel("");
		lblPiso.setForeground(Color.WHITE);
		lblPiso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPiso.setBounds(274, 163, 33, 20);
		DatosCliente.add(lblPiso);
		
		lblPuerta = new JLabel("");
		lblPuerta.setForeground(Color.WHITE);
		lblPuerta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPuerta.setBounds(317, 163, 119, 20);
		DatosCliente.add(lblPuerta);

		panel_ListasMat = new JPanel();
		panel_ListasMat.setBackground(Color.DARK_GRAY);
		panel_ListasMat.setBounds(10, 459, 774, 159);
		Menu.add(panel_ListasMat);
		panel_ListasMat.setLayout(null);
		
		JList list = new JList();
		list.setBounds(0, 0, 358, 159);
		panel_ListasMat.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(416, 0, 358, 159);
		panel_ListasMat.add(list_1);
	
		/**
		 * Boton implementado con Action Listener
		 */
		btnCrear = new JButton("GENERAR FACTURA");
		btnCrear.addActionListener(this);
		btnCrear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCrear.setBounds(10, 681, 186, 31);
		Menu.add(btnCrear);

		JPanel Comentario = new JPanel();
		Comentario.setBackground(Color.DARK_GRAY);
		Comentario.setBounds(10, 257, 819, 128);
		Menu.add(Comentario);
		Comentario.setLayout(null);
		
		lblComentario = new JLabel("");
		lblComentario.setForeground(Color.WHITE);
		lblComentario.setBounds(10, 10, 799, 108);
		Comentario.add(lblComentario);
		/**
		 * Boton implementado con Action Listener
		 */
		btnVolver = new JButton("VOLVER");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVolver.setBounds(10, 732, 186, 31);
		Menu.add(btnVolver);
		
		lblCodigo_txt = new JLabel("C\u00F3digo Orden Primaria:");
		lblCodigo_txt.setForeground(Color.WHITE);
		lblCodigo_txt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCodigo_txt.setBounds(20, 216, 157, 19);
		Menu.add(lblCodigo_txt);
		
		lblCodigo = new JLabel("");
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCodigo.setBounds(181, 216, 250, 19);
		Menu.add(lblCodigo);
		btnVolver.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();

		if (o == btnCrear) {
			
			
			
		}
		else if (o == btnVolver) {
			
			this.setVisible(false);
			
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		int opcion = JOptionPane.showConfirmDialog(this,(String)"Si sale, los datos no serán guardados. ¿Desea salir del programa?","INFO",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null);
		
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


