package a;

import java.util.Arrays;

public class Country {

	private  Highway[] highways = new Highway[5];

	public  Highway[] getHighways() {
		return highways;
	}

	public void setHighways(Highway[] highways) {
		this.highways = highways;
	}

	public Country(Highway[] highways) {
		super();
		this.highways = highways;
	}

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Country [highways=" + Arrays.toString(highways) + "]";
	}

	public  void addHighway(Highway highway) {
		for (int i = 0; i < highways.length; i++) {
			if (highways[i] == null) {
				highways[i] = highway;
				return;

			}
		}
	}

	
}
