package App.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import App.core.dao.company.CompanyDao;
import App.core.dao.coupon.CouponDao;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CompanyDao companyDao = ctx.getBean(CompanyDao.class);
		CouponDao couponDao = ctx.getBean(CouponDao.class);
		
		companyDao.addCompany(1, "michael");
		companyDao.sayhello();
		couponDao.addCoupon();
		couponDao.doWork();
		
		
		ctx.close();
	}

}
