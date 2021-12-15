package lab45;

public class Test4 {

	public static void main(String[] args) {
        int sum = 1;
		int a = (int)(Math.random()*8);
		System.out.println(a);
	
		for (int i = 1; i < a; i++) {
		sum = sum * i;	
		System.out.print(i + "x");
		
		}
		System.out.print(a + "=");
		System.out.println(sum * a);
		}
		
		
		
		
		}
		
		
	


