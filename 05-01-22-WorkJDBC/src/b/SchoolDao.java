package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import b.School;

public class SchoolDao {

	private String dburl = "jdbc:mysql://localhost:3306/db4?createDatabaseIfNotExist=true";
	private String user = "root";
	private String password = "1234";

	public void insertSchool(School school) {
		try (Connection con = DriverManager.getConnection(dburl, user, password)) {
			String sql = "insert into school values (0, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, school.getName());
			pstmt.setString(2, school.getAddress());
			pstmt.executeUpdate();
			System.out.println(" school add ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void selectSchool() {
		for (int i = 1; i < 4; i++) {
		try (Connection con = DriverManager.getConnection(dburl, user, password)) {
			String sql = "select * from school where id=" + i;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
// 				System.out.println("id \t\t  name \t\t  price \t\t");
//				System.out.println("______________________________________________");
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				System.out.println("   school id: " + id +  "     name: " + name + "  address: " + address);
				String sql1 = "select * from student where school_id =" + i;
				
				Statement stmt1 = con.createStatement();
				ResultSet rs1 = stmt1.executeQuery(sql1);
				while (rs1.next()) {
					int id1 = rs1.getInt(1);
					
					String name1 = rs1.getString(3);
					String email1 = rs1.getString(4);
					System.out.println("  student id: " + id1 + "    name: " + name1 + "   email: " + email1);
				}

			}

		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
}