package app.core.dalyJob;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import app.core.repositories.CouponRepo;
import app.core.services.AdminService;

@Component
//@Transactional
public class CouponExpirationDalyJob  {
	
	@Autowired
	AdminService adminService;
//	@Autowired
//	CouponRepo couponRepo;
	
	@Scheduled(cron = "1 0 0 * * *")
	public void deleteExpiredCoupons() {
		adminService.deleteExpiredCouponsByEndDate();
	}
//	public void deleteExpiredCoupons() {
//		couponRepo.deleteByEndDateBefore(LocalDate.now());
//	}
	

}
