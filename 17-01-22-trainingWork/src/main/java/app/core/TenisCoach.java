package app.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class TenisCoach implements CapacityCoach {

	@Value("${coach.tenis}")
	private String tenis;
	
	@Override
	public String getTrainProgram() {
		return this.tenis;
	}

}
