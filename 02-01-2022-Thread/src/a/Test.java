package a;

public class Test {

	public static void main(String[] args) {

		MyThead t1 = new MyThead();
		t1.start();
		
		try {
			t1.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.interrupt();
	}

}
