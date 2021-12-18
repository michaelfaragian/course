package lab7;

public class Test3 {

	public static void main(String[] args) {
		int c =0;
		//String str = "Sara Shara Shir Cameach";

		char [] arr = {'S','a','r','a', 'S','h','a','r','a', 'S','h','i','r', 'C','a','m','e','a','c','h'};
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a'||arr[i] == 'e' ||arr[i] =='i' ||arr[i] == 'o'||arr[i] == 'u') {
				c++;
			}
		}
		
		System.out.println(c);
		
	}

}
