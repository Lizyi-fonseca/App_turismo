package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Medios;
import Model.Promotores;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Jfpromotores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txttipodocumento;
	private JTextField txtdocumento;
	private JTextField txtnombres;
	private JTextField txtapellidos;
	private JTextField txtdireccion;
	private JTextField txtcorreopersonal;
	private JTextField txtcorreocoporativo;
	private JTextField txtfechanacimiento;
	private JTextField txttelefono;
	private JLabel lbltipodocumento;
	private JLabel lbldocumento;
	private JLabel lblnombres;
	private JLabel lblapellidos;
	private JLabel lbldireccion;
	private JLabel lblcorreopersonal;
	private JLabel lblcorreocoorporativo;
	private JLabel lblfechanacimiento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jfpromotores frame = new Jfpromotores();
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
	public Jfpromotores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 426);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txttipodocumento = new JTextField();
		txttipodocumento.setBackground(SystemColor.inactiveCaption);
		txttipodocumento.setBounds(118, 42, 108, 26);
		contentPane.add(txttipodocumento);
		txttipodocumento.setColumns(10);
		
		txtdocumento = new JTextField();
		txtdocumento.setBackground(SystemColor.inactiveCaption);
		txtdocumento.setBounds(363, 42, 105, 26);
		contentPane.add(txtdocumento);
		txtdocumento.setColumns(10);
		
		txtnombres = new JTextField();
		txtnombres.setBackground(SystemColor.inactiveCaption);
		txtnombres.setBounds(118, 111, 108, 26);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txtapellidos = new JTextField();
		txtapellidos.setBackground(SystemColor.inactiveCaption);
		txtapellidos.setBounds(363, 111, 105, 26);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBackground(SystemColor.inactiveCaption);
		txtdireccion.setBounds(118, 179, 108, 26);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtcorreopersonal = new JTextField();
		txtcorreopersonal.setBackground(SystemColor.inactiveCaption);
		txtcorreopersonal.setBounds(363, 179, 105, 26);
		contentPane.add(txtcorreopersonal);
		txtcorreopersonal.setColumns(10);
		
		txtcorreocoporativo = new JTextField();
		txtcorreocoporativo.setBackground(SystemColor.inactiveCaption);
		txtcorreocoporativo.setBounds(144, 240, 108, 26);
		contentPane.add(txtcorreocoporativo);
		txtcorreocoporativo.setColumns(10);
		
		txtfechanacimiento = new JTextField();
		txtfechanacimiento.setBackground(SystemColor.inactiveCaption);
		txtfechanacimiento.setBounds(144, 313, 105, 26);
		contentPane.add(txtfechanacimiento);
		txtfechanacimiento.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBackground(SystemColor.inactiveCaption);
		txttelefono.setBounds(363, 240, 105, 26);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		lbltipodocumento = new JLabel("Tipo Documento");
		lbltipodocumento.setFont(new Font("Arial", Font.PLAIN, 14));
		lbltipodocumento.setBounds(0, 42, 108, 26);
		contentPane.add(lbltipodocumento);
		
		lbldocumento = new JLabel("Documento");
		lbldocumento.setFont(new Font("Arial", Font.PLAIN, 14));
		lbldocumento.setBounds(247, 42, 106, 26);
		contentPane.add(lbldocumento);
		
		lblnombres = new JLabel("Nombres");
		lblnombres.setFont(new Font("Arial", Font.PLAIN, 14));
		lblnombres.setBounds(0, 111, 87, 33);
		contentPane.add(lblnombres);
		
		lblapellidos = new JLabel("Apellidos");
		lblapellidos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblapellidos.setBounds(247, 111, 89, 26);
		contentPane.add(lblapellidos);
		
		lbldireccion = new JLabel("Dirección");
		lbldireccion.setFont(new Font("Arial", Font.PLAIN, 14));
		lbldireccion.setBounds(0, 179, 96, 26);
		contentPane.add(lbldireccion);
		
		lblcorreopersonal = new JLabel("Correo Personal");
		lblcorreopersonal.setFont(new Font("Arial", Font.PLAIN, 14));
		lblcorreopersonal.setBounds(247, 179, 106, 26);
		contentPane.add(lblcorreopersonal);
		
		lblcorreocoorporativo = new JLabel("Correo Coorporativo");
		lblcorreocoorporativo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblcorreocoorporativo.setBounds(0, 239, 134, 26);
		contentPane.add(lblcorreocoorporativo);
		
		lblfechanacimiento = new JLabel("Fecha Nacimiento");
		lblfechanacimiento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblfechanacimiento.setBounds(0, 312, 134, 26);
		contentPane.add(lblfechanacimiento);
		
		JLabel lblNewLabel = new JLabel("Telefono");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(262, 240, 91, 26);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBackground(UIManager.getColor("Button.light"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		Promotores cr = new Promotores();
				
		cr.create(Integer.parseInt(txttipodocumento.getText()),Integer.parseInt(txtdocumento.getText()),
		txtnombres.getText(),txtapellidos.getText(),txtdireccion.getText(),txtcorreopersonal.getText(),
		txtcorreocoporativo.getText(),txtfechanacimiento.getText(),txttelefono.getText());
					
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setBounds(283, 315, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnlimpiar = new JButton("Limpiar");
		btnlimpiar.setBackground(UIManager.getColor("Button.light"));
		btnlimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnlimpiar.setBounds(382, 316, 89, 23);
		contentPane.add(btnlimpiar);
		
		btnlimpiar.addActionListener(e -> clearFields());
	}
	
	    private Object clearFields() {
	    	txttipodocumento.setText("");
	    	txtdocumento.setText("");
	    	txtnombres.setText("");
	    	txtapellidos.setText("");
	    	txtdireccion.setText("");
	    	txtcorreopersonal.setText("");
	    	txtcorreocoporativo.setText("");
	    	txtfechanacimiento.setText("");
	    	txttelefono.setText("");
	    	return null;
	}
}
