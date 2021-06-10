package ex02;

public class Ex02 {

	public static void main(String[] args) {
		
		int result = getNoodlesPrice(5);
		
		System.out.println(result);
		System.out.println(getNoodlesPrice(10));
		
		printHelloWorld();
	}
	
	// 육개장 가격에 따른 계산 함수
	// 파라미터 정하기
	// 리턴 타입 정하기
	public static int getNoodlesPrice(int count) {
		int result = 850 * count;
		
		return result;
	}
	
	// 오버라이드 (같은 이름의 함수를 다른 파라미터로 재정의 할 수 있다)
	public static int getNoodlesPrice(int count, int price) {
		int result = price * count;
		
		return result;
	}
	
	// 리턴 타입, 파라미터가 없는 함수
	// 헬로 월드를 출력하는 함수
	public static void printHelloWorld() {
		System.out.println("Hello World");
		System.out.println("Hello World");
	}
}
