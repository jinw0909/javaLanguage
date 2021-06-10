package ex03;

public class Ex03 {

	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 0; j <= 90; j++) {
				System.out.println(i + "세트" + j + "개째");
			}
		}
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print("(" + i + ", " + j + ")");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
