package a;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

		
		List<Integer>list = new ArrayList<Integer>();
		list.add(65);
		list.add(18);
		list.add(25);
		 int sum =0;
		
		System.out.println(list);
		System.out.println("=========");
		System.out.println(list.get(2));
		System.out.println("=========");
		
		sum = list.get(1) + list.get(2) + list.get(0);
		System.out.println(sum);
		
		System.out.println(sum / list.size());
		
		
		
		
		

		
		
		
	}

}
