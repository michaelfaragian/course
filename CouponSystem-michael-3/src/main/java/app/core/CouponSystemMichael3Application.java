package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import app.core.exception.CouponSystemException;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableScheduling
@SpringBootApplication
public class CouponSystemMichael3Application {

	public static void main(String[] args) throws CouponSystemException {
		SpringApplication.run(CouponSystemMichael3Application.class, args);
	}

}
