package project.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {


	public Connection Conexionbd(String db, String user, String pass, String proveedor) {
		String url = null;

		switch (proveedor.toLowerCase()) {
			case "postgresql":
				url = "jdbc:postgresql://localhost:5432/" + db;
				break;
			default:
				System.out.println("Ingresa un proveedor correcto.");
				return null;
		}

		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Conexion Establecida.");
			return conn;
		} catch (SQLException sqlE) {
			System.err.println("Error de conexion: " + sqlE.getMessage());
			Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, sqlE);
			return null;
		}
	}

	public static void main(String[] args) {
		conexion db_conexion = new conexion();
		db_conexion.Conexionbd("bd_pruebas", "postgres", "12345", "postgresql");
	}
}
