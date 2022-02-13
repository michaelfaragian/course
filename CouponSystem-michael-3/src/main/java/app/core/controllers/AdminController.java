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

import app.core.entities.Company;
import app.core.exception.CouponSystemException;
import app.core.services.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping
	public ResponseEntity<?> addCompany (@RequestBody Company company) throws CouponSystemException{
		try {
			int id = adminService.addCompany(company);
			 return ResponseEntity.ok(id);
		} catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}
	@PutMapping
	public ResponseEntity<?> updateCompany(@RequestBody Company company) throws CouponSystemException{
		try {
			int id = adminService.updateCompany(company);
			return ResponseEntity.ok(id);
		}catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
		
	}
	@DeleteMapping("/{companyId}")
	public ResponseEntity<?> deleteCompany(@PathVariable int companyId) throws CouponSystemException{
		try {
			adminService.deleteCompany(companyId);
			return ResponseEntity.ok(null);
		}catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
			
		}
	@GetMapping
	public ResponseEntity<?> getAllCompanies() throws CouponSystemException{
		try {
			List<Company> companies= adminService.getAllCompanies();
			return ResponseEntity.ok(companies);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	@GetMapping("/{companyId}")
	public ResponseEntity<?> getOneCompany(@PathVariable int companyId) {
		try {
			Company company = adminService.getOneCompany(companyId);
			return ResponseEntity.ok(company);
		}catch (CouponSystemException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
		
	}


