package ex01;

public class Ex01 {

	public static void main(String[] args) {
		
	    Shape[] shapes = new Shape[2];

	    shapes[0] = new Rectangle(10, 25);
	    shapes[1] = new Circle(8);

	    for (int i = 0; i < shapes.length; i++) {
	    	System.out.println(shapes[i].getName() + " ³ÐÀÌ " + shapes[i].calcArea() + " µÑ·¹ " +shapes[i].calcRound());
	    }
		

	}

}
