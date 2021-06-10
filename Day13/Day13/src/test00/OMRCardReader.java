package test00;

public class OMRCardReader {
	// 정답, 과목명
	private String subjectName;
	private int[] answer;
	
	//setter
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public void setAnswer(int[] answer) {
		this.answer = answer;
	}
	
	//채점기능
	public int scoring(OMRCard omrcard) {
		int score = 0;
		int[] omrAnswer = omrcard.getAnswer();
		for (int i = 0; i < this.answer.length; i++) {
			if (this.answer[i] == omrAnswer[i]) {
				score += 20;
			}
		}
		return score;
	}
}
