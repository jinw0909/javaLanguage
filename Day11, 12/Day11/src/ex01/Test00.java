package ex01;

public class Test00 {

	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle();
		rect1.width = 10;
		rect1.height = 15;
		
		int area = rect1.width * rect1.height;
		System.out.println(area);
		
		area = rect1.calculateArea();
		System.out.println(area);
		
		System.out.println(rect1.calculateArea(13));
		
		rect1.printRectangle();
	}

}
