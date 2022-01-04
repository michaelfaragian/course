package c;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDemo2 {

	public static void main(String[] args) {

		String dburl = "jdbc:mysql://localhost:3306/db1?createDatabaseIfNotExist=true";
		String user = "root";
		String password = "1234";
		
		
		try( Connection con = DriverManager.getConnection(dburl, user, password)){
			Statement stmt = con.createStatement();
			String sql = "select * from person";
			ResultSet rs = stmt.executeQuery("select * from book");
			
			while (rs.next()) {
			int id = rs.getInt(1);
			int authorid = rs.getInt(2);
			String title = rs.getString(3);
			Date date = rs.getDate(4);
			int price = rs.getInt(5);
			
			System.out.println("\n id: " + id + ", \n authorid: " +  authorid + ",\n title: " + title + ",\n date: " + date + ",\n price: " + price );
			System.out.println("===========");
		}
		}
		 catch (SQLException e) {
			e.printStackTrace();
		}
		
	
	}
			}
		
	

