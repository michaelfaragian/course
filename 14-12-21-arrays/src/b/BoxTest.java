package b;

public class BoxTest {

	public static void main(String[] args) {

		Box b1 = new Box( 100, 20, 5);
		System.out.println("iength: " + b1.getLength());
		System.out.println("width: " + b1.getWidth());
		System.out.println("height: " + b1.getHeight());
		
		//array of box elements
		Box[] boxes = new Box[2];
		
		//populate the array with 2 Box objects
		boxes[0] = new Box(1,1,1);
		boxes[1] = new Box(2,3,4);
		
		
		// use the boxes from array with a new reference
		Box b = boxes[0];
		System.out.println(b.getLength());
		
		// use the boxes from the array directly
		System.out.println(boxes[1].getLength());
		
		
		
		
		
		
		
		
	}

}
