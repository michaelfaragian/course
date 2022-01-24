package app.core;

import java.awt.Point;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx =  SpringApplication.run(Application.class, args);){
			
			
			Point p1 = ctx.getBean(Point.class);
			Point p2 = ctx.getBean(Point.class);
			
			
			
			System.out.println(p1);
			System.out.println(p2);
			
		}
	}

}
