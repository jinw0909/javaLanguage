package ex01;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.println("�߿�");
	}
	
	// �׷��
	public void grooming() {
		System.out.println("�׷��~~");
	}
}
