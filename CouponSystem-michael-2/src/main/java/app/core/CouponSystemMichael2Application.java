package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import app.core.exception.CouponSystemException;

@EnableScheduling
@SpringBootApplication
public class CouponSystemMichael2Application { 

	public static void main(String[] args) throws CouponSystemException {
	ApplicationContext ctx = SpringApplication.run(CouponSystemMichael2Application.class, args);
//	Test test = ctx.getBean(Test.class);
//	test.z();
//	Test test= ctx.getBean(Test.class);
//	test.getClass();
	
//	Test test =ctx.getBean(Test.class);
//		AdminService adminService = ctx.getBean(AdminService.class);
//		CompanyService companyService = ctx.getBean(CompanyService.class);
//		CustomerService customerService = ctx.getBean(CustomerService.class);
		
//		Company company = new Company(1, "aaa", "aaa", "aaa", null);
//		Customer customer = new Customer(0, "bbb", "bbb", "bbb", "bbb", null);
		////////////////// admin
//		System.out.println(adminService.login("admin@admin.com", "admin")); 
//		adminService.addCompany(company);
//		System.out.println(adminService.updateCompany(company)); 
//		adminService.deleteCompany(3);
//		System.out.println(adminService.getAllCompanies()); 
//		System.out.println(adminService.getOneCompany(1));
//		System.out.println(adminService.addCustomer(customer));
//		System.out.println(adminService.updateCustomer(customer));
//		adminService.deleteCustomer(4);
//		System.out.println(adminService.getAllCustomers());
//		System.out.println(adminService.getOneCustomer(2));
		/////////////// company
//		LoginManager loginManager = ctx.getBean(LoginManager.class);
//		System.out.println(loginManager.login("aaa", "aaa", ClientType.COMPANY));
//		Coupon coupon = new Coupon(0, Category.RESTAURANT, "zzz", "zzz", LocalDate.of(2020, 1, 1), LocalDate.of(2022, 1, 1), 10, 10, "zzz", companyService.findCompanyById(1), null);
//		System.out.println(companyService.login("aaa", "aaa"));
//		System.out.println(companyService.addCoupon(coupon)); 
//		System.out.println(companyService.updateCoupon(coupon));
//		companyService.deleteCoupon(10);
//		System.out.println(companyService.getAllCompanyCoupons());
//		System.out.println(companyService.getCompanyCouponsByCategory(Category.FOOD));
//		System.out.println(companyService.getCompanyCouponsByMaxPrice(101));
//		System.out.println(companyService.getCompanyDetailes());
		////////////////////////// customer
//		System.out.println(customerService.login("aaa", "aaa"));
//		customerService.purchaseCoupon(4);
//		System.out.println(customerService.getAllCustomerCoupon());
//		System.out.println(customerService.getCustomerCouponByCategory(Category.FOOD));
//		System.out.println(customerService.getCustomerCouponByMaxPrice(101));
//		System.out.println(customerService.getCustomerDetails());
//		AdminService adminService= (AdminService) loginManager.login("admin@admin.com", "admin", ClientType.ADMINISTRATOR);
//		AdminService adminService = null;
//		System.out.println(adminService.getOneCompany(1));
//		System.out.println(loginManager.login("aaa", "aaa", ClientType.CUSTOMER));
		
		
		
		
		
		
	}

}
