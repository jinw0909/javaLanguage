package ex03;

public class Ex03 {

	public static void main(String[] args) {
		// 객체를 생성
		ScoreData korean = new ScoreData();
		
		korean.name = "국어";
		korean.score = 100;
		korean.ranking = 1;
		
		System.out.println(korean.name);
		System.out.println(korean.score);
		System.out.println(korean.ranking);
		
		ScoreData math = new ScoreData();
		
		math.name = "수학";
		math.score = 90;
		math.ranking = 3;
		
		System.out.println(math.name);
		System.out.println(math.score);
		System.out.println(math.ranking);
		
		ScoreData[] data = new ScoreData[2];
		
		
		//생성 1
		data[0] = new ScoreData();
		data[1] = new ScoreData();
		
		//생성 2
		for (int i = 0; i < data.length; i++) {
			data[i] = new ScoreData();
		}
 		
		data[0].name = "국어";
		data[0].score = 80;
		data[0].ranking = 10;
		
		data[1].name = "수학";
		data[1].score = 90;
		data[1].ranking = 5;
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i].name);
			System.out.println(data[i].score);
			System.out.println(data[i].ranking);
		}
		
		//생성 3
		ScoreData english = new ScoreData();
		english.name = "영어";
		english.score = 90;
		english.ranking = 3;
		
		data[0] = english;
	}

}
