package Coupons.core.dalyJob;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import Coupons.core.DBDAO.CouponDBDAO;
import Coupons.core.exception.CouponSystemException;

public class CouponExpirationDalyJob  implements Runnable{
	
	private CouponDBDAO couponDBDAO = new CouponDBDAO(); 
	




	@Override
	public void run() {
		try {
			couponDBDAO.deleteExpiredCouponsFromCustomerCoupon(LocalDate.now());
			couponDBDAO.deleteExpiredCouponsFromCoupon(LocalDate.now());
			try {
				TimeUnit.DAYS.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		} catch (CouponSystemException e) {
			System.out.println(e.getMessage());
		}	
	}
}
