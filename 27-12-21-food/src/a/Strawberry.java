package a;

public class Strawberry extends Fruit {

	public Strawberry() {
		// TODO Auto-generated constructor stub
	}

	public Strawberry(String taste, int wegiht) {
		super(taste, wegiht);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		
		return "strawberry [taste=" + getTaste() + ", wegiht=" + getWegiht() + "]";
	}

}
