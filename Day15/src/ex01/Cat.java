package ex01;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	
	// 그루밍
	public void grooming() {
		System.out.println("그루밍~~");
	}
}
