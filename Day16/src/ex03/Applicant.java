package ex03;

public class Applicant implements JavaProgramming {
	
	// ��������, ����, �ڰ���
	private int toeic;
	private double grade;
	private String[] license;
	
	// �ڼҼ� ���� ���
	public String writeLetter() {
		String letter = "���� ���￡�� �¾ �����Ͻ� �ƹ����� �ڻ��Ͻ� ��Ӵ� ���̿���...";
		return letter;
	}
	
	@Override
	public void objectOriented() {
		System.out.println("���� �ް�IT���� �ڹٸ� ����� �߾��ϴ�. �Ͼ��ּ���.");
	}
}
