package ex01;

public class Ex01 {

	public static void main(String[] args) {
		// ��� Ŭ������ ����� �����ڸ� Ȱ��
		Person chang = new Person("������", "19890909", "����2");
		System.out.println(chang.getName());
		chang.setName("������");
		System.out.println(chang.getName());
	}

}
