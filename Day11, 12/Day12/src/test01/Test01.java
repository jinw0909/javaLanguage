package test01;

public class Test01 {

	public static void main(String[] args) {
		Student chang = new Student("������", "�ѱ����б�", "01051370460", "java");
		chang.printInfo();
		chang.setSchool("�̱����б�");
		chang.printInfo();
		chang.sendSchedule();
		chang.sendCheer("������!");
		
		System.out.println();
		
		Galaxy phone = new Galaxy("�Ｚ", "GalaxyS10", "010-5137-0460", "A0123456789");
		phone.printInfo();
		phone.call();
		phone.checkSleeping();
	}

}
