package Coupons.core.DAO;

import java.util.List;

import Coupons.core.beans.Coupon;
import Coupons.core.exception.CouponSystemException;

public interface CouponDAO {
	
	 int addCoupon (Coupon coupon) throws CouponSystemException;
	 
	 boolean checkCompanyIDAndTitle (int companyID , String Title) throws CouponSystemException;
	
	 void updateCoupon (Coupon coupon) throws CouponSystemException;
	 
	 void updateCouponWithoutCompanyID (Coupon coupon) throws CouponSystemException;
	 
	 void deleteCouponWithCompanyID (int companyID) throws CouponSystemException;
	 
	
	 void deleteCoupon (int couponID) throws CouponSystemException;
	
	
	 List<Coupon> getAllCoupons () throws CouponSystemException;
	 
	 List<Coupon> getAllCouponsWithCompanyID (int companyID) throws CouponSystemException;
	
	 Coupon getOneCoupon (int couponID) throws CouponSystemException;
	
	 void addCouponPurchase (int customerID , int couponID) throws CouponSystemException;
	
	 void deleteCouponPurchase (int customerID , int couponID) throws CouponSystemException;
	 
	 void deleteCouponPurchaseOnlyCouponID ( int couponID) throws CouponSystemException;
	 
	 void deleteCouponPurchaseWithCompanyID (int companyID) throws CouponSystemException;

	 void deleteCouponPurchaseWithCustomerID (int customerID) throws CouponSystemException;
	 
	 
}
