package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Tiposmedios {
	
	Conexion conector = new Conexion ();
	public String nombres ;
	public String observacion ;
	
	
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
	
	public void Create(String nombres, String observacion) {
		Connection dbConnection = null;//Preparar la trx
		PreparedStatement pst = null;
		String Script = "insert into tbltiposmedios (nombres, observacion) value (?,?)";
		
		try {
                dbConnection = conector.conectarBD();//abrir la conexion
			
			pst = dbConnection.prepareStatement(Script);//abrir el buffer
			//parametrizar los campos
			pst.setString(1,nombres);
			pst.setString(2,observacion);
			//ejecutar la trx
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null,"Registro con exito");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
