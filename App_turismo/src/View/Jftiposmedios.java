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
import javax.swing.ImageIcon;

public class Jftiposmedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombres;
	private JTextField txtobservacion;
	private JButton btnlimpiar;
	Tiposmedios cr = new Tiposmedios();
	private JTextField txtidtiposmedios1;
	
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
		setBounds(100, 100, 665, 435);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnombres = new JTextField();
		txtnombres.setBounds(149, 159, 258, 34);
		txtnombres.setBackground(SystemColor.inactiveCaption);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txtobservacion = new JTextField();
		txtobservacion.setBounds(149, 228, 258, 34);
		txtobservacion.setBackground(SystemColor.inactiveCaption);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);
		
		JLabel lblnombres = new JLabel("Nombres");
		lblnombres.setBounds(31, 165, 86, 20);
		lblnombres.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(lblnombres);
		
		JLabel lblobservacion = new JLabel("Observacion");
		lblobservacion.setBounds(31, 234, 86, 20);
		lblobservacion.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(lblobservacion);
		
		JButton tbnguardar = new JButton("");
		tbnguardar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\285657_floppy_guardar_save_icon (1).png"));
		tbnguardar.setFont(new Font("Arial", Font.PLAIN, 14));
		tbnguardar.setForeground(SystemColor.desktop);
		tbnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.Create(txtnombres.getText(), txtobservacion.getText());
				
			}
		});
		tbnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		tbnguardar.setBackground(UIManager.getColor("Button.light"));
		tbnguardar.setBounds(493, 122, 82, 71);
		contentPane.add(tbnguardar);
		
		btnlimpiar = new JButton("Limpiar");
		btnlimpiar.addMouseListener(new MouseAdapter() {
			
			
		});
		btnlimpiar.setIcon(null);
		btnlimpiar.setBackground(UIManager.getColor("Button.light"));
		btnlimpiar.setForeground(SystemColor.desktop);
		btnlimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnlimpiar.setBounds(295, 316, 112, 34);
		contentPane.add(btnlimpiar);
		
		JLabel lblNewLabel = new JLabel("Gestion de tipos de medio");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(188, 52, 180, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIdTipoDe = new JLabel("ID Tipo de Medios");
		lblIdTipoDe.setFont(new Font("Arial", Font.PLAIN, 14));
		lblIdTipoDe.setBounds(10, 97, 129, 20);
		contentPane.add(lblIdTipoDe);
		
		txtidtiposmedios1 = new JTextField();
		txtidtiposmedios1.setText("");
		txtidtiposmedios1.setColumns(10);
		txtidtiposmedios1.setBackground(SystemColor.inactiveCaption);
		txtidtiposmedios1.setBounds(149, 77, 258, 34);
		contentPane.add(txtidtiposmedios1);
		
		JButton btnDelete = new JButton("");
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtidtiposmedios1.getText()));
				
			}
		});
		btnDelete.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\1814090_delete_garbage_trash_icon.png"));
		btnDelete.setBounds(494, 31, 81, 65);
		contentPane.add(btnDelete);
		
		JButton btnconsultar = new JButton("");
		btnconsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.read(Integer.parseInt(txtidtiposmedios1.getText()), txtnombres, txtobservacion);
			}
		});
		btnconsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnconsultar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\6071808_folder_progress_task_update_update task progress_icon.png"));
		btnconsultar.setBackground(UIManager.getColor("Button.light"));
		btnconsultar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnconsultar.setBounds(493, 204, 86, 65);
		contentPane.add(btnconsultar);
		
		JButton btnActualizar = new JButton("");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.Update(Integer.parseInt(txtidtiposmedios1.getText()),txtnombres.getText(), txtobservacion.getText());
				
			}
		});
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\9104197_loading_refresh_reload_update_wait_icon.png"));
		btnActualizar.setBounds(493, 294, 89, 57);
		contentPane.add(btnActualizar);
		
		btnlimpiar.addActionListener(e -> clearFields());
	}

	private void clearFields() {
		txtnombres.setText("");
		txtobservacion.setText("");
		txtidtiposmedios1.setText("");
		
	}
}
