package app.core.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Coupon;
import app.core.entities.Coupon.Category;
import app.core.entities.Customer;
import app.core.exception.CouponSystemException;

//@Scope("prototype")
@Transactional
@Service
public class CustomerService extends ClientService {
	
//	private int customerId;
//	
//
//	public int getCustomerId() {
//		return customerId;
//	}
	@Override
	public boolean login(String email, String password)  {
//		Customer customer = customerRepo.findByEmailAndPassword(email, password);
//		if(customer == null) {
//			return false;
//		}else {
//			customerId = customer.getId();
		return customerRepo.existsByEmailAndPassword(email, password);
		}
//	}
	public void purchaseCoupon (int couponId, int customerId) throws CouponSystemException {
		Customer customer = customerRepo.getById(customerId);
		Optional<Coupon> opt = couponRepo.findById(couponId);
		if(opt.isEmpty()) {
			throw new CouponSystemException("purchaseCoupon failed - coupon "+couponId+" not exist");
		}
		Coupon couponFromDb = opt.get();	
		
		if(customer.getCoupons().contains(couponFromDb)){
			throw new CouponSystemException("purchaseCoupon failed - coupon with id "+couponId+" already buy by customer "+customerId);
		}
		if(couponFromDb.getAmount()<1) {
			throw new CouponSystemException("purchaseCoupon failed - coupon with id "+couponId+" less than 1");
		}
		if(couponFromDb.getEndDate().isBefore(LocalDate.now())) {
			throw new CouponSystemException("purchaseCoupon failed -  date coupon "+couponId+" alredy expired");
		}
		else {
			couponFromDb.setAmount(couponFromDb.getAmount()-1);
			customer.addCoupon(couponFromDb);
		}
	}
	public List<Coupon> getAllCustomerCoupon(int customerId){
		return couponRepo.findByCustomersId(customerId);
	}
	public List<Coupon> getCustomerCouponByCategory(Category category, int customerId){
		return couponRepo.findByCustomersIdAndCategory(customerId, category);
	}
	public List<Coupon> getCustomerCouponByMaxPrice(double MaxPrice, int customerId){
		return couponRepo.findByCustomersIdAndPriceLessThan(customerId, MaxPrice);
	}
	public Customer getCustomerDetails(int customerId){
		return customerRepo.findById(customerId).get(); 
	}

	
}

