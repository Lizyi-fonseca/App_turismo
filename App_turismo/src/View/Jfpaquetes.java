package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Operadores;
import Model.Paquetes;

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

public class Jfpaquetes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtiddestino;
	private JTextField txtidorigen;
	private JTextField txtfechaventa;
	private JTextField txthoraventa;
	private JTextField txtfechaejecucion;
	private JTextField txtobservacion;
	private JTextField txtidclientes;
	private JTextField txtidvehiculos;
	private JTextField txtidpromototes;
	private JTextField txtidagencias;
	private JTextField txtidmedios;
	private JLabel lbliddestino;
	private JLabel lblidorigen;
	private JLabel lblfechaventa;
	private JLabel lblhoraventa;
	private JLabel lblfechaejecucion;
	private JLabel lblodservacion;
	private JLabel lblidclientes;
	private JLabel lblidvehiculos;
	private JLabel lblidpromotores;
	private JLabel lblidagencias;
	private JLabel lblidmedios;
	private JButton btnguardar;
	private JButton btnDelete;
	private JTextField txtidcodigo;
	private JButton btnconsultar;
	private JButton btnActualizar;
	Paquetes cr = new Paquetes();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jfpaquetes frame = new Jfpaquetes();
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
	public Jfpaquetes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 422);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtiddestino = new JTextField();
		txtiddestino.setBackground(SystemColor.inactiveCaption);
		txtiddestino.setBounds(131, 11, 108, 30);
		contentPane.add(txtiddestino);
		txtiddestino.setColumns(10);

		txtidorigen = new JTextField();
		txtidorigen.setBackground(SystemColor.inactiveCaption);
		txtidorigen.setBounds(394, 11, 117, 30);
		contentPane.add(txtidorigen);
		txtidorigen.setColumns(10);

		txtfechaventa = new JTextField();
		txtfechaventa.setBackground(SystemColor.inactiveCaption);
		txtfechaventa.setBounds(131, 88, 108, 30);
		contentPane.add(txtfechaventa);
		txtfechaventa.setColumns(10);

		txthoraventa = new JTextField();
		txthoraventa.setBackground(SystemColor.inactiveCaption);
		txthoraventa.setBounds(394, 88, 117, 30);
		contentPane.add(txthoraventa);
		txthoraventa.setColumns(10);

		txtfechaejecucion = new JTextField();
		txtfechaejecucion.setBackground(SystemColor.inactiveCaption);
		txtfechaejecucion.setBounds(131, 156, 108, 30);
		contentPane.add(txtfechaejecucion);
		txtfechaejecucion.setColumns(10);

		txtobservacion = new JTextField();
		txtobservacion.setBackground(SystemColor.inactiveCaption);
		txtobservacion.setBounds(394, 156, 117, 30);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);

		txtidclientes = new JTextField();
		txtidclientes.setBackground(SystemColor.inactiveCaption);
		txtidclientes.setBounds(131, 213, 108, 30);
		contentPane.add(txtidclientes);
		txtidclientes.setColumns(10);

		txtidvehiculos = new JTextField();
		txtidvehiculos.setBackground(SystemColor.inactiveCaption);
		txtidvehiculos.setBounds(394, 213, 117, 30);
		contentPane.add(txtidvehiculos);
		txtidvehiculos.setColumns(10);

		txtidpromototes = new JTextField();
		txtidpromototes.setBackground(SystemColor.inactiveCaption);
		txtidpromototes.setBounds(131, 270, 108, 30);
		contentPane.add(txtidpromototes);
		txtidpromototes.setColumns(10);

		txtidagencias = new JTextField();
		txtidagencias.setBackground(SystemColor.inactiveCaption);
		txtidagencias.setBounds(394, 270, 117, 30);
		contentPane.add(txtidagencias);
		txtidagencias.setColumns(10);

		txtidmedios = new JTextField();
		txtidmedios.setBackground(SystemColor.inactiveCaption);
		txtidmedios.setBounds(131, 324, 108, 30);
		contentPane.add(txtidmedios);
		txtidmedios.setColumns(10);

		lbliddestino = new JLabel("Id Destino");
		lbliddestino.setFont(new Font("Arial", Font.PLAIN, 14));
		lbliddestino.setBounds(10, 11, 98, 30);
		contentPane.add(lbliddestino);

		lblidorigen = new JLabel("Id Origen");
		lblidorigen.setFont(new Font("Arial", Font.PLAIN, 14));
		lblidorigen.setBounds(280, 11, 92, 30);
		contentPane.add(lblidorigen);

		lblfechaventa = new JLabel("Fecha Venta");
		lblfechaventa.setFont(new Font("Arial", Font.PLAIN, 14));
		lblfechaventa.setBounds(10, 88, 98, 30);
		contentPane.add(lblfechaventa);

		lblhoraventa = new JLabel("Hora Venta");
		lblhoraventa.setFont(new Font("Arial", Font.PLAIN, 14));
		lblhoraventa.setBounds(274, 88, 86, 30);
		contentPane.add(lblhoraventa);

		lblfechaejecucion = new JLabel("Fecha Ejecucion");
		lblfechaejecucion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblfechaejecucion.setBounds(10, 156, 111, 30);
		contentPane.add(lblfechaejecucion);

		lblodservacion = new JLabel("Observacion");
		lblodservacion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblodservacion.setBounds(274, 156, 92, 30);
		contentPane.add(lblodservacion);

		lblidclientes = new JLabel("Id Clientes");
		lblidclientes.setFont(new Font("Arial", Font.PLAIN, 14));
		lblidclientes.setBounds(10, 213, 98, 30);
		contentPane.add(lblidclientes);

		lblidvehiculos = new JLabel("Id Vehiculos");
		lblidvehiculos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblidvehiculos.setBounds(280, 213, 80, 30);
		contentPane.add(lblidvehiculos);

		lblidpromotores = new JLabel("Id Promotores");
		lblidpromotores.setFont(new Font("Arial", Font.PLAIN, 14));
		lblidpromotores.setBounds(10, 270, 98, 30);
		contentPane.add(lblidpromotores);

		lblidagencias = new JLabel("Id Agencias");
		lblidagencias.setFont(new Font("Arial", Font.PLAIN, 14));
		lblidagencias.setBounds(274, 270, 86, 30);
		contentPane.add(lblidagencias);

		lblidmedios = new JLabel("Id Medios");
		lblidmedios.setFont(new Font("Arial", Font.PLAIN, 14));
		lblidmedios.setBounds(10, 324, 98, 30);
		contentPane.add(lblidmedios);

		btnguardar = new JButton("");
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		btnguardar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\285657_floppy_guardar_save_icon (1).png"));
		btnguardar.setBackground(UIManager.getColor("Button.light"));
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnguardar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnguardar.setBounds(559, 21, 80, 56);
		contentPane.add(btnguardar);

		btnDelete = new JButton("");
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtidcodigo.getText()));
			}
		});
		btnDelete.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\1814090_delete_garbage_trash_icon.png"));
		btnDelete.setBackground(UIManager.getColor("Button.light"));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnDelete.setFont(new Font("Arial", Font.PLAIN, 14));
		btnDelete.setBounds(559, 88, 82, 57);
		contentPane.add(btnDelete);

		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiar.setBackground(UIManager.getColor("Button.light"));
		btnLimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpiar.setBounds(525, 320, 114, 37);
		contentPane.add(btnLimpiar);

		txtidcodigo = new JTextField();
		txtidcodigo.setText("");
		txtidcodigo.setColumns(10);
		txtidcodigo.setBackground(SystemColor.inactiveCaption);
		txtidcodigo.setBounds(394, 324, 117, 30);
		contentPane.add(txtidcodigo);

		JLabel lblIdCodigo = new JLabel("id Codigo");
		lblIdCodigo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblIdCodigo.setBounds(280, 323, 92, 30);
		contentPane.add(lblIdCodigo);

		btnconsultar = new JButton("");
		btnconsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnconsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.read(Integer.parseInt(txtidcodigo.getText()), txtiddestino, txtidorigen, txtfechaventa, txthoraventa,
						txtfechaejecucion, txtobservacion, txtidclientes, txtidvehiculos, txtidpromototes,
						txtidagencias, txtidagencias);

			}
		});
		btnconsultar.setIcon(new ImageIcon(
				"C:\\Users\\lizyi\\Downloads\\6071808_folder_progress_task_update_update task progress_icon.png"));
		btnconsultar.setBackground(UIManager.getColor("Button.light"));
		btnconsultar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnconsultar.setBounds(553, 168, 86, 66);
		contentPane.add(btnconsultar);

		btnActualizar = new JButton("");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cr.Update(Integer.parseInt(txtidcodigo.getText()), Integer.parseInt(txtiddestino.getText()),
						Integer.parseInt(txtidorigen.getText()), txtfechaventa.getText(), txthoraventa.getText(),
						txtfechaejecucion.getText(), txtobservacion.getText(),
						Integer.parseInt(txtidclientes.getText()), Integer.parseInt(txtidvehiculos.getText()),
						Integer.parseInt(txtidpromototes.getText()), Integer.parseInt(txtidagencias.getText()),
						Integer.parseInt(txtidmedios.getText()) );

			}
		});
		btnActualizar.setIcon(
				new ImageIcon("C:\\Users\\lizyi\\Downloads\\9104197_loading_refresh_reload_update_wait_icon.png"));
		btnActualizar.setBounds(550, 245, 89, 52);
		contentPane.add(btnActualizar);

		btnDelete.addActionListener(e -> clearFields());
	}

	private Object clearFields() {
		txtiddestino.setText("");
		txtidorigen.setText("");
		txtfechaventa.setText("");
		txthoraventa.setText("");
		txtfechaejecucion.setText("");
		txtobservacion.setText("");
		txtidclientes.setText("");
		txtidvehiculos.setText("");
		txtidpromototes.setText("");
		txtidagencias.setText("");
		txtidmedios.setText("");
		return null;

	}
}
