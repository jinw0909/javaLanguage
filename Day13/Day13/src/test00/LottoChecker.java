package test00;

import java.util.Random;

public class LottoChecker {
	// ��÷��ȣ
	private int[] winningNumber = {1, 2, 3, 4, 5, 6};
	
	//Ư�� ���ڰ� �ش� �迭���� �ߺ��� �Ǿ����� Ȯ���ϴ� �޼ҵ�
	private boolean checkDuplicate(int number) {
		for (int i = 0; i < winningNumber.length; i++) {
			if (number == winningNumber[i]) {
				return true;
			}
		}
		return false;
	}
	// ��÷��ȣ ��÷
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
	
	// üũ���
	public String check(Lotto lotto) {
		
		int[] checkedNumber = lotto.getNumber();
		
		// ��� �´��� Ȯ��
		int count = 0;
		for (int i = 0; i < this.winningNumber.length; i++) {
			int targetNumber = winningNumber[i];
			
			for(int j = 0; j < checkedNumber.length; j++) {
				if(targetNumber == checkedNumber[j]) {
					count++;
					break; //�ߺ� ��ȣ�� ����
				}
			}
		}
		System.out.println(count);
		
		switch(count) {
		case 6:
			return "1��";
		case 5: 
			return "2��";
		case 4:
			return "3��";
		case 3:
			return "4��";
		case 2:
			return "5��";
		case 1:
			return "6��";
		default:
			return "��!";
		}
		
	}
}
