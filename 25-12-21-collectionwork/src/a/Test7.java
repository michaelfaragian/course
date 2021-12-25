package a;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

//		dog – an animal that barks
//		car – a vehicle
//		java – a programming language
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("dog", "an animal that barks");
		map.put("car", "a vehicle");
		map.put("java", "a programing language");
		
		Scanner sc = new Scanner(System.in);
		System.out.println(map.keySet());
		System.out.println("enter word: ");
		String input = sc.nextLine();
		System.out.println(map.get(input));
		
		
		
	}

}
