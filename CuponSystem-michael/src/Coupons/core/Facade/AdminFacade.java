package Coupons.core.Facade;

import Coupons.core.DAO.CompanyDAO;
import Coupons.core.beans.Company;
import Coupons.core.exception.CouponSystemException;

public class AdminFacade extends ClientFacade {
	
	
	public AdminFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean login(String email, String password) throws CouponSystemException {
		return email.equals("admin@admin.com") && password.equals("admin");
	}
	
	public int addCompany(Company company) throws CouponSystemException{
		if(companyDAO.isCompanyExistsByNameOrEmail(company.getName(), company.getEmail())) {
			throw new CouponSystemException("company with this name or email exist") ;
		}else {
			return companyDAO.addCompany(company);
		}
	}
	
	public void updateCompany (Company company) throws CouponSystemException{
		if (companyDAO.isCompanyExistsByIdOrName(company.getId(), company.getName())) {
			throw new CouponSystemException("canot change the name or the password of the company") ;
		}else {
			companyDAO.updateCompany(company);
		}
	}
	
	public void deleteCompany (int companyID) throws CouponSystemException{
		if (companyDAO.isCompanyExistsById(companyID)) {
			couponDAO.deleteCouponPurchaseWithCompanyID(companyID);
		}
	}
	
	

}
