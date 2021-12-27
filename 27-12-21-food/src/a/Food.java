package a;

public abstract class Food {
	private String taste;
	private int wegiht;
	
	
	public Food() {
		super();
	}
	public Food(String taste, int wegiht) {
		super();
		this.taste = taste;
		this.wegiht = wegiht;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public int getWegiht() {
		return wegiht;
	}
	public void setWegiht(int wegiht) {
		this.wegiht = wegiht;
	}
	@Override
	public String toString() {
		return "Food [taste=" + taste + ", wegiht=" + wegiht + "]";
	}
	
	
	

}
