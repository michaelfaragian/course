package app.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
import app.core.entities.Coupon;
import app.core.entities.Coupon.Category;
import app.core.exception.CouponSystemException;
import app.core.services.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	CompanyService companyService;

	@PostMapping("/add-coupon")
	public String addCoupon(@RequestBody Coupon coupon) {
		try {
			int id = companyService.addCoupon(coupon);
			return "coupon " + id + " added";
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@PutMapping("/update-coupon")
	public String updateCoupon(@RequestBody Coupon coupon) {
		try {
			int id = companyService.updateCoupon(coupon);
			return "coupon " + id + " updated";
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@DeleteMapping("/{couponId}")
	public String deleteCoupon(@PathVariable int couponId) {
		try {
			int id = companyService.deleteCoupon(couponId);
			return "coupon " + id + " deleted";
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping("/all")
	public List<Coupon> getAllCompanyCoupons() {
		try {
			return companyService.getAllCompanyCoupons();
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping("/category/{category}")
	public List<Coupon> getCompanyCouponsByCategory(@PathVariable Category category) {
		try {
			return companyService.getCompanyCouponsByCategory(category);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping("/price/{price}")
	public List<Coupon> getCompanyCouponsByMaxPrice(@PathVariable double price) {
		try {
			return companyService.getCompanyCouponsByMaxPrice(price);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping
	public Company getCompanyDetailes() {
		try {
			return companyService.getCompanyDetailes();
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

}
