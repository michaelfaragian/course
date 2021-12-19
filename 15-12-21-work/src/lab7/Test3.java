package lab7;

public class Test3 {

	public static void main(String[] args) {

		int c =0;
		 String str = "Sara Shara Shir Cameach”";
		 char [] song = new char[str.length()];
		 for (int i = 0; i < song.length; i++) {
			 song [i] = str.charAt(i);
			 System.out.print(song [i]);
			
			 if (song [i] == 'a'||song [i] == 'e'||song [i] == 'i'||song [i] == 'o'||song [i] == 'u' ) {
			c++;	
			}
		}
		 System.out.println();
		 System.out.println(c);
	}

}
