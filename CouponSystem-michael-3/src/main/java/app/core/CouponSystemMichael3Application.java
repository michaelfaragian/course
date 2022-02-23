package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import app.core.exception.CouponSystemException;
import app.core.filters.MyFilter;
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
	public FilterRegistrationBean<MyFilter> myFilter(JwtUtil jwtUtil){
		FilterRegistrationBean<MyFilter> filterRegistrationBean = new FilterRegistrationBean<>();
		MyFilter myFilter = new MyFilter(jwtUtil);
		filterRegistrationBean.setFilter(myFilter);
		filterRegistrationBean.addUrlPatterns("/admin/*","/company/*","/customer/*");
		return filterRegistrationBean;
	}
}
