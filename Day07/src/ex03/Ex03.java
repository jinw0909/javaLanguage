package ex03;

public class Ex03 {

	public static void main(String[] args) {
		// �迭 ���� ��
		int[] scores = {100, 95, 90, 80, 100};
		int[] numbers = new int[10];
		
		System.out.println("ù��° ���� : " + scores[0]);
		System.out.println("�ι�° ���� : " + scores[1]);
		System.out.println("����° ���� : " + scores[2]);
		
		scores[3] = 90;
		
		// �ݺ����� Ȱ���ؼ� �迭 �ٷ��
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "��° ����" + scores[i]);
		}
		
		// ���
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("����� " + sum / (double)scores.length);
		
		// �ְ��� ���ϱ�
		int max = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
			}
		}
		System.out.println("�ְ����� " + max);
	}

}
