/**package project.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import project.model.Constructors;
import project.model.conexion;

public class ConstructorsRepository {

	public List<Constructors> getConstructors() {

		List<Constructors> constructors = new ArrayList<>();
		String query = "select * from constructors";

		try {

			conexion c = new conexion();
			Connection cnx = c.conexion_db();

			Statement statement = cnx.createStatement();

			ResultSet rs = statement.executeQuery(query);

			// procesar los datos
			while (rs.next()) {
				int constructorid = rs.getInt("constructorid");
				String constructorRef = rs.getString("constructorRef");
				String name = rs.getString("name");
				String nationality = rs.getString("nationality");
				String url = rs.getString("url");

				Constructors constructor = new Constructors(constructorid, constructorRef, name, nationality,
						url);
				constructors.add(constructor);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return constructors;
	}

	public static void main(String[] args) {
		ConstructorsRepository c = new ConstructorsRepository();
		List<Constructors> ls_c = c.getConstructors();
		for (Constructors constructor : ls_c) {
			System.out.println("id: " + constructor.getConstructorId() + " Nombre: " + constructor.getConstructorName()
					+ " Url: " + constructor.getConstructorUrl());
		}
	}

}
**/