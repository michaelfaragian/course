package a;

import java.util.Arrays;

public class School {
	
	private ClassRoom [] classRooms = new ClassRoom [5];

	public School(ClassRoom[] classRooms) {
		super();
		this.classRooms = classRooms;
	}

	public ClassRoom[] getClassRooms() {
		return classRooms;
	}

	public void setClassRooms(ClassRoom[] classRooms) {
		this.classRooms = classRooms;
	}

	public School() {
		super();
	}

	@Override
	public String toString() {
		return "School [classRooms=" + Arrays.toString(classRooms) + "]";
	}
	
	public static int schoolStudents() {
		ClassRoom [] classRooms = new ClassRoom [5];
		Student [] students = new Student[15];
		int c= 0;
		for (int i = 0; i < classRooms.length; i++) {
			for (int j = 0; j < students.length; j++) {
				c++;
			}
			
		}
		return c;
	}
	public static int sumSchool() {
		ClassRoom [] classRooms = new ClassRoom [5];
		Student [] students = new Student[15];
		Grade [] grades = new Grade[6];
		int sum = 0;
		for (int i = 0; i < classRooms.length; i++) {
			for (int j = 0; j < students.length; j++) {
				for (int j2 = 0; j2 < grades.length; j2++) {
				sum+= classRooms[i].getStudents()[j].getGrades()[j2].getScore();	
				}
			}
		}
		return sum;
	}
	
}
	

