package test02;

public class Test02 {

	public static void main(String[] args) {
		//1번
		char resultA = 'A';
		char resultB = 'B';
		double averageA = 4.0;
		double averageB = 3.0;
		System.out.println("시험 성적이 90점 이상이면 \'" + resultA + "\'학점이고 평점은 " + averageA + "입니다." );
		System.out.println("시험 성적이 80점 이상이면 \'" + resultB+ "\'학점이고 평점은 " + averageB + "입니다." );
		
		//2번
		int number1 = 33;
		double number2 = 35.325;
		
		System.out.println("두 수의 곱 : " + number1 * number2);
		
		//3번
		int day = 24;
		
		System.out.println("943시간은 " + (943 / day) + "일 입니다.");
		
		//4번
		int width = 8;
		int height = 9;
		int sq = width * height;
		double tri = sq / (double)2;
		
		System.out.println("사각형의 넓이 : " + sq);
		System.out.println("삼각형의 넓이 : " + tri);
		
		//5번
		int korean = 93;
		int math = 88;
		int english = 94;
		double averageScore = (korean + math + english) / 3.0;
		
		System.out.println("국어 " + korean + "점, 수학 " + math + ", 영어 " + english + "점");
		System.out.println("평균 " + averageScore);
		
		//6번
		int celsius = 30;
		double fahrenHeit =  9 / 5.0 * celsius + 32;
		System.out.println("섭씨 " + celsius + "도는 화씨 " + fahrenHeit + "도 입니다.");
		
	}

}
