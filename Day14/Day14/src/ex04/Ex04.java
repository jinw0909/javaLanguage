package ex04;

public class Ex04 {

	public static void main(String[] args) {
		Person chang = new Person("������", 22);
		Person lee = new Person("������", 22);
		
		if(chang.equals(lee)) {
			System.out.println("���� ���");
		} else {
			System.out.println("�ٸ� ���");
		}

	}

}
