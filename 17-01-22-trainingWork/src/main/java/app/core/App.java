package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@Configuration
@PropertySource(value = { "application.properties" })
public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
		
		Gym gym = ctx.getBean(Gym.class);
		
		System.out.println(gym.getRunCoach().getTrainProgram());
		System.out.println(gym.getSwimCoach().getTrainProgram());
		System.out.println(gym.getTenisCoach().getTrainProgram());
		ctx.close();
		
	}

}
