package Coupons.core.Facade;

import java.time.LocalDate;

import Coupons.core.beans.Coupon;
import Coupons.core.exception.CouponSystemException;

public class CustomerFacade extends ClientFacade {
	
	private int customerID;

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
		
		
	}

	@Override
	public Boolean login(String email, String password) throws CouponSystemException {
		return customerDAO.isCustomerExists(email, password);
	}
	
	public void purchaseCoupon(Coupon coupon) throws CouponSystemException{
		if (couponDAO.checkIfCustomerBuyThisCouponBefore(customerID, coupon.getId())) {
			throw new CouponSystemException("the customer :"+ customerID+"allrady buy coupon "+coupon.getId());
		}else if (couponDAO.checkIfAmountLessThanOne(coupon.getCompanyID())){
			throw new CouponSystemException("the amount from coupon "+coupon.getId()+" is less than 1");
		}else if (coupon.getEndDate().isAfter(LocalDate.now())) {
			throw new CouponSystemException("the end date for coupon "+coupon.getId()+" past" );
		}else {
			couponDAO.addCouponPurchase(customerID, customerID);
			couponDAO.deleteFromAmount(customerID);
		}
			
		
	}
}
