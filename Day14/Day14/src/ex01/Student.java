package ex01;

public class Student extends Person {
	
	private String school;
	
	public Student(String name, String birth, String school) {
		super(name, birth);
		this.school = school;
	}
	
	// 메소드 재정의
	@Override
	public void greeting() {
		super.greeting();
		System.out.println("안녕하세요 저는" + this.school + "다닙니다.");
	}
	
	public String getSchool() {
		return this.school;
	}
}
