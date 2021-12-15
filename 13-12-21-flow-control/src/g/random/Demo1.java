package g.random;

public class Demo1 {

	public static void main(String[] args) {
		

	
	int r1 = (int) (Math.random() *11); // 0-10
	int r2 = (int) (Math.random() *11) + 10; // 10 - 20

	int a = 20;
	int b = 30;
	int r3 = (int)(Math.random()* (b - a + 1)) + a;
	System.out.println(r3);
	}
}
