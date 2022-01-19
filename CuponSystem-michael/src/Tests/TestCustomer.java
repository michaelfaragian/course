package Tests;

import Coupons.core.DAO.CouponDAO;
import Coupons.core.DBDAO.CouponDBDAO;
import Coupons.core.Facade.CustomerFacade;
import Coupons.core.beans.Coupon.Category;
import Coupons.core.exception.CouponSystemException;

public class TestCustomer {

	public static void main(String[] args) throws CouponSystemException {
		CustomerFacade customerFacade = new CustomerFacade();
//		CouponDAO couponDAO = new CouponDBDAO();
//		System.out.println(customerFacade.login("michael@", "123"));
		customerFacade.setCustomerID(3);
//		Coupon coupon = new Coupon(10, 4, Category.RESTAURANT, "bad", "bad", LocalDate.of(1999, 9, 12), LocalDate.of(2022, 1, 10), 10, 10, "bad");
//		customerFacade.purchaseCoupon(coupon);
//		couponDAO.addCoupon(coupon);
//		System.out.println(customerFacade.getCustomerCoupons() );
//		System.out.println(customerFacade.getCustomerCouponsByCategory(Category.FOOD));
//		System.out.println(customerFacade.getCustomerCouponsByMaxPrice(15));
		System.out.println(customerFacade.getCustomerDetails());
	}

}
