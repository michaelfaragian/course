package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatmentAndExecute2 {

	public static void main(String[] args) {

	
		String dburl = "jdbc:mysql://localhost:3306/db2?createDatabaseIfNotExist=true";
		String user = "root";
		String password = "1234";
		
		// define an sql as String
		for (int i = 1; i < 100; i++) {
			
			String sql = "insert into person values(" + i + ",'michael" + i + "')";
		
		
		// to get connection object we need DriverManager
		try (Connection con = DriverManager.getConnection(dburl, user, password);) {
			// use the connection to get a Statement object
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println(sql);
		} catch (SQLException e) {
			System.err.println(sql);
			e.printStackTrace();
		}
		}
		
	}

}
