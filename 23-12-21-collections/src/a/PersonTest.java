package a;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		list.add(new Person(105, "ccc", 36));
		list.add(new Person(101, "aaa", 27));
		list.add(new Person(19, "bbb", 30));
		list.add(new Person(150, "ccc", 25));
		System.out.println(list);//print
		list.sort(null);//sort
		System.out.println(list);//print again
		
	}

}
