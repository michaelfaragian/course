package b;

public class Student {
	
	private int id;
	private int School_id;
	private String name;
	private String email;
	
	
	public Student(int school_id, String name, String email) {
		super();
		School_id = school_id;
		this.name = name;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSchool_id() {
		return School_id;
	}


	public void setSchool_id(int school_id) {
		School_id = school_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	
	
	

}
