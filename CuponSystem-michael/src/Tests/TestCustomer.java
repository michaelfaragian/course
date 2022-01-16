package Tests;

import Coupons.core.DAO.CustomerDAO;
import Coupons.core.DBDAO.CustomerDBDAO;
import Coupons.core.Facade.CustomerFacade;
import Coupons.core.exception.CouponSystemException;

public class TestCustomer {

	public static void main(String[] args) throws CouponSystemException {
		CustomerFacade customerFacade = new CustomerFacade();
		System.out.println(customerFacade.login("michael@", "123"));

	}

}
