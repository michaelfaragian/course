package lab7;

public class Test2 {

	public static void main(String[] args) {

		int c =0;
		
		 char [] arr = {'j', 'o', 'h', 'n', 'b', 'r', 'c', 'e'};
		
		 
		 for (int i = 0; i < arr.length; i++) {
			if (arr [i] == 'n') {
			c++;	
			}
			
		}
		 System.out.println(c);

		String n = "“John Bryce”";
		char[] ar= new char [n.length()];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = n.charAt(i);
			
		System.out.print(ar[i]);
		
		if (ar [i] == 'n') {
			c++;
		}
		}
		System.out.println();
		System.out.println(c);
		

	}

}
