package a;

import java.util.Arrays;

public class Store {
	
	private Fruit[] fruits = new Fruit[100];
	private Vegetable [] vegetables = new Vegetable[100];
	
	
	public Fruit[] getFruits() {
		return fruits;
	}
	public void setFruits(Fruit[] fruits) {
		this.fruits = fruits;
	}
	public Vegetable[] getVegetables() {
		return vegetables;
	}
	public void setVegetables(Vegetable[] vegetables) {
		this.vegetables = vegetables;
	}
	public void addFruit (Fruit fruit) {
			for (int i = 0; i < fruits.length; i++) {
				if (fruits[i] == null) {
					fruits[i] = fruit;
					break;
			}
		}
	}
	public void addvegetable (Vegetable vegetable) {
		for (int i = 0; i < vegetables.length; i++) {
			if (vegetables[i] == null) {
				vegetables[i] = vegetable;
				break;
		}
	}
		
}
	public String getAll() {
		return fruits.toString() + Arrays.toString(vegetables);		
	}
	

}
