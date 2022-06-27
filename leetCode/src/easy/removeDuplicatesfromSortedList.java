package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class removeDuplicatesfromSortedList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> list = new LinkedList<>();
		System.out.println("HEAD:");
		for (int i = 0; i < 5; i++) {			
			list.add(in.nextInt());
		}
		in.close();
		System.out.println(delete(list));
	}
	private static HashSet<Integer> delete (List<Integer> list) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.addAll(list);
		return set;
		
	}

}
