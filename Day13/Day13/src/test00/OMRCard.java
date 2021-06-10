package test00;

public class OMRCard {
	// �̸�, �й�, ��ŷ�ѹ�ȣ (1 ~ 5)
	private String name;
	private String studentId;
	private int[] answer;
	
	// ������
	public OMRCard(String name, String studentId) {
		this.answer = new int[5]; //�����԰� ���ÿ� �迭�� �޸� Ȯ��
		this.name = name;
		this.studentId = studentId;
	}
	
	//setter
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setStudentId(String studentId) {
//		this.studentId = studentId;
//	}
//	public void setAnswer(int[] answer) {
//		this.answer = answer;
//	}
	
	// ���� ��ȣ�� ������ �Է��ϰ� �̰��� �����Ѵ�.
	public void setAnswer(int number, int answer) {
		if(number < 0 || number > 4) {
			System.out.println("���� ������ ���� �ʽ��ϴ�.");
			return;
		}
		if(answer < 1 || answer > 5) {
			System.out.println("������ ������ ���� �ʽ��ϴ�.");
			return;
		}
		this.answer[number] = answer;
	}
	
	public int[] getAnswer() {
		return this.answer;
	}
	
	// omrcard ���� Ȯ��
	public void printCard() {
		System.out.println("�̸� : " + this.name);
		System.out.println("�й� : " + this.studentId);
		
		for (int i = 0; i < this.answer.length; i++) {
			System.out.print(this.answer[i] + " ");
		}
		System.out.println();
	}
}
