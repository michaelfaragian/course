package e;

public class CallingMethods {
	
	public static void main(String[] args) {
		
		double res = add (5.5, 20);
		System.out.println(res);
		
		double less = sub(7, 3.5);
		System.out.println(less);
		
		sayHi();
	}

	// method signature:
	// 1.return type - [double]
	// 2.method name - identifier [add]
	// 3.parameters - inside[(double a, double b)] 

	public static double add(double a, double b) {
		return a + b;
	}

	public static double sub(double a, double b) {
		return a - b;
	}
	public static void sayHi() {
		System.out.println("hi");
	}
}
