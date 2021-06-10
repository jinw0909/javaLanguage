package ex01;

public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}
	
	// ¿ïÀ½ ¼Ò¸® ÀçÁ¤ÀÇ
	@Override
	public void cry() {
		System.out.println("¸Û¸Û!!");
	}
	
	// ²¿¸®Ä¡±â
	public void fishtail() {
		System.out.println("»ì¶û»ì¶û");
	}
}
