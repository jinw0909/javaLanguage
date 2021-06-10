package work01;

public class Goods {
	private String name;
	private int price;
	private String status;
	
	public Goods(String name, int price, String status) {
		if (status.equals("�Ǹ���") || status.equals("�ǸſϷ�") || status.equals("������")) {
			this.name = name;
			this.price = price;
			this.status = status;
		} else {
			System.out.println("�ǸŻ��°� ��ȿ���� �ʽ��ϴ�.");
		}
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return this.name + this.price + this.status;
	}
	
}
