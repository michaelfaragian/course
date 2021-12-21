package b.collections;

import java.util.HashMap;
import java.util.Map;

public class Demo3 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "sunday");
		map.put(3, "tuesday");
		map.put(6, "friday");
		
		System.out.println(map.get(6));
		
		
	}

}
