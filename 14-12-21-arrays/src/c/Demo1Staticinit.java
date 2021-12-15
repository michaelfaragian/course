package c;

public class Demo1Staticinit {

	public static void main(String[] args) {

		//arrays can be statically initialized
		int[] arr1 = {2,4,6,8};
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			
		}
		
		System.out.println("==========");
		String[] names = {"michael , maayan, liraz, ariel, noa,"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			
		}
		System.out.println("=============");
		 
		//Box[] boxes = {new Box(), new Box(1,2,3)};
	}

}
