package ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		Student student = new Student("장진우", "19890909", "한국대학교");
		student.greeting();
		
		Person me = new Person("장진우", "19890909");
		me.greeting();
	}
	
	

}
