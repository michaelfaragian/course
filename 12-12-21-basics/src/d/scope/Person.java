package d.scope;

public class Person {
	
	// attributes are global in the class
	// global variable are initialized automatically to default value
	
	private int id;
	private String name;
	private int age;
	
	public int getid() {
		int id;//this is a local to this method - not initialized
		id= 10;// initialization
		System.out.println(id);//10
		System.out.println(this.id);// the value of the person.id (0)
		return this.id;
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.getid();
		
	}

}
