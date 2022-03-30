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

import javax.swing.JButton;


import java.awt.Color;
import java.awt.Panel;

/**
 * @author Grupo_4
 * @version 5.1.2
 */
public class AnadirVehic extends JFrame implements ActionListener,ListSelectionListener, WindowListener{
	/**
	 * JLabel,JPanel,JButton,JTextField: privados solo estan llamados desde la propia clase
	 */
	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial correcto funcionamiento de los calculos
	 */
	private JPanel Menu;
	private JPanel panel_Botones;
	private JTextField txtNumBast;
	private JTextField txtModelo;
	private JTextField txtTipo;
	private JTextField txtKM;
	private JLabel lblKmRecorridos;
	private JLabel lblCilindrada;
	private JLabel lblFechaITV;
	private JLabel lblColor;
	private JTextField txtCilindrada;
	private JTextField txtAno;
	private JTextField txtColor;
	private JTextField txtMarca;
	/**
	 * ComboBox, JButton,String Jlabel: declarados public,se les asigna valor desde otras clases
	 */
	public JButton btnVolver;
	/**
	 * JButton: declarados public se da uso en clases externas y son
	 * modeficadas desde otras clases
	 */
	public JButton btnAceptar;
	/**
	 * JButton: declarados public se da uso en clases externas y son
	 * modeficadas desde otras clases
	 */
	public static JTextField txtMatricula;
	/**
	 * JTextField: declarados public se da uso en clases externas y son
	 * modeficadas desde otras clases
	 */
	
	

	/**
	 * crea frame de la clase.
	 */
	public AnadirVehic() {
		setBackground(new Color(255, 255, 255));
		setResizable(false);
		setTitle("A\u00D1ADIR NUEVO VEHICULO");
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(this);
		
		setBounds(100, 100, 539, 415);
		Menu = new JPanel();
		Menu.setBackground(Color.DARK_GRAY);
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(null);
		
		Panel panel_Datos_2 = new Panel();
		panel_Datos_2.setBackground(Color.DARK_GRAY);
		panel_Datos_2.setBounds(10, 10, 513, 301);
		Menu.add(panel_Datos_2);
		panel_Datos_2.setLayout(null);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(124, 10, 95, 31);
		panel_Datos_2.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblNumBastidor = new JLabel("Num. Bastidor:");
		lblNumBastidor.setForeground(Color.WHITE);
		lblNumBastidor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumBastidor.setBounds(10, 31, 101, 56);
		panel_Datos_2.add(lblNumBastidor);
		
		txtNumBast = new JTextField();
		txtNumBast.setColumns(10);
		txtNumBast.setBounds(124, 46, 95, 31);
		panel_Datos_2.add(txtNumBast);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setForeground(Color.WHITE);
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMatricula.setBounds(10, -5, 140, 56);
		panel_Datos_2.add(lblMatricula);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setForeground(Color.WHITE);
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblModelo.setBounds(10, 71, 116, 49);
		panel_Datos_2.add(lblModelo);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(124, 82, 95, 31);
		panel_Datos_2.add(txtModelo);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipo.setBounds(348, 67, 53, 56);
		panel_Datos_2.add(lblTipo);
		
		txtTipo = new JTextField();
		txtTipo.setColumns(10);
		txtTipo.setBounds(408, 89, 95, 31);
		panel_Datos_2.add(txtTipo);
		
		lblKmRecorridos = new JLabel("KM recorridos:");
		lblKmRecorridos.setForeground(Color.WHITE);
		lblKmRecorridos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKmRecorridos.setBounds(10, 145, 152, 56);
		panel_Datos_2.add(lblKmRecorridos);
		
		txtKM = new JTextField();
		txtKM.setBounds(124, 159, 94, 31);
		panel_Datos_2.add(txtKM);
		txtKM.setColumns(10);
		
		lblCilindrada = new JLabel("Cilindrada:");
		lblCilindrada.setForeground(Color.WHITE);
		lblCilindrada.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCilindrada.setBounds(324, -5, 73, 56);
		panel_Datos_2.add(lblCilindrada);
		
		lblFechaITV = new JLabel("Fecha ITV:");
		lblFechaITV.setForeground(Color.WHITE);
		lblFechaITV.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaITV.setBounds(312, 110, 81, 56);
		panel_Datos_2.add(lblFechaITV);
		
		lblColor = new JLabel("Color:");
		lblColor.setForeground(Color.WHITE);
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblColor.setBounds(355, 31, 53, 56);
		panel_Datos_2.add(lblColor);
		
		txtCilindrada = new JTextField();
		txtCilindrada.setColumns(10);
		txtCilindrada.setBounds(408, 10, 95, 31);
		panel_Datos_2.add(txtCilindrada);
		
		txtAno = new JTextField();
		txtAno.setColumns(10);
		txtAno.setBounds(408, 125, 95, 31);
		panel_Datos_2.add(txtAno);
		
		txtColor = new JTextField();
		txtColor.setColumns(10);
		txtColor.setBounds(408, 50, 95, 31);
		panel_Datos_2.add(txtColor);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setForeground(Color.WHITE);
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMarca.setBounds(10, 110, 116, 49);
		panel_Datos_2.add(lblMarca);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(124, 121, 95, 31);
		panel_Datos_2.add(txtMarca);
				
		panel_Botones = new JPanel();
		panel_Botones.setBackground(Color.DARK_GRAY);
		panel_Botones.setBounds(89, 329, 354, 46);
		Menu.add(panel_Botones);
		panel_Botones.setLayout(null);
		/**
		 * buttones implementados con ActionListeners
		 */
		btnVolver = new JButton("VOLVER");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVolver.addActionListener(this);

		btnVolver.setBounds(0, 0, 94, 46);
		panel_Botones.add(btnVolver);
		btnAceptar = new JButton("A\u00D1ADIR VEHICULO");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(171, 0, 173, 46);
		panel_Botones.add(btnAceptar);
	
		
		
	}
	@Override

	public void actionPerformed(ActionEvent e) {

		Object o=e.getSource();
		
		if(o==btnVolver) {
			
			this.setVisible(false);
			
		}else if(o==btnAceptar) {		
		

			String Matricula;
			String Num_Bastidor;
			String Modelo;
			String Marca;
			int KM_Recorridos;
			int Cilindrada;
			String Color;
			String Tipo;
			
			int Fecha_ITV;
			
		    
		    
			Matricula = txtMatricula.getText();
			Num_Bastidor = txtNumBast.getText();
			Modelo = txtModelo.getText();
			Marca = txtMarca.getText();
			KM_Recorridos = Integer.parseInt(txtKM.getText());
			Cilindrada = Integer.parseInt(txtCilindrada.getText());
			Color = txtColor.getText();
			Tipo = txtTipo.getText();
			Fecha_ITV = Integer.parseInt(txtAno.getText());
			
		    
		    
		    Vehiculo v1 = new Vehiculo(Matricula,Num_Bastidor,Modelo,Marca,KM_Recorridos,Cilindrada,Fecha_ITV,Color,Tipo);
			
			File f = new File("C:\\tmp\\vehiculos\\" + Matricula + ".dat");
			FileOutputStream fos;
			ObjectOutputStream oos;
			
			try {
				
				fos = new FileOutputStream(f);
				oos = new ObjectOutputStream (fos);
				
				// lo grabo
				oos.writeObject(v1);
				
				// cierro el fichero
				oos.close();
				fos.close();
				
			} catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
				
			} catch (IOException e1) {
				
				e1.printStackTrace();
				
			}
			
			
			this.setVisible(false);
			
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