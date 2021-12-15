package d;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// input from user
		System.out.print("enter day: ");
      Scanner sc = new Scanner(System.in);// input from keyboard
		String day = sc.nextLine();
		sc.close();// close the scanner
		// 
		
		
		
		//String day = "aaa";
		//String day = "sunday";
		//String day = "monday";
		//String day = "tuesday";
		//String day = "wenesday";
		//String day = "thursday";
		//String day = "friday";
		//String day = "saturday";
		
		//System.out.println(day);
		
		switch (day) {
		case "sunday":
			System.out.println("16:30");
			break;
		case "monday":
			System.out.println("16:30");
			break;
		case "tuesday":
			System.out.println("12:30");
			break;
		case "wenesday":
			System.out.println("16:30");
			break;
		case "thursday":
			System.out.println("16:30");
			break;
		case "friday":
			System.out.println("this weekend");
			break;
		case "saturday":
			System.out.println("this weekend");
			break;
			
			default:
				System.out.println(day + " is not a day");
			
		}
		
		
		
	}

}
