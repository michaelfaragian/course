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
		

		int a =0;
		 String str = "Sara Shara Shir Cameach”";
		 char [] song = new char[str.length()];
		 for (int i = 0; i < song.length; i++) {
			 song [i] = str.charAt(i);
			 System.out.print(song [i]);
			
			 if (song [i] == 'a'||song [i] == 'e'||song [i] == 'i'||song [i] == 'o'||song [i] == 'u' ) {
			a++;	
			}
		}
		 System.out.println();
		 System.out.println(c);
	}

}
