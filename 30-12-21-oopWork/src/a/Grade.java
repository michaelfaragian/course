package a;

public class Grade {
	
	private int score = 40; // 40 -100
	private Profession profession;
	
	
	@Override
	public String toString() {
		return "Grade [score=" + score + ", profession=" + profession + "]";
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		if(score >= 40 && score <= 100) {
			this.score = score;
		}
	}


	public Profession getProfession() {
		return profession;
	}


	public void setProfession(Profession profession) {
		this.profession = profession;
	}


	public Grade(int score, Profession profession) {
		setScore(score);
		this.profession = profession;
	}


	public Grade() {
		super();
	}


	public enum Profession{
		MATH, CHEMISTRY, GEOGRAPHY, LITERATURE, PHYSICS, SPORTS;
	}
	
	public static int randomScore() {
		 int score = (int)(Math.random()*60)+40;
		 return score;
	}
	public static Profession randomProfession() {
		int a = (int)(Math.random()*Profession.values().length);
		return Profession.values()[a];
	}
}
