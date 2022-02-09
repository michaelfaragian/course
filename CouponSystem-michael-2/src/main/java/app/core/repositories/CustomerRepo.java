package app.core.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Coupon;
import app.core.entities.Customer;
import app.core.exception.CouponSystemException;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	
	Customer findByEmailAndPassword(String Email, String Password);
	
	boolean existsByEmailAndPassword(String Email, String Password);
	
	boolean existsByEmail(String Email);
	

}
