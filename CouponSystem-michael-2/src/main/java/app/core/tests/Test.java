package app.core.tests;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import app.core.entities.Company;
import app.core.entities.Customer;
import app.core.exception.CouponSystemException;
import app.core.login.ClientType;
import app.core.login.LoginManager;
import app.core.services.AdminService;

@Component
public class Test {

	@Autowired
	LoginManager loginManager;

	@PostConstruct
	public void testAll() throws CouponSystemException {
		testAdminService();
		

	}

	private void testAdminService() throws CouponSystemException {
		AdminService adminService = (AdminService) loginManager.login("admin@admin.com", "admin",
				ClientType.ADMINISTRATOR);
		Company company1 = new Company(0, "aaa", "aaa@", "aaa", null);
		Company company2 = new Company(0, "bbb", "bbb@", "bbb", null);
		Company company3 = new Company(0, "ccc", "ccc@", "ccc", null);
		System.out.println(">>>>>> company added: " + adminService.addCompany(company1));
		System.out.println(company1);
		System.out.println("==================================================");
		System.out.println(">>>>>> company added: " + adminService.addCompany(company2));
		System.out.println(company2);
		System.out.println("==================================================");
		System.out.println(">>>>>> company added: " + adminService.addCompany(company3));
		System.out.println(company3);
		System.out.println("==================================================");
		adminService.deleteCompany(2);
		System.out.println(">>>>> company 2 deleted");
		List<Company> companies = adminService.getAllCompanies();
		System.out.println(">>>>>> all companies:");
		for (Company company : companies) {
			System.out.println(">>" + company);
		}
		System.out.println("==================================================");
		Company company = new Company(3, "ccc", "zzz", "zzz", null);
		adminService.updateCompany(company);
		System.out.println(">>>>>> company " + company.getId() + " update");
		System.out.println("==================================================");
		System.out.println(">>>>>> get one company: " + adminService.getOneCompany(3));
		System.out.println("==================================================");

		Customer customer1 = new Customer(0, "aaa", "aaa", "aaa@", "aaa", null);
		Customer customer2 = new Customer(0, "bbb", "bbb", "bbb@", "bbb", null);
		Customer customer3 = new Customer(0, "ccc", "ccc", "ccc@", "ccc", null);
		System.out.println(">>>>>> customer added: " + adminService.addCustomer(customer1));
		System.out.println("==================================================");
		System.out.println(">>>>>> customer added: " + adminService.addCustomer(customer2));
		System.out.println("==================================================");
		System.out.println(">>>>>> customer added: " + adminService.addCustomer(customer3));
		System.out.println("==================================================");
		adminService.deleteCustomer(2);
		System.out.println(">>>>> customer 2 deleted");
		System.out.println("==================================================");
		List<Customer> customers = adminService.getAllCustomers();
		System.out.println(">>>>>> all customers:");
		for (Customer customer : customers) {
			System.out.println(">>" + customer);
		}
		System.out.println("==================================================");
		Customer customer = new Customer(3, "zzz", "zzz", "zzz", "zzz", null);
		adminService.updateCustomer(customer);
		System.out.println(">>>>> customer " + customer.getId() + " update");
		System.out.println("==================================================");
		System.out.println(">>>>> get one customer: " + adminService.getOneCustomer(3));
		System.out.println("==================================================");
	}

}
