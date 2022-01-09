package Coupons.core.DAO;

import java.util.List;

import Coupons.core.beans.Coupon;
import Coupons.core.exception.CouponSystemException;

public interface CouponDAO {
	
	public int addCoupon (Coupon coupon) throws CouponSystemException;
	
	public void updateCoupon (Coupon coupon) throws CouponSystemException;
	
	public void deleteCoupon (int couponID) throws CouponSystemException;
	
	public List<Coupon> getAllCoupons () throws CouponSystemException;
	
	public Coupon getOneCoupon (int couponID) throws CouponSystemException;
	
	public void addCouponPurchase (int customerID , int couponID) throws CouponSystemException;
	
	public void deleteCouponPurchase (int customerID , int couponID) throws CouponSystemException;

}
