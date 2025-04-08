package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Companias {

	Conexion conector = new Conexion();

	public String razonsocial;
	public String direccion;
	public String correo;
	public String telefono;
	public String fecchacreaccion;
	public String wed;

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFecchacreaccion() {
		return fecchacreaccion;
	}

	public void setFecchacreaccion(String fecchacreaccion) {
		this.fecchacreaccion = fecchacreaccion;
	}

	public String getWed() {
		return wed;
	}

	public void setWed(String wed) {
		this.wed = wed;
	}

	public void create(String razonsocial, String direccion, String correo, String telefono, String fecchacreaccion,
			String wed) {

		Connection dbconnetion = null;
		PreparedStatement pst = null;
		String script = "INSERT INTO tblcompanias (razonsocial, direccion, correo,  telefono,  fecchacreaccion,wed) VALUES (?,?,?,?,?,?)";

		try {
			dbconnetion = conector.conectarBD();
			pst = dbconnetion.prepareStatement(script);
			pst.setString(1, razonsocial);
			pst.setString(2, direccion);
			pst.setString(3, correo);
			pst.setString(4, telefono);
			pst.setString(5, fecchacreaccion);
			pst.setString(6, wed);
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

	public void read(int idcompanias, JTextField razonsocial, JTextField direccion, JTextField correo,
			JTextField telefono, JTextField fecchacreaccion, JTextField wed) {

		Connection dbconnetion = null;
		PreparedStatement pst = null;

		String script = " SELECT * FROM tblcompanias WHERE idcompanias = ?";

		try {
			dbconnetion = conector.conectarBD();
			pst = dbconnetion.prepareStatement(script);
			pst.setInt(1, idcompanias);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				razonsocial.setText(rs.getString(2));
				direccion.setText(rs.getString(3));
				correo.setText(rs.getString(4));
				telefono.setText(rs.getString(5));
				fecchacreaccion.setText(rs.getString(6));
				wed.setText(rs.getString(7));

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void delete(int idcompanias) {
		Connection dbConnection = null;// Preparar la trx
		PreparedStatement pst = null;
		String Script = "DELETE FROM tblcompanias WHERE  idcompanias = ?";

		try {
			dbConnection = conector.conectarBD();// abrir la conexion

			pst = dbConnection.prepareStatement(Script);// abrir el buffer

			// parametrizar los campos
			pst.setInt(1, idcompanias);

			// Comfirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No." + idcompanias + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecute la transaccion
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No." + idcompanias + "?");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void Update(int idcompanias, String razonsocial, String direccion, String correo, String telefono,
			String fecchacreaccion, String wed) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String Script = "UPDATE tblcompanias set razonsocial = ?, direccion = ?, correo = ? , telefono = ? , fecchacreaccion = ? , wed = ? Where idcompanias = ? ";

		try {
			dbConnection = conector.conectarBD();

			pst = dbConnection.prepareStatement(Script);

			pst.setString(1, razonsocial);
			pst.setString(2, direccion);
			pst.setString(3, correo);
			pst.setString(4, telefono);
			pst.setString(5, fecchacreaccion);
			pst.setString(6, wed);
			pst.setInt(7, idcompanias);
			
			int confirmacion = JOptionPane.showConfirmDialog(null,
					"¿Desea actualizar el registro perteneciente al id No" + idcompanias + "?");

			if (confirmacion == JOptionPane.OK_OPTION) {

				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "ID" + idcompanias + "Actualizado ");

			}

		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}

	}

}
