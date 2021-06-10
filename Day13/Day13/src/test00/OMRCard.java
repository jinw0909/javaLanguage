package test00;

public class OMRCard {
	// 이름, 학번, 마킹한번호 (1 ~ 5)
	private String name;
	private String studentId;
	private int[] answer;
	
	// 생성자
	public OMRCard(String name, String studentId) {
		this.answer = new int[5]; //생성함과 동시에 배열의 메모리 확보
		this.name = name;
		this.studentId = studentId;
	}
	
	//setter
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setStudentId(String studentId) {
//		this.studentId = studentId;
//	}
//	public void setAnswer(int[] answer) {
//		this.answer = answer;
//	}
	
	// 문제 번호와 정답을 입력하고 이것을 세팅한다.
	public void setAnswer(int number, int answer) {
		if(number < 0 || number > 4) {
			System.out.println("문제 범위가 맞지 않습니다.");
			return;
		}
		if(answer < 1 || answer > 5) {
			System.out.println("정답의 범위가 맞지 않습니다.");
			return;
		}
		this.answer[number] = answer;
	}
	
	public int[] getAnswer() {
		return this.answer;
	}
	
	// omrcard 내용 확인
	public void printCard() {
		System.out.println("이름 : " + this.name);
		System.out.println("학번 : " + this.studentId);
		
		for (int i = 0; i < this.answer.length; i++) {
			System.out.print(this.answer[i] + " ");
		}
		System.out.println();
	}
}
