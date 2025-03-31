package Model;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Test {

	public static void main (String [] args) {
		Conexion Test = new Conexion ();
		
		if(Test.conectarBD() != null) {
			JOptionPane.showConfirmDialog(null, "Conectando a la BD");
		}else {
			JOptionPane.showConfirmDialog(null, "No conectado a la BD ");
		}
	}
}
