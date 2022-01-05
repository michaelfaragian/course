package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class StudentDao {
	
	private String dburl = "jdbc:mysql://localhost:3306/db4?createDatabaseIfNotExist=true";
	private String user = "root";
	private String password = "1234";
	
	public void insertStudent(Student student ) {
		try (Connection con = DriverManager.getConnection(dburl, user, password)){
			String sql = "insert into student values (0, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,student.getSchool_id());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getEmail());
			pstmt.executeUpdate();
			System.out.println(" student add ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
}
}