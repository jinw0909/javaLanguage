package test02;

public class Test02 {

	public static void main(String[] args) {
		//1��
		char resultA = 'A';
		char resultB = 'B';
		double averageA = 4.0;
		double averageB = 3.0;
		System.out.println("���� ������ 90�� �̻��̸� \'" + resultA + "\'�����̰� ������ " + averageA + "�Դϴ�." );
		System.out.println("���� ������ 80�� �̻��̸� \'" + resultB+ "\'�����̰� ������ " + averageB + "�Դϴ�." );
		
		//2��
		int number1 = 33;
		double number2 = 35.325;
		
		System.out.println("�� ���� �� : " + number1 * number2);
		
		//3��
		int day = 24;
		
		System.out.println("943�ð��� " + (943 / day) + "�� �Դϴ�.");
		
		//4��
		int width = 8;
		int height = 9;
		int sq = width * height;
		double tri = sq / (double)2;
		
		System.out.println("�簢���� ���� : " + sq);
		System.out.println("�ﰢ���� ���� : " + tri);
		
		//5��
		int korean = 93;
		int math = 88;
		int english = 94;
		double averageScore = (korean + math + english) / 3.0;
		
		System.out.println("���� " + korean + "��, ���� " + math + ", ���� " + english + "��");
		System.out.println("��� " + averageScore);
		
		//6��
		int celsius = 30;
		double fahrenHeit =  9 / 5.0 * celsius + 32;
		System.out.println("���� " + celsius + "���� ȭ�� " + fahrenHeit + "�� �Դϴ�.");
		
	}

}
