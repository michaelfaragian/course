package a;

public class Highway {
	

	private String name;
	
	Car [] cars = new Car [100];

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Highway() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Highway(String name, Car[] cars) {
		super();
		this.name = name;
		this.cars = cars;
	}

}
