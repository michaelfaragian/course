package d.scope;

public class Demo1 {

	public static void main(String[] args) {
	
		
		{// this is a scope - start
		int x = 5;
		System.out.println(x);
		}// end of scope
		
		{ // start scope
			int x = 2;
			System.out.println(x);
		}// end scope
		

	}

}
