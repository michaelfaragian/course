package a;

import a.Grade.Profession;

public class Teacher extends Person {
	
	private Profession profession;

	public Teacher(String name, int age, Profession profession) {
		super(name, age);
		this.profession = profession;
	}

	public Profession getProfessionTeacher() {
		return profession;
	}

	public void setProfessionTeacher(Profession profession) {
		this.profession = profession;
	}

	public Teacher() {
		super();
	}

	public Teacher(String name, int age) {
		super(name, age);
	}
	
	

}
