package e.animals;

public class Test {

	public static void main(String[] args) {

		Animal [] animals = new Animal[5];
		animals[0] = new Cat();
		animals[1] = new Dog();
		animals[3] = new Cat();
		animals [4] = new Bat();
		animals[2] = new Sparrow();
		
		for (int i = 0; i < animals.length; i++) {
			System.out.println("===============");
			Animal animal = animals[i];
			if(animal != null) {
				animal.speak();
				if (animal instanceof Flyer) {
				Flyer flyer = (Flyer) animal;
				flyer.fly();
				}
					
			}
			
		}
	}

}
