package ex01;

public class Rectangle {
	// ���� ����
	int width;
	int height;
	
	// �޼ҵ�(���)
	// ���̸� ���ϴ� �޼ҵ�
	int calculateArea() {
		int area = width * height;
		return area;
	}
	
	// �����ε�
	// ������ ���� ���̸� ���ϴ� �޼ҵ�
	int calculateArea(int count) {
		int result = calculateArea() * count;
		
		return result;
	}
	
	// ����Լ�
	void printRectangle() {
		System.out.println("���� : " + width + " ���� : " + height);
	}
}
