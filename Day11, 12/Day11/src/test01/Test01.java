package test01;

public class Test01 {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		
		circle1.radius = 8;
		System.out.println("���� ���� : " + circle1.calculateArea());
		System.out.println("���� �ѷ� : " + circle1.calculateLength());
		System.out.println("�� 25�� ���� : " + circle1.calculateArea(25));
		
		Product product1 = new Product();
		
		product1.name = "�����";
		product1.price = 1300;
		product1.expirationDate = "2021-03-02";
		
		System.out.println("��ǰ 5���� ���� : " + product1.calcPrice(5));
		System.out.println("��ǰ 13���� ���� : " + product1.calcPrice(13));
		
		if(product1.expireChk("2021-05-11")) {
			System.out.println("�Ǹ� ���� ��ǰ");
		} else {
			System.out.println("�Ǹ� �Ұ� ��ǰ");
		}
	}

}
