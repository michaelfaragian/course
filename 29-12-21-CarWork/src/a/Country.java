package a;

import java.util.Arrays;

public class Country {
	Highway [] highways = new Highway [5];
	
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
	
	

}
