package ex03;

public class Ex03 {

	public static void main(String[] args) {
		// 몸무게가 70kg 이하면 치킨을 먹고
		// 그렇지 않으면 샐러드를 먹자
		
		int weight = 74;
		
		if (weight <= 70) {
			System.out.println("치킨먹자");
		} else {
			System.out.println("샐러드 먹자");
		}
		
		//몸무게가 70이하면 치킨을 먹자
		//그렇지 않고 75이하면 닭가슴살을 먹자
		//그렇지 않고 80이하면 샐러드를 먹자
		//그렇지 않으면 굶어!
		
		if (weight <= 70) {
			System.out.println("치킨먹자");
		} else if (weight <= 75) {
			System.out.println("닭가슴살 먹자");
		} else if (weight <= 80) {
			System.out.println("샐러드를 먹자");
		} else {
			System.out.println("굶어!");
		}
		
		if (weight <= 70) 
			System.out.println("치킨먹자");
		
	}

}
