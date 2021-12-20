package a.animals;

import e.interfaces.Flyer;
import e.interfaces.Navigator;

public class Sparrow extends Bird implements Flyer,Navigator
{

	@Override
	public void speak() {
		System.out.println("speaks like a sparrow");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like sparrow");		
	}

	@Override
	public void fly() {
		System.out.println("fly like sparrow");
	}
	

}
