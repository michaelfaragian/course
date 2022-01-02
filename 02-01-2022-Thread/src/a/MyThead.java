package a;

import java.util.Date;

public class MyThead extends Thread{

	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("===interapt==");
				System.out.println(new Date());
				break;
			}
		}
	}

	
	


	
	 

}
