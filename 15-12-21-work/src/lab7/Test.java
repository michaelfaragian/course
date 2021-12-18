package lab7;

public class Test {

	public static void main(String[] args) {
		
		int c = 0;

		char arr[] = {'a','b','c','a','b','d','r','c'};
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == 'a' || arr[i] == 'c') {
				
				c++;
		
	}
	}
		System.out.println(c);	
	}
}
