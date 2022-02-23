package app.core.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Company;
import app.core.entities.Customer;
import app.core.exception.CouponSystemException;

@Transactional
@Service
public class AdminService extends ClientService {

	@Override
	public Boolean login(String email, String password ,int id) {
		return email.equals("admin@admin.com") && password.equals("admin");
	}
	
	public int addCompany(Company company) throws CouponSystemException {
		if(companyRepo.existsByNameOrEmail(company.getName(), company.getEmail())) {
			throw new CouponSystemException("addCompany failed - already exist company with name: " + company.getName()+" or by email: "+ company.getEmail());
		}else {
			companyRepo.save(company);
			Company companyFromDb  = companyRepo.findCompanyByEmailAndPassword(company.getEmail(), company.getPassword());
			return companyFromDb.getId();			
		}
	}
	
	public int updateCompany(Company company) throws CouponSystemException {
		if(companyRepo.existsById(company.getId()) && companyRepo.existsByNameOrEmail(company.getName(), null)) {
			companyRepo.save(company);
			return company.getId();
		}else {
			throw new CouponSystemException("updateCompany failed - you cannot update the id or the name of company");
		}
	}
	
	public void deleteCompany (int companyId) throws CouponSystemException {
		try {
			companyRepo.deleteById(companyId);			
		}catch (Exception e) {
			throw new CouponSystemException("deleteCompany failed");
		}
		
	}
	public List<Company> getAllCompanies(){
		List<Company> companies= companyRepo.findAll();
		if(companies.isEmpty()) {
			System.out.println("not exist any company");
		}
		return companies;
		
		
	}
	public Company getOneCompany(int companyId) throws CouponSystemException {
		Optional<Company> opt = companyRepo.findById(companyId);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new CouponSystemException("getOneCompany failed - company with id " + companyId + " not found");
		}
	}
	public int addCustomer(Customer customer) throws CouponSystemException {
		if(customerRepo.existsByEmail(customer.getEmail())) {
			throw new CouponSystemException("addCustomer failed - customer with Email " + customer.getEmail()+" already exist");
		}else {
			customerRepo.save(customer);
			Customer customer2 = customerRepo.findByEmailAndPassword(customer.getEmail(), customer.getPassword());
			return customer2.getId();
		}
	}
	public int updateCustomer(Customer customer) throws CouponSystemException {
		Optional<Customer> opt = customerRepo.findById(customer.getId());
		if(opt.isPresent()) {
			customerRepo.save(customer);
			return customer.getId();
		}else {
			throw new CouponSystemException("updateCustomer failed - customer with id " + customer.getId()+ " not exist");
		}
	}
	public int deleteCustomer(int customerId) throws CouponSystemException {
		Optional<Customer> opt = customerRepo.findById(customerId);
		if(opt.isPresent()) {
			customerRepo.deleteById(customerId);
			return customerId;			
		}else {
			throw new CouponSystemException("deleteCustomer failed - customer " + customerId+" not exist");
		}
	}
	public List<Customer> getAllCustomers(){
		List<Customer> customers = customerRepo.findAll();
		if(customers.isEmpty()) {
			System.out.println("not exist any customer");
		}
		return customers;
	}
	public Customer getOneCustomer(int customerId) throws CouponSystemException {
		Optional<Customer> opt = customerRepo.findById(customerId);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new CouponSystemException("getOneCustomer failed customer with Id " + customerId+ " not exist");
		}
	}
	public void deleteExpiredCouponsByEndDate() {
		couponRepo.deleteByEndDateBefore(LocalDate.now());
	}
	
	
	

}
