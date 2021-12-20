package a.animals;

import interfaces.Advanedflyer;

public class Bat extends Mammal implements Advanedflyer {

	@Override
	public void fly() {
		System.out.println("fly like a bat");
		
	}

	@Override
	public void navigate() {
		System.out.println("navigate like a bat");
		
	}

	@Override
	public void takeoff() {
		System.out.println("take of like a bat");
	}

	@Override
	public void land() {
		System.out.println("land like a bat");
		
	}

	@Override
	public void speak() {
		System.out.println("squeeq");
	}
	
	
}
