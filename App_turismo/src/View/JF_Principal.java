package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JF_Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_Principal frame = new JF_Principal();
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
	public JF_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 441);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnagencias = new JButton("");
		btnagencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnagencias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Jfagencias agencia = new Jfagencias ();
				agencia.setVisible(true);
				
			}
		});
		btnagencias.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\7898491_company_business_finance_office_marketing_icon.png"));
		btnagencias.setBounds(30, 73, 89, 65);
		contentPane.add(btnagencias);
		
		JLabel blntitulo = new JLabel("Biemvenidos a la aplicación de turismo");
		blntitulo.setFont(new Font("Arial Black", Font.PLAIN, 14));
		blntitulo.setBounds(48, 11, 311, 25);
		contentPane.add(blntitulo);
		
		JButton blnclientes = new JButton("");
		blnclientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Jfclientes cliente = new Jfclientes ();
				cliente.setVisible(true);
				
			}
		});
		blnclientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		blnclientes.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\61816_business_buyers_clients_users_icon.png"));
		blnclientes.setFont(new Font("Arial", Font.PLAIN, 14));
		blnclientes.setBounds(156, 73, 89, 65);
		contentPane.add(blnclientes);
		
		JButton btncompañia = new JButton("");
		btncompañia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btncompañia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Jfcompanias compania = new Jfcompanias ();
				compania.setVisible(true);
				
			}
		});
		btncompañia.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\44831_companies_competitors_departmens_offices_icon.png"));
		btncompañia.setBounds(270, 73, 89, 65);
		contentPane.add(btncompañia);
		
		JButton btnmedios = new JButton("");
		btnmedios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnmedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Jfmedios medios = new Jfmedios ();
				medios.setVisible(true);
				
			}
		});
		btnmedios.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\530853_eyes_iconfinder_look for_platform_search_icon.png"));
		btnmedios.setBounds(396, 73, 89, 65);
		contentPane.add(btnmedios);
		
		JButton operadores = new JButton("");
		operadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		operadores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Jfoperadores operadores = new Jfoperadores ();
				operadores.setVisible(true);
			}
		});
		operadores.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\4715004_actor_avatar_people_person_profile_icon.png"));
		operadores.setBounds(30, 186, 89, 65);
		contentPane.add(operadores);
		
		JButton btnpaquetes = new JButton("");
		btnpaquetes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnpaquetes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Jfpaquetes paquetes = new Jfpaquetes ();
				paquetes.setVisible(true);
				
			}
		});
		btnpaquetes.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\11300_packages_icon.png"));
		btnpaquetes.setBounds(156, 186, 89, 65);
		contentPane.add(btnpaquetes);
		
		JButton btnpromotores = new JButton("");
		btnpromotores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnpromotores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Jfpromotores promotores = new Jfpromotores ();
				promotores.setVisible(true);
			}
		});
		btnpromotores.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\4850490_clients_communication_discussion_media_social_icon.png"));
		btnpromotores.setBounds(270, 186, 89, 65);
		contentPane.add(btnpromotores);
		
		JButton btntiposmedios = new JButton("");
		btntiposmedios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btntiposmedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Jftiposmedios tiposmedios = new Jftiposmedios ();
				tiposmedios.setVisible(true);
				
			}
		});
		btntiposmedios.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\7740302_summer_passport_travel_transportation_transport_icon.png"));
		btntiposmedios.setBounds(396, 186, 89, 65);
		contentPane.add(btntiposmedios);
		
		JButton btntransporte = new JButton("");
		btntransporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btntransporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Jftipostransportes transportes = new Jftipostransportes ();
				transportes.setVisible(true);
				
			}
		});
		btntransporte.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\1342944_car_citycons_road_transport_icon.png"));
		btntransporte.setBounds(30, 312, 89, 57);
		contentPane.add(btntransporte);
		
		JButton btnvehiculo = new JButton("");
		btnvehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnvehiculo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Jfvehiculos vehiculos = new Jfvehiculos ();
				vehiculos.setVisible(true);
				
			}
		});
		btnvehiculo.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\7437295_bus_transport_transportation_public_icon.png"));
		btnvehiculo.setBounds(156, 312, 89, 57);
		contentPane.add(btnvehiculo);
		
		JLabel lblagencias = new JLabel("Agencias");
		lblagencias.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblagencias.setBounds(30, 47, 89, 14);
		contentPane.add(lblagencias);
		
		JLabel lblclientes = new JLabel("Clientes");
		lblclientes.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblclientes.setBounds(156, 48, 89, 14);
		contentPane.add(lblclientes);
		
		JLabel lblcompañia = new JLabel("Compañia");
		lblcompañia.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblcompañia.setBounds(270, 49, 89, 14);
		contentPane.add(lblcompañia);
		
		JLabel lblmedios = new JLabel("Medios");
		lblmedios.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblmedios.setBounds(396, 48, 89, 14);
		contentPane.add(lblmedios);
		
		JLabel blbmedios = new JLabel("Operadores");
		blbmedios.setFont(new Font("Arial Black", Font.PLAIN, 13));
		blbmedios.setBounds(30, 166, 89, 14);
		contentPane.add(blbmedios);
		
		JLabel lblpaquetes = new JLabel("Paquetes");
		lblpaquetes.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblpaquetes.setBounds(156, 161, 77, 14);
		contentPane.add(lblpaquetes);
		
		JLabel lblpromotores = new JLabel("Promotores");
		lblpromotores.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblpromotores.setBounds(270, 166, 92, 14);
		contentPane.add(lblpromotores);
		
		JLabel lbltiposmedios = new JLabel("Tipos Medios");
		lbltiposmedios.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lbltiposmedios.setBounds(396, 161, 89, 14);
		contentPane.add(lbltiposmedios);
		
		JLabel lbltransportes = new JLabel("Transportes");
		lbltransportes.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lbltransportes.setBounds(30, 282, 89, 14);
		contentPane.add(lbltransportes);
		
		JLabel lblvehiculo = new JLabel("Vehiculo");
		lblvehiculo.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblvehiculo.setBounds(156, 284, 89, 14);
		contentPane.add(lblvehiculo);
	}
}
