package Coupons.core.thread;

import java.sql.Time;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import Coupons.core.DBDAO.CouponDBDAO;
import Coupons.core.exception.CouponSystemException;

public class CouponExpirationDalyJob  implements Runnable{
	
	private CouponDBDAO couponDBDAO = new CouponDBDAO(); 
	

	@Override
	public void run() {
		try {
			couponDBDAO.deleteExpiredCouponsAndPurchase(LocalDate.now());
			System.out.println("1");
			couponDBDAO.deleteExpiredCouponsAndPurchase2(LocalDate.now());
//			try {
//				//TimeUnit.DAYS.sleep(1);
//			} catch (InterruptedException e) {
				
				//e.printStackTrace();
			//}
		} catch (CouponSystemException e) {
			e.printStackTrace();
		}	
	}
}
