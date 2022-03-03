package app.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.Coupon;
import app.core.entities.Coupon.Category;
import app.core.entities.Customer;
import app.core.exception.CouponSystemException;
import app.core.jwt.util.JwtUtil;
import app.core.services.CustomerService;

@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	JwtUtil jwtUtil;
	
	@PostMapping("/{couponId}")
	public String purchaseCoupon (@PathVariable int couponId ,@RequestHeader String token) {
		try {
			customerService.purchaseCoupon(couponId , jwtUtil.extractClient(token).clientId);
			return "coupon "+couponId+" purchase";
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	@GetMapping("/all")
	public List<Coupon> getAllCustomerCoupon(@RequestHeader String token){
		try {
			return customerService.getAllCustomerCoupon(jwtUtil.extractClient(token).clientId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	@GetMapping("/category/{category}")
	public List<Coupon> getCustomerCouponByCategory(Category category ,@RequestHeader String token){
		try {
			return customerService.getCustomerCouponByCategory(category, jwtUtil.extractClient(token).clientId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	
	
	@GetMapping("/price/{price}")
	public List<Coupon> getCustomerCouponByMaxPrice(double price ,@RequestHeader String token){
		try {
			return customerService.getCustomerCouponByMaxPrice(price, jwtUtil.extractClient(token).clientId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	@GetMapping
	public Customer getCustomerDetails(@RequestHeader String token){
		try {
			return customerService.getCustomerDetails(jwtUtil.extractClient(token).clientId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

}
