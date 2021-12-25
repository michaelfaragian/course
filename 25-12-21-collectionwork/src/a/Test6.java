package a;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test6 {

	public static void main(String[] args) {

		Map<Character, Integer> map1 = new LinkedHashMap<Character, Integer>();
		
		map1.put('A', 65);
		map1.put('B', 66);
		map1.put('C', 67);
		System.out.println(map1);
		System.out.println(map1.keySet());
		System.out.println(map1.values());
		System.out.println("===========");
		
		Map<Integer, String> map2 = new LinkedHashMap<Integer, String>();

		map2.put(1, "sunday");
		map2.put(2, "monday");
		map2.put(3, "tuseday" );
		System.out.println(map2);
		System.out.println(map2.keySet());
		System.out.println(map2.values());
		System.out.println("==========");
		
		
		Map<Integer, String> map3 = new LinkedHashMap<Integer, String>();
		map3.put(1, "one");
		map3.put(2, "two");
		map3.put(3, "three");
		map3.put(4, "four");
		map3.put(5, "five");
		
		System.out.println(map3);
		System.out.println(map3.keySet());
		System.out.println(map3.values());
		
		
	}

}
