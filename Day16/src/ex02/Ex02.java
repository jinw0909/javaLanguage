package ex02;

public class Ex02 {

	public static void main(String[] args) {
		// �������� ���ִ� Ŭ����
		// cm -> inch
		// ���� -> ȭ��
		// ������� �κ�
		// ��ȯ�ϴ� ��� ����� ������ �ִ�.
		// ��ȯ�� ��
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
		Converter converter2 = new FahrenheitConverter("��C", "��F");

	}

}
