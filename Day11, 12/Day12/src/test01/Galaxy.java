package test01;

public class Galaxy {
	private String maker;
	private String model;
	private String sNumber;
	private String pNumber;
	
	public Galaxy(String maker, String model, String pNumber, String sNumber) {
		this.maker = maker;
		this.model = model;
		this.sNumber = sNumber;
		this.pNumber = pNumber;
	}
	
	public void printInfo() {
		System.out.println(this.maker + "���� ������ " + this.model + "�Դϴ�.");
		System.out.println("��ȭ��ȣ : " + this.pNumber);
		System.out.println("�Ϸù�ȣ : " + this.sNumber);
	}
	
	public void call() {
		System.out.println(this.pNumber + " �� ��ȭ�� �̴ϴ� �Ѹ�������...");
	}
	
	public void checkSleeping() {
		System.out.println(this.pNumber + " �� �ڴ�? �޽����� ���� �մϴ�.");
	}
	
}
