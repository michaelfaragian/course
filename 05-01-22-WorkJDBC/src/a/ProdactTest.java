package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdactTest {

	public static void main(String[] args) {

		ProdactDao prodactDao = new ProdactDao();

		String dburl = "jdbc:mysql://localhost:3306/db3?createDatabaseIfNotExist=true";
		String user = "root";
		String password = "1234";

//		try (Connection con = DriverManager.getConnection(dburl, user, password)) {
//			String sql = "create table Product ( id int primary key auto_increment, name varchar (25), price float);";
//			Statement stmt = con.createStatement();
//			stmt.executeUpdate(sql);
//			System.out.println("table created");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

		for (int i = 0; i < 10; i++) { 
			Product product = new Product("product " + (i + 1), i + 10);
			prodactDao.addProduct(product);
			System.out.println(product);
		}
		
		prodactDao.seeTable();

	}

}
