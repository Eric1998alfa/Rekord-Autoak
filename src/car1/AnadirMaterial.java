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

/**
 * @author Grupo_4
 * @version 5.1.2
 */
public class AnadirMaterial extends JFrame implements ActionListener, ListSelectionListener, WindowListener {
	
	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial correcto funcionamiento de los calculos
	 */
	private JPanel Menu;
	private JPanel panel_Botones;
	public JButton btnVolver;
	public JButton btnAñadir;
	public static JTextField txtNombre;
	public static JTextField txtPrecio;
	public JLabel lblPrecio;
	/**
	 * JLabel: declarados public se da uso en clases externas y son
	 * modeficadas desde otras clases
	 */

	/**
	 * Crea frame de la clase.
	 */
	public AnadirMaterial() {
		setResizable(false);
		setTitle("A\u00D1ADIR MATERIAL");
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(this);
		
		setBounds(100, 100, 377, 351);
		Menu = new JPanel();
		Menu.setBackground(Color.DARK_GRAY);
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(null);

		panel_Botones = new JPanel();
		panel_Botones.setBackground(Color.DARK_GRAY);
		panel_Botones.setBounds(10, 271, 338, 42);
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
		btnAñadir = new JButton("A\u00D1ADIR MATERIAL");
		btnAñadir.addActionListener(this);
		btnAñadir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAñadir.setBounds(150, 0, 188, 42);
		panel_Botones.add(btnAñadir);

		Panel panel_Datos_1 = new Panel();
		panel_Datos_1.setBackground(Color.DARK_GRAY);
		panel_Datos_1.setLayout(null);
		panel_Datos_1.setBounds(10, 0, 532, 178);
		Menu.add(panel_Datos_1);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(151, 39, 182, 31);
		panel_Datos_1.add(txtNombre);

		lblPrecio = new JLabel("Precio por unidad:");
		lblPrecio.setForeground(Color.WHITE);
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrecio.setBounds(10, 66, 131, 56);
		panel_Datos_1.add(lblPrecio);

		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(151, 81, 89, 31);
		panel_Datos_1.add(txtPrecio);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(63, 24, 78, 56);
		panel_Datos_1.add(lblNombre);

	}

	@Override

	public void actionPerformed(ActionEvent e) {

		Object o = e.getSource();
		
		if (o == btnVolver) {
			
			this.setVisible(false);
			
		} else if (o == btnAñadir) {

			String nombre;
			double precio;

		  nombre = txtNombre.getText();
		  precio = Integer.parseInt(txtPrecio.getText());
		    

		  Material m1 = new Material(nombre,precio);
			
			File f = new File("C:\\tmp\\materiales\\" + nombre + ".dat");
			FileOutputStream fos;
			ObjectOutputStream oos;
			
			try {
				
				fos = new FileOutputStream(f);
				oos = new ObjectOutputStream (fos);
				
				// lo grabo
				oos.writeObject(m1);
				
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
			
		int opcion = JOptionPane.showConfirmDialog(this,(String)"Si sale, los datos no serán guardados. ¿Desea volver a la página anterior?","INFO",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null);
		
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