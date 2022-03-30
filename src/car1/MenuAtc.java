package car1;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import java.awt.Color;
/**
 * 
 * @author Grupo_4
 * @version 5.1.2
 *
 */

public class MenuAtc extends JFrame implements ActionListener, WindowListener{

	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial evita fallos de calculo
	 * 
	 */
	private JPanel Factura;
	private JPanel panelAbajo;
	private JPanel AccesoCliente;
	private JPanel AccesoArreglos;
	private JButton btnOrdenesTrabajo;
	private JButton btnNuevaOrden;
	private JButton btnVolver;
	private JButton btnCuenta;
	private JButton btnMaterial;
	/**
	 * Jlabel: declarados private no se modifica fuera de la clase
	 */
	

	/**
	 * Se crea el frame de la clase.
	 */
	public MenuAtc() {
		setBackground(new Color(255, 255, 255));
		setResizable(false);
		setTitle("MENU Atenci\u00F3n Clientes");
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(this);
		
		setBounds(100, 100, 750, 553);
		Factura = new JPanel();
		Factura.setBackground(Color.DARK_GRAY);
		Factura.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Factura);
		Factura.setLayout(null);
		
		AccesoCliente = new JPanel();
		AccesoCliente.setBackground(Color.DARK_GRAY);
		AccesoCliente.setBounds(34, 54, 607, 86);
		Factura.add(AccesoCliente);
		AccesoCliente.setLayout(null);
		
		btnOrdenesTrabajo = new JButton("Lista Ordenes de trabajo");
		btnOrdenesTrabajo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnOrdenesTrabajo.addActionListener(this);
		btnOrdenesTrabajo.setBounds(171, 10, 269, 62);
		AccesoCliente.add(btnOrdenesTrabajo);
		
		AccesoArreglos = new JPanel();
		AccesoArreglos.setBackground(Color.DARK_GRAY);
		AccesoArreglos.setLayout(null);
		AccesoArreglos.setBounds(34, 181, 607, 94);
		Factura.add(AccesoArreglos);
		
		btnNuevaOrden = new JButton("Crear Orden de trabajo");
		btnNuevaOrden.setBounds(167, 10, 275, 71);
		AccesoArreglos.add(btnNuevaOrden);
		btnNuevaOrden.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNuevaOrden.addActionListener(this);
		
		panelAbajo= new JPanel();
		panelAbajo.setBackground(Color.DARK_GRAY);
		panelAbajo.setBounds(10, 403, 195, 112);
		Factura.add(panelAbajo);
		panelAbajo.setLayout(null);
		/**
		 * Boton implementado con Action Listeer
		 */
		btnVolver = new JButton("VOLVER");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVolver.addActionListener(this);
		btnVolver.setBounds(10, 25, 174, 58);
		panelAbajo.add(btnVolver);
		
		JPanel AccesoArreglos_1 = new JPanel();
		AccesoArreglos_1.setLayout(null);
		AccesoArreglos_1.setBackground(Color.DARK_GRAY);
		AccesoArreglos_1.setBounds(484, 318, 252, 197);
		Factura.add(AccesoArreglos_1);
		
		btnCuenta = new JButton("Crear Cuenta");
		btnCuenta.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCuenta.setBounds(78, 10, 164, 71);
		AccesoArreglos_1.add(btnCuenta);
		btnCuenta.addActionListener(this);
		
		btnMaterial = new JButton("A\u00F1adir Material");
		btnMaterial.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnMaterial.setBounds(78, 104, 164, 71);
		AccesoArreglos_1.add(btnMaterial);
		btnMaterial.addActionListener(this);
	 

	}


	@Override
public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o= e.getSource();
		/**
		 * Si se pulsa el boton btnOrdenesTrabajo, instanciar LaC de la clase ListaAtClientes
		 */
		if(o==btnOrdenesTrabajo) {

			ListaOrdenes LaC=new ListaOrdenes();
			LaC.setVisible(true);
			this.setVisible(false);
			LaC.setLocationRelativeTo(null);

		
		}
		/**
		 * Si se pulsa el boton btnNuevaOrden, instanciar BI de la clase Base_Inicial
		 */
		else if(o==btnNuevaOrden){
		
			CrearOrdenPrim BI=new CrearOrdenPrim();
			BI.setVisible(true);
			this.setVisible(false);
			BI.setLocationRelativeTo(null);
		
		}
		/**
		 * Si se pulsa el boton btnVolver, instanciar LaC de ListaAtClientes
		 */	
		else if(o==btnVolver){
			Inicio aL=new Inicio();
			aL.setVisible(true);
			aL.setLocationRelativeTo(null);
			this.setVisible(false);
		} 
		else if(o==btnCuenta) {
			AnadirCuenta AC = new AnadirCuenta();
			AC.setVisible(true);
			AC.setLocationRelativeTo(null);
		} 
		else if(o==btnMaterial) {
			AnadirMaterial AM = new AnadirMaterial();
			AM.setVisible(true);
			AM.setLocationRelativeTo(null);
		}
	}


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		
		int opcion = JOptionPane.showConfirmDialog(this,(String)"Si cierra el programa, se cerrará la sesión. ¿Desea salir del programa?","INFO",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null);
		
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

	




	