package lab3;

public class LeapYear {

	public static void main(String[] args) {

		int year = (int)(Math.random()*2023);
		System.out.println(year);
		//int year = 200;
		if ( year % 4 ==0 && year % 100 != 0) {
			System.out.println("yes");
		}else if (year % 400 == 0) {
			System.out.println("yes");			
		}else 
			System.out.println("no");
		
	}

}
