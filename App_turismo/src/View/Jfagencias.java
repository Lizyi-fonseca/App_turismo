package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Agencias;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Jfagencias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombres;
	private JTextField txttelefono;
	private JTextField txtdireccion;
	private JTextField txtcorreo;
	private JTextField txtwed;
	private JLabel lblnombres;
	private JLabel lbltelefono;
	private JLabel lbldireccion;
	private JLabel lblcorreo;
	private JLabel lblwed;
	private JLabel lblagencias;
	private JTextField txtidcompania;
	Agencias cr = new Agencias();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jfagencias frame = new Jfagencias();
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
	public Jfagencias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 407);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.scrollbar);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnombres = new JTextField();
		txtnombres.setBackground(SystemColor.inactiveCaption);
		txtnombres.setBounds(34, 88, 119, 31);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBackground(SystemColor.inactiveCaption);
		txttelefono.setBounds(196, 88, 119, 31);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBackground(SystemColor.inactiveCaption);
		txtdireccion.setBounds(36, 184, 117, 31);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtcorreo = new JTextField();
		txtcorreo.setBackground(SystemColor.inactiveCaption);
		txtcorreo.setBounds(196, 184, 119, 31);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		txtwed = new JTextField();
		txtwed.setBackground(SystemColor.inactiveCaption);
		txtwed.setBounds(386, 88, 106, 31);
		contentPane.add(txtwed);
		txtwed.setColumns(10);
		
		lblnombres = new JLabel("Nombres");
		lblnombres.setFont(new Font("Arial", Font.PLAIN, 14));
		lblnombres.setBounds(55, 50, 86, 27);
		contentPane.add(lblnombres);
		
		lbltelefono = new JLabel("Telefono");
		lbltelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		lbltelefono.setBounds(196, 50, 106, 27);
		contentPane.add(lbltelefono);
		
		lbldireccion = new JLabel("Direccion");
		lbldireccion.setFont(new Font("Arial", Font.PLAIN, 14));
		lbldireccion.setBounds(55, 150, 83, 23);
		contentPane.add(lbldireccion);
		
		lblcorreo = new JLabel("Correo");
		lblcorreo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblcorreo.setBounds(210, 150, 99, 23);
		contentPane.add(lblcorreo);
		
		lblwed = new JLabel("Wed");
		lblwed.setFont(new Font("Arial", Font.PLAIN, 14));
		lblwed.setBounds(400, 50, 80, 27);
		contentPane.add(lblwed);
		
		JButton btnguardar = new JButton("");
		btnguardar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\285657_floppy_guardar_save_icon (1).png"));
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.create(txtnombres.getText(), txttelefono.getText(), txtdireccion.getText(), txtcorreo.getText(), txtwed.getText(), Integer.parseInt(txtidcompania.getText()));
			}
		});
		btnguardar.setBackground(Color.LIGHT_GRAY);
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnguardar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnguardar.setBounds(60, 261, 80, 57);
		contentPane.add(btnguardar);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\1814090_delete_garbage_trash_icon.png"));
		btnEliminar.setBackground(Color.LIGHT_GRAY);
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
			}
		});
		btnEliminar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEliminar.setBounds(182, 261, 86, 56);
		contentPane.add(btnEliminar);
		
		lblagencias = new JLabel("Agencias");
		lblagencias.setFont(new Font("Arial", Font.PLAIN, 14));
		lblagencias.setBounds(182, 11, 195, 28);
		contentPane.add(lblagencias);
		
		txtidcompania = new JTextField();
		txtidcompania.setColumns(10);
		txtidcompania.setBackground(SystemColor.inactiveCaption);
		txtidcompania.setBounds(386, 184, 106, 31);
		contentPane.add(txtidcompania);
		
		JLabel lblIdCompaia = new JLabel("Id compañia");
		lblIdCompaia.setFont(new Font("Arial", Font.PLAIN, 14));
		lblIdCompaia.setBounds(393, 150, 99, 23);
		contentPane.add(lblIdCompaia);
		
		btnEliminar.addActionListener(e -> clearFields());
	}

	private void clearFields() {
		txtnombres.setText("");
		txtdireccion.setText("");
		txtcorreo.setText("");
		txtidcompania.setText("");
		txttelefono.setText("");
		txtwed.setText("");
		
		
	}
}
