package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.Vehicle;

public class App {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class)){
			Vehicle v1 = ctx.getBean(Vehicle.class);
			
			v1.start();
			v1.goTo("eilat");
			v1.stop();
		}

	}

}
