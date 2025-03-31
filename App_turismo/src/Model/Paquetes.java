package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Paquetes {
	Conexion conector = new Conexion ();
	public int iddestino;
	public int idorigen ;
	public String fechaventa;
	public String horaventa ;
	public String fechaejecucion;
	public String observacion;
	public int idclientes;
	public int idvehiculos;
	public int idpromototes;
	public int idagencias;
	public int idmedios;
	
	public int getIddestino() {
		return iddestino;
	}
	public void setIddestino(int iddestino) {
		this.iddestino = iddestino;
	}
	public int getIdorigen() {
		return idorigen;
	}
	public void setIdorigen(int idorigen) {
		this.idorigen = idorigen;
	}
	public String getFechaventa() {
		return fechaventa;
	}
	public void setFechaventa(String fechaventa) {
		this.fechaventa = fechaventa;
	}
	public String getHoraventa() {
		return horaventa;
	}
	public void setHoraventa(String horaventa) {
		this.horaventa = horaventa;
	}
	public String getFechaejecucion() {
		return fechaejecucion;
	}
	public void setFechaejecucion(String fechaejecucion) {
		this.fechaejecucion = fechaejecucion;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public int getIdclientes() {
		return idclientes;
	}
	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}
	public int getIdvehiculos() {
		return idvehiculos;
	}
	public void setIdvehiculos(int idvehiculos) {
		this.idvehiculos = idvehiculos;
	}
	public int getIdpromototes() {
		return idpromototes;
	}
	public void setIdpromototes(int idpromototes) {
		this.idpromototes = idpromototes;
	}
	public int getIdagencias() {
		return idagencias;
	}
	public void setIdagencias(int idagencias) {
		this.idagencias = idagencias;
	}
	public int getIdmedios() {
		return idmedios;
	}
	public void setIdmedios(int idmedios) {
		this.idmedios = idmedios;
	}
	
	public void create (int iddestino,int idorigen,String fechaventa,String horaventa,String fechaejecucion,String observacion,int idclientes,int idvehiculos,int idpromototes,int idagencias,int idmedios) {
		Connection dbconnetion = null;
		PreparedStatement pst = null;
		
		 String script = "INSERT INTO tblpaquetes (iddestino,idorigen,fechaventa,horaventa,fechaejecucion,observacion,idclientes,idvehiculos,idpromototes,idagencias,idmedios) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		 
		 try {
			 dbconnetion = conector.conectarBD();
			 pst = dbconnetion.prepareStatement(script);
			 pst.setInt(1, iddestino);
			 pst.setInt(2, idorigen);
			 pst.setString(3, fechaventa);
			 pst.setString(4, horaventa);
			 pst.setString(5, fechaejecucion);
			 pst.setString(6,observacion);
			 pst.setInt(7, idclientes);
			 pst.setInt(8, idvehiculos);
			 pst.setInt(9, idpromototes);
			 pst.setInt(10, idagencias);
			 pst.setInt(11, idmedios);
			 pst.executeUpdate();
			 JOptionPane.showConfirmDialog(null, "Registro con exito");
			 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
