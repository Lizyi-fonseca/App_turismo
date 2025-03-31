package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Promotores {
	
	Conexion conector = new Conexion ();
	
	public int tipodocumento;
	public int documento;
	public String nombres;
	public String apellidos;
	public String direccion;
	public String correopersonal;
	public String correocoporativo;
	public String fechanacimiento;
	public String telefono;
	
	public int getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(int tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreopersonal() {
		return correopersonal;
	}
	public void setCorreopersonal(String correopersonal) {
		this.correopersonal = correopersonal;
	}
	public String getCorreocoporativo() {
		return correocoporativo;
	}
	public void setCorreocoporativo(String correocoporativo) {
		this.correocoporativo = correocoporativo;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void create (int tipodocumento,int documento,String nombres,
	String apellidos,String direccion,String correopersonal,
	String correocoporativo,String fechanacimiento,String telefono) {
	Connection dbconnetion = null;
	PreparedStatement pst = null;
	
	String script = "INSERT INTO tblpromotores (tipodocumento,documento,nombres,apellidos,direccion,correopersonal,correocoporativo,fechanacimiento,telefono) VALUES (?,?,?,?,?,?,?,?,?)";
		
	try {
		dbconnetion = conector.conectarBD();
		pst = dbconnetion.prepareStatement(script);
		pst.setInt(1, tipodocumento);
		pst.setInt(2, documento);
		pst.setString(3,nombres);
		pst.setString(4,apellidos);
		pst.setString(5,direccion);
		pst.setString(6,correopersonal);
		pst.setString(7,correocoporativo);
		pst.setString(8,fechanacimiento);
		pst.setString(9,telefono);
		pst.executeUpdate();
		JOptionPane.showConfirmDialog(null, "Registro con exito");
				
	} catch (Exception e) {
		
		System.out.println(e.getMessage());	
		
	}
	
	}
	

}
