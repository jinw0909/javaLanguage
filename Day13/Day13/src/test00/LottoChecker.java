package test00;

import java.util.Random;

public class LottoChecker {
	// 당첨번호
	private int[] winningNumber = {1, 2, 3, 4, 5, 6};
	
	//특정 숫자가 해당 배열에서 중복이 되었는지 확인하는 메소드
	private boolean checkDuplicate(int number) {
		for (int i = 0; i < winningNumber.length; i++) {
			if (number == winningNumber[i]) {
				return true;
			}
		}
		return false;
	}
	// 당첨번호 추첨
	public void drawLots() {
		Random random = new Random();
		winningNumber = new int[6];
//		int number = random.nextInt(45) + 1;
		
		// 1 4 5 3 6
		for (int i = 0; i < winningNumber.length; i++) {
			int number = random.nextInt(8) + 1;
			
			if(this.checkDuplicate(number)) {
				i--;
				continue;
			}
			
			winningNumber[i] = number;
		}
		
		for (int i = 0; i < winningNumber.length; i++) {
			int number = random.nextInt(8) + 1;
			for (int j = 0; j < i; j++) {
				(if number == winningNumber[i]) {
					i--;
					break;
				}
			}
			
			winningNumber[i] = number;
		}
		
		
	}
	
	// 체크기능
	public String check(Lotto lotto) {
		
		int[] checkedNumber = lotto.getNumber();
		
		// 몇개가 맞는지 확인
		int count = 0;
		for (int i = 0; i < this.winningNumber.length; i++) {
			int targetNumber = winningNumber[i];
			
			for(int j = 0; j < checkedNumber.length; j++) {
				if(targetNumber == checkedNumber[j]) {
					count++;
					break; //중복 번호가 없음
				}
			}
		}
		System.out.println(count);
		
		switch(count) {
		case 6:
			return "1등";
		case 5: 
			return "2등";
		case 4:
			return "3등";
		case 3:
			return "4등";
		case 2:
			return "5등";
		case 1:
			return "6등";
		default:
			return "꽝!";
		}
		
	}
}
