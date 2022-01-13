package a;
import Coupons.core.Facade.AdminFacade;
import Coupons.core.beans.Company;
import Coupons.core.exception.CouponSystemException;

public class Test {



		
		
		public static void main(String[] args) throws CouponSystemException {
			System.out.println("======");
			AdminFacade adminFacade = new AdminFacade();
//			CompanyDAO c = new CompanyDBDAO();
//			CouponDAO a = new CouponDBDAO();
			System.out.println("=====");
			Company company = new Company(1, "mitgr", "msichah;e1@gmaihl", "123456");
//			Coupon coupon = new Coupon(0, 0, Category.ELECTRICITY, "vfv", "sdxq", LocalDate.of(2020, 9, 12) , LocalDate.of(2021, 5, 12), 10, 5, "xxwx");
			System.out.println(adminFacade.addCompany(company));
			
//			System.out.println(a.addCoupon(coupon));
//			adminFacade.updateCompany(company);
		
		}


	}



