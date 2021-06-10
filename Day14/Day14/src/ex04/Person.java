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
		return "�̸� : " + this.name + "���� : " + this.age; 
	}
	
	@Override
	public boolean equals(Object obj) {
		Person person = (Person)obj;
		// �̸��� ���� ���̰� ������ ���� ������� ����
		if(this.age == person.age && this.name.equals(person.name)) {
			return true;
		} 
		
		return false;
	}
	
}
