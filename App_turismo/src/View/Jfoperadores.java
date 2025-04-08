package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Clientes;
import Model.Operadores;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Jfoperadores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txttipodocumento;
	private JTextField txtdocumento;
	private JTextField txtnombres;
	private JTextField txtapellidos;
	private JTextField txtdireccion;
	private JTextField txtcorreo;
	private JTextField txttelefono;
	private JTextField txtidvehiculos;
	private JLabel lbltipodocumento;
	private JLabel lbl;
	private JLabel lblnombres;
	private JLabel lblapellidos;
	private JLabel lbldireccion;
	private JLabel lblcorreo;
	private JLabel lbltelefono;
	private JLabel lblidvehiculo;
	private JButton btnguardar;
	private JButton btndelete;
	
	Operadores cr = new Operadores();
	private JButton btnLimpiar;
	private JLabel lblIdoperadores;
	private JTextField txtidoperadodres;
	private JButton btnConsultar;
	private JButton btnActualizar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jfoperadores frame = new Jfoperadores();
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
	public Jfoperadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 445);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txttipodocumento = new JTextField();
		txttipodocumento.setBackground(SystemColor.inactiveCaption);
		txttipodocumento.setBounds(142, 5, 116, 31);
		contentPane.add(txttipodocumento);
		txttipodocumento.setColumns(10);
		
		txtdocumento = new JTextField();
		txtdocumento.setBackground(SystemColor.inactiveCaption);
		txtdocumento.setBounds(413, 5, 116, 31);
		contentPane.add(txtdocumento);
		txtdocumento.setColumns(10);
		
		txtnombres = new JTextField();
		txtnombres.setBackground(SystemColor.inactiveCaption);
		txtnombres.setBounds(142, 92, 116, 31);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txtapellidos = new JTextField();
		txtapellidos.setBackground(SystemColor.inactiveCaption);
		txtapellidos.setBounds(413, 92, 116, 31);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBackground(SystemColor.inactiveCaption);
		txtdireccion.setBounds(142, 175, 116, 31);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtcorreo = new JTextField();
		txtcorreo.setBackground(SystemColor.inactiveCaption);
		txtcorreo.setBounds(413, 175, 116, 31);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBackground(SystemColor.inactiveCaption);
		txttelefono.setBounds(142, 248, 116, 31);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		txtidvehiculos = new JTextField();
		txtidvehiculos.setBackground(SystemColor.inactiveCaption);
		txtidvehiculos.setBounds(413, 248, 116, 31);
		contentPane.add(txtidvehiculos);
		txtidvehiculos.setColumns(10);
		
		lbltipodocumento = new JLabel("Tipo Documento");
		lbltipodocumento.setFont(new Font("Arial", Font.PLAIN, 14));
		lbltipodocumento.setBounds(0, 11, 122, 25);
		contentPane.add(lbltipodocumento);
		
		lbl = new JLabel("Documento");
		lbl.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl.setBounds(293, 4, 100, 31);
		contentPane.add(lbl);
		
		lblnombres = new JLabel("Nombres");
		lblnombres.setFont(new Font("Arial", Font.PLAIN, 14));
		lblnombres.setBounds(0, 92, 107, 31);
		contentPane.add(lblnombres);
		
		lblapellidos = new JLabel("Apellidos");
		lblapellidos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblapellidos.setBounds(293, 92, 86, 31);
		contentPane.add(lblapellidos);
		
		lbldireccion = new JLabel("Direccion");
		lbldireccion.setFont(new Font("Arial", Font.PLAIN, 14));
		lbldireccion.setBounds(0, 175, 96, 31);
		contentPane.add(lbldireccion);
		
		lblcorreo = new JLabel("Correo");
		lblcorreo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblcorreo.setBounds(293, 175, 86, 31);
		contentPane.add(lblcorreo);
		
		lbltelefono = new JLabel("Telefono");
		lbltelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		lbltelefono.setBounds(0, 248, 107, 31);
		contentPane.add(lbltelefono);
		
		lblidvehiculo = new JLabel("Id vehiculo");
		lblidvehiculo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblidvehiculo.setBounds(293, 248, 86, 31);
		contentPane.add(lblidvehiculo);
		
		btnguardar = new JButton("");
		btnguardar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\285657_floppy_guardar_save_icon (1).png"));
		btnguardar.setBackground(UIManager.getColor("Button.light"));
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		    
		    cr.create(Integer.parseInt(txttipodocumento.getText()), Integer.parseInt(txtdocumento.getText()),
		    		txtnombres.getText(), txtapellidos.getText(), txtdireccion.getText(),
		    		txtcorreo.getText(), txttelefono.getText(), Integer.parseInt(txtidvehiculos.getText()));
			}
		});
		btnguardar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnguardar.setBounds(556, 115, 86, 65);
		contentPane.add(btnguardar);
		
		btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.delete(Integer.parseInt(txtidoperadodres.getText()));
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\1814090_delete_garbage_trash_icon.png"));
		btndelete.setBackground(UIManager.getColor("Button.light"));
		btndelete.setFont(new Font("Arial", Font.PLAIN, 14));
		btndelete.setBounds(556, 34, 86, 57);
		contentPane.add(btndelete);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpiar.setBounds(302, 309, 116, 36);
		contentPane.add(btnLimpiar);
		
		lblIdoperadores = new JLabel("idoperadores");
		lblIdoperadores.setBackground(SystemColor.inactiveCaption);
		lblIdoperadores.setFont(new Font("Arial", Font.PLAIN, 14));
		lblIdoperadores.setBounds(0, 312, 86, 31);
		contentPane.add(lblIdoperadores);
		
		txtidoperadodres = new JTextField();
		txtidoperadodres.setText("");
		txtidoperadodres.setColumns(10);
		txtidoperadodres.setBackground(SystemColor.inactiveCaption);
		txtidoperadodres.setBounds(142, 313, 116, 31);
		contentPane.add(txtidoperadodres);
		
		btnConsultar = new JButton("");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.read(Integer.parseInt(txtidoperadodres.getText()), txttipodocumento, txtdocumento, txtnombres, txtapellidos, txtdireccion, txtcorreo, txttelefono, txtidvehiculos);
				
				
			}
		});
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\6071808_folder_progress_task_update_update task progress_icon.png"));
		btnConsultar.setBounds(556, 203, 89, 76);
		contentPane.add(btnConsultar);
		
		btnActualizar = new JButton("");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.Update(Integer.parseInt(txtidoperadodres.getText()), Integer.parseInt(txttipodocumento.getText()), Integer.parseInt(txtdocumento.getText()),
						txtnombres.getText(), txtapellidos.getText(), txtdireccion.getText(), txtcorreo.getText(), txttelefono.getText(), Integer.parseInt(txtidvehiculos.getText()));
				
				
			}
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\9104197_loading_refresh_reload_update_wait_icon.png"));
		btnActualizar.setBounds(556, 310, 89, 52);
		contentPane.add(btnActualizar);
		
		btndelete.addActionListener(e -> clearFields());
		
	}

	private Object clearFields() {
		txttipodocumento.setText("");
		txtdocumento.setText("");
		txtnombres.setText("");
		txtapellidos.setText("");
		txtdireccion.setText("");
		txtcorreo.setText("");
		txttelefono.setText("");
		txtidvehiculos.setText("");
		return null;
	}

}
