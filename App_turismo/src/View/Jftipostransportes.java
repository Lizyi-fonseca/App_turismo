package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Tiposmedios;
import Model.Tipostransportes;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Jftipostransportes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombres;
	private JTextField txtobservacion;
	private JLabel lblnombres;
	private JLabel lblobservacion;
	private JButton btnguardar;
	private JButton btnlimpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jftipostransportes frame = new Jftipostransportes();
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
	public Jftipostransportes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnombres = new JTextField();
		txtnombres.setBackground(SystemColor.inactiveCaption);
		txtnombres.setBounds(147, 29, 233, 33);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txtobservacion = new JTextField();
		txtobservacion.setBackground(SystemColor.inactiveCaption);
		txtobservacion.setBounds(147, 114, 233, 33);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);
		
		lblnombres = new JLabel("Nombres");
		lblnombres.setFont(new Font("Arial", Font.PLAIN, 14));
		lblnombres.setBounds(17, 32, 97, 24);
		contentPane.add(lblnombres);
		
		lblobservacion = new JLabel("Observacion");
		lblobservacion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblobservacion.setBounds(17, 113, 97, 33);
		contentPane.add(lblobservacion);
		
		btnguardar = new JButton("Guardar");
		btnguardar.setBackground(UIManager.getColor("Button.light"));
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
            Tipostransportes cr = new Tipostransportes();
				
			cr.create(txtnombres.getText(), txtobservacion.getText());
			
			}
		});
		btnguardar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnguardar.setBounds(97, 199, 115, 33);
		contentPane.add(btnguardar);
		
		btnlimpiar = new JButton("Limpiar");
		btnlimpiar.setBackground(UIManager.getColor("Button.light"));
		btnlimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnlimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnlimpiar.setBounds(277, 199, 115, 33);
		contentPane.add(btnlimpiar);
		
		btnlimpiar.addActionListener(e -> clearFields());
		
	       }
	       private void clearFields() {
		   txtnombres.setText("");
		   txtobservacion.setText("");
		
	}

}
