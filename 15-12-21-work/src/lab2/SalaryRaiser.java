package lab2;

public class SalaryRaiser {

	public static void main(String[] args) {

		
		int salary = (int)(Math.random()*1001) + 5000;
		System.out.println("cuurent salary: " + salary);
		
		if ( salary * 1.1 < 6000) {
			salary = (int) (salary * 1.1);
		}else
			salary = (int) (salary * 1.05);
		
		System.out.println("the new salary is: " + salary);
		
	}

}
