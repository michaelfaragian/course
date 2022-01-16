package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Airplane implements Vehicle {
	
	static int c; // this is just for the generating new car numbers
	
	private int number = ++c;
	// this is a dependency - helper class
	// it needs to be injected by the container
	@Autowired
	@Qualifier("airplaneEngine") 
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

}
