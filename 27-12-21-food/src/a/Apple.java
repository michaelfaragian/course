package a;

public class Apple extends Fruit {

	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apple(String taste, int wegiht) {
		super(taste, wegiht);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "apple [taste=" + getTaste() + ", wegiht=" + getWegiht() + "]";
	}

	
}
