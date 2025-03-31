package Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
	public Connection conectarBD() {
		//crea e inicializar un objeto de la clase connection
		Connection Connection = null;
		try {
			Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_turismo","root","123456");
			System.out.println("Connected with the database successfully");
		}catch(SQLException e ) {
			System.out.println("Error: "+e.getMessage());
		}
		return Connection;//retorna la conexion abierta con BD
	}
}
