package test00;

public class Test00 {

	public static void main(String[] args) {
		
		// ���� ���ϱ�
		String text = "Hello";
		int length = text.length();
		System.out.println(length);
		System.out.println(text.length());
		
		// ���� Ȯ���ϱ�
		// char 'a' 'b' 'c'
		// String "abc"
		char character = text.charAt(0);
		System.out.println(character);
		
		// charAt�� �̿��ؼ� �ݺ������� ���ڿ� ����ϱ�
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i) + " ") ;
		}
		System.out.println();
		
		// ���ڿ� �ڸ���
		String phoneNumber = "01012345678";
		
		// 010
		String partString = phoneNumber.substring(0, 3);
		System.out.println(partString);
		
		// 1234
		// ���� �ε������� �ڸ��� ���� ���� ��ŭ�� ���Ѵ�.
		partString = phoneNumber.substring(3, 7);
		System.out.println(partString);
		
		// Ư�� ���ڷ� ����, �������� Ȯ��
		text = "���α�";
		if (text.startsWith("��")) {
			System.out.println("�达�Դϴ�.");
		}
		if (text.endsWith("�α�")) {
			System.out.println("�̸��� �α� �Դϴ�.");
		}
		
		// ���ڿ� �Ϻ� �ٲٱ�
		String replaceText = text.replace("��", "��");
		System.out.println(replaceText);
		
		// ���ڿ� �ɰ���
		text = "���α�,���缮,����,Ȳ����,����ȣ";
		String[] names = text.split(",");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
