package test00;

public class Test00 {

	public static void main(String[] args) {
		// OMRCard
		// �̸�, ȭ��, ��ŷ�� ��ȣ
		OMRCard myCard = new OMRCard("������", "2124134181");
		
		myCard.setAnswer(0, 1);
		myCard.setAnswer(1, 1);
		myCard.setAnswer(2, 3);
		myCard.setAnswer(3, 2);
		myCard.setAnswer(4, 3);
		
		myCard.printCard();
		
		OMRCardReader reader = new OMRCardReader();
		reader.setSubjectName("�ڹ����α׷���");
		
		int[] answer = {1, 1, 3, 4, 5};
		reader.setAnswer(answer);
		
		int score = reader.scoring(myCard);
		System.out.println("����  : " + score);
		
		//
		Lotto lotto = new Lotto();
		LottoChecker lottoChecker = new LottoChecker();
		
		lottoChecker.drawLots();
		lottoChecker.check(lotto);
	}

}
