package test01;

public class Test01 {

	public static void main(String[] args) {
		
		// 01 
		
		int[][] numbers = new int[2][3];
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = 10;
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
		// 02
		System.out.println();
		
		int[][] numbers2 = new int[3][4];
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = j + 1;
			}
		}
		print2DArray(numbers2);
		
		// 03
		System.out.println();
		
		numbers = new int[3][3];
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = i + 1;
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
		// 04
		System.out.println();
		
		numbers = new int[5][5];
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = 0;
				if (i == 2) {
					numbers[i][j] = 1;
				}
				if (j == 2) {
					numbers[i][j] = 1;
				}
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
		// 05
		System.out.println();
		
		int[][] numbers4 = new int[3][3];
		
		for (int i = 0; i < numbers4.length; i++) {
			for (int j = 0; j < numbers4[i].length; j++) {
				numbers4[i][j] = (i * 3) + (j + 1);
			}
		}
		print2DArray(numbers4);
		
		// 06
		System.out.println();
		
		int[][] numbers5 = new int[3][3];
		
		int count = 1;
		for (int i = 0; i < numbers5.length; i++) {
			for (int j = 0; j < numbers5[i].length; j++) {
				numbers5[j][i] = count;
				count++;
			}
		}
		
		print2DArray(numbers5);

	}
	
	//배열을 출력하는 함수
	public static void print2DArray(int[][] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
