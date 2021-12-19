package a;

public class Shape {
	
	private String color;
	
	
	public static final String [] COLORS = 
		
		{"black" ,"red","green","blue"};

	public Shape(String color) {
		super();
		this.color = color;
	}

	public Shape() {
		this("black");
	}

	public String getColor() {
		this.color=color;
			return color;
			
		
	}

	public void setColor(String color) {
		for (int i = 0; i < COLORS.length; i++) {
			
			if(color.equals(COLORS[i])){
				this.color = color;
			}
				
			System.out.println(color + " is not viable ");
	
		}
	}

	
}


