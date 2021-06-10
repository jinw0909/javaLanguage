package ex02;

public class Member {
	// 회원 이름, 전화번호
	private String name;
	private String phoneNumber;
	
	public Member(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "이름: " + this.name + " 전화번호 : " + this.phoneNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		Member member = (Member)obj;
		//이름과 전호번호 둘 다 일치하는 경우
		if (this.name.equals(member.name) && 
				this.phoneNumber.equals(member.phoneNumber)) {
			return true;
		}
		return false;
	}
}
