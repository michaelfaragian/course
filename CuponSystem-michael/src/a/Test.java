package a;

import Coupons.core.DAO.CompanyDAO;
import Coupons.core.DBDAO.CompanyDBDAO;
import Coupons.core.Facade.AdminFacade;
import Coupons.core.beans.Company;
import Coupons.core.exception.CouponSystemException;

public class Test {
	
	
	public
	static void main(String[] args) throws CouponSystemException {
		
		AdminFacade adminFacade = new AdminFacade();
		Company company = new Company(1, "mitgr", "msichah;e1@gmaihl", "123456");
		System.out.println(adminFacade.addCompany(company));
		CompanyDAO c = new CompanyDBDAO();
		adminFacade.updateCompany(company);
	
	}

}
