package test00;

public class Test00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade myGrade = new Grade();
		myGrade.name = "김인규";
		int[] scores = {80, 94, 75};
		myGrade.scores = scores;
		for (int i = 0; i < myGrade.scores.length; i++) {
			System.out.print(myGrade.scores[i] + " ");
		}
		
		System.out.println();
		System.out.println(myGrade.getAverage());
		
		Person chang = new Person();
		chang.name = "장진우";
		chang.birth = "19890909";
		chang.gender = "남자";
		
		System.out.println("이름 : " + chang.name);
		System.out.println("생년월일 : " + chang.birth);
		System.out.println("나이 : " + chang.getAge(2021));
		
		chang.greeting(2021);
		
		Person yu = new Person();
		yu.name = "유재석";
		yu.birth = "19881104";
		yu.gender = "남자";
		
		int gap = chang.compareAge(yu);
	}

}
