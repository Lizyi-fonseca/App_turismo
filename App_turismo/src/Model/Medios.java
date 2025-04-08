package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Medios {

	public String nombres;
	public String observacion;
	public int idtiposmedios;

	Conexion conector = new Conexion();

	public int getIdtiposmedios() {
		return idtiposmedios;
	}

	public void setIdtiposmedios(int idtiposmedios) {
		this.idtiposmedios = idtiposmedios;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public int getPosmedios() {
		return idtiposmedios;
	}

	public void setPosmedios(int idtiposmedios) {
		this.idtiposmedios = idtiposmedios;
	}

	public void create(String nombres, String observacion, int idtiposmedios) {
		Connection dbconnetion = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tblmedios (nombres,  observacion, idtiposmedios) VALUES (?,?,?)";

		try {
			dbconnetion = conector.conectarBD();
			pst = dbconnetion.prepareStatement(script);
			pst.setString(1, nombres);
			pst.setString(2, observacion);
			pst.setInt(3, idtiposmedios);

			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

	}

	public void read(int idmedios, JTextField nombres, JTextField observacion, JTextField idtiposmedios) {

		Connection dbconnetion = null;
		PreparedStatement pst = null;

		String script = " SELECT * FROM tblmedios WHERE idmedios = ?";

		try {
			dbconnetion = conector.conectarBD();
			pst = dbconnetion.prepareStatement(script);
			pst.setInt(1, idmedios);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				nombres.setText(rs.getString(2));
				observacion.setText(rs.getString(3));
				idtiposmedios.setText(rs.getString(4));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void delete(int idmedios) {
		Connection dbConnection = null;// Preparar la trx
		PreparedStatement pst = null;
		String Script = "DELETE FROM tblmedios WHERE  idmedios = ?";

		try {
			dbConnection = conector.conectarBD();// abrir la conexion

			pst = dbConnection.prepareStatement(Script);// abrir el buffer

			// parametrizar los campos
			pst.setInt(1, idmedios);

			// Comfirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No." + idmedios + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecute la transaccion
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No." + idmedios + "?");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void Update(int idmedios, String nombres, String observacion, int idtiposmedios) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String Script = "UPDATE tblmedios set nombres = ?, observacion = ?, idtiposmedios = ? Where idmedios = ? ";

		try {
			dbConnection = conector.conectarBD();

			pst = dbConnection.prepareStatement(Script);

			pst.setString(1, nombres);
			pst.setString(2, observacion);
			pst.setInt(3, idtiposmedios);
			pst.setInt(4, idmedios);

			int confirmacion = JOptionPane.showConfirmDialog(null,
					"¿Desea actualizar el registro perteneciente al id No" + idmedios + "?");

			if (confirmacion == JOptionPane.OK_OPTION) {

				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "ID" + idmedios + "Actualizado ");

			}

		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}

	}

}
