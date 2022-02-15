package app.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.Company;
import app.core.entities.Customer;
import app.core.exception.CouponSystemException;
import app.core.services.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;

	@PostMapping("/add-company")
	public String addCompany(@RequestBody Company company) {
		try {
			int id = adminService.addCompany(company);
			return "company "+id+" added" ;
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@PutMapping("/update-company")
	public String updateCompany(@RequestBody Company company) {
		try {
			int id = adminService.updateCompany(company);
			return "company "+id+"updated";
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}

	}

	@DeleteMapping("/company/{companyId}")
	public String deleteCompany(@PathVariable int companyId)  {
		try {
			 adminService.deleteCompany(companyId);
			return "company "+companyId+" deleted";
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}

	}

	@GetMapping("/get-all-companies")
	public List<Company> getAllCompanies() {
		try {
			List<Company> companies = adminService.getAllCompanies();
			return(companies);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping("/company/{companyId}")
	public Company getOneCompany(@PathVariable int companyId) {
		try {
			Company company = adminService.getOneCompany(companyId);
			return(company);
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	@PostMapping("/customer/add-customer")
	public String addCustomer(@RequestBody Customer customer){
		try {
			int id = adminService.addCustomer(customer);
			return "customer "+id+" added";
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	@PutMapping("update-customer")
	public String updateCustomer(@RequestBody Customer customer){
		try {
			 int id = adminService.updateCustomer(customer);
			 return "customer "+id+" updated";
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	@DeleteMapping("/customer/{customerId}")
	public String deleteCustomer(@PathVariable int customerId){
		try {
			int id = adminService.deleteCustomer(customerId);
			return "customer "+ id+ " deleted";
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	@GetMapping("/get-all-customers")
	public List<Customer> getAllCustomers() {
		try {
			List<Customer> customers = adminService.getAllCustomers();
			return customers;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	@GetMapping("/customer/{customerId}")
	public Customer getOneCustomer(@PathVariable int customerId) {
		try {
			Customer customer = adminService.getOneCustomer(customerId);
			return customer;
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

}
