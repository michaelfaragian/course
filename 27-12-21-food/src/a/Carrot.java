package a;

public class Carrot extends Vegetable {

	public Carrot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carrot(String taste, int wegiht) {
		super(taste, wegiht);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		
		return "carrot [taste=" + getTaste() + ", wegiht=" + getWegiht() + "]";
	}
	
}
