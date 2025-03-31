package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Medios;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Jfmedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombres;
	private JTextField txtobservacion;
	private JTextField txtidtiposmedios;
	private JLabel lblmedios;
	private JLabel lblobservacion;
	private JLabel lbliditiposmedios;
	private JButton btnguardar;
	private JButton btnlimpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jfmedios frame = new Jfmedios();
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
	public Jfmedios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 339);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnombres = new JTextField();
		txtnombres.setBackground(SystemColor.inactiveCaption);
		txtnombres.setBounds(131, 47, 110, 32);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txtobservacion = new JTextField();
		txtobservacion.setBackground(SystemColor.inactiveCaption);
		txtobservacion.setBounds(364, 47, 123, 32);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);
		
		txtidtiposmedios = new JTextField();
		txtidtiposmedios.setBackground(SystemColor.inactiveCaption);
		txtidtiposmedios.setBounds(305, 126, 110, 32);
		contentPane.add(txtidtiposmedios);
		txtidtiposmedios.setColumns(10);
		
		lblmedios = new JLabel("Nombre");
		lblmedios.setFont(new Font("Arial", Font.PLAIN, 14));
		lblmedios.setBounds(10, 51, 97, 28);
		contentPane.add(lblmedios);
		
		lblobservacion = new JLabel("Observacion");
		lblobservacion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblobservacion.setBounds(251, 47, 103, 32);
		contentPane.add(lblobservacion);
		
		lbliditiposmedios = new JLabel("Id Tipos Medios");
		lbliditiposmedios.setFont(new Font("Arial", Font.PLAIN, 14));
		lbliditiposmedios.setBounds(130, 126, 110, 32);
		contentPane.add(lbliditiposmedios);
		
		btnguardar = new JButton("Guardar");
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Medios cr = new Medios();
				cr.create(txtnombres.getText(), txtobservacion.getText(), Integer.parseInt(txtidtiposmedios.getText()));
			}
		});
		btnguardar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnguardar.setBounds(151, 217, 123, 28);
		contentPane.add(btnguardar);
		
		btnlimpiar = new JButton("Limpiar");
		btnlimpiar.setBackground(UIManager.getColor("Button.light"));
		btnlimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnlimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnlimpiar.setBounds(317, 217, 123, 28);
		contentPane.add(btnlimpiar);
		
		btnlimpiar.addActionListener(e -> clearFields());
	}
	private void clearFields() {
		txtnombres.setText("");
		txtobservacion.setText("");
		txtidtiposmedios.setText("");
	
	}
}
