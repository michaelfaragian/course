package lab10;

public class Test1 {

	public static void main(String[] args) {

		int c = 0;
		int a = 0;
		int [] arr = {1,2,3,1,2,3,3,2,1,9,5,1,1,9};
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == 3) {
				c++;
		}else if( arr[i] == 1) {
			a++;
		}
			
		}
			
		System.out.println("3 num:  " + c);
		System.out.println("1 num:  " + a);
	}

}
