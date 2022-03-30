package car1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;

/**
 * 
 * @author Grupo_4
 * @version 5.1.2
 *
 */

public class ListaOrdenes extends JFrame implements ActionListener, WindowListener {

	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial evita fallo en calculo de variables
	 * 
	 */

	private JButton btnVolver;
	private JButton btnOrdenesPrim;
	private JButton btnOrdenesPend;
	private JButton btnFacturasAprob;
	
	/**
	 * JComboBox: public se da uso en clases extenas y son modificadas desde fuera
	 */
	private JPanel Factura;
	private JPanel panelAbajo;

	/**
	 * Launch the application.
	 */

	/**
	 * Se crea el Frame de la clase.
	 */
	public ListaOrdenes() {
		setResizable(false);
		setTitle("LISTA DE ORDENES");
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(this);
		
		setBounds(100, 100, 750, 515);
		Factura = new JPanel();
		Factura.setBackground(Color.DARK_GRAY);
		Factura.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Factura);
		Factura.setLayout(null);

		panelAbajo = new JPanel();
		panelAbajo.setBackground(Color.DARK_GRAY);
		panelAbajo.setBounds(22, 390, 286, 67);
		Factura.add(panelAbajo);
		panelAbajo.setLayout(null);
		/**
		 * Boton implementado con Action Listener
		 */
		btnVolver = new JButton("VOLVER");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVolver.addActionListener(this);
		btnVolver.setBounds(10, 11, 137, 46);
		panelAbajo.add(btnVolver);

		JLabel lblTitulo = new JLabel("Listado de Ordenes de trabajo");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTitulo.setBounds(22, 22, 354, 26);
		Factura.add(lblTitulo);
		
		btnOrdenesPrim = new JButton("ORDENES PRIMARIAS");
		btnOrdenesPrim.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnOrdenesPrim.setBounds(172, 130, 291, 41);
		btnOrdenesPrim.addActionListener(this);
		Factura.add(btnOrdenesPrim);
		
		btnOrdenesPend = new JButton("ORDENES PENDIENTES");
		btnOrdenesPend.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnOrdenesPend.setBounds(172, 207, 291, 41);
		btnOrdenesPend.addActionListener(this);
		Factura.add(btnOrdenesPend);
		
		btnFacturasAprob = new JButton("FACTURAS APROBADAS");
		btnFacturasAprob.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFacturasAprob.setBounds(172, 291, 291, 41);
		btnFacturasAprob.addActionListener(this);
		Factura.add(btnFacturasAprob);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * @param ActionEvent
		 */
		Object o = e.getSource();
		
		if (o == btnOrdenesPrim) {
			
			this.setVisible(false);
			ListaOrdenesPrim OPrim = new ListaOrdenesPrim();
			OPrim.setVisible(true);
			OPrim.setLocationRelativeTo(null);
			
		} else if (o == btnOrdenesPend) {
			
		} else if (o == btnFacturasAprob) {
			
		} else if (o == btnVolver) {
			
			this.setVisible(false);
			MenuAtc MaC = new MenuAtc();
			MaC.setVisible(true);
			MaC.setLocationRelativeTo(null);
			
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


