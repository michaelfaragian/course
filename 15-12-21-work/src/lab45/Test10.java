package lab45;

public class Test10 {

	public static void main(String[] args) {
		int b = 0;
		int a = (int)(Math.random()*10_001);
		int x = a;
		while (a != 0) {
			b = a % 10;	
			b = b + (b*10);
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
	
				   	
					   
						   
		
	
		
		
	


