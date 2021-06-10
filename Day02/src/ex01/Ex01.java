package ex01;

public class Ex01 {

	public static void main(String[] args) {
		int noodleCup;
		int coke = 1500;
		
		noodleCup = 850;
		coke = 1300;
		
		// 육개장 3개의 가격
		int sum = noodleCup * 3;
		
		System.out.println("육개장 3개의 가격은" + sum);
		
		int money = 10000;
		int change = money - sum;
		System.out.println("거스름돈: " + change);
		
		//5000원으로 육개장을 몇개 살 수 있는지
		money = 5000;
		System.out.println("살 수 있는 개수는: " + (money / noodleCup));
		
		//나머지 연산자
		//10 / 3 = 3 ...
		//%
		//5000원으로 살 수 있는 최대 개수로 사고 잔돈이 얼마가 남느냐
		change = money % noodleCup;
		System.out.println("거스름돈: " + change);
		
		
		
	}

}
