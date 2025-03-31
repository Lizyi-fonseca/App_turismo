package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Operadores;
import Model.Paquetes;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Jfpaquetes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtiddestino;
	private JTextField txtidorigen;
	private JTextField txtfechaventa;
	private JTextField txthoraventa;
	private JTextField txtfechaejecucion;
	private JTextField txtobservacion;
	private JTextField txtidclientes;
	private JTextField txtidvehiculos;
	private JTextField txtidpromototes;
	private JTextField txtidagencias;
	private JTextField txtidmedios;
	private JLabel lbliddestino;
	private JLabel lblidorigen;
	private JLabel lblfechaventa;
	private JLabel lblhoraventa;
	private JLabel lblfechaejecucion;
	private JLabel lblodservacion;
	private JLabel lblidclientes;
	private JLabel lblidvehiculos;
	private JLabel lblidpromotores;
	private JLabel lblidagencias;
	private JLabel lblidmedios;
	private JButton btnguardar;
	private JButton btnlimpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jfpaquetes frame = new Jfpaquetes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Jfpaquetes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 422);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtiddestino = new JTextField();
		txtiddestino.setBackground(SystemColor.inactiveCaption);
		txtiddestino.setBounds(131, 11, 108, 30);
		contentPane.add(txtiddestino);
		txtiddestino.setColumns(10);
		
		txtidorigen = new JTextField();
		txtidorigen.setBackground(SystemColor.inactiveCaption);
		txtidorigen.setBounds(394, 11, 117, 30);
		contentPane.add(txtidorigen);
		txtidorigen.setColumns(10);
		
		txtfechaventa = new JTextField();
		txtfechaventa.setBackground(SystemColor.inactiveCaption);
		txtfechaventa.setBounds(131, 88, 108, 30);
		contentPane.add(txtfechaventa);
		txtfechaventa.setColumns(10);
		
		txthoraventa = new JTextField();
		txthoraventa.setBackground(SystemColor.inactiveCaption);
		txthoraventa.setBounds(394, 88, 117, 30);
		contentPane.add(txthoraventa);
		txthoraventa.setColumns(10);
		
		txtfechaejecucion = new JTextField();
		txtfechaejecucion.setBackground(SystemColor.inactiveCaption);
		txtfechaejecucion.setBounds(131, 156, 108, 30);
		contentPane.add(txtfechaejecucion);
		txtfechaejecucion.setColumns(10);
		
		txtobservacion = new JTextField();
		txtobservacion.setBackground(SystemColor.inactiveCaption);
		txtobservacion.setBounds(394, 156, 117, 30);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);
		
		txtidclientes = new JTextField();
		txtidclientes.setBackground(SystemColor.inactiveCaption);
		txtidclientes.setBounds(131, 213, 108, 30);
		contentPane.add(txtidclientes);
		txtidclientes.setColumns(10);
		
		txtidvehiculos = new JTextField();
		txtidvehiculos.setBackground(SystemColor.inactiveCaption);
		txtidvehiculos.setBounds(394, 213, 117, 30);
		contentPane.add(txtidvehiculos);
		txtidvehiculos.setColumns(10);
		
		txtidpromototes = new JTextField();
		txtidpromototes.setBackground(SystemColor.inactiveCaption);
		txtidpromototes.setBounds(131, 270, 108, 30);
		contentPane.add(txtidpromototes);
		txtidpromototes.setColumns(10);
		
		txtidagencias = new JTextField();
		txtidagencias.setBackground(SystemColor.inactiveCaption);
		txtidagencias.setBounds(394, 270, 117, 30);
		contentPane.add(txtidagencias);
		txtidagencias.setColumns(10);
		
		txtidmedios = new JTextField();
		txtidmedios.setBackground(SystemColor.inactiveCaption);
		txtidmedios.setBounds(131, 324, 108, 30);
		contentPane.add(txtidmedios);
		txtidmedios.setColumns(10);
		
		lbliddestino = new JLabel("Id Destino");
		lbliddestino.setFont(new Font("Arial", Font.PLAIN, 14));
		lbliddestino.setBounds(10, 11, 98, 30);
		contentPane.add(lbliddestino);
		
		lblidorigen = new JLabel("Id Origen");
		lblidorigen.setFont(new Font("Arial", Font.PLAIN, 14));
		lblidorigen.setBounds(280, 11, 92, 30);
		contentPane.add(lblidorigen);
		
		lblfechaventa = new JLabel("Fecha Venta");
		lblfechaventa.setFont(new Font("Arial", Font.PLAIN, 14));
		lblfechaventa.setBounds(10, 88, 98, 30);
		contentPane.add(lblfechaventa);
		
		lblhoraventa = new JLabel("Hora Venta");
		lblhoraventa.setFont(new Font("Arial", Font.PLAIN, 14));
		lblhoraventa.setBounds(274, 88, 86, 30);
		contentPane.add(lblhoraventa);
		
		lblfechaejecucion = new JLabel("Fecha Ejecucion");
		lblfechaejecucion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblfechaejecucion.setBounds(10, 156, 111, 30);
		contentPane.add(lblfechaejecucion);
		
		lblodservacion = new JLabel("Observacion");
		lblodservacion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblodservacion.setBounds(274, 156, 92, 30);
		contentPane.add(lblodservacion);
		
		lblidclientes = new JLabel("Id Clientes");
		lblidclientes.setFont(new Font("Arial", Font.PLAIN, 14));
		lblidclientes.setBounds(10, 213, 98, 30);
		contentPane.add(lblidclientes);
		
		lblidvehiculos = new JLabel("Id Vehiculos");
		lblidvehiculos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblidvehiculos.setBounds(280, 213, 80, 30);
		contentPane.add(lblidvehiculos);
		
		lblidpromotores = new JLabel("Id Promotores");
		lblidpromotores.setFont(new Font("Arial", Font.PLAIN, 14));
		lblidpromotores.setBounds(10, 270, 98, 30);
		contentPane.add(lblidpromotores);
		
		lblidagencias = new JLabel("Id Agencias");
		lblidagencias.setFont(new Font("Arial", Font.PLAIN, 14));
		lblidagencias.setBounds(274, 270, 86, 30);
		contentPane.add(lblidagencias);
		
		lblidmedios = new JLabel("Id Medios");
		lblidmedios.setFont(new Font("Arial", Font.PLAIN, 14));
		lblidmedios.setBounds(10, 324, 98, 30);
		contentPane.add(lblidmedios);
		
		btnguardar = new JButton("Guardar");
		btnguardar.setBackground(UIManager.getColor("Button.light"));
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Paquetes cr = new Paquetes();
				 
				 cr.create(Integer.parseInt(txtiddestino.getText()),Integer.parseInt(txtidorigen.getText()), 
				txtfechaventa.getText(), txthoraventa.getText(), txtfechaejecucion.getText(), 
				txtobservacion.getText(), Integer.parseInt(txtidclientes.getText()),Integer.parseInt(txtidvehiculos.getText()),
				Integer.parseInt(txtidpromototes.getText()), Integer.parseInt(txtidagencias.getText()), Integer.parseInt(txtidmedios.getText()));
			}
		});
		btnguardar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnguardar.setBounds(261, 324, 108, 30);
		contentPane.add(btnguardar);
		
		btnlimpiar = new JButton("Limpiar");
		btnlimpiar.setBackground(UIManager.getColor("Button.light"));
		btnlimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnlimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnlimpiar.setBounds(407, 324, 98, 30);
		contentPane.add(btnlimpiar);
		
		btnlimpiar.addActionListener(e -> clearFields());
	}
	
	private Object clearFields() {
		txtiddestino.setText("");
		txtidorigen.setText("");
		txtfechaventa.setText("");
		txthoraventa.setText("");
		txtfechaejecucion.setText("");
		txtobservacion.setText("");
		txtidclientes.setText("");
		txtidvehiculos.setText("");
		txtidpromototes.setText("");
		txtidagencias.setText("");
		txtidmedios.setText("");
		return null;
	
	}
}
