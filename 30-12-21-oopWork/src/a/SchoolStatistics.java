package a;


import a.Grade.Profession;

public class SchoolStatistics {

	public static int a = 1;
	public static int b = 1;
	public static int c = 1;
	private static int sumSchool;
	private static int schoolStudents;
	private static int sumClass;
	private static int classStudents;

	public static void main(String[] args) {

		
		School school = creatSchool();
		
		showSchool(school);
		avgSchool(school);
		
		
	}

	

	private static void avgSchool(School school) {
		
		System.out.println(sumClass / classStudents);
	}



	private static void showSchool(School school) {
		
		for (int i = 0; i < school.getClassRooms().length; i++) {
			System.out.println(school.getClassRooms()[i]);
			System.out.println();
		}
	}



	private static School creatSchool() {
		ClassRoom [] classRooms = new ClassRoom [5];
		for (int i = 0; i < 5; i++) {
			classRooms[i] = creatClassRoom();
		}
		return new School(classRooms);
	}

	private static ClassRoom creatClassRoom() {
		String name = " class " + c++;
		creatTeacher();
		Student[] students = new Student[15];
		for (int i = 0; i < students.length; i++) {
			students[i] = creatStudent();
		}
		return new ClassRoom(name, creatTeacher(), students);
	}

	private static Teacher creatTeacher() {
		String name = "teacher" + b++;
		int age = (int) (Math.random() * 101) + 20;
		Profession profession = Grade.randomProfession();
		return new Teacher(name, age, profession);
	}

	private static Student creatStudent() {
		String name = "student" + a++;
		int age = (int) (Math.random() * 101) + 20;
		Grade[] grades = new Grade[6];
		for (int i = 0; i < 6; i++) {
			int score = Grade.randomScore();
			Profession profession = Profession.values()[i];
			grades[i] = new Grade(score, profession);
		}
		return new Student(name, age, grades);
	}

}
