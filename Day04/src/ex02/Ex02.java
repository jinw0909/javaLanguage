package ex02;

public class Ex02 {

	public static void main(String[] args) {
		// 70 �̻��� ���� ��� ����
		
		int weight = 80;
		
		while(weight >= 70) {
			System.out.println("���X���X" + weight);
			weight -= 2; //weight = weight - 2;
		}
		
		//Ƚ���ݺ� 5�� �ݺ�
		
		int i = 0;
		while (i < 5) {
			System.out.println("Hello World" + i);
			i++; // i = i + 1;
		}
		
		i = 5;
		while (i > 0) {
			System.out.println(i);
			i--;
		}
		
		int count = 10;
		
		i = 0;
		while (i < count) {
			System.out.println("�ݺ�");
			i++;
		}
		
		//�� ���ϱ�
		//1 ����  10������ ���� ���սô�.
		int sum = 0;
		i = 1;
		while(i <= 10) {
			sum += i; // sum = sum + i;
			System.out.println("log : " + sum);
			i++;
		}
		
		System.out.println(sum);
		
		
		// ī��Ʈ ����
		// 1 - 10 ������ ¦���� ������ ����ϼ���.
		count = 0;
		i = 1;
		while(i <= 10) {
			if (i % 2 == 0) {
				count++;
			}
			i++;
		}
		
		System.out.println(count);

	}

}
