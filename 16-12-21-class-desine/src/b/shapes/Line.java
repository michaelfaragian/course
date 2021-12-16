package b.shapes;

public class Line {
	
	private int Length;

	public Line(int Length) {
		super();
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}
	 
	public void print() {
		for( int i = 0; i < Length ; i++)
		System.out.print("*");
	}
	
	}
	
	
	


