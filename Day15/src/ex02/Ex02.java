package ex02;

public class Ex02 {

	public static void main(String[] args) {

		Shape[] shape = new Shape[3];

        // upcasting
        shape[0] = new Triangle(8, 10);
        shape[1] = new Rectangle(7, 13);
        shape[2] = new Circle(12);
        
        for (int i = 0; i < shape.length; i++) {
        	System.out.println(shape[i].getName() + "�� ���̴� " + shape[i].calcArea() + "cm^2�Դϴ�.");
        }

	}

}