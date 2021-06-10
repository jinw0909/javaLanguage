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
		System.out.println(this.name + "님의 학교가 " + this.school + "로 변경되었습니다.");
	}
	
	public void printInfo() {
		System.out.println(this.lesson + " 수업 : " + this.school + " " + this.name + "학생.");
	}
	
	public void sendSchedule() {
		System.out.println(this.name + "학생에게 " + "("+ this.number + ")" + " 수업일정 메세지를 전송합니다.");
	}
	
	public void sendCheer(String message) {
		System.out.println(this.name + "학생에게" + " ("+ this.number + ") " + message + " 라고 전송합니다.");
	}
	
}
