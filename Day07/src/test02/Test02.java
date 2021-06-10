package test02;

public class Test02 {

	public static void main(String[] args) {
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
		// 01 배열 값 접근
		numbers[3] = 6;
		
		// 02 배열 출력
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		//03
		for (int i = numbers.length - 1 ; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		//04
		for (int i = 1; i < numbers.length; i += 2) {
				System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		//05
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 2) {
				System.out.print(numbers[i] + "가 들어있는 index : " + i);
//				break;
			}
		}
		System.out.println();
		
		//06
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("가장 큰 값 : " + max);
		
		//07
		int index = 0;
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
				index = i;
			}
		}
		System.out.println("최소값의 index : " + index);
		
		//08
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("값의 합 : " + sum);
	}

}
