package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class mergeTwoSortedLists {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first list: ");
		for (int i = 0; i < 2; i++) {
			list1.add(in.nextInt()); 
		}
		System.out.println("Enter the second list: ");
		for (int i = 0; i < 2; i++) {
			list2.add(in.nextInt()); 
		}
		in.close();
		System.out.println(list(list1, list2));

	}
	
	public static ArrayList<Integer> list(List<Integer> list1, List<Integer> list2){
		List<Integer> list3 = new ArrayList<Integer>();
		list3.addAll(0, list1);
		list3.addAll(list1.size(), list2);
		Collections.sort(list3);
//        Collections.reverse(list3);
		return (ArrayList<Integer>) list3;
		
	}

}
