package ex01;

public class Animal {
	// 이름
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	// 우는 기능
	public void cry() {
		//동물마다 울음소리가 다르다.
	}
	// 먹는 기능
	public void eat() {
		System.out.println("냠냠");
	}
}
