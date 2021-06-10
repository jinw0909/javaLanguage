package ex04;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름 : " + this.name + "나이 : " + this.age; 
	}
	
	@Override
	public boolean equals(Object obj) {
		Person person = (Person)obj;
		// 이름이 같고 나이가 같으면 같은 사람으로 인정
		if(this.age == person.age && this.name.equals(person.name)) {
			return true;
		} 
		
		return false;
	}
	
}
