package test00;

public class Test00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade myGrade = new Grade();
		myGrade.name = "���α�";
		int[] scores = {80, 94, 75};
		myGrade.scores = scores;
		for (int i = 0; i < myGrade.scores.length; i++) {
			System.out.print(myGrade.scores[i] + " ");
		}
		
		System.out.println();
		System.out.println(myGrade.getAverage());
		
		Person chang = new Person();
		chang.name = "������";
		chang.birth = "19890909";
		chang.gender = "����";
		
		System.out.println("�̸� : " + chang.name);
		System.out.println("������� : " + chang.birth);
		System.out.println("���� : " + chang.getAge(2021));
		
		chang.greeting(2021);
		
		Person yu = new Person();
		yu.name = "���缮";
		yu.birth = "19881104";
		yu.gender = "����";
		
		int gap = chang.compareAge(yu);
	}

}
