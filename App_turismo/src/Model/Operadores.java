package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

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
	
	public void read (int idoperadores, JTextField tipodocumento,JTextField documento,JTextField nombres,JTextField apellidos,JTextField direccion,
			JTextField correo,JTextField telefono,JTextField idvehiculos) {
		
	    Connection dbconnetion = null;
	    PreparedStatement pst = null;
	    
	    String script = " SELECT * FROM tbloperadores WHERE idoperadores = ?";
	    
	    try {
	    	dbconnetion = conector.conectarBD();
	    	pst = dbconnetion.prepareStatement(script);
	    	pst.setInt(1, idoperadores);
	    	
	    	
	    	ResultSet rs = pst.executeQuery();
	    	
	    	
	    	while(rs.next()) {
	    		tipodocumento.setText(rs.getString(2));
	    		documento.setText(rs.getString(3));
	    		nombres.setText(rs.getString(4));
	    		apellidos.setText(rs.getString(5));
	    		direccion.setText(rs.getString(6));
	    		correo.setText(rs.getString(7));
	    		telefono.setText(rs.getString(8));
	    		idvehiculos.setText(rs.getString(9));
	    		
	    	}
	    	
	    	
	    	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	    
	}
	
	public void delete(int idoperadores) {
		Connection dbConnection = null;//Preparar la trx
		PreparedStatement pst = null;
		String Script = "DELETE FROM tbloperadores WHERE  idoperadores = ?";
		
		try {
                dbConnection = conector.conectarBD();//abrir la conexion
			
			pst = dbConnection.prepareStatement(Script);//abrir el buffer
			
			//parametrizar los campos
			pst.setInt(1,idoperadores);
			
			//Comfirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null,"¿Desea eliminar el registro No." + idoperadores + "?");
			
			if (resp == JOptionPane.OK_OPTION) {
			//Ejecute la transaccion 
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null,"¿Desea eliminar el registro No." + idoperadores + "?");
			
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
	}
    
	}
	
	public void Update(int idoperadores, int tipodocumento, int documento, String nombres ,String apellidos , String direccion , String correo ,String telefono , int idvehiculos) {

		Connection dbConnection = null;
		PreparedStatement pst = null;

		String Script = "UPDATE tbloperadores set tipodocumento = ?, documento = ?, nombres = ? , apellidos = ? , direccion = ? , correo = ? , telefono = ?, idvehiculos = ?  Where idoperadores = ? ";

		try {
			dbConnection = conector.conectarBD();

			pst = dbConnection.prepareStatement(Script);

			pst.setInt(1, tipodocumento);
			pst.setInt(2, documento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, direccion);
			pst.setString(6, correo);
			pst.setString(7, telefono);
			pst.setInt(8, idvehiculos);
			pst.setInt(9, idoperadores);
			

			int confirmacion = JOptionPane.showConfirmDialog(null,
					"¿Desea actualizar el registro perteneciente al id No" + idoperadores + "?");

			if (confirmacion == JOptionPane.OK_OPTION) {

				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "ID" + idoperadores + "Actualizado ");

			}

		} catch (Exception errorconexion) {
			System.out.println(errorconexion.getMessage());
		}

	}

	
	
	
}
