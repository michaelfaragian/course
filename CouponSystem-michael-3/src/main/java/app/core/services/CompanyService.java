package app.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Company;
import app.core.entities.Coupon;
import app.core.exception.CouponSystemException;

//@Scope("prototype")
@Transactional
@Service
public class CompanyService extends ClientService {

//	private int companyId;
//
//	public int getCompanyId() {
//		return companyId;
//	}
//	
//	public void setCompanyId(int companyId) {
//		this.companyId = companyId;
//	}


	@Override
	public Boolean login(String email, String password, int id) {
//		Company company = companyRepo.findCompanyByEmailAndPassword(email, password);
//		if (company == null) {
//			return false;
//		}else {		
//		companyId = company.getId();
		return companyRepo.existsByPasswordAndEmailAndId(password, email, id);
		}
//	}

	public Company findCompanyById(int companyId) throws CouponSystemException {
		Optional<Company> opt = companyRepo.findById(companyId);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			throw new CouponSystemException("findCompanyById failed - company with id " + companyId + " not found");
		}
	}

	public int addCoupon(Coupon coupon , int companyId) throws CouponSystemException {
		Company company = null;
		Optional<Company> opt = companyRepo.findById(companyId);
		if (opt.isPresent()) {
			company = opt.get();
		} else {
			throw new CouponSystemException(
					"addCoupon- findById failed - company with id " + coupon.getCompany().getId() + " not found");
		}
		if (couponRepo.existsByTitleAndCompanyId(coupon.getTitle(), companyId)) {
			throw new CouponSystemException("addCoupon failed - company " + companyId
					+ " already have title " + coupon.getTitle());
		} else {
			if (company.getId() != companyId) {
				throw new CouponSystemException("addCoupon failed - you must enter your companyId");
			} else {
				company.addCoupon(coupon);
				Coupon coupon1 = couponRepo.findByTitleAndCompanyId(coupon.getTitle(), companyId);
				return coupon1.getId();
			}
		}
	}

	public int updateCoupon(Coupon coupon , int companyId) throws CouponSystemException {
		if (couponRepo.existsByIdAndCompanyId(coupon.getId(), companyId)) {
			couponRepo.save(coupon);
			return coupon.getId();
		} else {
			throw new CouponSystemException("updateCoupon failed - you cannot update the couponId or companyid");
		}
	}
//
//	public int deleteCoupon(int couponId) throws CouponSystemException {
//		Coupon coupon = couponRepo.findByIdAndCompanyId(couponId, companyId);
//		if (coupon == null) {
//			throw new CouponSystemException("deleteCoupon failed - coupon with id " + couponId + " not found");
//		} else {
//			couponRepo.deleteById(couponId);
//			return couponId;
//		}
//	}

	public List<Coupon> getAllCompanyCoupons(int companyId) {
		return couponRepo.findByCompanyId(companyId);
	}
//
//	public List<Coupon> getCompanyCouponsByCategory(Category category) {
//		return couponRepo.findByCompanyIdAndCategory(companyId, category);
//	}
//
//	public List<Coupon> getCompanyCouponsByMaxPrice(double maxPrice) {
//		return couponRepo.findByCompanyIdAndPriceLessThan(companyId, maxPrice);
//	}
//
//	public Company getCompanyDetailes() throws CouponSystemException {
//		Optional<Company> opt = companyRepo.findById(companyId);
//		if (opt.isPresent()) {
//			return opt.get();
//		} else {
//			throw new CouponSystemException("getCompanyDetailes failed - company not found");
//		}
//	}
//
}
