package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import app.core.exception.CouponSystemException;

@EnableScheduling
@SpringBootApplication
public class CouponSystemMichael2Application {

	public static void main(String[] args) throws CouponSystemException {
		SpringApplication.run(CouponSystemMichael2Application.class, args);
	}

}
