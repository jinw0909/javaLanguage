package ex02;

public class Ex02 {

	public static void main(String[] args) {
		
		int result = getNoodlesPrice(5);
		
		System.out.println(result);
		System.out.println(getNoodlesPrice(10));
		
		printHelloWorld();
	}
	
	// ������ ���ݿ� ���� ��� �Լ�
	// �Ķ���� ���ϱ�
	// ���� Ÿ�� ���ϱ�
	public static int getNoodlesPrice(int count) {
		int result = 850 * count;
		
		return result;
	}
	
	// �������̵� (���� �̸��� �Լ��� �ٸ� �Ķ���ͷ� ������ �� �� �ִ�)
	public static int getNoodlesPrice(int count, int price) {
		int result = price * count;
		
		return result;
	}
	
	// ���� Ÿ��, �Ķ���Ͱ� ���� �Լ�
	// ��� ���带 ����ϴ� �Լ�
	public static void printHelloWorld() {
		System.out.println("Hello World");
		System.out.println("Hello World");
	}
}
