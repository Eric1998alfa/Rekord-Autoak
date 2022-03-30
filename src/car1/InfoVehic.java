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

import javax.swing.JButton;

import java.awt.Color;
import java.awt.Panel;
/**
 * 
 * @author Grupo_4
 * @version 5.1.2
 *
 */
public class InfoVehic extends JFrame implements ActionListener,ListSelectionListener{
	/**
	 *
	 */
	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial correcto funcionamiento de los calculos
	 */
	private JPanel Menu;
	private JPanel panel_Botones;
	
	private JLabel lblKmRecorridos_1;
	private JLabel lblCilindrada_1;
	private JLabel lblFechaITV_1;
	private JLabel lblColor_1;
	private JLabel lblMarca_1;
	/**
	 *
	 */
	private JButton btnAceptarVehiculos;
	public JLabel lblMatricula;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblNumBastidor;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblModelo;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel	lblMarca;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblKmRecorridos;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblCilindrada;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblFechaITV;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblColor;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	
	
	public JLabel lblTipo;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	



	/**
	 * Create the frame.
	 */
	public InfoVehic() {
		setResizable(false);
		setTitle("INFO_Veh\u00EDculo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 665, 467);
		Menu = new JPanel();
		Menu.setBackground(Color.DARK_GRAY);
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(null);
		
		Panel panel_Datos_2 = new Panel();
		panel_Datos_2.setBackground(Color.DARK_GRAY);
		panel_Datos_2.setBounds(10, 10, 306, 211);
		Menu.add(panel_Datos_2);
		panel_Datos_2.setLayout(null);
		
		JLabel lblNumBastidor_1 = new JLabel("Num. Bastidor:");
		lblNumBastidor_1.setForeground(Color.WHITE);
		lblNumBastidor_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumBastidor_1.setBounds(10, 31, 101, 56);
		panel_Datos_2.add(lblNumBastidor_1);
		
		JLabel lblMatricula_1 = new JLabel("Matricula:");
		lblMatricula_1.setForeground(Color.WHITE);
		lblMatricula_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMatricula_1.setBounds(10, -5, 71, 56);
		panel_Datos_2.add(lblMatricula_1);
		
		JLabel lblModelo_1 = new JLabel("Modelo:");
		lblModelo_1.setForeground(Color.WHITE);
		lblModelo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblModelo_1.setBounds(10, 82, 57, 49);
		panel_Datos_2.add(lblModelo_1);
		
		JLabel lblTipo_1 = new JLabel("Tipo:");
		lblTipo_1.setForeground(Color.WHITE);
		lblTipo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipo_1.setBounds(10, 155, 38, 56);
		panel_Datos_2.add(lblTipo_1);
		
		lblMatricula = new JLabel("");
		lblMatricula.setForeground(Color.WHITE);
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMatricula.setBounds(77, -5, 174, 51);
		panel_Datos_2.add(lblMatricula);
		
		lblNumBastidor = new JLabel("");
		lblNumBastidor.setForeground(Color.WHITE);
		lblNumBastidor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumBastidor.setBounds(111, 41, 185, 35);
		panel_Datos_2.add(lblNumBastidor);
		
		lblModelo = new JLabel("");
		lblModelo.setForeground(Color.WHITE);
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblModelo.setBounds(70, 85, 150, 46);
		panel_Datos_2.add(lblModelo);
		
		lblMarca = new JLabel("");
		lblMarca.setForeground(Color.WHITE);
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMarca.setBounds(58, 124, 176, 47);
		panel_Datos_2.add(lblMarca);
		
		lblMarca_1 = new JLabel("Marca:");
		lblMarca_1.setForeground(Color.WHITE);
		lblMarca_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMarca_1.setBounds(10, 122, 57, 49);
		panel_Datos_2.add(lblMarca_1);
		
		lblTipo = new JLabel("");
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipo.setBounds(45, 165, 206, 35);
		panel_Datos_2.add(lblTipo);
				
				panel_Botones = new JPanel();
				panel_Botones.setBackground(Color.DARK_GRAY);
				panel_Botones.setBounds(113, 263, 421, 55);
				Menu.add(panel_Botones);
				panel_Botones.setLayout(null);
						
						btnAceptarVehiculos = new JButton("ACEPTAR");
						btnAceptarVehiculos.setFont(new Font("Tahoma", Font.PLAIN, 14));
						btnAceptarVehiculos.addActionListener(this);
						btnAceptarVehiculos.setBounds(148, 11, 118, 39);
						panel_Botones.add(btnAceptarVehiculos);
						
						JPanel panel = new JPanel();
						panel.setBackground(Color.DARK_GRAY);
						panel.setBounds(320, 10, 331, 211);
						Menu.add(panel);
						panel.setLayout(null);
						
						lblCilindrada_1 = new JLabel("Cilindrada:");
						lblCilindrada_1.setForeground(Color.WHITE);
						lblCilindrada_1.setBounds(10, 0, 72, 39);
						panel.add(lblCilindrada_1);
						lblCilindrada_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
						
						lblFechaITV_1 = new JLabel("Fecha ITV:");
						lblFechaITV_1.setForeground(Color.WHITE);
						lblFechaITV_1.setBounds(10, 43, 85, 34);
						panel.add(lblFechaITV_1);
						lblFechaITV_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
						
						lblColor_1 = new JLabel("Color:");
						lblColor_1.setForeground(Color.WHITE);
						lblColor_1.setBounds(10, 80, 48, 39);
						panel.add(lblColor_1);
						lblColor_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
						
						lblKmRecorridos_1 = new JLabel("KM recorridos:");
						lblKmRecorridos_1.setForeground(Color.WHITE);
						lblKmRecorridos_1.setBounds(10, 129, 99, 39);
						panel.add(lblKmRecorridos_1);
						lblKmRecorridos_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
						
						lblCilindrada = new JLabel("");
						lblCilindrada.setForeground(Color.WHITE);
						lblCilindrada.setBounds(77, 0, 140, 39);
						panel.add(lblCilindrada);
						lblCilindrada.setFont(new Font("Tahoma", Font.PLAIN, 15));
						
						lblFechaITV = new JLabel("");
						lblFechaITV.setForeground(Color.WHITE);
						lblFechaITV.setBounds(88, 43, 195, 34);
						panel.add(lblFechaITV);
						lblFechaITV.setFont(new Font("Tahoma", Font.PLAIN, 15));
						
						lblKmRecorridos = new JLabel("");
						lblKmRecorridos.setForeground(Color.WHITE);
						lblKmRecorridos.setBounds(115, 129, 152, 39);
						panel.add(lblKmRecorridos);
						lblKmRecorridos.setFont(new Font("Tahoma", Font.PLAIN, 15));
						
						lblColor = new JLabel("");
						lblColor.setForeground(Color.WHITE);
						lblColor.setBounds(57, 88, 160, 28);
						panel.add(lblColor);
						lblColor.setFont(new Font("Tahoma", Font.PLAIN, 15));
	
		
		
	}
	@Override

	public void actionPerformed(ActionEvent e) {
		/**
		 *
		 */
		Object o=e.getSource();
		//int posicion=0; 
		//int numeroElementos=dlm.getSize();
		
		
		if(o==btnAceptarVehiculos)
		{
			this.setVisible(false);
		}
	}
	
		
		
		
		
	@Override
	public void valueChanged(ListSelectionEvent e) {
		/**
		 *
		 */
		
	}
}