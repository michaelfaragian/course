package Coupons.core.Facade;

import java.time.LocalDate;
import java.util.List;

import Coupons.core.beans.Coupon;
import Coupons.core.beans.Coupon.Category;
import Coupons.core.beans.Customer;
import Coupons.core.exception.CouponSystemException;

public class CustomerFacade extends ClientFacade {
	
	private int customerID;

	public int getCustomerID() {
		return customerID;
	}
		
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	

	public CustomerFacade() {
		super();
	}

	
	public CustomerFacade(int customerID) {
		super();
		this.customerID = customerID;
	}

	@Override
	public Boolean login(String email, String password) throws CouponSystemException {
		if (customerDAO.isCustomerExists(email, password)) {
			int id = customerDAO.getCustomerID(email, password);
			this.customerID = id;
			return true;			
		}
		return false;
	}
	
	public void purchaseCoupon(Coupon coupon) throws CouponSystemException{
		if (couponDAO.checkIfCustomerBuyThisCouponBefore(customerID, coupon.getId())) {
			throw new CouponSystemException("the customer :"+ customerID +"allrady buy coupon "+coupon.getId());
		}else if (couponDAO.checkIfAmountLessThanOne(coupon.getId())){
			throw new CouponSystemException("the amount from coupon "+coupon.getId()+" is less than 1");
		}else if (LocalDate.now().isAfter(coupon.getEndDate())) {
			throw new CouponSystemException("the end date for coupon "+coupon.getId()+" past" );
		}else {
			couponDAO.addCouponPurchase(customerID, coupon.getId());
			couponDAO.deleteFromAmount(coupon.getId());
		}	
	}
	
	public List<Coupon> getCustomerCoupons() throws CouponSystemException{
		//setCustomerID(1);
		return couponDAO.getCustomerCoupons(getCustomerID());
	}
	
	
	public List<Coupon> getCustomerCouponsByCategory(Category category) throws CouponSystemException{
		//int companyId = companyDAO.getCompanyID(email, password);
		return couponDAO.getCustomerCouponByIDAndCategory(customerID, category);
		
	} 
	
	public List<Coupon> getCustomerCouponsByMaxPrice (float maxPrice) throws CouponSystemException{
		return couponDAO.getCustomerCouponByIDAndmaxPrice(customerID, maxPrice);
	}
	
	public Customer getCustomerDetails() throws CouponSystemException {
		return customerDAO.getCustomerDetails(customerID);
		
	}
	
	
	
	
	
	
}
