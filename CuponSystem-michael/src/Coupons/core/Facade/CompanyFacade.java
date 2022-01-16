package Coupons.core.Facade;

import java.util.ArrayList;
import java.util.List;

import Coupons.core.beans.Company;
import Coupons.core.beans.Coupon;
import Coupons.core.beans.Coupon.Category;
import Coupons.core.exception.CouponSystemException;

public class CompanyFacade extends ClientFacade {
	
	
	private String email;
	private String password;
	

	public CompanyFacade() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	public CompanyFacade(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	

	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Boolean login(String email, String password) throws CouponSystemException {
		return companyDAO.isCompanyExists(email, password);
			
	}
	
	public void addCoupon (Coupon coupon) throws CouponSystemException{
		 if ( !couponDAO.checkCompanyIDAndTitle(coupon.getCompanyID(), coupon.getTitle())) {
			 couponDAO.addCoupon(coupon);
		 }else {
			 throw new CouponSystemException("the title " + coupon.getTitle() + " allrady exist where company id = " + coupon.getCompanyID());
		 }
	}
	
	public void updateCoupon (Coupon coupon) throws CouponSystemException{
		couponDAO.updateCouponWithoutCompanyID(coupon);
	}
	
	public void deleteCoupon (int couponID) throws CouponSystemException{
		couponDAO.deleteCouponPurchaseOnlyCouponID(couponID);
		couponDAO.deleteCoupon(couponID);
	}
	public List<Coupon>  getCompanyCoupons() throws CouponSystemException{
		int companyID = companyDAO.getCompanyID(email, password);
		return (List<Coupon>)couponDAO.getAllCouponsWithCompanyID(companyID);
	}

	public List<Coupon> getCompanyCouponsByCategory(Category category) throws CouponSystemException{
		int companyId = companyDAO.getCompanyID(email, password);
		return couponDAO.getCouponsWithCompanyIDAndCategory(companyId, category);
		
	}
	public List<Coupon> getCompanyCouponsByMaxPrice(double maxPrice) throws CouponSystemException{
		int companyID = companyDAO.getCompanyID(email, password);
		return couponDAO.getCompanyCouponsByMaxPrice(companyID, maxPrice);
		
	}
	public Company getCompanyDetailes() throws CouponSystemException{
		return companyDAO.getCompanyDetailes(email, password);
	}
}
