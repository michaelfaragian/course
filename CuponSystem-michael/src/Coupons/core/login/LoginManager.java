package Coupons.core.login;

import java.sql.SQLException;

import Coupons.core.DAO.ConnectionPool;
import Coupons.core.Facade.AdminFacade;
import Coupons.core.Facade.ClientFacade;
import Coupons.core.Facade.CompanyFacade;
import Coupons.core.Facade.CustomerFacade;
import Coupons.core.exception.CouponSystemException;

public class LoginManager {
	
	
	public LoginManager() {
		super();
	}
	
	private static LoginManager instance;
	
	public static LoginManager getInstance() throws CouponSystemException {
		return instance;
	}

	public ClientFacade login (String email,String password, ClientType clientType) throws CouponSystemException {
		AdminFacade adminFacade = new AdminFacade();	
		CustomerFacade customerFacade = new CustomerFacade();	
		CompanyFacade companyFacade = new CompanyFacade();	

		if (clientType == ClientType.ADMINISTRATOR) {	
			if (adminFacade.login(email, password)){
				return adminFacade;
			}
		}else if(clientType == ClientType.CUSTOMER) {
			if (customerFacade.login(email, password)) {
				return customerFacade;
			}
		}else if (clientType == ClientType.COMPANY) {
			if(companyFacade.login(email, password)) {
				return companyFacade;
			}
		}
		return null;
	}	
	}	
		