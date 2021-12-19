package e.animals;

public class Bat extends Mamal implements Flyer {

	@Override
	public void speak() {
		System.out.println("squik");
		
	}

	@Override
	public void fly() {
		System.out.println("fly like a bat");
		
	}

}
