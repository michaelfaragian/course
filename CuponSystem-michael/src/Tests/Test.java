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
			adminTest();
			customerTest();
			companyTest();
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
		System.out.println("\t \t adminTest start");
		System.out.println("--------------------------------------------------");
		System.out.println();
		AdminFacade adminFacade = (AdminFacade) LoginManager.getInstance().login("admin@admin.com", "admin", ClientType.ADMINISTRATOR);
//		adminFacade.addCompany(new Company(0, "zara", "zara@", "123"));
//		System.out.println("add company succeeded");
//		adminFacade.addCustomer(new Customer(0, "maya", "maya", "maya@", "123"));
//		System.out.println("add customer succeeded");
//		adminFacade.deleteCompany(2);
//		System.out.println("delete company succeeded");
//		adminFacade.deleteCustomer(4);
//		System.out.println("delete customer succeeded");
		System.out.println("all companies: ");
		System.out.println(adminFacade.getAllCompanies()); 
		System.out.println("all customers: ");
		System.out.println(adminFacade.getAllCustomers()); 
		System.out.println("one company: ");
		System.out.println(adminFacade.getOneCompany(6));
		System.out.println("one customer: ");
		System.out.println(adminFacade.getOneCustomer(3));	
//		adminFacade.updateCompany(new Company(4, "michal", "pull@", "pull"));
//		System.out.println("update company succeeded");
//		adminFacade.updateCustomer(new Customer(5, "liraz", "faragian", "liraz@faragian", "liraz"));
//		System.out.println("update customer succeeded");
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	
	private void customerTest() throws CouponSystemException {
		System.out.println("\t \t customerTest start");
		System.out.println("--------------------------------------------------");
		System.out.println();
		CustomerFacade customerFacade = (CustomerFacade) LoginManager.getInstance().login("faragian@", "123", ClientType.CUSTOMER);
		System.out.print("customer id: ");
		System.out.println(customerFacade.getCustomerID());
		System.out.println("customer coupons: ");
		System.out.println(customerFacade.getCustomerCoupons()); 
		System.out.println("customer coupon by category: ");
		System.out.println(customerFacade.getCustomerCouponsByCategory(Category.FOOD));
		System.out.println("customer coupon by max price: ");
		System.out.println(customerFacade.getCustomerCouponsByMaxPrice(60));
		System.out.println("customer details: ");
		System.out.println(customerFacade.getCustomerDetails()); 
//		customerFacade.purchaseCoupon(new Coupon(18, 6, Category.VACATION, "new", "new", LocalDate.of(2022, 1, 23),LocalDate.of(2030, 10, 10), 30, 30, "new"));
//		System.out.println("purchase coupon succeeded ");
		System.out.println();
		System.out.println();
		System.out.println();
		
	}

	private void companyTest() throws CouponSystemException {
		System.out.println("\t \t companyTest start");
		System.out.println("--------------------------------------------------");
		System.out.println();
		CompanyFacade companyFacade = (CompanyFacade) LoginManager.getInstance().login("michael@", "123456",ClientType.COMPANY);
		System.out.print("company id: ");
		System.out.println(companyFacade.getCompanyID());
//		companyFacade.addCoupon(new Coupon(0, 3, Category.ELECTRICITY, "zzz", "zzz", LocalDate.of(2022, 1, 23), LocalDate.of(2030, 10, 10), 30, 30, "zzz"));
		System.out.println("coupon added to company");
//		companyFacade.deleteCoupon(40);
		System.out.println("coupon deleted");
		System.out.println("all company coupons:");
		System.out.println(companyFacade.getCompanyCoupons());
		System.out.println("all company coupons by category:");
		System.out.println(companyFacade.getCompanyCouponsByCategory(Category.VACATION));
		System.out.println("all company coupons by max price:");
		System.out.println(companyFacade.getCompanyCouponsByMaxPrice(50));
		System.out.println("company detailes:");
		System.out.println(companyFacade.getCompanyDetailes()); 
		companyFacade.updateCoupon(new Coupon(20, 3, Category.VACATION, "very", "very", LocalDate.of(2022, 1, 23), LocalDate.of(2030, 10, 10), 30, 30, "very"));	
		System.out.println("update coupon succeeded");
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public void startProgram() throws CouponSystemException {
		job.start();
		ConnectionPool.getInstance();
		System.out.println();
		System.out.println("\t \t \t vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
		System.out.println("\t \t \t >>>>>>>>>> system started <<<<<<<<<<");
		System.out.println("\t \t \t ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println();
		System.out.println();
		System.out.println();
	}
	public void closeProgram() throws CouponSystemException   {
		job.interrupt();	
		ConnectionPool.getInstance().closeAllConnections();
		System.out.println("\t \t \t vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
		System.out.println("\t \t \t >>>>>>>>>>>> system stoped <<<<<<<<<<<<");
	}
}
