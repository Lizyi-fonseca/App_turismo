package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Agencias {
	// En esta línea llamando el objeto de la clase conexion
	Conexion conector = new Conexion();

	// Declaracion de variables
	public String nombres;
	public String telefono;
	public String direccion;
	public String correo;
	public String wed;
	public int idcompanias;

	// Metodos gett.. y set...
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getWed() {
		return wed;
	}

	public void setWed(String wed) {
		this.wed = wed;
	}

	public int getIdcompanias() {
		return idcompanias;
	}

	public void setIdcompanias(int idcompanias) {
		this.idcompanias = idcompanias;
	}
	

	// Declaracion de metodo para permitir la insercion de nuevos registros
	public void create(String nombres, String telefono, String direccion, String correo, String wed, int idcompanias) {

		//preprara la conexion con la base de datos
		Connection dbconnetion = null;
		PreparedStatement pst = null;

		// Esta línea se insertan nuevos registros con los siguentes valores
		String script = "INSERT INTO tblagencias (nombres,  telefono, direccion,  correo,  wed, idcompanias) VALUES (?,?,?,?,?,?)";

		
		try {
			//Establese la conexion con la base de datos
			dbconnetion = conector.conectarBD();
			//prepara la consulta
			pst = dbconnetion.prepareStatement(script);
			//se le asiganan valores a los parametros
			pst.setString(1, nombres);
			pst.setString(2, telefono);
			pst.setString(3, direccion);
			pst.setString(4, correo);
			pst.setString(5, wed);
			pst.setInt(6, idcompanias);
            //Permite ejecutar la consulta de actualizacion
			pst.executeUpdate();

			
			JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			
	         
			System.out.println(e.getMessage());
		}

	}

	// El metodo read define como se realizara la colsulta
	public void read(int idagencias, JTextField nombres, JTextField telefono, JTextField direccion, JTextField correo,
			JTextField wed) {

		Connection dbconnetion = null;
		PreparedStatement pst = null;
		
      //Define la colsulta que recuperara los datos de la tabla por medio de la condicion
		String script = " SELECT * FROM tblagencias WHERE idagencias = ?";

		try {
			//Establece la conex... a la base de datos
			dbconnetion = conector.conectarBD();
			//Prepara los parametros con la colsulta
			pst = dbconnetion.prepareStatement(script);
			//Establese el valor del parametro
			pst.setInt(1, idagencias);
            //Ejecuta la consulta
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				//Asigana los avlorex reperados a los campos
				nombres.setText(rs.getString(2));
				telefono.setText(rs.getString(3));
				direccion.setText(rs.getString(4));
				correo.setText(rs.getString(5));
				wed.setText(rs.getString(6));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void delete(int idagencias) {

		Connection dbConnection = null;
		PreparedStatement pst = null;
        //eliminará el registro de la tabla 'tblagencias' donde el 'idagencias' coincida
		String Script = "DELETE FROM tblagencias WHERE  idagencias = ?";

		try {
			dbConnection = conector.conectarBD();// abrir la conexion

			pst = dbConnection.prepareStatement(Script);// abrir el buffer

			// parametrizar los campos
			pst.setInt(1, idagencias);

			// Comfirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No." + idagencias + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecute la transaccion
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No." + idagencias + "?");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	// actualizar

	public void Update(int idagencias, String nombres, String telefono, String direccion, String correo, String wed,
			int idcompanias) {

		Connection dbConnection = null;
		PreparedStatement pst = null;
		// Actualiza los campos
		String Script = "UPDATE tblagencias set nombres = ? , telefono = ?, direccion = ? , correo = ? , wed = ?, idcompanias = ? Where idagencias = ? ";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(Script);
			 // Parametrizamos la consulta con los valores proporcionados
			pst.setString(1, nombres);
			pst.setString(2, telefono);
			pst.setString(3, direccion);
			pst.setString(4, correo);
			pst.setString(5, wed);
			pst.setInt(6, idcompanias);
			pst.setInt(7, idagencias);

			int confirmacion = JOptionPane.showConfirmDialog(null,
					"¿Desea actualizar el registro perteneciente al id No" + idagencias + "?");

			if (confirmacion == JOptionPane.OK_OPTION) {

				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "ID" + idagencias + "Actualizado ");

			}

		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}

	}

}
