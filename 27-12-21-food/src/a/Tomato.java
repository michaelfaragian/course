package a;

public class Tomato extends Vegetable {

	public Tomato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tomato(String taste, int wegiht) {
		super(taste, wegiht);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		
		return "tomato [taste=" + getTaste() + ", wegiht=" + getWegiht() + "]";
	}
	
	

}
