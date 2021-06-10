package test03;

public class Test03 {

	public static void main(String[] args) {
		
		// 숫자 문자열
		
		String numberString = "30";
		String numberString2 = "20";
		
		int number1 = Integer.parseInt(numberString);
		int number2 = Integer.parseInt(numberString2);
		
		System.out.println(number1 + number2);
		
		// 숫자 => 문자열
		
		number1 = 5;
		number2 = 10;
		
		// 꼼수!
		numberString = number1 + "";
		numberString2 = number2 + "";
		
		System.out.println(numberString + numberString2);
		
		// 정석적인 방법
		numberString = String.valueOf(number1);
		
		//문자열 비교
		String word1 = new String("고양이");
		String word2 = "고양이";
		
		//두 문자열은 같을까?
		if(word1 == word2) {
			System.out.println("두 문자열은 같아요.");
		} else {
			System.out.println("두 문자열은 달라요.");
		}
		
		//문자열 비교하는 법
		if(word1.equals(word2)) {
			System.out.println("두 문자열은 같아요.");
		} else {
			System.out.println("두 문자열은 달라요.");
		}
	}

}
