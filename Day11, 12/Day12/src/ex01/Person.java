package ex01;

public class Person {
	// 이름, 생년월일, 성별
	
	private String name;
	private String birth;
	private String gender;
	
	public Person() {
		System.out.println("출생신고");
	}
	
	public Person(String name, String birth, String gender) {
		this();
		
		this.name = name;
		this.birth = birth;
		if(gender.equals("남자") || gender.equals("여자")) {
			this.gender = gender;
		} else {
			System.out.println("성별이 잘못 입력되었습니다.");
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
