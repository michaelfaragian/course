package lab1;

public class Test2 {

	public static void main(String[] args) {
		
		int a = (int)(Math.random()*251 ) + 100;
		System.out.println("the movie in minutes : " + a);
		System.out.print("the movie in hours and minutes: " + ((int)(a / 60)));
		System.out.print(":" + (a % 60));
		
		
		
		
		
	}

}
