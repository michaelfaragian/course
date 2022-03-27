package app.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.Coupon;
import app.core.jwt.util.JwtUtil;
import app.core.jwt.util.JwtUtil.ClientDetails;
import app.core.login.ClientType;
import app.core.login.LoginManager;
import app.core.repositories.CompanyRepo;
import app.core.repositories.CustomerRepo;
import app.core.services.AdminService;

@RestController
@CrossOrigin
public class LoginController {
	
	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private LoginManager loginManager;
	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private CompanyRepo companyRepo;
	@Autowired
	private AdminService adminService;
	
	@PostMapping( path = "/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String login(@RequestParam String email , @RequestParam String password, @RequestParam String clientType) {
		ClientType type = ClientType.valueOf(clientType);
		if(loginManager.login(email,password,type)!=null ){
			int clientId;
			if(type==ClientType.CUSTOMER) {
				clientId = this.customerRepo.findByEmailAndPassword(email, password).getId();
			}else if(type==ClientType.COMPANY) {
				clientId = this.companyRepo.findCompanyByEmailAndPassword(email, password).getId();
			}else {
				clientId=0;
			}
			ClientDetails details = new ClientDetails(email,type,clientId); 
			return jwtUtil.generateToken(details);
		}else {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"login failed -bad credentials wrong email or password");
		}
	}
	@GetMapping("/coupons")
	public List<Coupon> getAllCoupons() {
		try {
			List<Coupon> coupons = adminService.getAllCoupons();
			return coupons;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
}
