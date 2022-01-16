package Tests;
import java.time.LocalDate;

import Coupons.core.DAO.CompanyDAO;
import Coupons.core.DAO.CouponDAO;
import Coupons.core.DAO.CustomerDAO;
import Coupons.core.DBDAO.CompanyDBDAO;
import Coupons.core.DBDAO.CouponDBDAO;
import Coupons.core.DBDAO.CustomerDBDAO;
import Coupons.core.Facade.AdminFacade;
import Coupons.core.Facade.CompanyFacade;
import Coupons.core.beans.Company;
import Coupons.core.beans.Coupon;
import Coupons.core.beans.Coupon.Category;
import Coupons.core.beans.Customer;
import Coupons.core.exception.CouponSystemException;

public class TestADMIN {



		
		
		public static void main(String[] args) throws CouponSystemException {
			AdminFacade adminFacade = new AdminFacade();
			CompanyFacade companyFacade = new CompanyFacade();
			CompanyDAO c = new CompanyDBDAO();
			CouponDAO a = new CouponDBDAO();
			CustomerDAO cus = new CustomerDBDAO();
			Company company = new Company(4, "michael", "michael@", "123456");
			Customer customer = new Customer(1, "m", "f", "faragian@", "123");
			Coupon coupon = new Coupon(0, 3, Category.ELECTRICITY, "mich", "f", LocalDate.of(1999, 9, 12), LocalDate.of(2022, 1, 10), 1, 1, "f");
//		 	System.out.println(adminFacade.login("admin@admin.com", "admin"));
		 	//System.out.println( adminFacade.addCompany(company));
//		 	adminFacade.updateCompany(company);
//		 	adminFacade.deleteCompany(company.getId());
//		 	System.out.println( adminFacade.getAllCompanies());
//		 	System.out.println( adminFacade.getOneCompany(3));
		// 	System.out.println(adminFacade.addCustomer(customer));
//		 	adminFacade.addCustomer(customer);
//			adminFacade.updateCustomer(customer);
//			System.out.println(adminFacade.getAllCustomers());
//			System.out.println(adminFacade.getOneCustomer(3));
			System.out.println(companyFacade.login("michael@", "123456"));
//			companyFacade.updateCoupon(coupon);
			companyFacade.addCoupon(coupon);
		
		}


	}



