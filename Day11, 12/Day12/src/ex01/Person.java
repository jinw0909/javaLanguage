package ex01;

public class Person {
	// �̸�, �������, ����
	
	private String name;
	private String birth;
	private String gender;
	
	public Person() {
		System.out.println("����Ű�");
	}
	
	public Person(String name, String birth, String gender) {
		this();
		
		this.name = name;
		this.birth = birth;
		if(gender.equals("����") || gender.equals("����")) {
			this.gender = gender;
		} else {
			System.out.println("������ �߸� �ԷµǾ����ϴ�.");
		}
	}
	
	// getter
	public String getName() {
		return "Mr." + this.name;
	}
	// setter
	public void setName(String name) {
		this.name = name;
	}

	
	
	
}
