package Coupons.core.login;

import Coupons.core.Facade.AdminFacade;
import Coupons.core.Facade.ClientFacade;
import Coupons.core.Facade.CompanyFacade;
import Coupons.core.Facade.CustomerFacade;

public class LoginManager {
	
	public ClientFacade login (String email,String password, ClientType clientType) {
		ClientFacade adminFacade = new AdminFacade();	
		ClientFacade customerFacade = new CustomerFacade();	
		ClientFacade companyFacade = new CompanyFacade();	
		if (clientType == ClientType.ADMINISTRATOR) {
			return adminFacade;
		}else if(clientType == ClientType.CUSTOMER) {
			return customerFacade;
		}else if (clientType == ClientType.COMPANY) {
			return companyFacade;
		}
		return null;
	}

}
