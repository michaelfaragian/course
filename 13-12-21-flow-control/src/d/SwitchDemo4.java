package d;



public class SwitchDemo4 {

	public static void main(String[] args) {
		 
		int day = (int) (Math.random()* 7) + 1; // 1-7 inclusive
		System.out.println(day);
		
		
		
		
		
		switch (day) {
		case 1:
			System.out.println("16:30");
			break;
		case 2:
			System.out.println("16:30");
			break;
		case 3:
			System.out.println("12:30");
			break;
		case 4:
			System.out.println("16:30");
			break;
		case 5:
			System.out.println("16:30");
			break;
		case 6:
			System.out.println("this weekend");
			break;
		case 7:
			System.out.println("this weekend");
			break;
			
			default:
				System.out.println(day + " is not a day");
			
		}
		
		
		
	}

}
