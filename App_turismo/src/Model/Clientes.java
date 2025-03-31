package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Clientes {
	
	//En esta ínea se esta llamando el objeto de la clase conector
	Conexion conector = new Conexion ();
	
	public int idclientes ;
    public int tipodocumento ;
    public int documento ;
    public String nombres ;
    public String apellidos;
    public String eps ;
    public String alergias ;
    public  String fechanacimiento;
    public String correo;
    public  String estadocivil;
    public String telefono;
    public  String direccion;
    
    	
	public int getIdclientes() {
		return idclientes;
	}
	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}
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
	public String getEps() {
		return eps;
	}
	public void setEps(String eps) {
		this.eps = eps;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
    
    public String getTelefono() {
	    return telefono;
    }
    public void setTelefono(String telefono) {
	    this.telefono = telefono;
    }
    public String getDireccion() {
	     return direccion;
    }
    public void setDireccion(String direccion) {
	     this.direccion = direccion;
}
	public void create(int tipodocumento,int documento,String nombres,String apellidos,String eps,String alergias,String fechanacimiento,String correo,String estadocivil,String telefono,String direccion ) {
		Connection dbconnetion = null;
		PreparedStatement pst = null;
		
		String script = "INSERT INTO tblclientes (tipodocumento,  documento, nombres,  apellidos,  eps, alergias,fechanacimiento,correo,estadocivil,telefono,direccion) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
         try {
        	 dbconnetion = conector.conectarBD();
        	 pst = dbconnetion.prepareStatement(script);
        	 pst.setInt(1, tipodocumento);
        	 pst.setInt(2, documento);
        	 pst.setString(3, nombres);
        	 pst.setString(4, apellidos);
        	 pst.setString(5, eps);
        	 pst.setString(6, alergias);
        	 pst.setString(7, fechanacimiento);
        	 pst.setString(8, correo);
        	 pst.setString(9, estadocivil);
        	 pst.setString(10, telefono);
        	 pst.setString(11, direccion);
        	 
        	 pst.executeUpdate();
        	 JOptionPane.showConfirmDialog(null, "Registro con exito");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
	
}
