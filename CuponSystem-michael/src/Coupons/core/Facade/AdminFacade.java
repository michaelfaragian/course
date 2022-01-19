package Coupons.core.Facade;

import java.util.List;

import Coupons.core.beans.Company;
import Coupons.core.beans.Customer;
import Coupons.core.exception.CouponSystemException;

public class AdminFacade extends ClientFacade {
	
	
	public AdminFacade() {
		super();
	}

	@Override
	public Boolean login(String email, String password) throws CouponSystemException {
		return email.equals("admin@admin.com") && password.equals("admin");
	}
	
	public int addCompany(Company company) throws CouponSystemException{
		if(companyDAO.isCompanyExistsByNameOrEmail(company.getName(), company.getEmail())) {
			throw new CouponSystemException("company with this name or email exist") ;
		}else {
			return companyDAO.addCompany(company);
		}
	}
	
	public void updateCompany (Company company) throws CouponSystemException{
		if (companyDAO.isCompanyExistsByIdOrName(company.getId(), company.getName())) {
			companyDAO.updateCompanyWithoutName(company);
		}else {
			throw new CouponSystemException("this company not exist");
		}
	}
	
	public void deleteCompany (int companyID) throws CouponSystemException{
		if (companyDAO.isCompanyExistsById(companyID)) {
			couponDAO.deleteCouponPurchaseWithCompanyID(companyID);
			couponDAO.deleteCouponWithCompanyID(companyID);
			companyDAO.deleteCompany(companyID);
		}else {
			throw new CouponSystemException("delete company failed");
		}
	}
	public List<Company> getAllCompanies() throws CouponSystemException{
		return companyDAO.getAllCompanies();
	}
	
	public Company getOneCompany (int companyID) throws CouponSystemException{
		return companyDAO.getOneCompany(companyID);
	}
	
	public void addCustomer (Customer customer) throws CouponSystemException{
		if ( customerDAO.isCustomerExistsByEmail(customer)) {
			throw new CouponSystemException("customer with email " +customer.getEmail() + "already exists");
		}else {
			customerDAO.addCustomer(customer);
		}
	}
	public void updateCustomer (Customer customer) throws CouponSystemException{
		customerDAO.updateCustomer(customer);
	}
	public void deleteCustomer(Customer customer) throws CouponSystemException{
		couponDAO.deleteCouponPurchaseWithCustomerID(customer.getId());
		customerDAO.deleteCustomer(customer.getId());
	}
	
	public List<Customer> getAllCustomers() throws CouponSystemException{
		return customerDAO.getAllCustomers();
	}
	
	public Customer getOneCustomer (int customerID) throws CouponSystemException {
		return customerDAO.getOneCustomer(customerID);
		
	}
	

}
