package a;


public class Test {

	public static void main(String[] args) {

		MyThread t1 = new MyThread("t1");
		MyThread t2 = new MyThread("t2");
		MyThread t3 = new MyThread("t3");
		MyThread t4 = new MyThread("t4");
		 
		Thread [] threads = {t1,t2,t3,t4};
		for (Thread t : threads) {
			t.start();
		}
		
		// get a reference to the currently running thread
		Thread cuurThread = Thread.currentThread();
		
		for (int i = 0; i <= 100 ; i++) {
			System.out.println(cuurThread.getName() + ": " + i);
		}
	}
	
	

}
