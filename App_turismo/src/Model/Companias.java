package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Companias {
	
	Conexion conector = new Conexion ();
	
	public String razonsocial;
	public String direccion ;
    public String correo ;
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
	
	public void create (String razonsocial,String direccion, String correo,String telefono,String fecchacreaccion,String wed) {
		
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
	
}
	
