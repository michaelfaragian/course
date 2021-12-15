package lab45;

public class Palindrom {

	public static void main(String[] args) {
		int c;
		int b = 0;
		int a = (int)(Math.random()*10_001);
		int x = a;
		while (a != 0) {
			c = a % 10;
			b = b * 10;
			b = b + c;	
			a = (int)( a / 10);
		}
		System.out.println(x);
		System.out.println(b);
		if (x == b) {
			System.out.println("palindrom");
		} else
			System.out.println("no palindrom");
		{
		}
		
	}
}
		
			   
			  
		   
	
				   	
					   
						   
		
	
		
		
	


