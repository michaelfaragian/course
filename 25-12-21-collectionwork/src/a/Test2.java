package a;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 100; i++) {
			int r = (int)(Math.random()*61) +20;
			list.add(r);
		}
		
		System.out.println(list);
		System.out.println("number of elements: " + list.size());
		System.out.println("the first element: " + list.get(0));
		System.out.println("the last element: " + list.get(list.size()-1));
		System.out.println("the 10 element: " + list.get(9));
		
		
		Boolean contains;
		contains = list.contains(25);
		System.out.println("contains 25? " + contains);
		
		if(contains) {
			System.out.println("index: " + list.indexOf(25));
		}
		
		
		
		
		
		
		
	}

}
