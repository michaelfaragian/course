package c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDemo1 {

	public static void main(String[] args) {

		String dburl = "jdbc:mysql://localhost:3306/db2?createDatabaseIfNotExist=true";
		String user = "root";
		String password = "1234";
		
		
		try( Connection con = DriverManager.getConnection(dburl, user, password)){
			Statement stmt = con.createStatement();
			String sql = "select * from person";
			ResultSet rs = stmt.executeQuery("select * from person");
			
			rs.next();// move to the next (first) row of Result Set
			rs.next();// move to the next (second) row of Result Set
			
			// id from column 1 -id
			// int id = rs.getint ("id");
			int id = rs.getInt(1);
			// name from column 2 -name
			// string name = rs.getstring(:name");
			String name = rs.getString(2);
			// print 
			System.out.println("id: " + id +", name: " + name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
