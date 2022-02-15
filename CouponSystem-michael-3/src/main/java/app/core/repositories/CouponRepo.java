package app.core.repositories;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Coupon;
import app.core.entities.Coupon.Category;

public interface CouponRepo extends JpaRepository<Coupon, Integer> {
	
	boolean existsByTitleAndCompanyId(String title, int id);
	
	Coupon findByTitleAndCompanyId(String title, int id);
	
	boolean existsByIdAndCompanyId(int couponId,int companyId);
	
	List<Coupon> findByCompanyId(int companyId);
	
	Coupon findByIdAndCompanyId(int couponId ,int companyId);
	
	List<Coupon> findByCompanyIdAndCategory(int companyId,Category category);
	
	List<Coupon> findByCompanyIdAndPriceLessThan(int companyId,double maxPrice);
	
	List<Coupon> findByCustomersId (int customerId);
	
	List<Coupon> findByCustomersIdAndCategory (int customerId, Category category);
	
	List<Coupon> findByCustomersIdAndPriceLessThan(int customerId, double maxPrice);
	
	void deleteByEndDateBefore(LocalDate time);
}
