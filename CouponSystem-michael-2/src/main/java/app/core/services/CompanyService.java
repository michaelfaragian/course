package app.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Company;
import app.core.entities.Coupon;
import app.core.entities.Coupon.Category;
import app.core.exception.CouponSystemException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Transactional
@Service
public class CompanyService extends ClientService {
	
	private int companyId;
	

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Override
	public Boolean login(String email, String password) {
		Company company = companyRepo.findCompanyByEmailAndPassword(email, password);
		if(company== null) {
			return false;
		}
		companyId = company.getId();
		return companyRepo.existsByNameAndEmail(password, email);
	}
	
	public int addCoupon(Coupon coupon) throws CouponSystemException{
		if (couponRepo.existsByTitleAndCompanyId(coupon.getTitle(), companyId)) {
			throw new CouponSystemException("addCoupon failed - company "+coupon.getCompany().getId()+" already have title "+coupon.getTitle());
		}else {
			Optional<Company> opt = companyRepo.findById(companyId);
			if(opt.isEmpty()) {
				throw new CouponSystemException("findById failed - not found");
			}else {
				Company company= opt.get();
				company.addCoupon(coupon);
				return coupon.getId();
				
			}
		}
	}
	
	public Company findCompanyById(int companyId) throws CouponSystemException {
		Optional<Company> opt = companyRepo.findById(companyId);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new CouponSystemException("findCompanyById failed - company with id "+companyId+" not found");
		}
	}
	
	public int updateCoupon(Coupon coupon) throws CouponSystemException {
		if(couponRepo.existsByIdAndCompanyId(coupon.getId(),companyId)) {
			couponRepo.save(coupon);
			return coupon.getId();
		}else {
			throw new CouponSystemException("updateCoupon failed - you cannot update the couponId or companyid");
		}
	}
	public int deleteCoupon(int couponId) throws CouponSystemException {
		Coupon coupon  = couponRepo.findByIdAndCompanyId(couponId, companyId);
		if(coupon == null) {
			throw new CouponSystemException("deleteCoupon failed - coupon with id "+couponId+" not found");
		}else {
			couponRepo.deleteById(couponId);
			return couponId;
		}
		}
	public List<Coupon> getAllCompanyCoupons(){
		return couponRepo.findByCompanyId(companyId);
 	}
	public List<Coupon> getCompanyCouponsByCategory(Category category){
		return couponRepo.findByCompanyIdAndCategory(companyId, category);
	}
	public List<Coupon> getCompanyCouponsByMaxPrice(int maxPrice){
		return couponRepo.findByCompanyIdAndPriceLessThan(companyId, maxPrice);
	}
	public Company getCompanyDetailes () throws CouponSystemException {
		Optional<Company> opt = companyRepo.findById(companyId);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new CouponSystemException("getCompanyDetailes failed - company not found");
		}
	}
 	
 	
 	}
	
	
	
	
	
	


