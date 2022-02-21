package app.core.services;

import org.springframework.beans.factory.annotation.Autowired;

import app.core.repositories.CompanyRepo;
import app.core.repositories.CouponRepo;
import app.core.repositories.CustomerRepo;

public abstract class ClientService {

	@Autowired
	protected CompanyRepo companyRepo;
	@Autowired
	protected CouponRepo couponRepo;
	@Autowired
	protected CustomerRepo customerRepo;

	public abstract Boolean login(String email, String password);

}
