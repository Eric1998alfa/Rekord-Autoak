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
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ItemEvent;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;

/**
 * 
 * @author Grupo_4
 * @version 5.1.2
 *
 */
public class CrearOrdenPrim extends JFrame implements ActionListener, ListSelectionListener, WindowListener {

	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial correcto funcionamiento de los calculos
	 */
	public JButton btnInfoVehiculo;

	public JButton btnVolver;

	public JButton btnInfoCliente;

	public static JButton btnAnadirVehiculo;

	public JButton btnAnadirCliente;
	
	public JTextArea txtComentario;

	public JButton btnCrearOrden;

	private JLabel lblAccesoVehiculo;
	private JPanel Factura;
	private JPanel panelAbajo;
	private JPanel AccesoCliente;
	private JPanel AccesoVehiculos;
	private JLabel lblAccesoCliente;
	private JPanel panel_1;
	private JLabel lblAñadirComentario;
	private JTextField txtCliente;
	private JTextField txtVehiculo;


	public CrearOrdenPrim() {
		setResizable(false);
		setTitle("CREAR ORDEN DE TRABAJO");
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(this);
		
		setBounds(100, 100, 750, 452);
		Factura = new JPanel();
		Factura.setForeground(Color.WHITE);
		Factura.setBackground(Color.DARK_GRAY);
		Factura.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Factura);
		Factura.setLayout(null);

		AccesoCliente = new JPanel();
		AccesoCliente.setBackground(Color.DARK_GRAY);
		AccesoCliente.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		AccesoCliente.setBounds(34, 10, 657, 60);
		Factura.add(AccesoCliente);
		AccesoCliente.setLayout(null);

		btnInfoCliente = new JButton("INFO");
		btnInfoCliente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInfoCliente.addActionListener(this);
		btnInfoCliente.setBounds(541, 15, 85, 33);
		AccesoCliente.add(btnInfoCliente);

		lblAccesoCliente = new JLabel("CLIENTE");
		lblAccesoCliente.setForeground(Color.WHITE);
		lblAccesoCliente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAccesoCliente.setBounds(10, 15, 85, 33);
		AccesoCliente.add(lblAccesoCliente);

		btnAnadirCliente = new JButton("A\u00D1ADIR NUEVO CLIENTE");
		btnAnadirCliente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAnadirCliente.addActionListener(this);

		btnAnadirCliente.setBounds(291, 15, 221, 33);
		AccesoCliente.add(btnAnadirCliente);
		
		txtCliente = new JTextField();
		txtCliente.setBounds(115, 15, 151, 33);
		AccesoCliente.add(txtCliente);
		txtCliente.setColumns(10);

		panelAbajo = new JPanel();
		panelAbajo.setBackground(Color.DARK_GRAY);
		panelAbajo.setBounds(139, 353, 445, 51);
		Factura.add(panelAbajo);
		panelAbajo.setLayout(null);

		btnVolver = new JButton("VOLVER");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVolver.addActionListener(this);
		btnVolver.setBounds(10, 10, 133, 31);
		panelAbajo.add(btnVolver);

		btnCrearOrden = new JButton("CREAR ORDEN PRIMARIA");
		btnCrearOrden.setBounds(153, 10, 272, 31);
		panelAbajo.add(btnCrearOrden);
		btnCrearOrden.addActionListener(this);
		btnCrearOrden.setFont(new Font("Tahoma", Font.PLAIN, 15));

		AccesoVehiculos = new JPanel();
		AccesoVehiculos.setBackground(Color.DARK_GRAY);
		AccesoVehiculos.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		AccesoVehiculos.setBounds(34, 80, 657, 58);
		Factura.add(AccesoVehiculos);
		AccesoVehiculos.setLayout(null);

		btnInfoVehiculo = new JButton("INFO");
		btnInfoVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInfoVehiculo.addActionListener(this);
		btnInfoVehiculo.setBounds(542, 13, 85, 33);
		AccesoVehiculos.add(btnInfoVehiculo);

		lblAccesoVehiculo = new JLabel("VEHICULO");
		lblAccesoVehiculo.setForeground(Color.WHITE);
		lblAccesoVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAccesoVehiculo.setBounds(10, 23, 99, 13);
		AccesoVehiculos.add(lblAccesoVehiculo);

		btnAnadirVehiculo = new JButton("A\u00D1ADIR NUEVO VEHICULO");
		btnAnadirVehiculo.addActionListener(this);
		btnAnadirVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAnadirVehiculo.setBounds(290, 13, 222, 33);
		AccesoVehiculos.add(btnAnadirVehiculo);
		
		txtVehiculo = new JTextField();
		txtVehiculo.setColumns(10);
		txtVehiculo.setBounds(115, 13, 151, 33);
		AccesoVehiculos.add(txtVehiculo);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(34, 149, 657, 168);
		Factura.add(panel_1);
		panel_1.setLayout(null);
		
		lblAñadirComentario = new JLabel("A\u00D1ADIR COMENTARIO DE LA ORDEN");
		lblAñadirComentario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAñadirComentario.setForeground(Color.WHITE);
		lblAñadirComentario.setBounds(20, 10, 226, 27);
		panel_1.add(lblAñadirComentario);
		
		JScrollPane barraScroll = new JScrollPane();
		barraScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		barraScroll.setBounds(10, 39, 637, 118);
		panel_1.add(barraScroll);
		
		txtComentario = new JTextArea();
		barraScroll.setViewportView(txtComentario);


		
	}

	@SuppressWarnings({ "static-access" })

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * definir objeto o que redirige a la fuente
		 */
		Object o = e.getSource();

		if (o == btnInfoCliente) {
			
			String dni;
		    dni = txtCliente.getText();
			
		    File f = new File("C:\\tmp\\clientes\\" + dni + ".dat");
			
			Cliente c = null;

			FileInputStream fis;
			ObjectInputStream ois;
			
			try
			{
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);
				
				c = (Cliente) ois.readObject();
				
				String DNI = c.getDNI();
				String Nombre = c.getNombre();
				String Apellidos = c.getApellidos();
				int Telefono = c.getTelefono();
				Fecha Fecha_nacimiento = c.getFecha_nacimiento();
				String Email = c.getEmail();
				int Codigo_postal = c.getCodigo_postal();
				String Calle = c.getCalle();
				int Portal = c.getPortal();
				int Piso = c.getPiso();
				String Puerta = c.getPuerta();
				Fecha Fecha_alta = c.getFecha_alta();
				
				
				InfoCliente IC = new InfoCliente();
				
				IC.lblDNI.setText(DNI);
				IC.lblNombre.setText(Nombre);
				IC.lblApellidos.setText(Apellidos);
				IC.lblTelf.setText(String.valueOf(Telefono));
				IC.lblEmail.setText(Email);
				IC.lblCod_P.setText(String.valueOf(Codigo_postal));
				IC.lblFecha_N.setText(String.valueOf(Fecha_nacimiento));
				IC.lblFecha_A.setText(String.valueOf(Fecha_alta));
				IC.lblCalle.setText(Calle);
				IC.lblPortal.setText(String.valueOf(Portal));
				IC.lblPiso.setText(String.valueOf(Portal));
				IC.lblPuerta.setText(Puerta);

				IC.setVisible(true);
				IC.setLocationRelativeTo(null);

				
				ois.close();
				fis.close();
			}
			catch (IOException e1)
			{
				
				JOptionPane.showMessageDialog (null, "El DNI introducido no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
				
			}
			catch (ClassNotFoundException e1)
			{
				System.out.println("error carga - clase");
			}


		} else if (o == btnAnadirCliente) {
			
			AnadirCliente aC = new AnadirCliente();
			aC.setVisible(true);
			aC.setLocationRelativeTo(null);

		} else if (o == btnAnadirVehiculo) {

			AnadirVehic Av = new AnadirVehic();
			Av.setVisible(true);
			Av.setLocationRelativeTo(null);

		} else if (o == btnInfoVehiculo) {

			String matricula;
		    matricula = txtVehiculo.getText();
			
		    File f = new File("C:\\tmp\\vehiculos\\" + matricula + ".dat");
			
			Vehiculo v = null;

			FileInputStream fis;
			ObjectInputStream ois;
			
			try
			{
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);
				
				v = (Vehiculo) ois.readObject();

				String Matricula = v.getMatricula();
				String Num_Bastidor = v.getNum_Bastidor();
				String Modelo = v.getModelo();
				String Marca = v.getMarca();
				int KM_Recorridos = v.getKM_Recorridos();
				int Cilindrada = v.getCilindrada();
				String Color = v.getColor();
				String Tipo = v.getTipo();
				int Fecha_ITV = v.getFecha_ITV();
				
				

				InfoVehic Veh = new InfoVehic();
				
				Veh.setVisible(true);
				Veh.lblMatricula.setText(Matricula);
				Veh.lblNumBastidor.setText(Num_Bastidor);
				Veh.lblModelo.setText(Modelo);
				Veh.lblMarca.setText(Marca);
				Veh.lblTipo.setText(Tipo);
				Veh.lblFechaITV.setText(String.valueOf(Fecha_ITV));
				Veh.lblColor.setText(Color);
				Veh.lblKmRecorridos.setText(String.valueOf(KM_Recorridos));
				Veh.lblCilindrada.setText(String.valueOf(Cilindrada));

				Veh.setLocationRelativeTo(null);

				
				ois.close();
				fis.close();
			}
			catch (IOException e1)
			{
				
				JOptionPane.showMessageDialog (null, "La matricula introducida no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
				
			}
			catch (ClassNotFoundException e1)
			{
				System.out.println("error carga - clase");
			}



		} else if (o == btnVolver) {
			/**
			 * instancia MaC de la clase MenuAtCliente cierra la ventana actual y abre la
			 * ventana MenuAtCliente
			 */
			this.setVisible(false);
			MenuAtc MaC = new MenuAtc();
			MaC.setVisible(true);
			MaC.setLocationRelativeTo(null);
		}

		else if (o == btnCrearOrden) {
			
		    //CLIENTE
		    String dni;
		    dni = txtCliente.getText();
			
		    File f = new File("C:\\tmp\\clientes\\" + dni + ".dat");
			Cliente c = null;

			FileInputStream fis;
			ObjectInputStream ois;
			
			
			//VEHICULO
			String matricula;
		    matricula = txtVehiculo.getText();
			
		    File f2 = new File("C:\\tmp\\vehiculos\\" + matricula + ".dat");
			Vehiculo v = null;

			FileInputStream fis2;
			ObjectInputStream ois2;
			
			
			//ORDEN PRIMARIA
		    String CodOrdenprim;
		    Calendar calendar = Calendar.getInstance();
		    SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmss");
		    CodOrdenprim = formatter.format(calendar.getTime());
		    
			File f3 = new File("C:\\tmp\\ordenprimaria\\" + CodOrdenprim + ".dat");
			
			FileOutputStream fos3;
			ObjectOutputStream oos3;
			
			try
			{
				//CLIENTE
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);
				
				c = (Cliente) ois.readObject();
				
				String DNI = c.getDNI();
				String Nombre = c.getNombre();
				String Apellidos = c.getApellidos();
				int Telefono = c.getTelefono();
				Fecha Fecha_nacimiento = c.getFecha_nacimiento();
				String Email = c.getEmail();
				int Codigo_postal = c.getCodigo_postal();
				String Calle = c.getCalle();
				int Portal = c.getPortal();
				int Piso = c.getPiso();
				String Puerta = c.getPuerta();
				Fecha Fecha_alta = c.getFecha_alta();

				ois.close();
				fis.close();
				
			
				try {
					//VEHICULO
					fis2 = new FileInputStream(f2);
					ois2 = new ObjectInputStream(fis2);
						
					v = (Vehiculo) ois2.readObject();
	
					String Matricula = v.getMatricula();
					String Num_Bastidor = v.getNum_Bastidor();
					String Modelo = v.getModelo();
					String Marca = v.getMarca();
					int KM_Recorridos = v.getKM_Recorridos();
					int Cilindrada = v.getCilindrada();
					String Color = v.getColor();
					String Tipo = v.getTipo();
					int Fecha_ITV = v.getFecha_ITV();
						
					ois2.close();
					fis2.close();
					
					
					//COMENTARIO
					String Comentarios;
				  Comentarios = txtComentario.getText();
				    
	
				  OrdenPrim op = new OrdenPrim(DNI,Nombre,Apellidos,Telefono,Fecha_nacimiento,
				  														Email,Codigo_postal,Calle,Portal,Piso,Puerta,Fecha_alta,
				  														Matricula,Num_Bastidor,Modelo,Marca,KM_Recorridos,Cilindrada,
				  														Fecha_ITV,Color,Tipo,Comentarios,CodOrdenprim);
					
					
					try {
						
						fos3 = new FileOutputStream(f3);
						oos3 = new ObjectOutputStream (fos3);
						
						// lo grabo
						oos3.writeObject(op);
						
						// cierro el fichero
						oos3.close();
						fos3.close();
						
						
						
						//FINALIZADO
						JOptionPane.showMessageDialog(this,(String)"Orden Primaria creada","INFO",JOptionPane.INFORMATION_MESSAGE,null);
						this.setVisible(false);
						
						CrearOrdenPrim BI=new CrearOrdenPrim();
						BI.setVisible(true);
						this.setVisible(false);
						BI.setLocationRelativeTo(null);
						
						
					} catch (FileNotFoundException e1) {
						
						e1.printStackTrace();
						
					} catch (IOException e1) {
						
						e1.printStackTrace();
						
					}
				    
				
				}
				catch (IOException e1)
				{
					//ERROR VEHICULO
					JOptionPane.showMessageDialog (null, "La matricula introducida no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
			}
			catch (IOException e1)
			{
				
				//ERROR DNI
				JOptionPane.showMessageDialog (null, "El DNI introducido no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
				
			}
			catch (ClassNotFoundException e1)
			{
				System.out.println("error carga - clase");
			}


		}
	}



	@SuppressWarnings("unchecked")
	@Override
	public void valueChanged(ListSelectionEvent e) {

		Object o = e.getSource();
		@SuppressWarnings("unused")
		int posicion;
		posicion = ((JList<String>) o).getSelectedIndex();
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
