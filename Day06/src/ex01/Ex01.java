package ex01;

public class Ex01 {

	public static void main(String[] args) {
		//��ġ������ 10ȸ 3��Ʈ
//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= 10; j++) {
//				//System.out.print("���X���X ");
//				
//				System.out.print(i + "��Ʈ " + j + "��° ");
//			}
//			System.out.println();
//		}
		
//		*****
//		*****
//		*****
//		for(int i = 0; i < 3; i++) {
//			
//			for(int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
		
//		*
//		**
//		***
//		****
//		*****
		
		
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println();
		
//		*****
//		****
//		***
//		**
//		*
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println();
		
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println();
//		
//	     *
//	    ***
//	   *****
//	  *******
//	 *********
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2 * i; j++) {
				System.out.print("*");
			}
			System.out.print("*");
			System.out.println();
		}
	}

}
