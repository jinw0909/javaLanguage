package test03;

public class Test03 {

	public static void main(String[] args) {
		
		// ���� ���ڿ�
		
		String numberString = "30";
		String numberString2 = "20";
		
		int number1 = Integer.parseInt(numberString);
		int number2 = Integer.parseInt(numberString2);
		
		System.out.println(number1 + number2);
		
		// ���� => ���ڿ�
		
		number1 = 5;
		number2 = 10;
		
		// �ļ�!
		numberString = number1 + "";
		numberString2 = number2 + "";
		
		System.out.println(numberString + numberString2);
		
		// �������� ���
		numberString = String.valueOf(number1);
		
		//���ڿ� ��
		String word1 = new String("�����");
		String word2 = "�����";
		
		//�� ���ڿ��� ������?
		if(word1 == word2) {
			System.out.println("�� ���ڿ��� ���ƿ�.");
		} else {
			System.out.println("�� ���ڿ��� �޶��.");
		}
		
		//���ڿ� ���ϴ� ��
		if(word1.equals(word2)) {
			System.out.println("�� ���ڿ��� ���ƿ�.");
		} else {
			System.out.println("�� ���ڿ��� �޶��.");
		}
	}

}
