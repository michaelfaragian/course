package app.core.tests;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import app.core.entities.Company;
import app.core.exception.CouponSystemException;
import app.core.login.ClientType;
import app.core.login.LoginManager;
import app.core.services.AdminService;


@Component
public class Test {
	
	@Autowired
	LoginManager loginManager;
	
	@PostConstruct
	public void z() throws CouponSystemException {
	AdminService adminService = (AdminService)loginManager.login("admin@admin.com", "admin", ClientType.ADMINISTRATOR);
	Company company1 = new Company(0, "aaa", "aaa", "aaa", null);
	Company company2 = new Company(0, "bbb", "bbb", "bbb", null);
	Company company3 = new Company(0, "ccc", "ccc", "ccc", null);
	adminService.addCompany(company1);
	adminService.addCompany(company2);
	adminService.addCompany(company3);
	}
	
	
	
}
