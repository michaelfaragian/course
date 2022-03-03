package app.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.Company;
import app.core.entities.Customer;
import app.core.exception.CouponSystemException;
import app.core.jwt.util.JwtUtil;
import app.core.login.ClientType;
import app.core.services.AdminService;

@CrossOrigin
@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired 
	AdminService adminService;
	@Autowired
	JwtUtil jwtUtil;

	@PostMapping("/add-company")
	public int addCompany(@RequestBody Company company ,@RequestHeader String token) {
		try {
			int id = adminService.addCompany(company);
			return id;
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@PutMapping("/update-company")
	public int updateCompany(@RequestBody Company company ,@RequestHeader String token) {
		try {
			int id = adminService.updateCompany(company);
			return id;
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}

	}

	@DeleteMapping("/company/{companyId}")
	public void deleteCompany(@PathVariable int companyId,@RequestHeader String token)  {
		try {
			 adminService.deleteCompany(companyId);
//			return companyId;
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}

	}

	@GetMapping("/get-all-companies")
	public List<Company> getAllCompanies(@RequestHeader String token) {
		try {
			List<Company> companies = adminService.getAllCompanies();
			return(companies);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping("/company/{companyId}")
	public Company getOneCompany(@PathVariable int companyId ,@RequestHeader String token) {
		try {
			Company company = adminService.getOneCompany(companyId);
			return(company);
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	@PostMapping("/customer/add-customer")
	public int addCustomer(@RequestBody Customer customer ,@RequestHeader String token){
		try {
			int id = adminService.addCustomer(customer);
			return id;
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	@PutMapping("update-customer")
	public int updateCustomer(@RequestBody Customer customer ,@RequestHeader String token){
		try {
			 int id = adminService.updateCustomer(customer);
			 return id;
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	@DeleteMapping("/customer/{customerId}")
	public int deleteCustomer(@PathVariable int customerId ,@RequestHeader String token){
		try {
			int id = adminService.deleteCustomer(customerId);
			return id;
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	@GetMapping("/get-all-customers")
	public List<Customer> getAllCustomers(@RequestHeader String token) {
		try {
			List<Customer> customers = adminService.getAllCustomers();
			return customers;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	@GetMapping("/customer/{customerId}")
	public Customer getOneCustomer(@PathVariable int customerId ,@RequestHeader String token) {
		try {
			Customer customer = adminService.getOneCustomer(customerId);
			return customer;
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

}
