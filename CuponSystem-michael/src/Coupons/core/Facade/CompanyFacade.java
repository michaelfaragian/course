package Coupons.core.Facade;

import Coupons.core.beans.Coupon;
import Coupons.core.exception.CouponSystemException;

public class CompanyFacade extends ClientFacade {
	
	

	public CompanyFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Boolean login(String email, String password) throws CouponSystemException {
		return email.equals(companyDAO.isCompanyExistsByEmail(email) )&&
				password.equals(companyDAO.isCompanyExistsPassword(password));
	}
	
	
	
	public void updateCoupon (Coupon coupon) throws CouponSystemException{
		couponDAO.updateCouponWithoutCompanyID(coupon);
	}
	
	public void deleteCoupon (int couponID) throws CouponSystemException{
		couponDAO.deleteCouponPurchaseOnlyCouponID(couponID);
		couponDAO.deleteCoupon(couponID);
	}

}
