package ex02;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle(int radius) {
		super("¿ø");
		this.radius = radius;
	}
	
	@Override
	public double calcArea() {
		return this.radius * this.radius * 3.14;
	}
}
