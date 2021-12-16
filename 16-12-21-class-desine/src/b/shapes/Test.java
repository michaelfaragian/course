package b.shapes;

public class Test {

	public static void main(String[] args) {

		Shape shape = new Shape();
		shape.setColor("red");
		
		System.out.println(shape.getColor());
		
		shape.setColor("blue");
		System.out.println(shape.getColor());
		
		System.out.println("area: " + shape.getArea());
		
	}

}
