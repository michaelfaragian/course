package b.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo3Milon {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("java", " a programming lanuage");
		map.put("dog", " an animal that barks");
		map.put("table", " a furniture");
		map.put("dog", " an animal that barks");

		System.out.println(map);

		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter word: ");
		String key = sc.nextLine();
		if(map.containsKey(key)) {
			System.out.println("definition");
			
		}

	}

}
