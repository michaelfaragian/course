package a;


public class Store {
	
	private Fruit [] fruit = new Fruit[100];
	private Vegetable [] vegetable = new Vegetable[100];
	
	
	public void AddFruit(Fruit x) {
		for (int i = 0; i < fruit.length; i++) {
			if ( fruit [i] == null) {
				fruit [i] = x;
				break;
			}
		}
	}
	
	public void AddVegetable(Vegetable x) {
		for (int i = 0; i < vegetable.length; i++) {
			if ( vegetable [i] == null) {
				vegetable [i] = x;
	}
		}
	}

	public Fruit[] getFruit() {
		return fruit;
	}

	public void setFruit(Fruit[] fruit) {
		this.fruit = fruit;
	}

	public Vegetable[] getVegetable() {
		return vegetable;
	}

	public void setVegetable(Vegetable[] vegetable) {
		this.vegetable = vegetable;
	}
	
}


