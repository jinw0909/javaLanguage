package ex01;

public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}
	
	// ���� �Ҹ� ������
	@Override
	public void cry() {
		System.out.println("�۸�!!");
	}
	
	// ����ġ��
	public void fishtail() {
		System.out.println("������");
	}
}
