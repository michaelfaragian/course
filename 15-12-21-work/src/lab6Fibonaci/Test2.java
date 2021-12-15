package lab6Fibonaci;

public class Test2 {

	public static void main(String[] args) {
		
		
		int index = (int)(Math.random()*41) + 1;
		System.out.println("the index: " + index);

        if (index == 1 || index == 2) {
			System.out.println("the number: 1");
		}else {
			
		

		int f1 = 1;
		int f2 = 1;
		int f3;
		
		//System.out.println(f1);
		//System.out.println(f2);
		int i;
		for ( i = 2; i != index; i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
				System.out.println("the number: " + f2);
		}		
	}
}
		