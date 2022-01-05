package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import b.School;

public class Test {

	public static void main(String[] args) {

		SchoolDao schoolDao = new SchoolDao();
		StudentDao studentDao = new StudentDao();
		
		String dburl = "jdbc:mysql://localhost:3306/db4?createDatabaseIfNotExist=true";
		String user = "root";
		String password = "1234";
		
		try (Connection con = DriverManager.getConnection(dburl, user, password)){
			String sql ="create table school ( id int primary key auto_increment, name varchar(25), address varchar(25));";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("table school created");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try (Connection con = DriverManager.getConnection(dburl, user, password)){
			String sql ="create table student ( id int primary key auto_increment, school_id int , name varchar(20), email varchar(30), foreign key (school_id) references school(id))";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("table student created");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < 3; i++) {
			School school = new School("school " + i, "address " + i * 3.56);
			schoolDao.insertSchool(school);
			for (int j = 0; j < 10; j++) {
				Student student = new Student(i + 1, "student " + i, "student" + i + "@" + i);
				studentDao.insertStudent(student);
			}
			
		}
		
			
			schoolDao.selectSchool();
		
		
	}

}
