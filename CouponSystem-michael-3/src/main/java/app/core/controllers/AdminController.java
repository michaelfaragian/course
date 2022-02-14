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
	public ResponseEntity<?> addCompany(@RequestBody Company company) {
		try {
			int id = adminService.addCompany(company);
			return ResponseEntity.ok(id);
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
//			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@PutMapping("/update-company")
	public ResponseEntity<?> updateCompany(@RequestBody Company company) {
		try {
			int id = adminService.updateCompany(company);
			return ResponseEntity.ok("company " + id + " updated");
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}

	}

	@DeleteMapping("/company/{companyId}")
	public ResponseEntity<?> deleteCompany(@PathVariable int companyId)  {
		try {
			adminService.deleteCompany(companyId);
			return ResponseEntity.ok("company " + companyId + " deleted");
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}

	}

	@GetMapping("/get-all-companies")
	public ResponseEntity<?> getAllCompanies() {
		try {
			List<Company> companies = adminService.getAllCompanies();
			return ResponseEntity.ok(companies);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

	@GetMapping("/company/{companyId}")
	public ResponseEntity<?> getOneCompany(@PathVariable int companyId) {
		try {
			Company company = adminService.getOneCompany(companyId);
			return ResponseEntity.ok(company);
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	@PostMapping("/customer/add-customer")
	public ResponseEntity<?> addCustomer(@RequestBody Customer customer){
		try {
			int id = adminService.addCustomer(customer);
			return ResponseEntity.ok(id);
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	@PutMapping("update-customer")
	public ResponseEntity<?> updateCustomer(@RequestBody Customer customer){
		try {
			 int id = adminService.updateCustomer(customer);
			 return ResponseEntity.ok("customer "+id+" updated");
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	@DeleteMapping("/customer/{customerId}")
	public ResponseEntity<?> deleteCustomer(@PathVariable int customerId){
		try {
			int id = adminService.deleteCustomer(customerId);
			return ResponseEntity.ok("customer "+ id+ " deleted");
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	@GetMapping("/get-all-customers")
	public ResponseEntity<?> getAllCustomers() {
		try {
			List<Customer> customers = adminService.getAllCustomers();
			return ResponseEntity.ok(customers);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	@GetMapping("/customer/{customerId}")
	public ResponseEntity<?> getOneCustomer(@PathVariable int customerId) {
		try {
			Customer customer = adminService.getOneCustomer(customerId);
			return ResponseEntity.ok(customer);
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

}
