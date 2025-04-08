package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
	public void create(int tipodocumento,int documento,String nombres,String apellidos,String eps,String alergias,
			String fechanacimiento,String correo,String estadocivil,String telefono,String direccion ) {
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
	public void read (int idclientes, JTextField tipodocumento,JTextField documento,JTextField nombres,JTextField apellidos,JTextField eps,JTextField alergias,
			JTextField fechanacimiento,JTextField correo,JTextField estadocivil,JTextField telefono,JTextField direccion) {
		
	    Connection dbconnetion = null;
	    PreparedStatement pst = null;
	    
	    String script = " SELECT * FROM tblclientes WHERE idclientes = ?";
	    
	    try {
	    	dbconnetion = conector.conectarBD();
	    	pst = dbconnetion.prepareStatement(script);
	    	pst.setInt(1, idclientes);
	    	
	    	
	    	ResultSet rs = pst.executeQuery();
	    	
	    	
	    	while(rs.next()) {
	    		tipodocumento.setText(rs.getString(2));
	    		documento.setText(rs.getString(3));
	    		nombres.setText(rs.getString(4));
	    		apellidos.setText(rs.getString(5));
	    		eps.setText(rs.getString(6));
	    		alergias.setText(rs.getString(7));
	    		fechanacimiento.setText(rs.getString(8));
	    		correo.setText(rs.getString(9));
	    		estadocivil.setText(rs.getString(10));
	    		telefono.setText(rs.getString(11));
	    		direccion.setText(rs.getString(12));
	    	}
	    	
	    	
	    	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	    
	}
	
	public void delete(int idclientes) {
		Connection dbConnection = null;//Preparar la trx
		PreparedStatement pst = null;
		String Script = "DELETE FROM tblclientes WHERE  idclientes = ?";
		
		try {
                dbConnection = conector.conectarBD();//abrir la conexion
			
			pst = dbConnection.prepareStatement(Script);//abrir el buffer
			
			//parametrizar los campos
			pst.setInt(1,idclientes);
			
			//Comfirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null,"¿Desea eliminar el registro No." + idclientes + "?");
			
			if (resp == JOptionPane.OK_OPTION) {
			//Ejecute la transaccion 
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null,"¿Desea eliminar el registro No." + idclientes + "?");
			
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
	}
		
	
	}
	
	
	public void Update(int idclientes,int tipodocumento , int documento, String nombres,String  apellidos,
			String eps, String alergias, String fechanacimiento, String correo, String estadocivil, String telefono, String direccion) {
		
		Connection dbConnection = null;
		PreparedStatement pst = null;
		
		String Script = "UPDATE tblclientes set tipodocumento = ?, documento = ?, nombres = ?, apellidos = ?, eps = ?, alergias  = ?, fechanacimiento = ?, correo = ?, estadocivil = ?,telefono = ?, direccion = ? Where idclientes = ?";
		
		try {
                dbConnection = conector.conectarBD();
			
			pst = dbConnection.prepareStatement(Script);
			
			//Prametrizar los campos
			pst.setInt(1,tipodocumento);
			pst.setInt(2,documento);
			pst.setString(3,nombres);
			pst.setString(4,apellidos);
			pst.setString(5,eps);
			pst.setString(6,alergias);
			pst.setString(7,fechanacimiento);
			pst.setString(8,correo);
			pst.setString(9,estadocivil);
			pst.setString(10,telefono);
			pst.setString(11,direccion);
			pst.setInt(12,idclientes);
			
			int confirmacion = JOptionPane.showConfirmDialog(null,"¿Desea actualizar el registro perteneciente al id No" + idclientes + "?");
			
			if ( confirmacion == JOptionPane.OK_OPTION) {
			
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null,"ID" + idclientes + "Actualizado ");
			
			}
			
		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
	}
		
	
	}
	
	
	
}
