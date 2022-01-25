package Tests;

import java.time.LocalDate;

import Coupons.core.DAO.ConnectionPool;
import Coupons.core.Facade.AdminFacade;
import Coupons.core.Facade.CompanyFacade;
import Coupons.core.Facade.CustomerFacade;
import Coupons.core.beans.Company;
import Coupons.core.beans.Coupon;
import Coupons.core.beans.Coupon.Category;
import Coupons.core.dalyJob.CouponExpirationDalyJob;
import Coupons.core.beans.Customer;
import Coupons.core.exception.CouponSystemException;
import Coupons.core.login.ClientType;
import Coupons.core.login.LoginManager;

public class Test {
	
	Thread job = new Thread(new CouponExpirationDalyJob());
	
	public void testAll() {
		try {
			startProgram();
			System.out.println("\t system started");
//			adminTest();
//			System.out.println("\t adminTest start");
//			customerTest();
//			System.out.println("\t customerTest start");
//			companyTest();
//			System.out.println("\t companyTest start");
		} catch (CouponSystemException e) {
			e.printStackTrace();
		}finally {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				closeProgram();
			} catch (CouponSystemException e) {
				e.printStackTrace();
			}
	}
	}
	public void adminTest() throws CouponSystemException {
		AdminFacade adminFacade = (AdminFacade) LoginManager.getInstance().login("admin@admin.com", "admin", ClientType.ADMINISTRATOR);
		adminFacade.addCompany(new Company(0, "kola", "kola@", "123"));
		adminFacade.addCustomer(new Customer(0, "liraz", "liraz", "liraz@", "123"));
		adminFacade.deleteCompany(1);
		adminFacade.deleteCustomer(2);
		System.out.println(adminFacade.getAllCompanies()); 
		System.out.println(adminFacade.getAllCustomers()); 
		System.out.println(adminFacade.getOneCompany(2));
		System.out.println(adminFacade.getOneCustomer(3));	
		adminFacade.updateCompany(new Company(5, "michael", "faragian@", "123456789"));
		adminFacade.updateCustomer(new Customer(4, "michael", "faragian", "michael@fara", "123456789"));
		
	}
	
	private void customerTest() throws CouponSystemException {
		CustomerFacade customerFacade = (CustomerFacade) LoginManager.getInstance().login("faragian@", "123", ClientType.CUSTOMER);
		System.out.println(customerFacade.getCustomerID());
		System.out.println(customerFacade.getCustomerCoupons()); 
		System.out.println(customerFacade.getCustomerCouponsByCategory(Category.FOOD));
		System.out.println(customerFacade.getCustomerCouponsByMaxPrice(60));
		System.out.println(customerFacade.getCustomerDetails()); 
		customerFacade.purchaseCoupon(new Coupon(10, 4, Category.RESTAURANT, "bad", "bad", LocalDate.of(1999, 9, 12),LocalDate.of(2022, 1, 10), 10, 10, "bad"));
		
	}

	private void companyTest() throws CouponSystemException {
		CompanyFacade companyFacade = (CompanyFacade) LoginManager.getInstance().login("michael@", "123456",ClientType.COMPANY);
		System.out.println(companyFacade.getCompanyID());
		companyFacade.addCoupon(new Coupon(0, 7, Category.VACATION, "new", "new", LocalDate.of(2022, 1, 23), LocalDate.of(2030, 10, 10), 30, 30, "new"));
		companyFacade.deleteCoupon(7);
		System.out.println(companyFacade.getCompanyCoupons());
		System.out.println(companyFacade.getCompanyCouponsByCategory(Category.FOOD));
		System.out.println(companyFacade.getCompanyCouponsByMaxPrice(50));
		System.out.println(companyFacade.getCompanyDetailes()); 
		companyFacade.updateCoupon(new Coupon(6, 3, Category.FOOD, "m", "m", LocalDate.of(1999, 9, 12), LocalDate.of(2022, 1, 10), 1, 1, "m"));	
	}
	
	public void startProgram() throws CouponSystemException {
		job.start();
		ConnectionPool.getInstance();
	}
	public void closeProgram() throws CouponSystemException   {
		job.interrupt();	
		ConnectionPool.getInstance().closeAllConnections();
	}
}
