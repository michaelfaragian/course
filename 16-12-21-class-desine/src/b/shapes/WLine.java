package b.shapes;

public class WLine extends Line {
			
	private int width;

	public WLine(int Length, int width) {
		super(Length);
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void print() {
		for (int i = 0; i < width; i++) {
			super.print();
		}
	}
	

}
