package ex01;

public class Student extends Person {
	
	private String school;
	
	public Student(String name, String birth, String school) {
		super(name, birth);
		this.school = school;
	}
	
	// �޼ҵ� ������
	@Override
	public void greeting() {
		super.greeting();
		System.out.println("�ȳ��ϼ��� ����" + this.school + "�ٴմϴ�.");
	}
	
	public String getSchool() {
		return this.school;
	}
}
