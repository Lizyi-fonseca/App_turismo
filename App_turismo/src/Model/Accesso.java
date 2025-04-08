package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;
import View.JF_Principal;

public class Accesso {

	//declaro objeto conector 
	Conexion conector = new Conexion();
	public int documento;
	public String contraseña;
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public void Acceso(int documento, String contraseña) {
		
		Connection dbConnection = null;// Abrirla la conexion
		PreparedStatement pst = null;// Abrir el buffer

		String Script = "SELECT * FROM tblpromotores WHERE documento = ? and contrasena = ?";

		try {
			dbConnection = conector.conectarBD();// Abrir la conexión
			pst = dbConnection.prepareStatement(Script);// Abrir el buffer

			pst.setInt(1, documento);
			pst.setString(2, contraseña);
			ResultSet rs = pst.executeQuery();// Almacenamiento temporal

			while (rs.next()) {
			

				JOptionPane.showConfirmDialog(null, "Acceso permitido ");

			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

	}
	
	
	
	
	
}
