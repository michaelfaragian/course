package a;

public class Person {
	
	private int id;
	private String name;
	private int age;
	
	// getters + setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws PersonAgeException {
		if (age >= 0 && age <= 120) {
			this.age = age;//0 - 120 : throw checked exception if violated  			
		}else {
			throw new PersonAgeException("setAge failed: " + age + " is illeagal");
		}
	}
	

	
	
}
