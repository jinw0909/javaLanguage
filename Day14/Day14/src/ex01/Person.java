package ex01;

public class Person {
	private String name;
	private String birth;
	
	public Person(String name, String birth) {
		this.name= name;
		this.birth = birth;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void greeting() {
		System.out.println("안녕하세요 저는 " + this.name + "입니다.");
	}
}
