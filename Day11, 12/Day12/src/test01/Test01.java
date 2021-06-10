package test01;

public class Test01 {

	public static void main(String[] args) {
		Student chang = new Student("장진우", "한국대학교", "01051370460", "java");
		chang.printInfo();
		chang.setSchool("미국대학교");
		chang.printInfo();
		chang.sendSchedule();
		chang.sendCheer("잘하자!");
		
		System.out.println();
		
		Galaxy phone = new Galaxy("삼성", "GalaxyS10", "010-5137-0460", "A0123456789");
		phone.printInfo();
		phone.call();
		phone.checkSleeping();
	}

}
