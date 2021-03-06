package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Primary
public class FamilyCar implements Vehicle {
	
	static int c; // this is just for the generating new car numbers
	
	private int number = ++c;
	
	// insert value from properties file - always text or numbers
	@Value("${car.max.speed:80}")
	private int maxSpeed;
	// this is a dependency - helper class
	// it needs to be injected by the container
	@Autowired
	@Qualifier("carEngine")
	private Engine engine;

	@Override
	public void start() {
		engine.switchOn();
		
		
	}

	@Override
	public void goTo(String destination) {
		System.out.println("going to " + destination);
	}

	@Override
	public void stop() {
		engine.switchOff();
		
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	
}
