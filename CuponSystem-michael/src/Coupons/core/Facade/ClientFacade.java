package Coupons.core.Facade;

import Coupons.core.DAO.CompanyDAO;
import Coupons.core.DAO.CouponDAO;
import Coupons.core.DAO.CustomerDAO;
import Coupons.core.DBDAO.CompanyDBDAO;
import Coupons.core.DBDAO.CouponDBDAO;
import Coupons.core.DBDAO.CustomerDBDAO;
import Coupons.core.exception.CouponSystemException;

public abstract class ClientFacade {
	
	protected CompanyDAO companyDAO = new CompanyDBDAO();
	protected CustomerDAO customerDAO = new CustomerDBDAO();
	protected CouponDAO couponDAO = new CouponDBDAO();
	
	
	
	public abstract Boolean login (String email, String password) throws CouponSystemException;
	

	
	

}
