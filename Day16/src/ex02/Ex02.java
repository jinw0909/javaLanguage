package ex02;

public class Ex02 {

	public static void main(String[] args) {
		// 컨버팅을 해주는 클래스
		// cm -> inch
		// 섭씨 -> 화씨
		// 기능적인 부분
		// 전환하는 계산 기능을 가지고 있다.
		// 전환할 값
//		Converter[] converters = new Converter[4];
//		converters[0] = new FahrenheitConverter();
//		converters[1] = new FahrenheitConverter();
//		converters[2] = new InchConverter();
//		converters[3] = new InchConverter();
//		
//		System.out.println(converters[0].stringConvertResult(32));
////		for (int i = 0; i < converters.length ; i++) {
////			converters[i].stringConvertResult();
////		}
		
		Converter converter = new InchConverter("cm", "inch");
		Converter converter2 = new FahrenheitConverter("°C", "°F");

	}

}
