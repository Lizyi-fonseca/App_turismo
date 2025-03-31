package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Agencias;
import Model.Clientes;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Jfclientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txttipodocumento;
	private JTextField txtdocumento;
	private JTextField txtnombres;
	private JTextField txtapellidos;
	private JTextField txteps;
	private JTextField txtalergias;
	private JTextField txtfechanacimiento;
	private JTextField txtcorreo;
	private JTextField txtestadocivil;
	private JTextField txttelefono;
	private JTextField txtdireccion;
	private JLabel lbndocumeno;
	private JLabel lbndocumento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jfclientes frame = new Jfclientes();
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
	public Jfclientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 421);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txttipodocumento = new JTextField();
		txttipodocumento.setBackground(SystemColor.inactiveCaption);
		txttipodocumento.setBounds(121, 91, 104, 26);
		contentPane.add(txttipodocumento);
		txttipodocumento.setColumns(10);
		
		txtdocumento = new JTextField();
		txtdocumento.setBackground(SystemColor.inactiveCaption);
		txtdocumento.setBounds(351, 91, 111, 26);
		contentPane.add(txtdocumento);
		txtdocumento.setColumns(10);
		
		txtnombres = new JTextField();
		txtnombres.setBackground(SystemColor.inactiveCaption);
		txtnombres.setBounds(92, 27, 118, 26);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txtapellidos = new JTextField();
		txtapellidos.setBackground(SystemColor.inactiveCaption);
		txtapellidos.setBounds(351, 27, 111, 25);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);
		
		txteps = new JTextField();
		txteps.setBackground(SystemColor.inactiveCaption);
		txteps.setBounds(92, 150, 118, 27);
		contentPane.add(txteps);
		txteps.setColumns(10);
		
		txtalergias = new JTextField();
		txtalergias.setBackground(SystemColor.inactiveCaption);
		txtalergias.setBounds(351, 150, 111, 26);
		contentPane.add(txtalergias);
		txtalergias.setColumns(10);
		
		txtfechanacimiento = new JTextField();
		txtfechanacimiento.setBackground(SystemColor.inactiveCaption);
		txtfechanacimiento.setBounds(121, 214, 104, 26);
		contentPane.add(txtfechanacimiento);
		txtfechanacimiento.setColumns(10);
		
		txtcorreo = new JTextField();
		txtcorreo.setBackground(SystemColor.inactiveCaption);
		txtcorreo.setBounds(351, 213, 111, 26);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		txtestadocivil = new JTextField();
		txtestadocivil.setBackground(SystemColor.inactiveCaption);
		txtestadocivil.setBounds(121, 284, 104, 26);
		contentPane.add(txtestadocivil);
		txtestadocivil.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBackground(SystemColor.inactiveCaption);
		txttelefono.setBounds(351, 280, 111, 26);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBackground(SystemColor.inactiveCaption);
		txtdireccion.setBounds(121, 346, 104, 26);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		lbndocumeno = new JLabel("Tipo Documento");
		lbndocumeno.setFont(new Font("Arial", Font.PLAIN, 14));
		lbndocumeno.setBounds(7, 90, 104, 26);
		contentPane.add(lbndocumeno);
		
		lbndocumento = new JLabel("Documento");
		lbndocumento.setFont(new Font("Arial", Font.PLAIN, 14));
		lbndocumento.setBounds(235, 93, 104, 20);
		contentPane.add(lbndocumento);
		
		JLabel lblnombres = new JLabel("Nombres");
		lblnombres.setFont(new Font("Arial", Font.PLAIN, 14));
		lblnombres.setBounds(10, 26, 86, 26);
		contentPane.add(lblnombres);
		
		JLabel lblapellidos = new JLabel("Apellidos");
		lblapellidos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblapellidos.setBounds(241, 26, 99, 27);
		contentPane.add(lblapellidos);
		
		JLabel lbleps = new JLabel("EPS");
		lbleps.setFont(new Font("Arial", Font.PLAIN, 14));
		lbleps.setBounds(7, 152, 66, 20);
		contentPane.add(lbleps);
		
		JLabel lblalergias = new JLabel("Alergias");
		lblalergias.setFont(new Font("Arial", Font.PLAIN, 14));
		lblalergias.setBounds(235, 152, 86, 20);
		contentPane.add(lblalergias);
		
		JLabel lblfechanacimiento = new JLabel("Fecha de nacimiento");
		lblfechanacimiento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblfechanacimiento.setBounds(7, 213, 104, 26);
		contentPane.add(lblfechanacimiento);
		
		JLabel lblcorreo = new JLabel("Correo");
		lblcorreo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblcorreo.setBounds(235, 214, 86, 19);
		contentPane.add(lblcorreo);
		
		JLabel lblestadocivil = new JLabel("Estadocivil");
		lblestadocivil.setFont(new Font("Arial", Font.PLAIN, 14));
		lblestadocivil.setBounds(7, 287, 104, 19);
		contentPane.add(lblestadocivil);
		
		JLabel lbltelefono = new JLabel("Telefono");
		lbltelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		lbltelefono.setBounds(241, 283, 86, 26);
		contentPane.add(lbltelefono);
		
		JLabel lbldirecion = new JLabel("Direccion");
		lbldirecion.setFont(new Font("Arial", Font.PLAIN, 14));
		lbldirecion.setBounds(22, 345, 89, 26);
		contentPane.add(lbldirecion);
		
		JButton btnguardar = new JButton("Guardar");
		btnguardar.setBackground(SystemColor.activeCaptionBorder);
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes cr = new Clientes();
				cr.create(Integer.parseInt(txttipodocumento.getText()), Integer.parseInt(txtdocumento.getText()), txtnombres.getText(),txtapellidos.getText(), txteps.getText(), txtalergias.getText(), txtfechanacimiento.getText(), txtcorreo.getText(),txtestadocivil.getText(),txttelefono.getText(),txtdireccion.getText());
			}
		});
		btnguardar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnguardar.setBounds(250, 336, 113, 34);
		contentPane.add(btnguardar);
		
		JButton btnlimpiar = new JButton("limpiar");
		btnlimpiar.setBackground(SystemColor.activeCaptionBorder);
		btnlimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnlimpiar.addActionListener(l -> clearFields());
			}

			private Object clearFields() {
				txttipodocumento.setText("");
				txtdocumento.setText("");
				txtnombres.setText("");
				txtapellidos.setText("");
				txteps.setText("");
				txtalergias.setText("");
				txtfechanacimiento.setText("");
				txtcorreo.setText("");
				txtestadocivil.setText("");
				txttelefono.setText("");
				txtdireccion.setText("");
				return null;
			}
		});
		btnlimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnlimpiar.setBounds(373, 336, 111, 34);
		contentPane.add(btnlimpiar);
	}
}
