package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Companias;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class Jfcompanias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtrazonsocial;
	private JTextField txtdireccion;
	private JTextField txtcorreo;
	private JTextField txttelefono;
	private JTextField txtfecchacreaccion;
	private JTextField txtwed;
	private JLabel lblNewLabel;
	private JLabel lbldireccio;
	private JLabel lblcorreo;
	private JLabel lbltelefono;
	private JLabel lblfechacreacion;
	private JLabel lblNewLabel_1;
	private JLabel lblwed;
	private JButton btnguardar;
	private JButton btnlimpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jfcompanias frame = new Jfcompanias();
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
	public Jfcompanias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 403);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(180, 180, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtrazonsocial = new JTextField();
		txtrazonsocial.setBackground(SystemColor.inactiveCaption);
		txtrazonsocial.setBounds(112, 26, 122, 31);
		contentPane.add(txtrazonsocial);
		txtrazonsocial.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBackground(new Color(191, 205, 219));
		txtdireccion.setBounds(112, 103, 122, 31);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtcorreo = new JTextField();
		txtcorreo.setBackground(SystemColor.inactiveCaption);
		txtcorreo.setBounds(112, 179, 122, 31);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBackground(SystemColor.inactiveCaption);
		txttelefono.setBounds(374, 26, 138, 31);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		txtfecchacreaccion = new JTextField();
		txtfecchacreaccion.setBackground(SystemColor.inactiveCaption);
		txtfecchacreaccion.setBounds(374, 103, 138, 31);
		contentPane.add(txtfecchacreaccion);
		txtfecchacreaccion.setColumns(10);
		
		txtwed = new JTextField();
		txtwed.setBackground(SystemColor.inactiveCaption);
		txtwed.setBounds(374, 179, 138, 31);
		contentPane.add(txtwed);
		txtwed.setColumns(10);
		
		lblNewLabel = new JLabel("Razon Social");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 30, 103, 20);
		contentPane.add(lblNewLabel);
		
		lbldireccio = new JLabel("Direccion");
		lbldireccio.setFont(new Font("Arial", Font.PLAIN, 14));
		lbldireccio.setBounds(10, 103, 103, 33);
		contentPane.add(lbldireccio);
		
		lblcorreo = new JLabel("Correo");
		lblcorreo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblcorreo.setBounds(10, 179, 103, 31);
		contentPane.add(lblcorreo);
		
		lbltelefono = new JLabel("Telefono");
		lbltelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		lbltelefono.setBounds(261, 25, 86, 31);
		contentPane.add(lbltelefono);
		
		lblfechacreacion = new JLabel("Fecha Creacion");
		lblfechacreacion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblfechacreacion.setBounds(261, 103, 124, 31);
		contentPane.add(lblfechacreacion);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(266, 187, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblwed = new JLabel("Wed");
		lblwed.setFont(new Font("Arial", Font.PLAIN, 14));
		lblwed.setBounds(261, 179, 86, 23);
		contentPane.add(lblwed);
		
		btnguardar = new JButton("Guardar");
		btnguardar.setBackground(SystemColor.scrollbar);
		btnguardar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Companias cr = new Companias();
				cr.create(txtrazonsocial.getText(),txtdireccion.getText(), txtcorreo.getText(),txttelefono.getText(),txtfecchacreaccion.getText(),txtwed.getText());
			}
		});
		btnguardar.setBounds(117, 276, 117, 33);
		contentPane.add(btnguardar);
		
		btnlimpiar = new JButton("limpiar");
		btnlimpiar.setBackground(SystemColor.scrollbar);
		btnlimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnlimpiar.setBounds(366, 276, 111, 29);
		contentPane.add(btnlimpiar);
		
		btnlimpiar.addActionListener(e -> clearFields());
	}
	
	private void clearFields() {
		txtrazonsocial.setText("");
		txtdireccion.setText("");
		txtcorreo.setText("");
		txttelefono.setText("");
		txtfecchacreaccion.setText("");
		txtwed.setText("");
	}

}
