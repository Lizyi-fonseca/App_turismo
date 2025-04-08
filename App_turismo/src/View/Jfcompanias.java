package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Companias;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Jfcompanias extends JFrame {

	Companias cr = new Companias();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtrazonsocial;
	private JTextField txtdireccion;
	private JTextField txtcorreo;
	private JTextField txttelefono;
	private JTextField txtfecchacreaccion;
	private JTextField txtwed;
	private JLabel lblNewLabel;
	private JLabel lbldireccio;
	private JLabel lblcorreo;
	private JLabel lbltelefono;
	private JLabel lblfechacreacion;
	private JLabel lblNewLabel_1;
	private JLabel lblwed;
	private JButton btnguardar;
	private JTextField txtidcompañia;
	private JLabel lblIdCompaia;
	private JButton btnlimpiar;

	private JButton btndelete;
	private JButton btnconsultar;
	private JButton btnActualizar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jfcompanias frame = new Jfcompanias();
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
	public Jfcompanias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 435);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(180, 180, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtrazonsocial = new JTextField();
		txtrazonsocial.setBackground(SystemColor.inactiveCaption);
		txtrazonsocial.setBounds(112, 26, 122, 31);
		contentPane.add(txtrazonsocial);
		txtrazonsocial.setColumns(10);

		txtdireccion = new JTextField();
		txtdireccion.setBackground(new Color(191, 205, 219));
		txtdireccion.setBounds(112, 103, 122, 31);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);

		txtcorreo = new JTextField();
		txtcorreo.setBackground(SystemColor.inactiveCaption);
		txtcorreo.setBounds(112, 179, 122, 31);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);

		txttelefono = new JTextField();
		txttelefono.setBackground(SystemColor.inactiveCaption);
		txttelefono.setBounds(374, 26, 138, 31);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);

		txtfecchacreaccion = new JTextField();
		txtfecchacreaccion.setBackground(SystemColor.inactiveCaption);
		txtfecchacreaccion.setBounds(374, 103, 138, 31);
		contentPane.add(txtfecchacreaccion);
		txtfecchacreaccion.setColumns(10);

		txtwed = new JTextField();
		txtwed.setBackground(SystemColor.inactiveCaption);
		txtwed.setBounds(374, 179, 138, 31);
		contentPane.add(txtwed);
		txtwed.setColumns(10);

		lblNewLabel = new JLabel("Razon Social");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 30, 103, 20);
		contentPane.add(lblNewLabel);

		lbldireccio = new JLabel("Direccion");
		lbldireccio.setFont(new Font("Arial", Font.PLAIN, 14));
		lbldireccio.setBounds(10, 103, 103, 33);
		contentPane.add(lbldireccio);

		lblcorreo = new JLabel("Correo");
		lblcorreo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblcorreo.setBounds(10, 179, 103, 31);
		contentPane.add(lblcorreo);

		lbltelefono = new JLabel("Telefono");
		lbltelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		lbltelefono.setBounds(261, 25, 86, 31);
		contentPane.add(lbltelefono);

		lblfechacreacion = new JLabel("Fecha Creacion");
		lblfechacreacion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblfechacreacion.setBounds(261, 103, 124, 31);
		contentPane.add(lblfechacreacion);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(266, 187, 46, 14);
		contentPane.add(lblNewLabel_1);

		lblwed = new JLabel("Wed");
		lblwed.setFont(new Font("Arial", Font.PLAIN, 14));
		lblwed.setBounds(261, 179, 86, 23);
		contentPane.add(lblwed);

		btnguardar = new JButton("");
		btnguardar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\285657_floppy_guardar_save_icon (1).png"));
		btnguardar.setBackground(SystemColor.scrollbar);
		btnguardar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cr.create(txtrazonsocial.getText(), txtdireccion.getText(), txtcorreo.getText(), txttelefono.getText(),
						txtfecchacreaccion.getText(), txtwed.getText());
			}
		});
		btnguardar.setBounds(553, 11, 86, 63);
		contentPane.add(btnguardar);

		txtidcompañia = new JTextField();
		txtidcompañia.setText("");
		txtidcompañia.setColumns(10);
		txtidcompañia.setBackground(SystemColor.inactiveCaption);
		txtidcompañia.setBounds(112, 264, 138, 31);
		contentPane.add(txtidcompañia);

		lblIdCompaia = new JLabel("Id Compañia");
		lblIdCompaia.setFont(new Font("Arial", Font.PLAIN, 14));
		lblIdCompaia.setBounds(10, 263, 86, 31);
		contentPane.add(lblIdCompaia);

		btnlimpiar = new JButton("Limpiar");
		btnlimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnlimpiar.setBackground(UIManager.getColor("Button.light"));
		btnlimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnlimpiar.setBounds(390, 260, 122, 37);
		contentPane.add(btnlimpiar);

		btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cr.delete(Integer.parseInt(txtidcompañia.getText()));
			}
		});
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\1814090_delete_garbage_trash_icon.png"));
		btndelete.setBounds(553, 103, 86, 63);
		contentPane.add(btndelete);

		btnconsultar = new JButton("");
		btnconsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cr.read(Integer.parseInt(txtidcompañia.getText()), txtrazonsocial, txtdireccion, txtcorreo, txttelefono,
						txtfecchacreaccion, txtwed);

			}
		});
		btnconsultar.setIcon(new ImageIcon(
				"C:\\Users\\lizyi\\Downloads\\6071808_folder_progress_task_update_update task progress_icon.png"));
		btnconsultar.setBackground(UIManager.getColor("Button.light"));
		btnconsultar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnconsultar.setBounds(546, 199, 93, 57);
		contentPane.add(btnconsultar);

		btnActualizar = new JButton("");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cr.Update(Integer.parseInt(txtidcompañia.getText()), txtrazonsocial.getText(), txtdireccion.getText(),
						txtcorreo.getText(), txttelefono.getText(), txtfecchacreaccion.getText(), txtwed.getText());

			}
		});
		btnActualizar.setIcon(
				new ImageIcon("C:\\Users\\lizyi\\Downloads\\9104197_loading_refresh_reload_update_wait_icon.png"));
		btnActualizar.setBounds(550, 274, 89, 63);
		contentPane.add(btnActualizar);

	}

	private void clearFields() {
		txtrazonsocial.setText("");
		txtdireccion.setText("");
		txtcorreo.setText("");
		txttelefono.setText("");
		txtfecchacreaccion.setText("");
		txtwed.setText("");
	}

}
