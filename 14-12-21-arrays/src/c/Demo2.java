package c;

public class Demo2 {

	public static void main(String[] args) {

		String[] modes = { "on", "off", "stand by", "sleep"};
		
		int index = (int)(Math.random()* modes.length);
		System.out.println(modes[index]);
		System.out.println(modes[1]);
	}

}
