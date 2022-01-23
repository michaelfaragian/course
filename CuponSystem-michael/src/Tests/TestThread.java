package Tests;

import Coupons.core.thread.CouponExpirationDalyJob;

public class TestThread {

	public static void main(String[] args) {

		Thread t = new Thread( new CouponExpirationDalyJob());
		t.start();
		t.interrupt();
	}

}
