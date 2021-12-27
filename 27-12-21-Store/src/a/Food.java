package a;

public abstract class Food {
	
	private int weight;
	private String taste;
	
	
	public Food() {
		super();
	}


	public Food(int weight, String taste) {
		super();
		this.weight = weight;
		this.taste = taste;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public String getTaste() {
		return taste;
	}


	public void setTaste(String taste) {
		this.taste = taste;
	}


	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [weight=" + weight + ", taste=" + taste + "]";
	}
	
	
	

}
