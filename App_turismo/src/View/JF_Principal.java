package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;

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
		setBounds(100, 100, 511, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnagencias = new JButton("");
		btnagencias.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\7898491_company_business_finance_office_marketing_icon.png"));
		btnagencias.setBounds(30, 73, 89, 65);
		contentPane.add(btnagencias);
		
		JLabel blntitulo = new JLabel("Biemvenidos a la aplicación de turismo");
		blntitulo.setFont(new Font("Arial", Font.PLAIN, 14));
		blntitulo.setBounds(48, 11, 311, 25);
		contentPane.add(blntitulo);
		
		JButton blnclientes = new JButton("");
		blnclientes.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\61816_business_buyers_clients_users_icon.png"));
		blnclientes.setFont(new Font("Arial", Font.PLAIN, 14));
		blnclientes.setBounds(156, 73, 89, 65);
		contentPane.add(blnclientes);
		
		JButton btncompañia = new JButton("");
		btncompañia.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\44831_companies_competitors_departmens_offices_icon.png"));
		btncompañia.setBounds(270, 73, 89, 65);
		contentPane.add(btncompañia);
		
		JButton btnmedios = new JButton("");
		btnmedios.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\530853_eyes_iconfinder_look for_platform_search_icon.png"));
		btnmedios.setBounds(396, 73, 89, 65);
		contentPane.add(btnmedios);
		
		JButton operadores = new JButton("");
		operadores.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\4715004_actor_avatar_people_person_profile_icon.png"));
		operadores.setBounds(30, 167, 89, 65);
		contentPane.add(operadores);
		
		JButton btnpaquetes = new JButton("");
		btnpaquetes.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\11300_packages_icon.png"));
		btnpaquetes.setBounds(156, 169, 89, 57);
		contentPane.add(btnpaquetes);
		
		JButton btnpromotores = new JButton("");
		btnpromotores.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\4850490_clients_communication_discussion_media_social_icon.png"));
		btnpromotores.setBounds(270, 169, 89, 57);
		contentPane.add(btnpromotores);
		
		JButton btntiposmedios = new JButton("");
		btntiposmedios.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\7740302_summer_passport_travel_transportation_transport_icon.png"));
		btntiposmedios.setBounds(396, 170, 89, 57);
		contentPane.add(btntiposmedios);
		
		JButton btntransporte = new JButton("");
		btntransporte.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\1342944_car_citycons_road_transport_icon.png"));
		btntransporte.setBounds(30, 259, 89, 57);
		contentPane.add(btntransporte);
		
		JButton btnvehiculo = new JButton("");
		btnvehiculo.setIcon(new ImageIcon("C:\\Users\\lizyi\\Downloads\\7437295_bus_transport_transportation_public_icon.png"));
		btnvehiculo.setBounds(156, 259, 89, 57);
		contentPane.add(btnvehiculo);
	}
}
