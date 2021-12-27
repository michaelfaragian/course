package a;

import java.util.Arrays;

public class StoreStatic {

	public static void main(String[] args) {

		Store store = new Store();
		
		store.AddFruit(new Apple(65, "sweet"));
		store.AddFruit(new Apple(45, "bad"));
		store.AddFruit(new Apple());
		store.AddFruit(new Strawbery(7, "sweet"));
		store.AddFruit(new Strawbery(12, "sour"));
		store.AddVegetable(new Tomato(14, "sharp"));
		store.AddVegetable(new Tomato(12, "sweet"));
		store.AddVegetable(new Tomato(16, "sour"));
		store.AddVegetable(new Carrot(16, "sour"));
		store.AddVegetable(new Carrot(2, "sharp"));
		
		System.out.println(Arrays.toString(store.getFruit()));
		System.out.println(Arrays.toString(store.getVegetable()));
	}

}
