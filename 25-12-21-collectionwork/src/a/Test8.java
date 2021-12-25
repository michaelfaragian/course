package a;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test8 {
	
	public static void main(String[] args) {
		
		Map<String, String> milon = new LinkedHashMap<String, String>();
		milon.put("car", "a vehicle");
		milon.put("closet", "place to put things");
		milon.put("cat", "an animal that do miaoo");
		milon.put("street", "place that people walk there");
		milon.put("wallet", "place that put ther money");
		milon.put("phone", "thing that people conecting with other pople");
		
		System.out.println(milon);
		
	}

}
