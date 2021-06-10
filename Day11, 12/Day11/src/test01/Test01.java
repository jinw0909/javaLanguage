package test01;

public class Test01 {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		
		circle1.radius = 8;
		System.out.println("원의 넓이 : " + circle1.calculateArea());
		System.out.println("원의 둘레 : " + circle1.calculateLength());
		System.out.println("원 25개 넓이 : " + circle1.calculateArea(25));
		
		Product product1 = new Product();
		
		product1.name = "새우깡";
		product1.price = 1300;
		product1.expirationDate = "2021-03-02";
		
		System.out.println("제품 5개의 가격 : " + product1.calcPrice(5));
		System.out.println("제품 13개의 가격 : " + product1.calcPrice(13));
		
		if(product1.expireChk("2021-05-11")) {
			System.out.println("판매 가능 상품");
		} else {
			System.out.println("판매 불가 상품");
		}
	}

}
