package lab45;

public class Test10 {

	public static void main(String[] args) {
		
		int a = (int)(Math.random()*10_001);
		int y = a;
		System.out.println(a);
		int x =a;
		while (a > 9) {
			dig ++;
			a = (int) (a / 10);			
		}
		System.out.println("the number of digit: " + dig);
		
		while (a > 9) {
			a = (int) (a / 10);
			
		}System.out.println("the left number is: " + a);
		
		while (x != 0) {
			 s = s + (x % 10) ;
			x = (int)(x / 10);
		}
		System.out.println("the sum of the digits: " + s);
		
		
		System.out.print("the oposite number: " );
		while (y > 0) {
			b = (y % 10);
			y = (int)(y / 10);
			System.out.print(b);
		}
		
		
		
		
			   
			  
		   }
	}
	
				   	
					   
						   
		
	
		
		
	


