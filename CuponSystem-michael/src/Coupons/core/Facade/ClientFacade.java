package Coupons.core.Facade;

import Coupons.core.DAO.CompanyDAO;
import Coupons.core.DAO.CouponDAO;
import Coupons.core.DAO.CustomerDAO;
import Coupons.core.exception.CouponSystemException;

public abstract class ClientFacade {
	
	protected CompanyDAO companyDAO;
	protected CustomerDAO customerDAO;
	protected CouponDAO couponDAO;
	
	
	public ClientFacade(CompanyDAO companyDBDAO, CustomerDAO customerDBDAO, CouponDAO couponDBDAO) {
		this.companyDAO = companyDBDAO;
		this.customerDAO = customerDBDAO;
		this.couponDAO = couponDBDAO;
	}
	
	public abstract Boolean login (String email, String password) throws CouponSystemException;
	

	
	

}
