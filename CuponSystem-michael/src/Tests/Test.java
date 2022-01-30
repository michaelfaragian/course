package Tests;

import java.time.LocalDate;
import java.util.List;

import Coupons.core.DAO.ConnectionPool;
import Coupons.core.Facade.AdminFacade;
import Coupons.core.Facade.CompanyFacade;
import Coupons.core.Facade.CustomerFacade;
import Coupons.core.beans.Company;
import Coupons.core.beans.Coupon;
import Coupons.core.beans.Coupon.Category;
import Coupons.core.beans.Customer;
import Coupons.core.dalyJob.CouponExpirationDalyJob;
import Coupons.core.exception.CouponSystemException;
import Coupons.core.login.ClientType;
import Coupons.core.login.LoginManager;

public class Test {

	Thread job = new Thread(new CouponExpirationDalyJob());

	public void testAll() {
		try {
			startProgram();
			adminTest();
			companyTest();
			customerTest();
		} catch (CouponSystemException e) {
			e.printStackTrace();
		} finally {
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
		System.out.println("\t \t >>> adminTest start <<< ");
		System.out.println("--------------------------------------------------");
		System.out.println();
		AdminFacade adminFacade = (AdminFacade) LoginManager.getInstance().login("admin@admin.com", "admin",
				ClientType.ADMINISTRATOR);
		Company company1 = new Company(0, "aaa", "aaa@", "aaa");
		Company company2 = new Company(0, "bbb", "bbb@", "bbb");
		Company company3 = new Company(0, "ccc", "ccc@", "ccc");
		adminFacade.addCompany(company1);
		System.out.println("company added: " + company1);
		adminFacade.addCompany(company2);
		System.out.println("company added: " + company2);
		adminFacade.addCompany(company3);
		System.out.println("company added: " + company3);
		System.out.println("---------------------------------------");
		System.out.println();
		adminFacade.deleteCompany(2);
		System.out.println("---------------------------------------");
		System.out.println();
		System.out.println("--- delete --- " + company2);
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		System.out.println(">>>> get all companies: ");
		System.out.println();
		List<Company> companies = adminFacade.getAllCompanies();
		for (Company company : companies) {
			System.out.println(company);
		}
		System.out.println("-------------------------------------");
		System.out.println();
		adminFacade.updateCompany(new Company(1, "aaa", "zzz@", "zzz"));
		System.out.println("update company 1 succeeded");
		System.out.println("---------------------------------------");
		System.out.println();
		System.out.println(">>>> get one company: ");
		System.out.println(adminFacade.getOneCompany(1));
		System.out.println();
		Customer customer1 = new Customer(0, "aaa", "aaa", "aaa@", "aaa");
		Customer customer2 = new Customer(0, "bbb", "bbb", "bbb@", "bbb");
		Customer customer3 = new Customer(0, "ccc", "ccc", "ccc@", "ccc");
		adminFacade.addCustomer(customer1);
		System.out.println("customer added: " + customer1);
		adminFacade.addCustomer(customer2);
		System.out.println("customer added: " + customer2);
		adminFacade.addCustomer(customer3);
		System.out.println("customer added: " + customer3);
		System.out.println();
		System.out.println();
		adminFacade.deleteCustomer(2);
		System.out.println("--- delete --- " + customer2);
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		System.out.println(">>>> get all customers: ");
		System.out.println();
		List<Customer> customers = adminFacade.getAllCustomers();
		for (Customer customer : customers) {
			System.out.println(customer);
		}
		System.out.println("---------------------------------");
		System.out.println();
		adminFacade.updateCustomer(new Customer(1, "zzz", "zzz", "zzz@zzz", "zzz"));
		System.out.println("update customer 1 succeeded");
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println(">>>> get one customer: ");
		System.out.println(adminFacade.getOneCustomer(1));
		System.out.println();
		System.out.println();
		System.out.println();

	}

	private void companyTest() throws CouponSystemException {
		System.out.println("\t \t >>> companyTest start <<<");
		System.out.println("--------------------------------------------------");
		System.out.println();
		CompanyFacade companyFacade = (CompanyFacade) LoginManager.getInstance().login("ccc@", "ccc",
				ClientType.COMPANY);
		System.out.print("company id: ");
		System.out.println(companyFacade.getCompanyID());
		System.out.println();
		System.out.println("----------------------------");
		System.out.println();
		System.out.println("company detailes:");
		System.out.println(companyFacade.getCompanyDetailes());
		System.out.println("-----------------------------");
		System.out.println();
		Coupon coupon1 = new Coupon(0, 3, Category.ELECTRICITY, "aaa", "aaa", LocalDate.of(2022, 1, 1),
				LocalDate.of(2023, 1, 1), 11, 111, "aaa");
		Coupon coupon2 = new Coupon(0, 3, Category.FOOD, "bbb", "bbb", LocalDate.of(2022, 1, 1),
				LocalDate.of(2023, 1, 1), 22, 222, "bbb");
		Coupon coupon3 = new Coupon(0, 3, Category.RESTAURANT, "ccc", "ccc", LocalDate.of(2022, 1, 1),
				LocalDate.of(2023, 1, 1), 33, 333, "ccc");
		Coupon coupon4 = new Coupon(0, 3, Category.VACATION, "ddd", "ddd", LocalDate.of(2022, 1, 1),
				LocalDate.of(2023, 1, 1), 44, 444, "ddd");
		Coupon coupon5 = new Coupon(0, 3, Category.VACATION, "eee", "eee", LocalDate.of(2022, 1, 1),
				LocalDate.of(2023, 1, 1), 55, 555, "eee");
		companyFacade.addCoupon(coupon1);
		companyFacade.addCoupon(coupon2);
		companyFacade.addCoupon(coupon3);
		companyFacade.addCoupon(coupon4);
		companyFacade.addCoupon(coupon5);
		System.out.println("coupon added: " + coupon1);
		System.out.println("--------------------------------");
		System.out.println();
		System.out.println("coupon added: " + coupon2);
		System.out.println("--------------------------------");
		System.out.println();
		System.out.println("coupon added: " + coupon3);
		System.out.println("--------------------------------");
		System.out.println();
		System.out.println("coupon added: " + coupon4);
		System.out.println("--------------------------------");
		System.out.println();
		System.out.println("coupon added: " + coupon5);
		System.out.println();
		System.out.println();
		companyFacade.deleteCoupon(5);
		System.out.println("------------------------------------");
		System.out.println("--- deleted --- " + coupon5);
		System.out.println("------------------------------------");
		System.out.println();
		System.out.println();
		companyFacade.updateCoupon(new Coupon(1, 3, Category.ELECTRICITY, "ZZZ", "ZZZ", LocalDate.of(2022, 1, 1),
				LocalDate.of(2023, 1, 1), 11, 111, "ZZZ"));
		System.out.println("update coupon 1 succeeded");
		System.out.println("--------------------------------------");
		System.out.println();
		System.out.println(">>>> all company coupons:");
		System.out.println();
		List<Coupon> coupons = companyFacade.getCompanyCoupons();
		for (Coupon coupon : coupons) {
			System.out.println(coupon);
			System.out.println("---------------------------------");
		}
		System.out.println();
		System.out.println(">>>> all company coupons by category VACATION :");
		System.out.println();
		List<Coupon> coupons2 = companyFacade.getCompanyCouponsByCategory(Category.VACATION);
		for (Coupon coupon : coupons2) {
			System.out.println(coupon);
			System.out.println("---------------------------------");
		}
		System.out.println();
		System.out.println(">>>> all company coupons by max price 400:");
		System.out.println();
		List<Coupon> coupons3 = companyFacade.getCompanyCouponsByMaxPrice(400);
		for (Coupon coupon : coupons3) {
			System.out.println(coupon);
			System.out.println("--------------------------------");
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}

	private void customerTest() throws CouponSystemException {
		System.out.println("\t \t >>> customerTest start <<<");
		System.out.println("--------------------------------------------------");
		System.out.println();
		CustomerFacade customerFacade = (CustomerFacade) LoginManager.getInstance().login("zzz@zzz", "zzz",
				ClientType.CUSTOMER);
		System.out.print("customer id: ");
		System.out.println(customerFacade.getCustomerID());
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		System.out.println("customer details: ");
		System.out.println(customerFacade.getCustomerDetails());
		System.out.println();
		Coupon coupon1 = new Coupon(2, 3, Category.FOOD, "bbb", "bbb", LocalDate.of(2022, 1, 1),
				LocalDate.of(2023, 1, 1), 22, 222, "bbb");
		Coupon coupon2 = new Coupon(3, 3, Category.RESTAURANT, "ccc", "ccc", LocalDate.of(2022, 1, 1),
				LocalDate.of(2023, 1, 1), 33, 333, "ccc");
		Coupon coupon3 = new Coupon(4, 3, Category.VACATION, "ddd", "ddd", LocalDate.of(2022, 1, 1),
				LocalDate.of(2023, 1, 1), 44, 444, "ddd");
		customerFacade.purchaseCoupon(coupon1);
		customerFacade.purchaseCoupon(coupon2);
		customerFacade.purchaseCoupon(coupon3);
		System.out.println("purchase coupon: " + coupon1);
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("purchase coupon: " + coupon2);
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("purchase coupon: " + coupon3);
		System.out.println();
		System.out.println("---------------------------------------");

		System.out.println(">>>>> customer coupons: ");
		System.out.println();
		List<Coupon> coupons = customerFacade.getCustomerCoupons();
		for (Coupon coupon : coupons) {
			System.out.println(coupon);
			System.out.println();
		}
		System.out.println("----------------------------------------");
		System.out.println(">>>>> customer coupon by category FOOD: ");
		System.out.println();
		List<Coupon> coupons2 = customerFacade.getCustomerCouponsByCategory(Category.FOOD);
		for (Coupon coupon : coupons2) {
			System.out.println(coupon);
			System.out.println();
			System.out.println("----------------------------------------");
		}
		System.out.println(">>>> customer coupon by max price 350 : ");
		System.out.println();
		List<Coupon> coupons3 = customerFacade.getCustomerCouponsByMaxPrice(350);
		for (Coupon coupon : coupons3) {
			System.out.println(coupon);
			System.out.println();
		}
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

	public void closeProgram() throws CouponSystemException {
		job.interrupt();
		ConnectionPool.getInstance().closeAllConnections();
		System.out.println("\t \t \t vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
		System.out.println("\t \t \t >>>>>>>>>>>> system stoped <<<<<<<<<<<<");
	}
}
