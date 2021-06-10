package ex03;

public class Applicant implements JavaProgramming {
	
	// 토익점수, 학점, 자격증
	private int toeic;
	private double grade;
	private String[] license;
	
	// 자소서 쓰는 기능
	public String writeLetter() {
		String letter = "저는 서울에서 태어나 엄격하신 아버지와 자상하신 어머님 사이에서...";
		return letter;
	}
	
	@Override
	public void objectOriented() {
		System.out.println("저는 메가IT에서 자바를 배워서 잘씁니다. 믿어주세요.");
	}
}
