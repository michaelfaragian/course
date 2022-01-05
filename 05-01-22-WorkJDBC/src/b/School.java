package b;

public class School {
	
	private int id;
	private String name;
	private String address;
	
	public School(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public School(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public School() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
