package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Medios;
import Model.Promotores;

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

public class Jfpromotores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txttipodocumento;
	private JTextField txtdocumento;
	private JTextField txtnombres;
	private JTextField txtapellidos;
	private JTextField txtdireccion;
	private JTextField txtcorreopersonal;
	private JTextField txtcorreocoporativo;
	private JTextField txtfechanacimiento;
	private JTextField txttelefono;
	private JLabel lbltipodocumento;
	private JLabel lbldocumento;
	private JLabel lblnombres;
	private JLabel lblapellidos;
	private JLabel lbldireccion;
	private JLabel lblcorreopersonal;
	private JLabel lblcorreocoorporativo;
	private JLabel lblfechanacimiento;
	private JLabel lblidpromotores;
	private JTextField txtIdpromotores;
	private JButton btnEliminar;

	Promotores cr = new Promotores();
	private JButton btnlimpiar;
	private JButton btncolsultar;
	private JButton btnActualizar;
	private JTextField txtcontraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jfpromotores frame = new Jfpromotores();
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
	public Jfpromotores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 426);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txttipodocumento = new JTextField();
		txttipodocumento.setBackground(SystemColor.inactiveCaption);
		txttipodocumento.setBounds(118, 42, 108, 26);
		contentPane.add(txttipodocumento);
		txttipodocumento.setColumns(10);

		txtdocumento = new JTextField();
		txtdocumento.setBackground(SystemColor.inactiveCaption);
		txtdocumento.setBounds(363, 42, 105, 26);
		contentPane.add(txtdocumento);
		txtdocumento.setColumns(10);

		txtnombres = new JTextField();
		txtnombres.setBackground(SystemColor.inactiveCaption);
		txtnombres.setBounds(118, 111, 108, 26);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);

		txtapellidos = new JTextField();
		txtapellidos.setBackground(SystemColor.inactiveCaption);
		txtapellidos.setBounds(363, 111, 105, 26);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);

		txtdireccion = new JTextField();
		txtdireccion.setBackground(SystemColor.inactiveCaption);
		txtdireccion.setBounds(118, 179, 108, 26);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);

		txtcorreopersonal = new JTextField();
		txtcorreopersonal.setBackground(SystemColor.inactiveCaption);
		txtcorreopersonal.setBounds(363, 179, 105, 26);
		contentPane.add(txtcorreopersonal);
		txtcorreopersonal.setColumns(10);

		txtcorreocoporativo = new JTextField();
		txtcorreocoporativo.setBackground(SystemColor.inactiveCaption);
		txtcorreocoporativo.setBounds(144, 240, 108, 26);
		contentPane.add(txtcorreocoporativo);
		txtcorreocoporativo.setColumns(10);

		txtfechanacimiento = new JTextField();
		txtfechanacimiento.setBackground(SystemColor.inactiveCaption);
		txtfechanacimiento.setBounds(144, 287, 105, 26);
		contentPane.add(txtfechanacimiento);
		txtfechanacimiento.setColumns(10);

		txttelefono = new JTextField();
		txttelefono.setBackground(SystemColor.inactiveCaption);
		txttelefono.setBounds(363, 240, 105, 26);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);

		lbltipodocumento = new JLabel("Tipo Documento");
		lbltipodocumento.setFont(new Font("Arial", Font.PLAIN, 14));
		lbltipodocumento.setBounds(0, 42, 108, 26);
		contentPane.add(lbltipodocumento);

		lbldocumento = new JLabel("Documento");
		lbldocumento.setFont(new Font("Arial", Font.PLAIN, 14));
		lbldocumento.setBounds(247, 42, 106, 26);
		contentPane.add(lbldocumento);

		lblnombres = new JLabel("Nombres");
		lblnombres.setFont(new Font("Arial", Font.PLAIN, 14));
		lblnombres.setBounds(0, 111, 87, 33);
		contentPane.add(lblnombres);

		lblapellidos = new JLabel("Apellidos");
		lblapellidos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblapellidos.setBounds(247, 111, 89, 26);
		contentPane.add(lblapellidos);

		lbldireccion = new JLabel("Dirección");
		lbldireccion.setFont(new Font("Arial", Font.PLAIN, 14));
		lbldireccion.setBounds(0, 179, 96, 26);
		contentPane.add(lbldireccion);

		lblcorreopersonal = new JLabel("Correo Personal");
		lblcorreopersonal.setFont(new Font("Arial", Font.PLAIN, 14));
		lblcorreopersonal.setBounds(247, 179, 106, 26);
		contentPane.add(lblcorreopersonal);

		lblcorreocoorporativo = new JLabel("Correo Coorporativo");
		lblcorreocoorporativo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblcorreocoorporativo.setBounds(0, 239, 134, 26);
		contentPane.add(lblcorreocoorporativo);

		lblfechanacimiento = new JLabel("Fecha Nacimiento");
		lblfechanacimiento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblfechanacimiento.setBounds(0, 286, 134, 26);
		contentPane.add(lblfechanacimiento);

		JLabel lblNewLabel = new JLabel("Telefono");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(262, 240, 91, 26);
		contentPane.add(lblNewLabel);

		JButton btnconsultar = new JButton("");
		btnconsultar.addMouseListener(new MouseAdapter() {

		});
		btnconsultar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\285657_floppy_guardar_save_icon (1).png"));
		btnconsultar.setBackground(UIManager.getColor("Button.light"));
		btnconsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cr.create(Integer.parseInt(txttipodocumento.getText()), Integer.parseInt(txtdocumento.getText()),
						Integer.parseInt(txtcontraseña.getText()), txtnombres.getText(), txtapellidos.getText(),
						txtdireccion.getText(), txtcorreopersonal.getText(), txtcorreocoporativo.getText(),
						txtfechanacimiento.getText(), txttelefono.getText());
			}
		});
		btnconsultar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnconsultar.setBounds(541, 131, 81, 57);
		contentPane.add(btnconsultar);

		lblidpromotores = new JLabel("id promotores");
		lblidpromotores.setFont(new Font("Arial", Font.PLAIN, 14));
		lblidpromotores.setBounds(247, 289, 91, 20);
		contentPane.add(lblidpromotores);

		txtIdpromotores = new JTextField();
		txtIdpromotores.setBackground(SystemColor.inactiveCaption);
		txtIdpromotores.setBounds(363, 287, 105, 26);
		contentPane.add(txtIdpromotores);
		txtIdpromotores.setColumns(10);

		btnEliminar = new JButton("");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.delete(Integer.parseInt(txtIdpromotores.getText()));
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\1814090_delete_garbage_trash_icon.png"));
		btnEliminar.setBounds(541, 42, 81, 57);
		contentPane.add(btnEliminar);

		btnlimpiar = new JButton("Limpiar");
		btnlimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnlimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnlimpiar.setBounds(363, 340, 108, 33);
		contentPane.add(btnlimpiar);

		btncolsultar = new JButton("");
		btncolsultar.setIcon(new ImageIcon(
				"C:\\Users\\lizyi\\Downloads\\6071808_folder_progress_task_update_update task progress_icon.png"));
		btncolsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cr.read(Integer.parseInt(txtIdpromotores.getText()), txtcontraseña, txttipodocumento, txtdocumento,
						txtnombres, txtapellidos, txtdireccion, txtcorreopersonal, txtcorreocoporativo,
						txtfechanacimiento, txttelefono);

			}
		});
		btncolsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btncolsultar.setFont(new Font("Arial", Font.PLAIN, 14));
		btncolsultar.setBounds(535, 225, 87, 57);
		contentPane.add(btncolsultar);

		btnActualizar = new JButton("");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Update(Integer.parseInt(txtIdpromotores.getText()), Integer.parseInt(txtcontraseña.getText()),
						Integer.parseInt(txttipodocumento.getText()), Integer.parseInt(txtdocumento.getText()),
						txtnombres.getText(), txtapellidos.getText(), txtdireccion.getText(),
						txtcorreopersonal.getText(), txtcorreocoporativo.getText(), txtfechanacimiento.getText(),
						Integer.parseInt(txttelefono.getText()));											
			}
		});
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				

			}
		});
		btnActualizar.setIcon(
				new ImageIcon("C:\\Users\\lizyi\\Downloads\\9104197_loading_refresh_reload_update_wait_icon.png"));
		btnActualizar.setBounds(533, 312, 89, 61);
		contentPane.add(btnActualizar);

		JLabel lblcontraseña = new JLabel("Contraseña");
		lblcontraseña.setFont(new Font("Arial", Font.PLAIN, 14));
		lblcontraseña.setBounds(10, 340, 96, 26);
		contentPane.add(lblcontraseña);

		txtcontraseña = new JTextField();
		txtcontraseña.setColumns(10);
		txtcontraseña.setBackground(SystemColor.inactiveCaption);
		txtcontraseña.setBounds(144, 340, 105, 26);
		contentPane.add(txtcontraseña);

	}

	private Object clearFields() {
		txttipodocumento.setText("");
		txtdocumento.setText("");
		txtnombres.setText("");
		txtapellidos.setText("");
		txtdireccion.setText("");
		txtcorreopersonal.setText("");
		txtcorreocoporativo.setText("");
		txtfechanacimiento.setText("");
		txttelefono.setText("");
		return null;
	}
}
