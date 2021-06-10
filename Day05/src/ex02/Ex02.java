package ex02;

public class Ex02 {

	public static void main(String[] args) {
		int i = 0;
		while (true) {
			if (i == 5) {
				break;
			}
			System.out.println("Hello World");
			i++;
		}
		
	
		// continue 
		for (i = 0; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}
