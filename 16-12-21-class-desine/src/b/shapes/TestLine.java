package b.shapes;

public class TestLine {

	public static void main(String[] args) {

		Line line = new Line(5);
		line.setLength(10);
	System.out.println(line.getLength());
		line.print();
		
		
		line.setLength(15);
		System.out.println(line.getLength());
		line.print();
		
	}

}
