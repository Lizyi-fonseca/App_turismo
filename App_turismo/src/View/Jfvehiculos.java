package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Tipostransportes;
import Model.Vehiculos;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Jfvehiculos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtmarca;
	private JTextField txtpuestos;
	private JTextField txtmodelo;
	private JTextField txtnumeromotor;
	private JTextField txtcategoria;
	private JTextField txtidtipo;
	private JLabel lblmarca;
	private JLabel lblpuesto;
	private JLabel lblmodelo;
	private JLabel lblnumeromotor;
	private JLabel lblcategoria;
	private JLabel lbltipo;
	private JButton btnguardar;
	private JButton btnlimpiar;

	Vehiculos cr = new Vehiculos();
	private JButton btnLimpiar;
	private JTextField txtidvehiculos;
	private JLabel lblIdvehiculos;
	private JButton btnConsultar;
	private JButton btnActualizar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jfvehiculos frame = new Jfvehiculos();
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
	public Jfvehiculos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 440);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtmarca = new JTextField();
		txtmarca.setBackground(SystemColor.inactiveCaption);
		txtmarca.setBounds(106, 36, 122, 30);
		contentPane.add(txtmarca);
		txtmarca.setColumns(10);

		txtpuestos = new JTextField();
		txtpuestos.setBackground(SystemColor.inactiveCaption);
		txtpuestos.setBounds(390, 41, 117, 35);
		contentPane.add(txtpuestos);
		txtpuestos.setColumns(10);

		txtmodelo = new JTextField();
		txtmodelo.setBackground(SystemColor.inactiveCaption);
		txtmodelo.setBounds(106, 115, 122, 30);
		contentPane.add(txtmodelo);
		txtmodelo.setColumns(10);

		txtnumeromotor = new JTextField();
		txtnumeromotor.setBackground(SystemColor.inactiveCaption);
		txtnumeromotor.setBounds(390, 115, 117, 30);
		contentPane.add(txtnumeromotor);
		txtnumeromotor.setColumns(10);

		txtcategoria = new JTextField();
		txtcategoria.setBackground(SystemColor.inactiveCaption);
		txtcategoria.setBounds(106, 192, 122, 30);
		contentPane.add(txtcategoria);
		txtcategoria.setColumns(10);

		txtidtipo = new JTextField();
		txtidtipo.setBackground(SystemColor.inactiveCaption);
		txtidtipo.setBounds(390, 192, 117, 30);
		contentPane.add(txtidtipo);
		txtidtipo.setColumns(10);

		lblmarca = new JLabel("Marca");
		lblmarca.setFont(new Font("Arial", Font.PLAIN, 14));
		lblmarca.setBounds(10, 35, 86, 30);
		contentPane.add(lblmarca);

		lblpuesto = new JLabel("Puesto");
		lblpuesto.setFont(new Font("Arial", Font.PLAIN, 14));
		lblpuesto.setBounds(264, 36, 86, 30);
		contentPane.add(lblpuesto);

		lblmodelo = new JLabel("Modelo");
		lblmodelo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblmodelo.setBounds(0, 115, 82, 30);
		contentPane.add(lblmodelo);

		lblnumeromotor = new JLabel("Numero Motor");
		lblnumeromotor.setFont(new Font("Arial", Font.PLAIN, 14));
		lblnumeromotor.setBounds(264, 115, 96, 30);
		contentPane.add(lblnumeromotor);

		lblcategoria = new JLabel("Categoria");
		lblcategoria.setFont(new Font("Arial", Font.PLAIN, 14));
		lblcategoria.setBounds(0, 192, 82, 30);
		contentPane.add(lblcategoria);

		lbltipo = new JLabel("Tipo");
		lbltipo.setFont(new Font("Arial", Font.PLAIN, 14));
		lbltipo.setBounds(264, 192, 86, 30);
		contentPane.add(lbltipo);

		btnguardar = new JButton("");
		btnguardar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\285657_floppy_guardar_save_icon (1).png"));
		btnguardar.setBackground(UIManager.getColor("Button.light"));
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cr.create(txtmarca.getText(), Integer.parseInt(txtpuestos.getText()), txtmodelo.getText(),
						Integer.parseInt(txtnumeromotor.getText()), txtcategoria.getText(),
						Integer.parseInt(txtidtipo.getText()));

			}

		});
		btnguardar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnguardar.setBounds(552, 36, 96, 57);
		contentPane.add(btnguardar);

		btnlimpiar = new JButton("");
		btnlimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cr.delete(Integer.parseInt(txtidvehiculos.getText()));
			}
		});
		btnlimpiar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\1814090_delete_garbage_trash_icon.png"));
		btnlimpiar.setBackground(UIManager.getColor("Button.light"));
		btnlimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnlimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnlimpiar.setBounds(552, 139, 96, 54);
		contentPane.add(btnlimpiar);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpiar.setBounds(376, 270, 131, 35);
		contentPane.add(btnLimpiar);

		txtidvehiculos = new JTextField();
		txtidvehiculos.setText("");
		txtidvehiculos.setColumns(10);
		txtidvehiculos.setBackground(SystemColor.inactiveCaption);
		txtidvehiculos.setBounds(106, 252, 122, 30);
		contentPane.add(txtidvehiculos);

		lblIdvehiculos = new JLabel("idvehiculos");
		lblIdvehiculos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblIdvehiculos.setBounds(0, 251, 86, 30);
		contentPane.add(lblIdvehiculos);

		btnConsultar = new JButton("");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.read(Integer.parseInt(txtidvehiculos.getText()), txtmarca, txtpuestos, txtmodelo, txtnumeromotor,
						txtcategoria, txtidtipo);

			}
		});
		btnConsultar.setIcon(new ImageIcon(
				"C:\\Users\\lizyi\\Downloads\\6071808_folder_progress_task_update_update task progress_icon.png"));
		btnConsultar.setBounds(552, 231, 96, 57);
		contentPane.add(btnConsultar);

		btnActualizar = new JButton("");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cr.Update(Integer.parseInt(txtidvehiculos.getText()), txtmarca.getText(),
						Integer.parseInt(txtpuestos.getText()), txtmodelo.getText(),
						Integer.parseInt(txtnumeromotor.getText()), txtcategoria.getText(),
						Integer.parseInt(txtidtipo.getText()));

			}
		});
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.setIcon(
				new ImageIcon("C:\\Users\\lizyi\\Downloads\\9104197_loading_refresh_reload_update_wait_icon.png"));
		btnActualizar.setBounds(552, 313, 96, 57);
		contentPane.add(btnActualizar);

		btnlimpiar.addActionListener(e -> clearFields());
	}

	private void clearFields() {

		txtmarca.setText("");
		txtpuestos.setText("");
		txtmodelo.setText("");
		txtnumeromotor.setText("");
		txtcategoria.setText("");
		txtidtipo.setText("");
	}

}
