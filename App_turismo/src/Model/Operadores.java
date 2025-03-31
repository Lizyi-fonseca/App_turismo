package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Operadores {
	
	Conexion conector = new Conexion ();
    public int tipodocumento;
    public int documento;
    public String nombres;
    public String apellidos ;
    public String direccion ;
    public String correo ;
    public String telefono;
    public int idvehiculos ;
    
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
	public int getIdvehiculos() {
		return idvehiculos;
	}
	public void setIdvehiculos(int idvehiculos) {
		this.idvehiculos = idvehiculos;
	}
	
	public void create (int tipodocumento,int documento,String nombres,String apellidos,String direccion,String correo,String telefono,int idvehiculos) {
		
    Connection dbconnetion = null;
    PreparedStatement pst = null;
    
    String script = "INSERT INTO tbloperadores (tipodocumento,documento,nombres,apellidos,direccion,correo,telefono,idvehiculos) VALUES (?,?,?,?,?,?,?,?)";
    
    try {
    	dbconnetion = conector.conectarBD();
    	pst = dbconnetion.prepareStatement(script);
    	pst.setInt(1, tipodocumento);
    	pst.setInt(2, documento);
    	pst.setString(3, nombres);
    	pst.setString(4, apellidos);
    	pst.setString(5, direccion);
    	pst.setString(6, correo);
    	pst.setString(7, telefono);
    	pst.setInt(8, idvehiculos);
    	pst.executeUpdate();
    	JOptionPane.showConfirmDialog(null, "Registro con exito");
    	
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
    
	}
	
	
}
