package test00;

public class Person {
	String name;
	String birth;
	String gender;
	
	// ���� ���ϱ�
	int getAge(int targetYear) {
		String yearString = birth.substring(0, 4);
		
		int year = Integer.parseInt(birth.substring(0, 4));
		
		return targetYear - year + 1;
	}
	
	void greeting(int targetYear) {
		System.out.println("�ȳ��ϼ���" + this.name + "�Դϴ�.");
		System.out.println("���� " + this.getAge(targetYear) + "�� " + this.gender + "�Դϴ�. �� ��Ź�帳�ϴ�.");
	}
	
	// ���̸� ���ϴ� �޼ҵ�
	int compareAge(Person person) {
		// this
		int thisYear = Integer.parseInt(this.birth.substring(0, 4));
		int targetYear = Integer.parseInt(person.birth.substring(0, 4));
		// ����� ������ �ĸ����ͷ� ���� ��ü�� ���̰� �� ����
		// ����� ����� ���� �ڱ��ڽ��� ��ü ���̰� �� ����
		// ����� 0�̸� �����̴� 
		return thisYear - targetYear;
	}
}
