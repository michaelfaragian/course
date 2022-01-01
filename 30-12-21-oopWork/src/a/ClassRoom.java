package a;

import java.util.Arrays;

public class ClassRoom {
	
	private String name;
	private Teacher teacher;
	private Student [] students = new Student[15];
	
	public ClassRoom(String name, Teacher teacher, Student[] students) {
		super();
		this.name = name;
		this.teacher = teacher;
		this.students = students;
	}

	public ClassRoom() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "ClassRoom [name=" + name + ", teacher=" + teacher + ", students=" + Arrays.toString(students) + "]"+ "\n";
	}

	
	public static int classStudents() {
		 Student [] students = new Student[15];
		 int c = 0;
		for (int i = 0; i < students.length ; i++) {
			c++;
		}
		return c;
	}
	
	public static int sumClass() {
		Student [] students = new Student[15];
		Grade [] grades = new Grade[6];
		int sum = 0;
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < grades.length; j++) {
				sum += students[i].getGrades()[j].getScore();
			}
		}
		return sum;
	}
	
}
