package ex03;

public class Snack {
	private String name;
	private int price;
	private int stack;
	
	public Snack (String name, int price, int stack) {
		this.name = name;
		this.price = price;
		this.stack = stack;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStack() {
		return stack;
	}

	public void setStack(int stack) {
		this.stack = stack;
	}
	
	@Override
	public String toString() {
		return "제품명 : " + this.name + " 가격 : " + this.price + " 재고 : " + this.stack;
	}
}
