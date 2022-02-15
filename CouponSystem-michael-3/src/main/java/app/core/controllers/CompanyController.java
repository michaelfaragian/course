package app.core.controllers;

import java.lang.module.ResolutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.Coupon;
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
			return "coupon "+id+" added";
		} catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	@PutMapping("/update-coupon")
	public String updateCoupon (@RequestBody Coupon coupon) {
		try {
			int id = companyService.updateCoupon(coupon);
			return "mknbkhasv"+id+"jhfyi";
		}catch (CouponSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	
	

	
}
