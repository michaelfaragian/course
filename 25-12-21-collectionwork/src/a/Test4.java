package a;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test4 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("michael");
		set.add("maayan");
		set.add("liraz");
		
		System.out.println(set);

		Iterator<String> it = set.iterator();
		
		// print a spesific element
		
		for (int i = 0; it.hasNext(); i++) {
			String curr = it.next();
			if ( i == 2) {
				System.out.println(curr);
				break;
			}
		}
		
	}

}
