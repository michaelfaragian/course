package app.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class SwimCoach implements CapacityCoach {
	
	@Value("${coach.swim}")
	private String swim;

	@Override
	public String getTrainProgram() {
		return this.swim;
	}

}
