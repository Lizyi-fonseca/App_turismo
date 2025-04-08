package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;
import View.JF_Principal;

public class Promotores {

	Conexion conector = new Conexion();
	
	public int tipodocumento;
	public int documento;
	public int contraseña;
	public String nombres;
	public String apellidos;
	public String direccion;
	public String correopersonal;
	public String correocoporativo;
	public String fechanacimiento;
	public String telefono;

	
	JF_Principal principal = new JF_Principal();
	

	public int getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(int tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreopersonal() {
		return correopersonal;
	}

	public void setCorreopersonal(String correopersonal) {
		this.correopersonal = correopersonal;
	}

	public String getCorreocoporativo() {
		return correocoporativo;
	}

	public void setCorreocoporativo(String correocoporativo) {
		this.correocoporativo = correocoporativo;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getContraseña() {
		return contraseña;
	}

	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}

	public void create(int tipodocumento, int documento, int contraseña, String nombres, String apellidos,
			String direccion, String correopersonal, String correocoporativo, String fechanacimiento, String telefono) {

		Connection dbconnetion = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tblpromotores (tipodocumento,documento,nombres,apellidos,direccion,correopersonal,correocoporativo,fechanacimiento,telefono) VALUES (?,?,?,?,?,?,?,?,?)";

		try {
			dbconnetion = conector.conectarBD();
			pst = dbconnetion.prepareStatement(script);
			pst.setInt(1, tipodocumento);
			pst.setInt(2, documento);
			pst.setInt(3, contraseña);
			pst.setString(4, nombres);
			pst.setString(5, apellidos);
			pst.setString(6, direccion);
			pst.setString(7, correopersonal);
			pst.setString(8, correocoporativo);
			pst.setString(9, fechanacimiento);
			pst.setString(10, telefono);

			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

	public void read(int idpromototes, JTextField contraseña, JTextField tipodocumento, JTextField documento,
			JTextField nombres, JTextField apellidos, JTextField direccion, JTextField correopersonal,
			JTextField correocoporativo, JTextField fechanacimiento, JTextField telefono) {

		Connection dbconnetion = null;
		PreparedStatement pst = null;

		String script = " SELECT * FROM tblpromotores WHERE idpromototes = ?";

		try {
			dbconnetion = conector.conectarBD();
			pst = dbconnetion.prepareStatement(script);
			pst.setInt(1, idpromototes);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				contraseña.setText(rs.getString(2));
				tipodocumento.setText(rs.getString(3));
				documento.setText(rs.getString(4));
				nombres.setText(rs.getString(5));
				apellidos.setText(rs.getString(6));
				direccion.setText(rs.getString(7));
				correopersonal.setText(rs.getString(8));
				correocoporativo.setText(rs.getString(9));
				fechanacimiento.setText(rs.getString(10));
				telefono.setText(rs.getString(11));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void delete(int idpromototes) {
		Connection dbConnection = null;// Preparar la trx
		PreparedStatement pst = null;

		String Script = "DELETE FROM tblpromotores WHERE  idpromototes = ?";

		try {
			dbConnection = conector.conectarBD();// abrir la conexion

			pst = dbConnection.prepareStatement(Script);// abrir el buffer

			// parametrizar los campos
			pst.setInt(1, idpromototes);

			// Comfirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No." + idpromototes + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecute la transaccion
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No." + idpromototes + "?");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void Update(int idpromototes, int contraseña, int tipodocumento, int documento, String nombres,
			String apellidos, String direccion, String correopersonal, String correocoporativo, String fechanacimiento,
			int telefono) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String Script = "UPDATE tblpromotores set contraseña = ?, tipodocumento = ?, documento = ?, nombres = ?, apellidos = ?, direccion = ?,correopersonal = ?,correocoporativo = ?,fechanacimiento = ?, telefono = ? Where idpromototes = ? ";

		try {
			dbConnection = conector.conectarBD();

			pst = dbConnection.prepareStatement(Script);
			pst.setInt(1, contraseña);
			pst.setInt(2, tipodocumento);
			pst.setInt(3, documento);
			pst.setString(4, nombres);
			pst.setString(5, apellidos);
			pst.setString(6, direccion);
			pst.setString(7, correopersonal);
			pst.setString(8, correocoporativo);
			pst.setString(9, fechanacimiento);
			pst.setInt(10, telefono);
			pst.setInt(11, idpromototes);

			int confirmacion = JOptionPane.showConfirmDialog(null,
					"¿Desea actualizar el registro perteneciente al id No" + idpromototes + "?");

			if (confirmacion == JOptionPane.OK_OPTION) {

				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "ID" + idpromototes + "Actualizado ");

			}

		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}

	}

	public void Acceso(int documento, String contra) {

		Connection dbConnection = null;// Abrirla la conexion
		PreparedStatement pst = null;// Abrir el buffer

		String Script = "SELECT * FROM tblpromotores WHERE documento = ? and contrasena = ?";

		try {
			dbConnection = conector.conectarBD();// Abrir la conexión
			pst = dbConnection.prepareStatement(Script);// Abrir el buffer

			pst.setInt(1, documento);
			pst.setString(2, contra);
			ResultSet rs = pst.executeQuery();// Almacenamiento temporal
			
			
			while (rs.next()) {
				System.out.println("Salida");	
				principal.show();
				
				//JOptionPane.showConfirmDialog(null, "Acceso permitido ");

			}

		} catch (SQLException e) {
			
			//System.out.println(e.getMessage());
		}

	}

}
