package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.CrossOrigin;

import app.core.exception.CouponSystemException;
import app.core.filters.AdminFilter;
import app.core.filters.CompanyFilter;
import app.core.filters.CustomerFilter;
import app.core.jwt.util.JwtUtil;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@EnableScheduling
@SpringBootApplication
public class CouponSystemMichael3Application {

	public static void main(String[] args) throws CouponSystemException {
		SpringApplication.run(CouponSystemMichael3Application.class, args);
	}
	@Bean
	public FilterRegistrationBean<AdminFilter> adminFilter(JwtUtil jwtUtil){
		FilterRegistrationBean<AdminFilter> filterRegistrationBean = new FilterRegistrationBean<>();
		AdminFilter adminFilter = new AdminFilter(jwtUtil);
		filterRegistrationBean.setFilter(adminFilter);
		filterRegistrationBean.addUrlPatterns("/admin/*");
		return filterRegistrationBean;
	}
	@Bean
	public FilterRegistrationBean<CompanyFilter> companyFilter(JwtUtil jwtUtil){
		FilterRegistrationBean<CompanyFilter> filterRegistrationBean = new FilterRegistrationBean<>();
		CompanyFilter companyFilter = new CompanyFilter(jwtUtil);
		filterRegistrationBean.setFilter(companyFilter);
		filterRegistrationBean.addUrlPatterns("/company/*");
		return filterRegistrationBean;
	}
	@Bean
	public FilterRegistrationBean<CustomerFilter> customerFilter(JwtUtil jwtUtil){
		FilterRegistrationBean<CustomerFilter> filterRegistrationBean = new FilterRegistrationBean<>();
		CustomerFilter customerFilter = new CustomerFilter(jwtUtil);
		filterRegistrationBean.setFilter(customerFilter);
		filterRegistrationBean.addUrlPatterns("/customer/*");
		return filterRegistrationBean;
	}
}
