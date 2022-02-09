package app.core.tests;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.core.entities.Company;
import app.core.entities.Coupon;
import app.core.entities.Coupon.Category;
import app.core.entities.Customer;
import app.core.exception.CouponSystemException;
import app.core.login.ClientType;
import app.core.login.LoginManager;
import app.core.services.AdminService;
import app.core.services.CompanyService;
import app.core.services.CustomerService;

@Component
public class Test {

	@Autowired
	LoginManager loginManager;

	@PostConstruct
	public void testAll() throws CouponSystemException {
		testAdminService();
		testCompanyService();
		testCustomerService();

	}

	private void testAdminService() throws CouponSystemException {
//		AdminService adminService = (AdminService) loginManager.login("admin@admin.com", "admin",
//				ClientType.ADMINISTRATOR);
//		Company company1 = new Company(0, "aaa", "aaa@", "aaa", null);
//		Company company2 = new Company(0, "bbb", "bbb@", "bbb", null);
//		Company company3 = new Company(0, "ccc", "ccc@", "ccc", null);
//		System.out.println(">>>>>> company added: " + adminService.addCompany(company1));
//		System.out.println(company1);
//		System.out.println("==================================================");
//		System.out.println(">>>>>> company added: " + adminService.addCompany(company2));
//		System.out.println(company2);
//		System.out.println("==================================================");
//		System.out.println(">>>>>> company added: " + adminService.addCompany(company3));
//		System.out.println(company3);
//		System.out.println("==================================================");
//		adminService.deleteCompany(2);
//		System.out.println(">>>>> company 2 deleted");
//		List<Company> companies = adminService.getAllCompanies();
//		System.out.println(">>>>>> all companies:");
//		for (Company company : companies) {
//			System.out.println(">>" + company);
//		}
//		System.out.println("==================================================");
//		Company company = new Company(3, "ccc", "zzz", "zzz", null);
//		adminService.updateCompany(company);
//		System.out.println(">>>>>> company " + company.getId() + " update");
//		System.out.println("==================================================");
//		System.out.println(">>>>>> get one company: " + adminService.getOneCompany(3));
//		System.out.println("==================================================");
//
//		Customer customer1 = new Customer(0, "aaa", "aaa", "aaa@", "aaa", null);
//		Customer customer2 = new Customer(0, "bbb", "bbb", "bbb@", "bbb", null);
//		Customer customer3 = new Customer(0, "ccc", "ccc", "ccc@", "ccc", null);
//		System.out.println(">>>>>> customer added: " + adminService.addCustomer(customer1));
//		System.out.println("==================================================");
//		System.out.println(">>>>>> customer added: " + adminService.addCustomer(customer2));
//		System.out.println("==================================================");
//		System.out.println(">>>>>> customer added: " + adminService.addCustomer(customer3));
//		System.out.println("==================================================");
//		adminService.deleteCustomer(2);
//		System.out.println(">>>>> customer 2 deleted");
//		System.out.println("==================================================");
//		List<Customer> customers = adminService.getAllCustomers();
//		System.out.println(">>>>>> all customers:");
//		for (Customer customer : customers) {
//			System.out.println(">>" + customer);
//		}
//		System.out.println("==================================================");
//		Customer customer = new Customer(3, "zzz", "zzz", "zzz", "zzz", null);
//		adminService.updateCustomer(customer);
//		System.out.println(">>>>> customer " + customer.getId() + " update");
//		System.out.println("==================================================");
//		System.out.println(">>>>> get one customer: " + adminService.getOneCustomer(3));
//		System.out.println("==================================================");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("\t \t >>> adminTest start <<< ");
		System.out.println("--------------------------------------------------");
		System.out.println();
		AdminService adminService = (AdminService) loginManager.login("admin@admin.com", "admin", ClientType.ADMINISTRATOR);
		Company company1 = new Company(0, "aaa", "aaa@", "aaa", null);
		Company company2 = new Company(0, "bbb", "bbb@", "bbb",null);
		Company company3 = new Company(0, "ccc", "ccc@", "ccc",null);
		adminService.addCompany(company1);
		System.out.println("company added: " + company1);
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		adminService.addCompany(company2);
		System.out.println("company added: " + company2);
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		adminService.addCompany(company3);
		System.out.println("company added: " + company3);
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		adminService.deleteCompany(2);
		System.out.println("---------------------------------------");
		System.out.println();
		System.out.println("--- delete --- " + company2);
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		System.out.println(">>>> get all companies: ");
		System.out.println();
		List<Company> companies = adminService.getAllCompanies();
		for (Company company : companies) {
			System.out.println(company);
		}
		System.out.println("-------------------------------------");
		System.out.println();
		adminService.updateCompany(new Company(1, "aaa", "zzz@", "zzz",null));
		System.out.println("update company 1 succeeded");
		System.out.println("---------------------------------------");
		System.out.println();
		System.out.println(">>>> get one company: ");
		System.out.println(adminService.getOneCompany(1));
		System.out.println();
		Customer customer1 = new Customer(0, "aaa", "aaa", "aaa@", "aaa",null);
		Customer customer2 = new Customer(0, "bbb", "bbb", "bbb@", "bbb",null);
		Customer customer3 = new Customer(0, "ccc", "ccc", "ccc@", "ccc",null);
		adminService.addCustomer(customer1);
		System.out.println("customer added: " + customer1);
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		adminService.addCustomer(customer2);
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		System.out.println("customer added: " + customer2);
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		adminService.addCustomer(customer3);
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		System.out.println("customer added: " + customer3);
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		adminService.deleteCustomer(2);
		System.out.println("--- delete --- " + customer2);
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		System.out.println(">>>> get all customers: ");
		System.out.println();
		List<Customer> customers = adminService.getAllCustomers();
		for (Customer customer : customers) {
			System.out.println(customer);
		}
		System.out.println("---------------------------------");
		System.out.println();
		adminService.updateCustomer(new Customer(1, "zzz", "zzz", "zzz@zzz", "zzz",null));
		System.out.println("update customer 1 succeeded");
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println(">>>> get one customer: ");
		System.out.println(adminService.getOneCustomer(1));
		System.out.println();
		System.out.println();
		System.out.println();

	}

	private void testCompanyService() throws CouponSystemException {
		System.out.println("\t \t >>> companyTest start <<<");
		System.out.println("--------------------------------------------------");
		System.out.println();
		System.out.println(1);
		CompanyService companyService = (CompanyService) loginManager.login("zzz@", "zzz", ClientType.COMPANY);
		System.out.println(2);
		System.out.print("company id: ");
		System.out.println(3);
		System.out.println(companyService.getCompanyId());
		System.out.println(4);
		System.out.println();
		System.out.println("----------------------------");
		System.out.println();
		System.out.println("company detailes:");
		System.out.println(companyService.getCompanyDetailes());
		System.out.println("-----------------------------");
		System.out.println();
		Coupon coupon1 = new Coupon(0, Category.ELECTRICITY, "aaa", "aaa", LocalDate.of(2022, 2, 9),
				LocalDate.of(2023, 2, 9),11, 111, "aaa", companyService.findCompanyById(1), null);
		
		Coupon coupon2 = new Coupon(0, Category.FOOD, "bbb", "bbb", LocalDate.of(2022, 2, 9),
				LocalDate.of(2023, 2, 9),22, 222, "bbb", companyService.findCompanyById(1), null);
		
		Coupon coupon3 = new Coupon(0, Category.RESTAURANT, "ccc", "ccc", LocalDate.of(2022, 2, 9),
				LocalDate.of(2023, 2, 9),33, 333, "ccc", companyService.findCompanyById(1), null);
		
		Coupon coupon4 = new Coupon(0, Category.VACATION, "ddd", "ddd", LocalDate.of(2022, 2, 9),
				LocalDate.of(2023, 2, 9),44, 444, "ddd", companyService.findCompanyById(1), null);
				
		
		companyService.addCoupon(coupon1);
		companyService.addCoupon(coupon2);
		companyService.addCoupon(coupon3);
		companyService.addCoupon(coupon4);
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
		System.out.println();
		System.out.println();
		companyService.deleteCoupon(4);
		System.out.println("------------------------------------");
		System.out.println("--- deleted --- " + coupon4);
		System.out.println("------------------------------------");
		System.out.println();
		System.out.println();
		companyService.updateCoupon(new Coupon(1, Category.FOOD, "zzz", "zzz", LocalDate.of(2022, 2, 9),
				LocalDate.of(2023, 2, 9),99, 999, "zzz", companyService.findCompanyById(1), null));
		System.out.println("update coupon 1 succeeded");
		System.out.println("--------------------------------------");
		System.out.println();
		System.out.println(">>>> all company coupons:");
		System.out.println();
		List<Coupon> coupons = companyService.getAllCompanyCoupons();
		for (Coupon coupon : coupons) {
			System.out.println(coupon);
			System.out.println("---------------------------------");
		}
		System.out.println();
		System.out.println(">>>> all company coupons by category FOOD :");
		System.out.println();
		List<Coupon> coupons2 = companyService.getCompanyCouponsByCategory(Category.FOOD);
		for (Coupon coupon : coupons2) {
			System.out.println(coupon);
			System.out.println("---------------------------------");
		}
		System.out.println();
		System.out.println(">>>> all company coupons by max price 400:");
		System.out.println();
		List<Coupon> coupons3 = companyService.getCompanyCouponsByMaxPrice(400);
		for (Coupon coupon : coupons3) {
			System.out.println(coupon);
			System.out.println("--------------------------------");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
	}

	
	
	
	
	private void testCustomerService() throws CouponSystemException {
		System.out.println("\t \t >>> customerTest start <<<");
		System.out.println("--------------------------------------------------");
		System.out.println();
		CustomerService customerService = (CustomerService) loginManager.login("zzz@zzz", "zzz", ClientType.CUSTOMER);
		System.out.print("customer id: ");
		System.out.println(customerService.getCustomerId());
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		System.out.println("customer details: ");
		System.out.println(customerService.getCustomerDetails());
		System.out.println();				
		System.out.println("---------------------------------------");
		System.out.println();				
		customerService.purchaseCoupon(1);
		customerService.purchaseCoupon(2);
		customerService.purchaseCoupon(3);
		System.out.println("purchase coupon: " + 1);
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("purchase coupon: " + 2);
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("purchase coupon: " + 3);
		System.out.println();
		System.out.println("---------------------------------------");

		System.out.println(">>>>> customer coupons: ");
		System.out.println();
		List<Coupon> coupons = customerService.getAllCustomerCoupon();
		for (Coupon coupon : coupons) {
			System.out.println(coupon);
			System.out.println();
		}
		System.out.println("----------------------------------------");
		System.out.println(">>>>> customer coupon by category FOOD: ");
		System.out.println();
		List<Coupon> coupons2 = customerService.getCustomerCouponByCategory(Category.FOOD);
		for (Coupon coupon : coupons2) {
			System.out.println(coupon);
			System.out.println();
			System.out.println("----------------------------------------");
		}
		System.out.println(">>>> customer coupon by max price 350 : ");
		System.out.println();
		List<Coupon> coupons3 = customerService.getCustomerCouponByMaxPrice(350);
		for (Coupon coupon : coupons3) {
			System.out.println(coupon);
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();

	}

}
