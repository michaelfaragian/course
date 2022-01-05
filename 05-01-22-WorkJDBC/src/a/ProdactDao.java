package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdactDao {
	
	private String dburl = "jdbc:mysql://localhost:3306/db3?createDatabaseIfNotExist=true";
	private String user = "root";
	private String password = "1234";
	
	public void createTable(Product product) {
		try ( Connection con = DriverManager.getConnection(dburl, user, password)){
			String sql = "create table Product ( id int primary key auto_increment, name varchar (25), price float)";
			System.out.println("table created");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void addProduct (Product product) {
	try ( Connection con = DriverManager.getConnection(dburl, user, password)){
		String sql = "insert into Product values (0, ?, ? )";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, product.getName());
		pstmt.setFloat(2, product.getPrice());
		pstmt.executeUpdate();
		System.out.println(" product add ");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	}
	
	public void seeTable() {
		try (Connection con = DriverManager.getConnection(dburl, user, password)){
			String sql = "select * from Product;";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			System.out.println("id \t\t  name \t\t  price \t\t");
			System.out.println("______________________________________________");
			
			while(rs.next()) {
				//int id = rs.getInt(1);
				//String name = rs.getString(2);
				//Float price = rs.getFloat(3);
				System.out.println( rs.getInt(1) + " \t|\t " + rs.getString(2) + " \t|\t  " + rs.getDouble(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	 
	 
	
	
	

}
