package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Tipostransportes {

	Conexion conector = new Conexion();

	public String nombres;
	public String observacion;

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

	public void create(String nombres, String observacion) {
		Connection dbconnetion = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tbltipostransportes (nombres,observacion) VALUES (?,?)";

		try {
			dbconnetion = conector.conectarBD();
			pst = dbconnetion.prepareStatement(script);
			pst.setString(1, nombres);
			pst.setString(2, observacion);
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

	public void read(int idtipo, JTextField nombres, JTextField observacion) {

		Connection dbconnetion = null;
		PreparedStatement pst = null;

		String script = " SELECT * FROM tbltipostransportes WHERE idtipo = ?";

		try {
			dbconnetion = conector.conectarBD();
			pst = dbconnetion.prepareStatement(script);
			pst.setInt(1, idtipo);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				nombres.setText(rs.getString(2));
				observacion.setText(rs.getString(3));

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void delete(int idtipo) {
		Connection dbConnection = null;// Preparar la trx
		PreparedStatement pst = null;
		String Script = "DELETE FROM tbltipostransportes WHERE  idtipo = ?";

		try {
			dbConnection = conector.conectarBD();// abrir la conexion

			pst = dbConnection.prepareStatement(Script);// abrir el buffer

			// parametrizar los campos
			pst.setInt(1, idtipo);

			// Comfirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No." + idtipo + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecute la transaccion
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No." + idtipo + "?");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public void Update(int idtipo, String nombres, String observacion) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String Script = "UPDATE tbltipostransportes set nombres = ?, observacion = ? Where idtipo = ? ";

		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(Script);

			pst.setString(1, nombres);
			pst.setString(2, observacion);
			pst.setInt(3, idtipo);

			int confirmacion = JOptionPane.showConfirmDialog(null,
					"¿Desea actualizar el registro perteneciente al id No" + idtipo + "?");

			if (confirmacion == JOptionPane.OK_OPTION) {

				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "ID" + idtipo + "Actualizado ");

			}

		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}

	}



}
