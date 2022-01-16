package Tests;

import Coupons.core.Facade.CompanyFacade;
import Coupons.core.beans.Coupon.Category;
import Coupons.core.exception.CouponSystemException;

public class TestCOMPANY {

	public static void main(String[] args) throws CouponSystemException {
		
		CompanyFacade companyFacade = new CompanyFacade("michael@", "123456");
//		System.out.println(companyFacade.getCompanyCoupons());
//		System.out.println(companyFacade.getCompanyCouponByCategory(Category.RESTAURANT));
//		System.out.println(companyFacade.getCompanyCouponsByMaxPrice(2));
		System.out.println(companyFacade.getCompanyDetailes());

	}

}
