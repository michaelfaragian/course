package a;

import Coupons.core.Facade.CompanyFacade;
import Coupons.core.exception.CouponSystemException;

public class Test2 {

	public static void main(String[] args) throws CouponSystemException {
		
		CompanyFacade companyFacade = new CompanyFacade("msichlah;e1@gmaihl", "123456");
		System.out.println(companyFacade.getAllCompanyCoupons());

	}

}
