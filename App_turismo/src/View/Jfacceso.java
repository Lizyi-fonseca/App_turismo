package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Accesso;
import Model.Promotores;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Jfacceso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtdocumento;
	private JTextField txtcontraseña;
	Promotores principal =  new Promotores ();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jfacceso frame = new Jfacceso();
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
	public Jfacceso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 388);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbldocumento = new JLabel("Documento");
		lbldocumento.setFont(new Font("Arial", Font.PLAIN, 14));
		lbldocumento.setBounds(75, 51, 247, 29);
		contentPane.add(lbldocumento);
		
		txtdocumento = new JTextField();
		txtdocumento.setBackground(SystemColor.inactiveCaption);
		txtdocumento.setFont(new Font("Arial", Font.PLAIN, 14));
		txtdocumento.setBounds(75, 104, 247, 29);
		contentPane.add(txtdocumento);
		txtdocumento.setColumns(10);
		
		JLabel lblcontraseña = new JLabel("Contraseña");
		lblcontraseña.setFont(new Font("Arial", Font.PLAIN, 14));
		lblcontraseña.setBounds(75, 168, 247, 29);
		contentPane.add(lblcontraseña);
		
		txtcontraseña = new JTextField();
		txtcontraseña.setBackground(SystemColor.inactiveCaption);
		txtcontraseña.setFont(new Font("Arial", Font.PLAIN, 14));
		txtcontraseña.setBounds(75, 208, 247, 29);
		contentPane.add(txtcontraseña);
		txtcontraseña.setColumns(10);
		
		JButton btningresar = new JButton("Ingresar");
		btningresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				principal.Acceso(Integer.parseInt(txtdocumento.getText()), txtcontraseña.getText());
				
			}
		});
		btningresar.setForeground(UIManager.getColor("Button.foreground"));
		btningresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btningresar.setBackground(UIManager.getColor("Button.light"));
		btningresar.setFont(new Font("Arial", Font.PLAIN, 14));
		btningresar.setBounds(376, 261, 116, 29);
		contentPane.add(btningresar);
	}
}
