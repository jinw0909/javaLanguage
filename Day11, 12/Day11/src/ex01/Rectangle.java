package ex01;

public class Rectangle {
	// 가로 세로
	int width;
	int height;
	
	// 메소드(기능)
	// 넓이를 구하는 메소드
	int calculateArea() {
		int area = width * height;
		return area;
	}
	
	// 오버로드
	// 갯수에 따른 넓이를 구하는 메소드
	int calculateArea(int count) {
		int result = calculateArea() * count;
		
		return result;
	}
	
	// 출력함수
	void printRectangle() {
		System.out.println("가로 : " + width + " 세로 : " + height);
	}
}
