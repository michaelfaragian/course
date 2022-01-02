package a;

import java.util.Arrays;


public class Student extends Person {
	
	private Grade [] grades = new Grade[6];
	
	public Student(String name, int age, Grade[] grades) {
		super(name, age);
		this.grades = grades;
	}


	public Student(Grade[] grades) {
		super();
		this.grades = grades;
	}

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super(name, age);
	}

	public Grade[] getGrades() {
		return grades;
	}

	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}


	@Override
	public String toString() {
		return "[" + Arrays.toString(grades) + ",Name=" + getName() + ", Age=" + getAge()
				+ "]" + "\n";
	}


	

	
	
	  
	
}
