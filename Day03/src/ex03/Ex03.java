package ex03;

public class Ex03 {

	public static void main(String[] args) {
		// �����԰� 70kg ���ϸ� ġŲ�� �԰�
		// �׷��� ������ �����带 ����
		
		int weight = 74;
		
		if (weight <= 70) {
			System.out.println("ġŲ����");
		} else {
			System.out.println("������ ����");
		}
		
		//�����԰� 70���ϸ� ġŲ�� ����
		//�׷��� �ʰ� 75���ϸ� �߰������� ����
		//�׷��� �ʰ� 80���ϸ� �����带 ����
		//�׷��� ������ ����!
		
		if (weight <= 70) {
			System.out.println("ġŲ����");
		} else if (weight <= 75) {
			System.out.println("�߰����� ����");
		} else if (weight <= 80) {
			System.out.println("�����带 ����");
		} else {
			System.out.println("����!");
		}
		
		if (weight <= 70) 
			System.out.println("ġŲ����");
		
	}

}
