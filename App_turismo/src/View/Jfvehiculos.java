package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Tipostransportes;
import Model.Vehiculos;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Jfvehiculos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtmarca;
	private JTextField txtpuestos;
	private JTextField txtmodelo;
	private JTextField txtnumeromotor;
	private JTextField txtcategoria;
	private JTextField txtidtipo;
	private JLabel lblmarca;
	private JLabel lblpuesto;
	private JLabel lblmodelo;
	private JLabel lblnumeromotor;
	private JLabel lblcategoria;
	private JLabel lbltipo;
	private JButton btnguardar;
	private JButton btnlimpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jfvehiculos frame = new Jfvehiculos();
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
	public Jfvehiculos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtmarca = new JTextField();
		txtmarca.setBackground(SystemColor.inactiveCaption);
		txtmarca.setBounds(106, 36, 122, 30);
		contentPane.add(txtmarca);
		txtmarca.setColumns(10);
		
		txtpuestos = new JTextField();
		txtpuestos.setBackground(SystemColor.inactiveCaption);
		txtpuestos.setBounds(390, 41, 117, 25);
		contentPane.add(txtpuestos);
		txtpuestos.setColumns(10);
		
		txtmodelo = new JTextField();
		txtmodelo.setBackground(SystemColor.inactiveCaption);
		txtmodelo.setBounds(106, 115, 122, 30);
		contentPane.add(txtmodelo);
		txtmodelo.setColumns(10);
		
		txtnumeromotor = new JTextField();
		txtnumeromotor.setBackground(SystemColor.inactiveCaption);
		txtnumeromotor.setBounds(390, 115, 117, 30);
		contentPane.add(txtnumeromotor);
		txtnumeromotor.setColumns(10);
		
		txtcategoria = new JTextField();
		txtcategoria.setBackground(SystemColor.inactiveCaption);
		txtcategoria.setBounds(106, 192, 122, 30);
		contentPane.add(txtcategoria);
		txtcategoria.setColumns(10);
		
		txtidtipo = new JTextField();
		txtidtipo.setBackground(SystemColor.inactiveCaption);
		txtidtipo.setBounds(390, 192, 117, 25);
		contentPane.add(txtidtipo);
		txtidtipo.setColumns(10);
		
		lblmarca = new JLabel("Marca");
		lblmarca.setFont(new Font("Arial", Font.PLAIN, 14));
		lblmarca.setBounds(10, 35, 86, 30);
		contentPane.add(lblmarca);
		
		lblpuesto = new JLabel("Puesto");
		lblpuesto.setFont(new Font("Arial", Font.PLAIN, 14));
		lblpuesto.setBounds(264, 36, 86, 30);
		contentPane.add(lblpuesto);
		
		lblmodelo = new JLabel("Modelo");
		lblmodelo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblmodelo.setBounds(0, 115, 82, 30);
		contentPane.add(lblmodelo);
		
		lblnumeromotor = new JLabel("Numero Motor");
		lblnumeromotor.setFont(new Font("Arial", Font.PLAIN, 14));
		lblnumeromotor.setBounds(264, 115, 96, 30);
		contentPane.add(lblnumeromotor);
		
		lblcategoria = new JLabel("Categoria");
		lblcategoria.setFont(new Font("Arial", Font.PLAIN, 14));
		lblcategoria.setBounds(0, 192, 82, 30);
		contentPane.add(lblcategoria);
		
		lbltipo = new JLabel("Tipo");
		lbltipo.setFont(new Font("Arial", Font.PLAIN, 14));
		lbltipo.setBounds(264, 192, 86, 30);
		contentPane.add(lbltipo);
		
		btnguardar = new JButton("Guardar");
		btnguardar.setBackground(UIManager.getColor("Button.light"));
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vehiculos cr = new Vehiculos();
				
		cr.create(txtmarca.getText(),Integer.parseInt(txtpuestos.getText()),
		txtmodelo.getText(),Integer.parseInt(txtnumeromotor.getText()),
		txtcategoria.getText(),Integer.parseInt(txtidtipo.getText()));
				
			}
			
		});
		btnguardar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnguardar.setBounds(51, 284, 122, 30);
		contentPane.add(btnguardar);
		
		btnlimpiar = new JButton("Limpiar");
		btnlimpiar.setBackground(UIManager.getColor("Button.light"));
		btnlimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnlimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnlimpiar.setBounds(217, 284, 112, 30);
		contentPane.add(btnlimpiar);
		
		btnlimpiar.addActionListener(e -> clearFields());
	}
	 private void clearFields() {
		 
		 txtmarca.setText("");
		 txtpuestos.setText("");
		 txtmodelo.setText("");
		 txtnumeromotor.setText("");
		 txtcategoria.setText("");
		 txtidtipo.setText("");
	 }

}
