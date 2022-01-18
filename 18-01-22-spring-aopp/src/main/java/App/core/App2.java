package App.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import App.core.aspects.StatisticsAspect;
import App.core.dao.company.Company;
import App.core.dao.company.CompanyDao;
import App.core.dao.coupon.CouponDao;

public class App2 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CompanyDao companyDao = ctx.getBean(CompanyDao.class);
		CouponDao couponDao = ctx.getBean(CouponDao.class);
		
		companyDao.addCompany(1, "michael");
		companyDao.addCompany(new Company());
		companyDao.addCompany(new Company());
		companyDao.addCompany(new Company());
		companyDao.sayhello();
		couponDao.addCoupon();
		couponDao.doWork();
		
		StatisticsAspect statisticsAspect = ctx.getBean(StatisticsAspect.class);
		System.out.println("number: " + statisticsAspect.getNumberOfCalls()); 
		
		ctx.close();
	}

}
