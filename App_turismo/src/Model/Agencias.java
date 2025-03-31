package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Agencias {
	//En esta ínea se esta llamando el objeto de la clase conector
	Conexion conector = new Conexion ();
	
	//En esta linea declaro las variables o instancias
	public String nombres;
	public String  telefono ;
	public String direccion ;
	public String correo;
	public String wed ;
	public int idcompanias;
	
   //En estas lieas estan los metodos getters y setters	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
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
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getWed() {
		return wed;
	}
	public void setWed(String wed) {
		this.wed = wed;
	}
	public int getIdcompanias() {
		return idcompanias;
	}
	public void setIdcompanias(int idcompanias) {
		this.idcompanias = idcompanias;
	}
	
  //En esta línea se declara el metodo create con los parametros
	public void create (String nombres, String telefono,String direccion, String correo, String wed, int idcompanias ) {
	
		//Establece la nonexion con la base de datos
		Connection dbconnetion = null;
		PreparedStatement pst = null;
	//Esta línea es una sentencia para ingresar nuevos registros a la base de datos	
		String script = "INSERT INTO tblagencias (nombres,  telefono, direccion,  correo,  wed, idcompanias) VALUES (?,?,?,?,?,?)";
		
	//En estas lineas establese los parametros para que se ejecute la sentencia
	try {
		dbconnetion = conector.conectarBD();
		pst = dbconnetion.prepareStatement(script);
		pst.setString(1, nombres);
		pst.setString(2, telefono);
		pst.setString(3, direccion);
		pst.setString(4, correo);
		pst.setString(5, wed);
		pst.setInt(6, idcompanias);
		
		pst.executeUpdate();
		
		JOptionPane.showConfirmDialog(null, "Registro con exito");

	} catch (SQLException e) {
		
		System.out.println(e.getMessage());
	}
	
	}
	
		public void delete (String nombres, String telefono,String direccion, String correo, String wed, int idcompanias ) {
		
			Connection dbconnetion = null;
			PreparedStatement pst = null;
		
			String script = "DELETE FROM tblagencias WHERE idagencias =?";
			
		
		try {
			dbconnetion = conector.conectarBD();
			pst = dbconnetion.prepareStatement(script);
			pst.setString(1, nombres);
			pst.setString(2, telefono);
			pst.setString(3, direccion);
			pst.setString(4, correo);
			pst.setString(5, wed);
			pst.setInt(6, idcompanias);
			
			pst.executeUpdate();
			
			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
	
	
	}
	
	
	
}
