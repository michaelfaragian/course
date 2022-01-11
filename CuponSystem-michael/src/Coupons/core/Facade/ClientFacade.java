package Coupons.core.Facade;

import Coupons.core.DAO.CompanyDAO;
import Coupons.core.DAO.CouponDAO;
import Coupons.core.DAO.CustomerDAO;
import Coupons.core.exception.CouponSystemException;

public abstract class ClientFacade {
	
	protected CompanyDAO companyDAO;
	protected CustomerDAO customerDAO;
	protected CouponDAO couponDAO;
	
	
	
	public abstract Boolean login (String email, String password) throws CouponSystemException;
	

	
	

}
