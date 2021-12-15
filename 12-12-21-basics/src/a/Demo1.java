package a;

public class Demo1 {

	public static void main(String[] args) {
		
		// integers - literal integer is int by default
		byte n1 = 5;
		short n2 = 10;
		int n3 = 15;
		long n4 = 99999999999999L; // change default literal type to long
		
		
		//decimals- literal decimal is double by default
		float f1 = 5.3F; // change default literal type to float
		double f2 = 5D; // change default literal type to double

		// the expression calculated value has type
		// the type is determined by the members
		 float sum = n4 + n3 + f1;
		 
		 
		 // p is a reference to a point object
		Point p = new Point(5,3);
		// we use the reference to access the objects members
		 System.out.println(p.getX());
		 System.out.println(p.getY());
		 
		 
		 
		 
		 
		 
	}
	

}
