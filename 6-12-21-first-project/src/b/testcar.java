package b;

public class testcar {

	public static void main(String[] args) {
		
		car car1 = new car();
	//	car car2 = new car();
		
		car1.number= 123456;
		car1.color= "red";
		car1.brand = "subaru";
		car1.year = 2018;


		System.out.println(car1.number);
		System.out.println(car1.color);
		System.out.println(car1.brand);
		System.out.println(car1.year);
	}

}
