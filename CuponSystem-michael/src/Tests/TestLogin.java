package Tests;

import Coupons.core.Facade.AdminFacade;
import Coupons.core.Facade.CompanyFacade;
import Coupons.core.Facade.CustomerFacade;
import Coupons.core.beans.Company;
import Coupons.core.beans.Customer;
import Coupons.core.exception.CouponSystemException;
import Coupons.core.login.ClientType;
import Coupons.core.login.LoginManager;

public class TestLogin {

	public static void main(String[] args) {                         

		try {
			// get an instance of login manager
			LoginManager loginManager;
			loginManager = LoginManager.getInstance();
			// get a facade by login
			AdminFacade adminFacade = (AdminFacade) loginManager.login("admin@admin.com", "admin", ClientType.ADMINISTRATOR);
			// do client actions
			 System.out.println(adminFacade.getOneCustomer(5)); 
		//	System.out.println(customer);
			System.out.println("coupons");
			//System.out.println(customerFacade.getCustomerCoupons());
		} catch (CouponSystemException e) {
			System.out.println("ERROR: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
