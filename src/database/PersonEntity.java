package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PersonEntity {
	private String firstName;
	private String lastName;

	public void insertDatabase() {
		Scanner in = new Scanner(System.in);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String hostname = "localhost";
			String dbname = "test";
			String username = "root";
			String pass = "";

			Connection conn = DriverManager.getConnection("jdbc:mysql://" + hostname + "/" + dbname, username, pass);
			System.out.print("Database is connected !\n\n");

//			QUERY SYNTAX
			String insertQuery = "insert into person (firstName, lastName) values (?,?)";
			String selectQuery = "select * from person";

//			PRESTATEMENT
			PreparedStatement prestateIns = conn.prepareStatement(insertQuery);
			System.out.println("nama depan: ");
			this.firstName = in.next();
			System.out.println("nama belakang: ");
			this.lastName = in.next();
			prestateIns.setString(1, this.firstName);
			prestateIns.setString(2, this.lastName);

			PreparedStatement prestateSelect = conn.prepareStatement(selectQuery);

//			PROCESS
			int resultInsert = prestateIns.executeUpdate();
			if (resultInsert > 0) {
				System.out.println("Person has been added!\n");
			}

			ResultSet result = prestateSelect.executeQuery();
			while (result.next()) {
				System.out.println("firstName" + "\t" + "lastName");
				System.out.println(result.getString("firstName") + "\t" + result.getString("lastName"));
			}

			conn.close();
			prestateIns.close();
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
	}
	
	public static void main(String[] args) {
		PersonEntity personEntity = new PersonEntity();
		personEntity.insertDatabase();
	}
}
