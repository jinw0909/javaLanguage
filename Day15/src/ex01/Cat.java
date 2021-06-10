package ex01;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.println("具克");
	}
	
	// 弊风怪
	public void grooming() {
		System.out.println("弊风怪~~");
	}
}
