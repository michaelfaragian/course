package Coupons.core.Facade;

import Coupons.core.beans.Company;
import Coupons.core.exception.CouponSystemException;

public class AdminFacade extends ClientFacade {

	

	@Override
	public Boolean login(String email, String password) throws CouponSystemException {
		return email.equals("admin@admin.com") && password.equals("admin");
	}
	
	public int addCompany(Company company) throws CouponSystemException{
		
		
		
		return 0;
		
	}
	
	

}
