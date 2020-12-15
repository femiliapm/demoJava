package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {
	public void database() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String host = "localhost";
			String dbname = "test";
			String username = "root";
			String pass = "";
			String query = "select * from table_position";
//			select namakolom from namatable
			String query2 = "select * from table_position where positionCode = ? and positionName = ?";
			String updateQuery = "update table_position set positionCode = ?, positionName = ? where id = ?";
			String insertQuery = "insert into table_position (positionCode, positionName) values (?,?)";
			String deleteQuery = "delete from table_position where id = ?";

			Connection conn = DriverManager.getConnection("jdbc:mysql://" + host + "/" + dbname, username, pass);
			System.out.print("Database is connected !\n\n");

//			SELECT DATA
//			Statement statement = conn.createStatement();
			PreparedStatement prestate = conn.prepareStatement(query);
			
//			INSERT & UPDATE
			PreparedStatement prestate2 = conn.prepareStatement(deleteQuery);			
//			prestate2.setString(1, "HCS");
//			prestate2.setString(2, "Human Capital Manager");
			prestate2.setInt(1, 56);
			
//			RESULT for INSERT and UPDATE and DELETE
			int res = prestate2.executeUpdate();
			System.out.println(res);
			if (res > 0) {
				System.out.println("Data updated OR inserted OR deleted!");
			}
			
//			RESULT for SELECT
//			ResultSet res = statement.executeQuery(query);
			ResultSet res2 = prestate.executeQuery();
			System.out.println(res2);
			while (res2.next()) {
//				SIMPAN DATA
				int id = res2.getInt("id");
				String posCode = res2.getString("positionCode");
				String posName = res2.getString("positionName");
				
				System.out.println(
						id + "\t" + posCode + "\t" + posName);
			}

			conn.close();
//			statement.close();
			prestate.close();
		} catch (Exception e) {
			System.out.print("Do not connect to DB - Error:" + e);
		}
	}

	public static void main(String[] args) {
		Jdbc db = new Jdbc();
		db.database();
	}
}
