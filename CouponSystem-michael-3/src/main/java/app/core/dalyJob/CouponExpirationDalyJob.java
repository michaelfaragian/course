package app.core.dalyJob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import app.core.services.AdminService;

@Component
public class CouponExpirationDalyJob {

	@Autowired
	AdminService adminService;

	@Scheduled(cron = "1 0 0 * * *")
	public void deleteExpiredCoupons() {
		System.out.println(">>>>>>>deleteExpiredCoupons start<<<<<<");
		adminService.deleteExpiredCouponsByEndDate();
	}

}
