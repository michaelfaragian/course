package a;

public class TestPerson {

	public static void main(String[] args) {

		System.out.println("atart");
		System.out.println("counter: " + Person.getCounter());
		
		Person p1 = new Person(9685, "michael", 25);
		Person p2 = new Person(9685, "david", 25);
		Person p3 = new Person(9685, "moshe", 25);
		System.out.println(p2.id);
		
		System.out.println(Person.getCounter());// static reference
		
		System.out.println(p1.getName());// dynamic reference
		
		p2.setAge(98);
		System.out.println(p2.getAge());
		
		System.out.println(p1.getId());
		System.out.println(p3.getId());
		
		Person p4 = new Person(26, "david", 165);
		System.out.println();
		
	}

}
