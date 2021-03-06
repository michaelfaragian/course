package app.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
import app.core.entities.Coupon;
import app.core.entities.Coupon.Category;
import app.core.exception.CouponSystemException;
import app.core.jwt.util.JwtUtil;
import app.core.services.CompanyService;

@CrossOrigin
@RestController
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	CompanyService companyService;
	
	@Autowired
	JwtUtil jwtUtil;

	@PostMapping("/add-coupon")
	public int addCoupon(@RequestBody Coupon coupon ,@RequestHeader String token) {
//		System.out.println(coupon.getCategory().toString()); 
		try {
			int id = companyService.addCoupon(coupon , jwtUtil.extractClient(token).clientId);
			return id;
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@PutMapping("/update-coupon")
	public int updateCoupon(@RequestBody Coupon coupon ,@RequestHeader String token) {
		try {
			int id = companyService.updateCoupon(coupon , jwtUtil.extractClient(token).clientId);
			return  id ;
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@DeleteMapping("/{couponId}")
	public int deleteCoupon(@PathVariable int couponId ,@RequestHeader String token) {
		try {
			int id = companyService.deleteCoupon(couponId,jwtUtil.extractClient(token).clientId);
			return id;
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping("/all")
	public List<Coupon> getAllCompanyCoupons(@RequestHeader String token) {
		try {
			return companyService.getAllCompanyCoupons(jwtUtil.extractClient(token).clientId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping("/category/{category}")
	public List<Coupon> getCompanyCouponsByCategory(@PathVariable Category category ,@RequestHeader String token) {
		try {
			return companyService.getCompanyCouponsByCategory(category, jwtUtil.extractClient(token).clientId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping("/price/{price}")
	public List<Coupon> getCompanyCouponsByMaxPrice(@PathVariable double price ,@RequestHeader String token) {
		try {
			return companyService.getCompanyCouponsByMaxPrice(price, jwtUtil.extractClient(token).clientId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping
	public Company getCompanyDetailes(@RequestHeader String token) {
		try {
			return companyService.getCompanyDetailes(jwtUtil.extractClient(token).clientId);
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

}
