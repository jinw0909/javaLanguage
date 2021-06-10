package test00;

public class Test00 {

	public static void main(String[] args) {
		// OMRCard
		// 이름, 화면, 마킹한 번호
		OMRCard myCard = new OMRCard("장진우", "2124134181");
		
		myCard.setAnswer(0, 1);
		myCard.setAnswer(1, 1);
		myCard.setAnswer(2, 3);
		myCard.setAnswer(3, 2);
		myCard.setAnswer(4, 3);
		
		myCard.printCard();
		
		OMRCardReader reader = new OMRCardReader();
		reader.setSubjectName("자바프로그래밍");
		
		int[] answer = {1, 1, 3, 4, 5};
		reader.setAnswer(answer);
		
		int score = reader.scoring(myCard);
		System.out.println("점수  : " + score);
		
		//
		Lotto lotto = new Lotto();
		LottoChecker lottoChecker = new LottoChecker();
		
		lottoChecker.drawLots();
		lottoChecker.check(lotto);
	}

}
