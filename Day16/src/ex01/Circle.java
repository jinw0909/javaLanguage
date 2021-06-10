package ex01;

public class Circle extends Shape {
	
	private String name;
	private int radius;
	
	public Circle(int radius) {
		super("¿ø");
		this.radius = radius;
	}
	
	@Override
	public double calcArea() {
		return radius * radius * 3.14;
	}
	
	@Override
	public double calcRound() {
		return radius * 2 * 3.14;
	}
}
