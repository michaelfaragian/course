package a;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			int r = (int)(Math.random()*6)+5;
			list.add(r);
			
		}
		System.out.println(list);
		
		
		Set<Integer> set = new LinkedHashSet<Integer>(list);
		list.clear();
		list.addAll(set);
		System.out.println(list);
		
		
		
	}

}
