package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
		
		
	public void read (int idtiposmedios, JTextField nombres,JTextField observacion) {
		
	    Connection dbconnetion = null;
	    PreparedStatement pst = null;
	    
	    String script = " SELECT * FROM tbltiposmedios WHERE idtiposmedios = ?";
	    
	    try {
	    	dbconnetion = conector.conectarBD();
	    	pst = dbconnetion.prepareStatement(script);
	    	pst.setInt(1, idtiposmedios);
	    	
	    	
	    	ResultSet rs = pst.executeQuery();
	    	
	    	
	    	while(rs.next()) {
	    		nombres.setText(rs.getString(2));
	    		observacion.setText(rs.getString(3));
	    		
	    	}
	    	
	    	
	    	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	    
	}
		
		
		public void delete(int idtiposmedios) {
			Connection dbConnection = null;//Preparar la trx
			PreparedStatement pst = null;
			String Script = "DELETE FROM tbltiposmedios WHERE  idtiposmedios = ?";
			
			try {
				
	            dbConnection = conector.conectarBD();//abrir la conexion
				
				pst = dbConnection.prepareStatement(Script);//abrir el buffer
				
				//parametrizar los campos
				pst.setInt(1,idtiposmedios);
				
				//Comfirmar la operacion
				int resp = JOptionPane.showConfirmDialog(null,"¿Desea eliminar el registro No." + idtiposmedios + "?");
				
				if (resp == JOptionPane.OK_OPTION) {
				//Ejecute la transaccion 
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null,"¿Desea eliminar el registro No." + idtiposmedios + "?");
				
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
	}
		
		public void Update(int idtiposmedios,String nombres, String observacion) {
			
			Connection dbConnection = null;
			PreparedStatement pst = null;
			
			String Script = "UPDATE tbltiposmedios set nombres = ?, observacion = ? Where idtiposmedios = ? ";
			
			try {
	                dbConnection = conector.conectarBD();
				
				pst = dbConnection.prepareStatement(Script);
				
				
				
				pst.setString(1,nombres);
				pst.setString(2,observacion);
				pst.setInt(3,idtiposmedios);
				
				int confirmacion = JOptionPane.showConfirmDialog(null,"¿Desea actualizar el registro perteneciente al id No" + idtiposmedios + "?");
				
				if ( confirmacion == JOptionPane.OK_OPTION) {
				
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null,"ID" + idtiposmedios + "Actualizado ");
				
				}
				
			} catch (Exception errorconexion) {
				System.out.println(errorconexion.getMessage());
		}
			
		
		}

}
