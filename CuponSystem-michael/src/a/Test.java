package a;
import Coupons.core.DAO.CompanyDAO;
import Coupons.core.DAO.CouponDAO;
import Coupons.core.DAO.CustomerDAO;
import Coupons.core.DBDAO.CompanyDBDAO;
import Coupons.core.DBDAO.CouponDBDAO;
import Coupons.core.DBDAO.CustomerDBDAO;
import Coupons.core.Facade.AdminFacade;
import Coupons.core.beans.Company;
import Coupons.core.beans.Customer;
import Coupons.core.exception.CouponSystemException;

public class Test {



		
		
		public static void main(String[] args) throws CouponSystemException {
			AdminFacade adminFacade = new AdminFacade();
			CompanyDAO c = new CompanyDBDAO();
			CouponDAO a = new CouponDBDAO();
			CustomerDAO cus = new CustomerDBDAO();
			Company company = new Company(4, "michal", "mich@", "123");
			Customer customer = new Customer(1, "m", "f", "faragian@", "123");
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
		
		}


	}



