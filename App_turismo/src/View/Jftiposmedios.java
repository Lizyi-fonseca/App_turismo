package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Tiposmedios;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;

public class Jftiposmedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombres;
	private JTextField txtobservacion;
	private JButton btnLimpiar;
  //  private boolean isSecondNumber = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jftiposmedios frame = new Jftiposmedios();
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
	public Jftiposmedios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 392);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnombres = new JTextField();
		txtnombres.setBounds(147, 85, 258, 34);
		txtnombres.setBackground(SystemColor.inactiveCaption);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txtobservacion = new JTextField();
		txtobservacion.setBounds(147, 154, 258, 34);
		txtobservacion.setBackground(SystemColor.inactiveCaption);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);
		
		JLabel lblnombres = new JLabel("Nombres");
		lblnombres.setBounds(29, 91, 86, 20);
		lblnombres.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(lblnombres);
		
		JLabel lblobservacion = new JLabel("Observacion");
		lblobservacion.setBounds(29, 160, 86, 20);
		lblobservacion.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(lblobservacion);
		
		JButton tbnguardar = new JButton("Guardar");
		tbnguardar.setFont(new Font("Arial", Font.PLAIN, 14));
		tbnguardar.setForeground(SystemColor.desktop);
		tbnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tiposmedios cr = new Tiposmedios();
				
				cr.Create(txtnombres.getText(), txtobservacion.getText());
				
			}
		});
		tbnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		tbnguardar.setBackground(UIManager.getColor("Button.light"));
		tbnguardar.setBounds(44, 225, 149, 39);
		contentPane.add(tbnguardar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBackground(UIManager.getColor("Button.light"));
		btnLimpiar.setForeground(SystemColor.desktop);
		btnLimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpiar.setBounds(247, 224, 158, 39);
		contentPane.add(btnLimpiar);
		
		JLabel lblNewLabel = new JLabel("Gestion de tipos de medio");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(188, 45, 180, 14);
		contentPane.add(lblNewLabel);
		btnLimpiar.addActionListener(e -> clearFields());
	}

	private void clearFields() {
		txtnombres.setText("");
		txtobservacion.setText("");
		
		
	}
}
