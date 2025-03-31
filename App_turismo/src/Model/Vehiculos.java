package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Vehiculos {
	
	Conexion conector = new Conexion ();
	
	public String marca ;
	public int puestos;
	public String modelo;
	public int numeromotor;
	public String categoria;
	public int idtipo;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

    public int getPuestos() {
	    return puestos;
    }
    public void setPuestos(int puestos) {
	     this.puestos = puestos;
}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

    public int getNumeromotor() {
	    return numeromotor;
    }
    public void setNumeromotor(int numeromotor) {
	    this.numeromotor = numeromotor;
}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getIdtipo() {
		return idtipo;
	}
	public void setIdtipo(int idtipo) {
		this.idtipo = idtipo;
	}

	public void create (String marca,int puestos,String modelo,int numeromotor,
	String categoria,int idtipo) {
		
		Connection dbconnetion = null;
		PreparedStatement pst = null;
		
		String script = "INSERT INTO tblvehiculos (marca,puestos,modelo,numeromotor,categoria,idtipo) VALUES (?,?,?,?,?,?)";
		try {
			dbconnetion = conector.conectarBD();
			pst = dbconnetion.prepareStatement(script);
			pst.setString(1,marca);
			pst.setInt(2,puestos);
			pst.setString(3,modelo);
			pst.setInt(4, numeromotor);
			pst.setString(5, categoria);
			pst.setInt(6,idtipo);
			
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null,"Registro con exito");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
	
	}
	
	
}
