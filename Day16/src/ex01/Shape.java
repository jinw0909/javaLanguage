package ex01;

public abstract class Shape {
	
	private String name;
	public Shape(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public abstract double calcArea();
	public abstract double calcRound();
}
