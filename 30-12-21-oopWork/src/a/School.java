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

	
}
