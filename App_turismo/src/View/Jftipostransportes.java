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
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Jftipostransportes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombres;
	private JTextField txtobservacion;
	private JLabel lblnombres;
	private JLabel lblobservacion;
	private JButton btnguardar;
	private JButton btnlimpiar;
	private JButton btnLimpiar;
	private JButton btnconsultar;
	private JTextField txtidtipo;
	 Tipostransportes cr = new Tipostransportes();
	 private JButton btnActualizar;

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
		setBounds(100, 100, 619, 415);
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
		txtobservacion.setBounds(147, 113, 233, 34);
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
		
		btnguardar = new JButton("");
		btnguardar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\285657_floppy_guardar_save_icon (1).png"));
		btnguardar.setBackground(UIManager.getColor("Button.light"));
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
           
				
			cr.create(txtnombres.getText(), txtobservacion.getText());
			
			}
		});
		btnguardar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnguardar.setBounds(451, 29, 103, 51);
		contentPane.add(btnguardar);
		
		btnlimpiar = new JButton("");
		btnlimpiar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\1814090_delete_garbage_trash_icon.png"));
		btnlimpiar.setBackground(UIManager.getColor("Button.light"));
		btnlimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnlimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnlimpiar.setBounds(451, 113, 104, 51);
		contentPane.add(btnlimpiar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBackground(UIManager.getColor("Button.light"));
		btnLimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpiar.setBounds(190, 283, 163, 39);
		contentPane.add(btnLimpiar);
		
		btnconsultar = new JButton("");
		btnconsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnconsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.read(Integer.parseInt(txtidtipo.getText()), txtnombres, txtobservacion);
			}
		});
		btnconsultar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\6071808_folder_progress_task_update_update task progress_icon.png"));
		btnconsultar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnconsultar.setBounds(451, 201, 103, 51);
		contentPane.add(btnconsultar);
		
		txtidtipo = new JTextField();
		txtidtipo.setText("");
		txtidtipo.setColumns(10);
		txtidtipo.setBackground(SystemColor.inactiveCaption);
		txtidtipo.setBounds(147, 187, 233, 34);
		contentPane.add(txtidtipo);
		
		JLabel lblIdTipo = new JLabel("Id Tipo");
		lblIdTipo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblIdTipo.setBounds(17, 188, 97, 33);
		contentPane.add(lblIdTipo);
		
		btnActualizar = new JButton("");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.Update(Integer.parseInt(txtidtipo.getText()), txtnombres.getText(), txtobservacion.getText());
			}
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\9104197_loading_refresh_reload_update_wait_icon.png"));
		btnActualizar.setBounds(457, 278, 97, 51);
		contentPane.add(btnActualizar);
		
		btnlimpiar.addActionListener(e -> clearFields());
		
	       }
	       private void clearFields() {
		   txtnombres.setText("");
		   txtobservacion.setText("");
		
	}
}
