package ex02;

public class Member {
	// ȸ�� �̸�, ��ȭ��ȣ
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
		return "�̸�: " + this.name + " ��ȭ��ȣ : " + this.phoneNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		Member member = (Member)obj;
		//�̸��� ��ȣ��ȣ �� �� ��ġ�ϴ� ���
		if (this.name.equals(member.name) && 
				this.phoneNumber.equals(member.phoneNumber)) {
			return true;
		}
		return false;
	}
}
