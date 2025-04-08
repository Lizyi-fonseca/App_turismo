package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Agencias;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class Jfagencias extends JFrame {

	Agencias cr = new Agencias();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombres;
	private JTextField txttelefono;
	private JTextField txtdireccion;
	private JTextField txtcorreo;
	private JTextField txtwed;
	private JLabel lblnombres;
	private JLabel lbltelefono;
	private JLabel lbldireccion;
	private JLabel lblcorreo;
	private JLabel lblwed;
	private JTextField txtidcompania;
	private JTextField txtIdagencia;
	private JLabel lblIdAgencias;
	private JButton btnlimpiar;
	private JButton btnActualizar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jfagencias frame = new Jfagencias();
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
	public Jfagencias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 433);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.scrollbar);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtnombres = new JTextField();
		txtnombres.setBackground(SystemColor.inactiveCaption);
		txtnombres.setBounds(34, 38, 285, 31);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);

		txttelefono = new JTextField();
		txttelefono.setBackground(SystemColor.inactiveCaption);
		txttelefono.setBounds(34, 104, 285, 31);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);

		txtdireccion = new JTextField();
		txtdireccion.setBackground(SystemColor.inactiveCaption);
		txtdireccion.setBounds(34, 184, 285, 31);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);

		txtcorreo = new JTextField();
		txtcorreo.setBackground(SystemColor.inactiveCaption);
		txtcorreo.setBounds(34, 265, 285, 31);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);

		txtwed = new JTextField();
		txtwed.setBackground(SystemColor.inactiveCaption);
		txtwed.setBounds(34, 345, 285, 31);
		contentPane.add(txtwed);
		txtwed.setColumns(10);

		lblnombres = new JLabel("Nombres");
		lblnombres.setFont(new Font("Arial", Font.PLAIN, 14));
		lblnombres.setBounds(38, 0, 281, 27);
		contentPane.add(lblnombres);

		lbltelefono = new JLabel("Telefono");
		lbltelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		lbltelefono.setBounds(34, 76, 285, 27);
		contentPane.add(lbltelefono);

		lbldireccion = new JLabel("Direccion");
		lbldireccion.setFont(new Font("Arial", Font.PLAIN, 14));
		lbldireccion.setBounds(34, 146, 290, 27);
		contentPane.add(lbldireccion);

		lblcorreo = new JLabel("Correo");
		lblcorreo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblcorreo.setBounds(34, 226, 285, 28);
		contentPane.add(lblcorreo);

		lblwed = new JLabel("Wed");
		lblwed.setFont(new Font("Arial", Font.PLAIN, 14));
		lblwed.setBounds(34, 307, 285, 27);
		contentPane.add(lblwed);

		JButton btnguardar = new JButton("");
		btnguardar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\285657_floppy_guardar_save_icon (1).png"));
		btnguardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cr.create(txtnombres.getText(), txttelefono.getText(), txtdireccion.getText(), txtcorreo.getText(),
						txtwed.getText(), Integer.parseInt(txtidcompania.getText()));
			}
		});
		btnguardar.setBackground(Color.LIGHT_GRAY);
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnguardar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnguardar.setBounds(537, 107, 86, 57);
		contentPane.add(btnguardar);

		JButton tbndelete = new JButton("");
		tbndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// invocar el metedo para eliminar registro
				cr.delete(Integer.parseInt(txtIdagencia.getText()));

			}
		});
		tbndelete.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\1814090_delete_garbage_trash_icon.png"));
		tbndelete.setBackground(Color.LIGHT_GRAY);
		tbndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		tbndelete.setFont(new Font("Arial", Font.PLAIN, 14));
		tbndelete.setBounds(537, 22, 86, 56);
		contentPane.add(tbndelete);

		txtidcompania = new JTextField();
		txtidcompania.setColumns(10);
		txtidcompania.setBackground(SystemColor.inactiveCaption);
		txtidcompania.setBounds(355, 75, 144, 31);
		contentPane.add(txtidcompania);

		JLabel lblIdCompaia = new JLabel("Id compañia");
		lblIdCompaia.setFont(new Font("Arial", Font.PLAIN, 14));
		lblIdCompaia.setBounds(355, 37, 144, 31);
		contentPane.add(lblIdCompaia);

		txtIdagencia = new JTextField();
		txtIdagencia.setText("");
		txtIdagencia.setColumns(10);
		txtIdagencia.setBackground(SystemColor.inactiveCaption);
		txtIdagencia.setBounds(355, 175, 144, 31);
		contentPane.add(txtIdagencia);

		lblIdAgencias = new JLabel("id Agencias");
		lblIdAgencias.setFont(new Font("Arial", Font.PLAIN, 14));
		lblIdAgencias.setBounds(362, 133, 137, 31);
		contentPane.add(lblIdAgencias);

		btnlimpiar = new JButton("Limpiar");
		btnlimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				btnlimpiar.addActionListener(f -> clearFields());

			}
		});
		btnlimpiar.setBackground(UIManager.getColor("Button.light"));
		btnlimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnlimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnlimpiar.setBounds(376, 264, 103, 31);
		contentPane.add(btnlimpiar);

		JButton btnconsultar = new JButton("");
		btnconsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnconsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cr.read(Integer.parseInt(txtIdagencia.getText()), txtnombres, txttelefono, txtdireccion, txtcorreo,
						txtwed);

			}
		});
		btnconsultar.setIcon(new ImageIcon(
				"C:\\Users\\lizyi\\Downloads\\6071808_folder_progress_task_update_update task progress_icon.png"));
		btnconsultar.setBackground(UIManager.getColor("Button.light"));
		btnconsultar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnconsultar.setBounds(537, 184, 86, 57);
		contentPane.add(btnconsultar);

		btnActualizar = new JButton("");
		btnActualizar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cr.Update(Integer.parseInt(txtIdagencia.getText()), txtnombres.getText(), txttelefono.getText(),
						txtdireccion.getText(), txtcorreo.getText(), txtwed.getText(),
						Integer.parseInt(txtidcompania.getText()));
			}
		});
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.setIcon(
				new ImageIcon("C:\\Users\\lizyi\\Downloads\\9104197_loading_refresh_reload_update_wait_icon.png"));
		btnActualizar.setBounds(537, 277, 83, 57);
		contentPane.add(btnActualizar);

	}

	private void clearFields() {
		txtnombres.setText("");
		txttelefono.setText("");
		txtdireccion.setText("");
		txtcorreo.setText("");
		txtwed.setText("");
		txtidcompania.setText("");
		txtIdagencia.setText("");

	}

}
