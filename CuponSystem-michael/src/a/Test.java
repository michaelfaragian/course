package a;

import Coupons.core.DAO.CouponDAO;
import Coupons.core.DBDAO.CouponDBDAO;
import Coupons.core.beans.Coupon;
import Coupons.core.exception.CouponSystemException;

public class Test {
	public static void main(String[] args) {
		Coupon coupon = new Coupon(0, 0, null, null, null, null, null, 0, 0, null);
		CouponDAO c = new CouponDBDAO();
		try {
			c.addCoupon(coupon);
		} catch (CouponSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
