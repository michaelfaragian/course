package app.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component


public class RunCoach implements CapacityCoach{

	@Value("${coach.run}")
	private String run;
	@Override
	public String getTrainProgram() {
		return this.run;
	}

}
