package app.beans;

public class Country {
	
	private int id;
	private String name;
	private int population;
	private int area;

	
	public Country() {
		
	}
	public Country(int id, String name, int population, int area) {
		this.id = id;
		this.name = name;
		this.population = population;
		this.area = area;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public void print() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(population);
		System.out.println(area);
			
	}
	
	
}
