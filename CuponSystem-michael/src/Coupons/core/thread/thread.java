package Coupons.core.thread;

import java.time.LocalDate;
import Coupons.core.DBDAO.CouponDBDAO;
import Coupons.core.exception.CouponSystemException;

public class thread  implements Runnable{

	@Override
	public void run() {
		CouponDBDAO couponDBDAO = new CouponDBDAO();
		try {
			int id = couponDBDAO.deleteCouponPurchaseByEndDate(LocalDate.now());
			couponDBDAO.deleteCoupon(id);
			try {
				Thread.sleep(864000000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (CouponSystemException e) {
			e.printStackTrace();
		}
		
	}

}
