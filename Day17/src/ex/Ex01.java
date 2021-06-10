package ex;

public class Ex01 {

	public static void main(String[] args) {
		int number1 = 10;
		System.out.println(number1);
		
		Integer number2 = 10;
		System.out.println(number2);
		
		Integer number3 = new Integer(10);
		System.out.println(number3);
		
		Integer number4 = new Integer(10);
		
		System.out.println(number1 == number2);
		System.out.println(number1 == number3);
		System.out.println(number2 == number3);

		Integer number5 = 20;
		Integer number6 = 20;
		System.out.println(number5 == number6);
	}

}
