package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.Conexion;

public class Vehiculos {

	Conexion conector = new Conexion();

	public String marca;
	public int puestos;
	public String modelo;
	public int numeromotor;
	public String categoria;
	public int idtipo;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeromotor() {
		return numeromotor;
	}

	public void setNumeromotor(int numeromotor) {
		this.numeromotor = numeromotor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getIdtipo() {
		return idtipo;
	}

	public void setIdtipo(int idtipo) {
		this.idtipo = idtipo;
	}

	public void create(String marca, int puestos, String modelo, int numeromotor, String categoria, int idtipo) {

		Connection dbconnetion = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tblvehiculos (marca,puestos,modelo,numeromotor,categoria,idtipo) VALUES (?,?,?,?,?,?)";
		try {
			dbconnetion = conector.conectarBD();
			pst = dbconnetion.prepareStatement(script);
			pst.setString(1, marca);
			pst.setInt(2, puestos);
			pst.setString(3, modelo);
			pst.setInt(4, numeromotor);
			pst.setString(5, categoria);
			pst.setInt(6, idtipo);

			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

	public void read(int idvehiculos, JTextField marca, JTextField puestos, JTextField modelo, JTextField numeromotor,
			JTextField categoria, JTextField idtipo) {

		Connection dbconnetion = null;
		PreparedStatement pst = null;

		String script = " SELECT * FROM tblvehiculos WHERE idvehiculos = ?";

		try {
			dbconnetion = conector.conectarBD();
			pst = dbconnetion.prepareStatement(script);
			pst.setInt(1, idvehiculos);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				marca.setText(rs.getString(2));
				puestos.setText(rs.getString(3));
				modelo.setText(rs.getString(4));
				numeromotor.setText(rs.getString(5));
				categoria.setText(rs.getString(6));
				idtipo.setText(rs.getString(7));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void delete(int idvehiculos) {
		Connection dbConnection = null;// Preparar la trx
		PreparedStatement pst = null;
		String Script = "DELETE FROM tbltipostransportes WHERE  idvehiculos = ?";

		try {
			dbConnection = conector.conectarBD();// abrir la conexion

			pst = dbConnection.prepareStatement(Script);// abrir el buffer

			// parametrizar los campos
			pst.setInt(1, idvehiculos);

			// Comfirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No." + idvehiculos + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// Ejecute la transaccion
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No." + idvehiculos + "?");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void Update(int idvehiculos, String marca, int puestos, String modelo, int numeromotor, String categoria,int idtipo) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String Script = "UPDATE tblvehiculos set marca = ?, puestos = ?, modelo = ? , numeromotor = ?, categoria = ?, idtipo = ? Where idvehiculos = ? ";

		try {

			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(Script);

			pst.setString(1, marca);
			pst.setInt(2, puestos);
			pst.setString(3, modelo);
			pst.setInt(4, numeromotor);
			pst.setString(5, categoria);
			pst.setInt(6, idtipo);
			pst.setInt(7, idvehiculos);

			int confirmacion = JOptionPane.showConfirmDialog(null,
					"¿Desea actualizar el registro perteneciente al id No" + idvehiculos + "?");

			if (confirmacion == JOptionPane.OK_OPTION) {

				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "ID" + idvehiculos + "Actualizado ");

			}

		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}

	}

}
