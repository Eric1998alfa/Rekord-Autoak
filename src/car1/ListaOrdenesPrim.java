package car1;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 * 
 * @author Grupo_4
 * @version 5.1.2
 *
 */

public class ListaOrdenesPrim extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial evita fallos de calculo
	 */

	public JButton btnVolver;
	/**
	 * JButton, JButton,String Jlabel: declarados public,se les asigna valor desde
	 * otras clases
	 */
	public JButton btnAcceder;
	/**
	 * JComboBox declarados public porque estan llamados, asignados valor desde otras
	 * clases
	 */
	private JPanel Factura;
	private JPanel panelAbajo;
	private JTextField txtOrdenPrim;

	/**
	 * Se crea el Frame de la clase
	 */
	public ListaOrdenesPrim() {
		setResizable(false);
		setTitle("LISTA ORDENES PRIMARIAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 691);
		Factura = new JPanel();
		Factura.setBackground(Color.DARK_GRAY);
		Factura.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Factura);
		Factura.setLayout(null);

		panelAbajo = new JPanel();
		panelAbajo.setBackground(Color.DARK_GRAY);
		panelAbajo.setBounds(33, 577, 550, 67);
		Factura.add(panelAbajo);
		panelAbajo.setLayout(null);
		/**
		 * Boton implementado con Action Listener
		 */
		btnVolver = new JButton("VOLVER");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVolver.addActionListener(this);
		btnVolver.setBounds(39, 10, 137, 46);
		panelAbajo.add(btnVolver);
		/**
		 * Boton implementado con Action Listener
		 */
		btnAcceder = new JButton("ACCEDER");
		btnAcceder.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAcceder.setBounds(211, 13, 291, 41);
		panelAbajo.add(btnAcceder);
		btnAcceder.addActionListener(this);

		JLabel lblTitulo = new JLabel("Listado de Ordenes Primarias");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTitulo.setBounds(27, 22, 354, 26);
		Factura.add(lblTitulo);
		
		txtOrdenPrim = new JTextField();
		txtOrdenPrim.setBounds(71, 106, 385, 43);
		Factura.add(txtOrdenPrim);
		txtOrdenPrim.setColumns(10);


		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * @param ActionEvent
		 * escucha los eventos y carga la matriz selecionada a campo correspondiente
		 */
		Object o = e.getSource();

		if (o == btnAcceder) {
			
			String OrdenPrim;
		  OrdenPrim = txtOrdenPrim.getText();
			
		  File f = new File("C:\\tmp\\ordenprimaria\\" + OrdenPrim + ".dat");
			
			OrdenPrim op = null;

			FileInputStream fis;
			ObjectInputStream ois;
			
			try
			{
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);
				
				op = (OrdenPrim) ois.readObject();
				
				String DNI = op.getDNI();
				String Nombre = op.getNombre();
				String Apellidos = op.getApellidos();
				int Telefono = op.getTelefono();
				Fecha Fecha_nacimiento = op.getFecha_nacimiento();
				String Email = op.getEmail();
				int Codigo_postal = op.getCodigo_postal();
				String Calle = op.getCalle();
				int Portal = op.getPortal();
				int Piso = op.getPiso();
				String Puerta = op.getPuerta();
				
				String Matricula = op.getMatricula();
				String Num_Bastidor = op.getNum_Bastidor();
				String Modelo = op.getModelo();
				String Marca = op.getMarca();
				int KM_Recorridos = op.getKM_Recorridos();
				int Cilindrada = op.getCilindrada();
				int Fecha_ITV = op.getFecha_ITV();
				String Color = op.getColor();
				String Tipo = op.getTipo();
				
				String Comentarios = op.getComentarios();
				String CodOrdenprim = op.getCodOrdenprim();
				
				
				CrearOrdenPend Cop = new CrearOrdenPend();
				
				//Datos Cliente
				Cop.lblDNI.setText(DNI);
				Cop.lblNombre.setText(Nombre);
				Cop.lblApellidos.setText(Apellidos);
				Cop.lblTelefono.setText(String.valueOf(Telefono));
				Cop.lblFecha_nacimiento.setText(String.valueOf(Fecha_nacimiento));
				Cop.lblEmail.setText(Email);
				Cop.lblCodigo_postal.setText(String.valueOf(Codigo_postal));
				Cop.lblCalle.setText(Calle);
				Cop.lblPortal.setText(String.valueOf(Portal));
				Cop.lblPiso.setText(String.valueOf(Piso));
				Cop.lblPuerta.setText(Puerta);
				
				
				//Datos Vehiculo
				Cop.lblMatricula.setText(Matricula);
				Cop.lblNBastidor.setText(Num_Bastidor);
				Cop.lblModelo.setText(Modelo);
				Cop.lblMarca.setText(Marca);
				Cop.lblTipo.setText(Tipo);
				Cop.lblFechaITV.setText(String.valueOf(Fecha_ITV));
				Cop.lblColor.setText(Color);
				Cop.lblKMRecorridos.setText(String.valueOf(KM_Recorridos));
				Cop.lblCilindrada.setText(String.valueOf(Cilindrada));
				
				Cop.lblComentario.setText(Comentarios);
				Cop.lblCodigo.setText(CodOrdenprim);
				
				Cop.setVisible(true);
				Cop.setLocationRelativeTo(null);
				
				
				ois.close();
				fis.close();
			}
			catch (IOException e1)
			{
				
				JOptionPane.showMessageDialog (null, "La Orden Primaria introducida no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
				
			}
			catch (ClassNotFoundException e1)
			{
				System.out.println("error carga - clase");
			}

		} else if (o == btnVolver) {
			
			Inicio I = new Inicio();
			I.setVisible(true);
			I.setLocationRelativeTo(null);
			this.setVisible(false);

		}
	}
}

	




	