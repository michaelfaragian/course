package lab7;

public class Test2 {

	public static void main(String[] args) {

		int c =0;
		String n = "“John Bryce”";
		char[] arr= new char [n.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = n.charAt(i);
			
		System.out.print(arr[i]);
		
		if (arr [i] == 'n') {
			c++;
		}
		}
		System.out.println();
		System.out.println(c);
		
	}

}
