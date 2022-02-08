package Coupons.core.login;

import Coupons.core.Facade.AdminFacade;
import Coupons.core.Facade.ClientService;
import Coupons.core.Facade.CompanyFacade;
import Coupons.core.Facade.CustomerFacade;
import Coupons.core.exception.CouponSystemException;

public class LoginManager {

	private LoginManager() {
		super();
	}

	private static LoginManager instance = new LoginManager();

	public static LoginManager getInstance() throws CouponSystemException {
		return instance;
	}

	public ClientService login(String email, String password, ClientType clientType) throws CouponSystemException {

		if (clientType == ClientType.ADMINISTRATOR) {
			AdminService adminService = new AdminFacade();
			if (adminFacade.login(email, password)) {
				return adminFacade;
			}
		} else if (clientType == ClientType.CUSTOMER) {
			CustomerFacade customerFacade = new CustomerFacade();
			if (customerFacade.login(email, password)) {
				return customerFacade;
			}
		} else if (clientType == ClientType.COMPANY) {
			CompanyFacade companyFacade = new CompanyFacade();
			if (companyFacade.login(email, password)) {
				return companyFacade;
			}
		}
		return null;
	}
}
