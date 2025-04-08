package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Paquetes {
	Conexion conector = new Conexion();
	public int iddestino;
	public int idorigen;
	public String fechaventa;
	public String horaventa;
	public String fechaejecucion;
	public String observacion;
	public int idclientes;
	public int idvehiculos;
	public int idpromototes;
	public int idagencias;
	public int idmedios;

	public int getIddestino() {
		return iddestino;
	}

	public void setIddestino(int iddestino) {
		this.iddestino = iddestino;
	}

	public int getIdorigen() {
		return idorigen;
	}

	public void setIdorigen(int idorigen) {
		this.idorigen = idorigen;
	}

	public String getFechaventa() {
		return fechaventa;
	}

	public void setFechaventa(String fechaventa) {
		this.fechaventa = fechaventa;
	}

	public String getHoraventa() {
		return horaventa;
	}

	public void setHoraventa(String horaventa) {
		this.horaventa = horaventa;
	}

	public String getFechaejecucion() {
		return fechaejecucion;
	}

	public void setFechaejecucion(String fechaejecucion) {
		this.fechaejecucion = fechaejecucion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public int getIdclientes() {
		return idclientes;
	}

	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}

	public int getIdvehiculos() {
		return idvehiculos;
	}

	public void setIdvehiculos(int idvehiculos) {
		this.idvehiculos = idvehiculos;
	}

	public int getIdpromototes() {
		return idpromototes;
	}

	public void setIdpromototes(int idpromototes) {
		this.idpromototes = idpromototes;
	}

	public int getIdagencias() {
		return idagencias;
	}

	public void setIdagencias(int idagencias) {
		this.idagencias = idagencias;
	}

	public int getIdmedios() {
		return idmedios;
	}

	public void setIdmedios(int idmedios) {
		this.idmedios = idmedios;
	}

	public void read(int idcodigo, JTextField iddestino, JTextField idorigen, JTextField fechaventa,
			JTextField horaventa, JTextField fechaejecucion, JTextField observacion, JTextField idclientes,
			JTextField idvehiculos, JTextField idpromototes, JTextField idagencias, JTextField idmedios ) {

		Connection dbconnetion = null;
		PreparedStatement pst = null;

		String script = " SELECT * FROM tblpaquetes WHERE idcodigo = ?";

		try {
			dbconnetion = conector.conectarBD();
			pst = dbconnetion.prepareStatement(script);
			pst.setInt(1, idcodigo);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				iddestino.setText(rs.getString(2));
				idorigen.setText(rs.getString(3));
				fechaventa.setText(rs.getString(4));
				horaventa.setText(rs.getString(5));
				fechaejecucion.setText(rs.getString(6));
				observacion.setText(rs.getString(7));
				idclientes.setText(rs.getString(8));
				idvehiculos.setText(rs.getString(9));
				idpromototes.setText(rs.getString(10));
				idagencias.setText(rs.getString(11));
				idmedios.setText(rs.getString(12));

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void delete(int idcodigo) {
		Connection dbConnection = null;// Preparar la trx
		PreparedStatement pst = null;
		String Script = "DELETE FROM tblpaquetes WHERE  idcodigo = ?";

		try {
			dbConnection = conector.conectarBD();// abrir la conexion

			pst = dbConnection.prepareStatement(Script);// abrir el buffer

			// parametrizar los campos
			pst.setInt(1, idcodigo);

			// Comfirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No." + idcodigo + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecute la transaccion
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No." + idcodigo + "?");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void Update(int idcodigo,int iddestino, int idorigen, String  fechaventa, String horaventa, String fechaejecucion, String observacion,
			int idclientes, int idvehiculos, int idpromototes, int idagencias, int idmedios) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String Script = "UPDATE tblpaquetes set iddestino = ?, idorigen = ?, fechaventa = ?, horaventa = ?, fechaejecucion = ?, observacion = ?, idclientes  = ?, idvehiculos = ?, idpromototes = ?, idagencias = ?,idmedios = ? Where idcodigo = ?";

		try {
			dbConnection = conector.conectarBD();

			pst = dbConnection.prepareStatement(Script);

			pst.setInt(1, iddestino);
			pst.setInt(2, idorigen);
			pst.setString(3, fechaventa);
			pst.setString(4, horaventa);
			pst.setString(5, fechaejecucion);
			pst.setString(6, observacion);
			pst.setInt(7, idclientes);
			pst.setInt(8, idvehiculos);
			pst.setInt(9, idpromototes);
			pst.setInt(10, idagencias);
			pst.setInt(11, idmedios);
			pst.setInt(12, idcodigo);
			
			int confirmacion = JOptionPane.showConfirmDialog(null,
					"¿Desea actualizar el registro perteneciente al id No" + idcodigo + "?");

			if (confirmacion == JOptionPane.OK_OPTION) {

				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "ID" + idcodigo + "Actualizado ");

			}

		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}

	}

}
