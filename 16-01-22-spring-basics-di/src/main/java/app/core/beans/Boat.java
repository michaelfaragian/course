package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Boat  implements Vehicle{
	
	@Autowired
	@Qualifier("boatEngine")
	private Engine engine;

	@Override
	public void start() {
		engine.switchOn();
		
	}

	@Override
	public void goTo(String destination) {
		System.out.println("swim to " + destination);
		
	}

	@Override
	public void stop() {
		engine.switchOff();
	}

}
