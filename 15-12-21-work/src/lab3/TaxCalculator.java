package lab3;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {

		// int tax;
		// int salary = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("enter salary: ");
		double salary = s.nextDouble();

		System.out.print("enter tax: ");
		double tax = s.nextDouble();
		s.close();

		/**if (salary < 23_000) {
			tax = (int) (salary * tax);
			
		} else if (salary < 50_000) {
			
			tax = (int) (salary * tax);
		} else if (salary < 100_000) {
			
			tax = (int) (salary * tax);
		} else
			tax = (int) (salary * tax);
*/
		System.out.println("the salary is: " + salary);
		System.out.println("the tax will be: " + tax);
		System.out.println("the new salary will be: " + (salary - tax));

	}

}
