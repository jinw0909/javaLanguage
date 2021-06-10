package test01;

public class Student {
	private String name;
	private String school;
	private String number;
	private String lesson;
	
	public Student(String name, String school, String number, String lesson) {
		this.name = name;
		this.school = school;
		this.number = number;
		this.lesson = lesson;
	}
	
	// setter school
	public void setSchool(String school) {
		this.school = school;
		System.out.println(this.name + "���� �б��� " + this.school + "�� ����Ǿ����ϴ�.");
	}
	
	public void printInfo() {
		System.out.println(this.lesson + " ���� : " + this.school + " " + this.name + "�л�.");
	}
	
	public void sendSchedule() {
		System.out.println(this.name + "�л����� " + "("+ this.number + ")" + " �������� �޼����� �����մϴ�.");
	}
	
	public void sendCheer(String message) {
		System.out.println(this.name + "�л�����" + " ("+ this.number + ") " + message + " ��� �����մϴ�.");
	}
	
}
