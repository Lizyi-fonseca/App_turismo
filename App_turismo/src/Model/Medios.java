package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Medios {
	
	public String nombres ;
	public String observacion ;
	public int idtiposmedios ;
	
	Conexion conector = new Conexion ();
	
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
	
	public void create (String nombres,String observacion,int idtiposmedios) {
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

}
