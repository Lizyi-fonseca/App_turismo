package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

import Model.Agencias;
import Model.Clientes;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;

public class Jfclientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txttipodocumento;
	private JTextField txtdocumento;
	private JTextField txtnombres;
	private JTextField txtapellidos;
	private JTextField txteps;
	private JTextField txtalergias;
	private JTextField txtfechanacimiento;
	private JTextField txtcorreo;
	private JTextField txtestadocivil;
	private JTextField txttelefono;
	private JTextField txtdireccion;
	private JLabel lbndocumeno;
	private JLabel lbndocumento;
	Clientes cr = new Clientes();
	private JButton btnlimpiar;
	private JTextField txtIdCliente;
	private JLabel lblidcliente;
	private JButton btnconsultar;
	private JButton btnActualizar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jfclientes frame = new Jfclientes();
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
	public Jfclientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 455);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txttipodocumento = new JTextField();
		txttipodocumento.setBackground(SystemColor.inactiveCaption);
		txttipodocumento.setBounds(121, 71, 104, 26);
		contentPane.add(txttipodocumento);
		txttipodocumento.setColumns(10);
		
		txtdocumento = new JTextField();
		txtdocumento.setBackground(SystemColor.inactiveCaption);
		txtdocumento.setBounds(351, 71, 111, 26);
		contentPane.add(txtdocumento);
		txtdocumento.setColumns(10);
		
		txtnombres = new JTextField();
		txtnombres.setBackground(SystemColor.inactiveCaption);
		txtnombres.setBounds(92, 11, 118, 26);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txtapellidos = new JTextField();
		txtapellidos.setBackground(SystemColor.inactiveCaption);
		txtapellidos.setBounds(351, 12, 111, 25);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);
		
		txteps = new JTextField();
		txteps.setBackground(SystemColor.inactiveCaption);
		txteps.setBounds(92, 130, 118, 27);
		contentPane.add(txteps);
		txteps.setColumns(10);
		
		txtalergias = new JTextField();
		txtalergias.setBackground(SystemColor.inactiveCaption);
		txtalergias.setBounds(351, 130, 111, 26);
		contentPane.add(txtalergias);
		txtalergias.setColumns(10);
		
		txtfechanacimiento = new JTextField();
		txtfechanacimiento.setBackground(SystemColor.inactiveCaption);
		txtfechanacimiento.setBounds(121, 181, 104, 26);
		contentPane.add(txtfechanacimiento);
		txtfechanacimiento.setColumns(10);
		
		txtcorreo = new JTextField();
		txtcorreo.setBackground(SystemColor.inactiveCaption);
		txtcorreo.setBounds(351, 181, 111, 26);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		txtestadocivil = new JTextField();
		txtestadocivil.setBackground(SystemColor.inactiveCaption);
		txtestadocivil.setBounds(121, 247, 104, 26);
		contentPane.add(txtestadocivil);
		txtestadocivil.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBackground(SystemColor.inactiveCaption);
		txttelefono.setBounds(351, 247, 111, 26);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBackground(SystemColor.inactiveCaption);
		txtdireccion.setBounds(121, 296, 104, 26);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		lbndocumeno = new JLabel("Tipo Documento");
		lbndocumeno.setFont(new Font("Arial", Font.PLAIN, 14));
		lbndocumeno.setBounds(7, 70, 104, 26);
		contentPane.add(lbndocumeno);
		
		lbndocumento = new JLabel("Documento");
		lbndocumento.setFont(new Font("Arial", Font.PLAIN, 14));
		lbndocumento.setBounds(257, 73, 80, 20);
		contentPane.add(lbndocumento);
		
		JLabel lblnombres = new JLabel("Nombres");
		lblnombres.setFont(new Font("Arial", Font.PLAIN, 14));
		lblnombres.setBounds(22, 10, 86, 26);
		contentPane.add(lblnombres);
		
		JLabel lblapellidos = new JLabel("Apellidos");
		lblapellidos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblapellidos.setBounds(257, 10, 99, 27);
		contentPane.add(lblapellidos);
		
		JLabel lbleps = new JLabel("EPS");
		lbleps.setFont(new Font("Arial", Font.PLAIN, 14));
		lbleps.setBounds(16, 132, 66, 20);
		contentPane.add(lbleps);
		
		JLabel lblalergias = new JLabel("Alergias");
		lblalergias.setFont(new Font("Arial", Font.PLAIN, 14));
		lblalergias.setBounds(235, 132, 86, 20);
		contentPane.add(lblalergias);
		
		JLabel lblfechanacimiento = new JLabel("Fecha de nacimiento");
		lblfechanacimiento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblfechanacimiento.setBounds(0, 180, 104, 26);
		contentPane.add(lblfechanacimiento);
		
		JLabel lblcorreo = new JLabel("Correo");
		lblcorreo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblcorreo.setBounds(235, 184, 86, 19);
		contentPane.add(lblcorreo);
		
		JLabel lblestadocivil = new JLabel("Estadocivil");
		lblestadocivil.setFont(new Font("Arial", Font.PLAIN, 14));
		lblestadocivil.setBounds(7, 250, 104, 19);
		contentPane.add(lblestadocivil);
		
		JLabel lbltelefono = new JLabel("Telefono");
		lbltelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		lbltelefono.setBounds(235, 246, 86, 26);
		contentPane.add(lbltelefono);
		
		JLabel lbldirecion = new JLabel("Direccion");
		lbldirecion.setFont(new Font("Arial", Font.PLAIN, 14));
		lbldirecion.setBounds(7, 295, 89, 26);
		contentPane.add(lbldirecion);
		
		JButton btnguardar = new JButton("");
		btnguardar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\285657_floppy_guardar_save_icon.png"));
		btnguardar.setBackground(SystemColor.activeCaptionBorder);
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cr.create(Integer.parseInt(txttipodocumento.getText()), Integer.parseInt(txtdocumento.getText()), txtnombres.getText(),txtapellidos.getText(), txteps.getText(), txtalergias.getText(), txtfechanacimiento.getText(), txtcorreo.getText(),txtestadocivil.getText(),txttelefono.getText(),txtdireccion.getText());
			}
		});
		btnguardar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnguardar.setBounds(506, 110, 104, 69);
		contentPane.add(btnguardar);
		
		JButton btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				cr.delete(Integer.parseInt(txtIdCliente.getText()));
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\1814090_delete_garbage_trash_icon.png"));
		btndelete.setBackground(SystemColor.activeCaptionBorder);
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			}

			private Object clearFields() {
				txttipodocumento.setText("");
				txtdocumento.setText("");
				txtnombres.setText("");
				txtapellidos.setText("");
				txteps.setText("");
				txtalergias.setText("");
				txtfechanacimiento.setText("");
				txtcorreo.setText("");
				txtestadocivil.setText("");
				txttelefono.setText("");
				txtdireccion.setText("");
				return null;
			}
		});
		btndelete.setFont(new Font("Arial", Font.PLAIN, 14));
		btndelete.setBounds(506, 11, 104, 69);
		contentPane.add(btndelete);
		
		btnlimpiar = new JButton("Limpiar");
		btnlimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				btnlimpiar.addActionListener(f -> clearFields());
			}
		});
		btnlimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			}
		});
		btnlimpiar.setBackground(UIManager.getColor("Button.light"));
		btnlimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnlimpiar.setBounds(327, 332, 135, 33);
		contentPane.add(btnlimpiar);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setBackground(SystemColor.inactiveCaption);
		txtIdCliente.setBounds(351, 298, 111, 23);
		contentPane.add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		lblidcliente = new JLabel("Id Cliente");
		lblidcliente.setFont(new Font("Arial", Font.PLAIN, 14));
		lblidcliente.setBounds(235, 295, 86, 26);
		contentPane.add(lblidcliente);
		
		btnconsultar = new JButton("");
		btnconsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnconsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.read(Integer.parseInt(txtIdCliente.getText()), txttipodocumento, txtdocumento, txtnombres, txtapellidos, txteps, txtalergias, 
				txtfechanacimiento, txtcorreo,txtestadocivil,txttelefono,txtdireccion);
			}
		});
		btnconsultar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\6071808_folder_progress_task_update_update task progress_icon.png"));
		btnconsultar.setBackground(UIManager.getColor("Button.light"));
		btnconsultar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnconsultar.setBounds(506, 212, 104, 69);
		contentPane.add(btnconsultar);
		
		btnActualizar = new JButton("");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.Update(Integer.parseInt(txtIdCliente.getText()), Integer.parseInt(txttipodocumento.getText()), Integer.parseInt(txtdocumento.getText()),
				          txtnombres.getText(), txtapellidos.getText(), txteps.getText(), txtalergias.getText(), txtfechanacimiento.getText(), txtcorreo.getText(),
				          txtestadocivil.getText(), txttelefono.getText(), txtdireccion.getText());
				
			}
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\9104197_loading_refresh_reload_update_wait_icon.png"));
		btnActualizar.setBounds(506, 308, 104, 57);
		contentPane.add(btnActualizar);
		
	}

	private void clearFields() {
		
		txttipodocumento.setText("");
		txtdocumento.setText("");
		txtnombres.setText("");
		txtapellidos.setText("");
		txteps.setText("");
		txtalergias.setText("");
		txtfechanacimiento.setText("");
		txtcorreo.setText("");
		txtcorreo.setText("");
		txtestadocivil.setText("");
		txttelefono.setText("");
		txtdireccion.setText("");
		txtIdCliente.setText("");
		
		
	}
}
