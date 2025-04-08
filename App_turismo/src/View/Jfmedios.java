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
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	private JButton btndelete;
	private JButton btnLimpiar;
	private JTextField txtmedios;
	private JLabel lblIdMedios;

	Medios cr = new Medios();
	private JButton btnconsultar;
	private JButton btnActualizar;

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
		setBounds(100, 100, 673, 434);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtnombres = new JTextField();
		txtnombres.setBackground(SystemColor.inactiveCaption);
		txtnombres.setBounds(135, 46, 156, 41);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);

		txtobservacion = new JTextField();
		txtobservacion.setBackground(SystemColor.inactiveCaption);
		txtobservacion.setBounds(135, 114, 156, 41);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);

		txtidtiposmedios = new JTextField();
		txtidtiposmedios.setBackground(SystemColor.inactiveCaption);
		txtidtiposmedios.setBounds(135, 181, 156, 41);
		contentPane.add(txtidtiposmedios);
		txtidtiposmedios.setColumns(10);

		lblmedios = new JLabel("Nombre");
		lblmedios.setFont(new Font("Arial", Font.PLAIN, 14));
		lblmedios.setBounds(10, 51, 97, 28);
		contentPane.add(lblmedios);

		lblobservacion = new JLabel("Observacion");
		lblobservacion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblobservacion.setBounds(0, 122, 103, 32);
		contentPane.add(lblobservacion);

		lbliditiposmedios = new JLabel("Id Tipos Medios");
		lbliditiposmedios.setFont(new Font("Arial", Font.PLAIN, 14));
		lbliditiposmedios.setBounds(-11, 184, 110, 32);
		contentPane.add(lbliditiposmedios);

		btnguardar = new JButton("");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.create(txtnombres.getText(), txtobservacion.getText(), Integer.parseInt(txtidtiposmedios.getText()));

			}
		});
		btnguardar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\285657_floppy_guardar_save_icon.png"));
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnguardar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnguardar.setBounds(376, 46, 81, 73);
		contentPane.add(btnguardar);

		btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtmedios.getText()));
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\1814090_delete_garbage_trash_icon.png"));
		btndelete.setBackground(UIManager.getColor("Button.light"));
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btndelete.setFont(new Font("Arial", Font.PLAIN, 14));
		btndelete.setBounds(376, 214, 81, 57);
		contentPane.add(btndelete);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnLimpiar.addActionListener(f -> clearFields());

			}
		});
		btnLimpiar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiar.setBackground(UIManager.getColor("Button.light"));
		btnLimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpiar.setBounds(129, 326, 138, 41);
		contentPane.add(btnLimpiar);

		txtmedios = new JTextField();
		txtmedios.setText("");
		txtmedios.setColumns(10);
		txtmedios.setBackground(SystemColor.inactiveCaption);
		txtmedios.setBounds(135, 255, 156, 41);
		contentPane.add(txtmedios);

		lblIdMedios = new JLabel("id Medios");
		lblIdMedios.addMouseListener(new MouseAdapter() {

		});
		lblIdMedios.setFont(new Font("Arial", Font.PLAIN, 14));
		lblIdMedios.setBounds(10, 258, 110, 32);
		contentPane.add(lblIdMedios);

		btnconsultar = new JButton("");
		btnconsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnconsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cr.read(Integer.parseInt(txtmedios.getText()), txtnombres, txtobservacion, txtidtiposmedios);

			}
		});
		btnconsultar.setIcon(new ImageIcon(
				"C:\\Users\\lizyi\\Downloads\\6071808_folder_progress_task_update_update task progress_icon.png"));
		btnconsultar.setBackground(UIManager.getColor("Button.light"));
		btnconsultar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnconsultar.setBounds(376, 131, 81, 57);
		contentPane.add(btnconsultar);

		btnActualizar = new JButton("");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cr.Update(Integer.parseInt(txtmedios.getText()), txtnombres.getText(), txtobservacion.getText(),
						Integer.parseInt(txtidtiposmedios.getText()));

			}
		});
		btnActualizar.setIcon(
				new ImageIcon("C:\\Users\\lizyi\\Downloads\\9104197_loading_refresh_reload_update_wait_icon.png"));
		btnActualizar.setBounds(368, 302, 89, 47);
		contentPane.add(btnActualizar);

	}

	private void clearFields() {
		txtnombres.setText("");
		txtobservacion.setText("");
		txtidtiposmedios.setText("");

	}
}
