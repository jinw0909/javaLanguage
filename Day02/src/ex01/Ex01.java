package ex01;

public class Ex01 {

	public static void main(String[] args) {
		int noodleCup;
		int coke = 1500;
		
		noodleCup = 850;
		coke = 1300;
		
		// ������ 3���� ����
		int sum = noodleCup * 3;
		
		System.out.println("������ 3���� ������" + sum);
		
		int money = 10000;
		int change = money - sum;
		System.out.println("�Ž�����: " + change);
		
		//5000������ �������� � �� �� �ִ���
		money = 5000;
		System.out.println("�� �� �ִ� ������: " + (money / noodleCup));
		
		//������ ������
		//10 / 3 = 3 ...
		//%
		//5000������ �� �� �ִ� �ִ� ������ ��� �ܵ��� �󸶰� ������
		change = money % noodleCup;
		System.out.println("�Ž�����: " + change);
		
		
		
	}

}
