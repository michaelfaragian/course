package app.core;

import org.springframework.stereotype.Component;

@Component

public class Gym {
	
	private RunCoach runCoach;
	private SwimCoach swimCoach;
	private TenisCoach tenisCoach;
	
	
	public Gym(RunCoach runCoach, SwimCoach swimCoach, TenisCoach tenisCoach) {
		super();
		this.runCoach = runCoach;
		this.swimCoach = swimCoach;
		this.tenisCoach = tenisCoach;
	}


	public RunCoach getRunCoach() {
		return runCoach;
	}


	public SwimCoach getSwimCoach() {
		return swimCoach;
	}


	public TenisCoach getTenisCoach() {
		return tenisCoach;
	}
	
	
	
	

}
