package c;

public class persontest {

	public static void main(String[] args) {

		// creating object using constructor 1
		person p1 = new person();

		// creating object using constructor 2
		person p2 = new person(111, "avi", 32);

		// print p1
		
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println("============");

		// print p2
		
		System.out.println(p2.getId());
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println("=========");
	}

}
