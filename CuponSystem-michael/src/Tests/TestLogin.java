package Tests;

import Coupons.core.exception.CouponSystemException;
import Coupons.core.login.ClientType;
import Coupons.core.login.LoginManager;

public class TestLogin {

	public static void main(String[] args) throws CouponSystemException {

		LoginManager loginManager = new LoginManager();
		System.out.println(loginManager.login("mich@", "123", ClientType.COMPANY));
		
		
	}

}
