package ex01;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scores = {
				{90, 100, 80},
				{70, 90, 98},
				{80, 50, 78},
				{100, 90, 88},
				{95, 78, 88},
		};
		System.out.println("3��° �л��� 2��° ���� " + scores[2][1]);
		System.out.println("2��° �л��� 1��° ���� " + scores[1][0]);
		System.out.println("5��° �л��� 3��° ���� " + scores[4][2]);

		//�ݺ������� ���� �ϰ� ����ϱ�
		for (int i = 0; i < scores.length; i++) { //�迭�� �����ϱ�
			for(int j = 0; j < scores[i].length; j++) { //�迭 �ȿ� �ִ� �� �����ϱ�
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		
		// �л��� ��� ���ϱ�
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			System.out.println(sum / 3.0);
		}
	}

}
