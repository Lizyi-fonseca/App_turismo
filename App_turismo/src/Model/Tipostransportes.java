package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Tipostransportes {
	
	Conexion conector = new Conexion ();
	
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
	
	public void create (String nombres, String observacion) {
		Connection dbconnetion = null;
		PreparedStatement pst = null;
		
		String script = "INSERT INTO tbltipostransportes (nombres,observacion) VALUES (?,?)";
		
		try {
			dbconnetion = conector.conectarBD();
			pst = dbconnetion.prepareStatement(script);
			pst.setString(1,nombres);
			pst.setString(2,observacion);
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null,"Registro con exito");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}


}
