package test01;

public class Triangle {
	private int base;
	private int height;
	private int width;
	
	public Triangle(int base, int height, int width) {
		this.base = base;
		this.height = height;
		this.width = width;
	}
	
	@Override
	public boolean equals(Object object) {
		Triangle triangle = (Triangle)object;
		if (this.height == triangle.height 
				&& this.width == triangle.width 
				&& this.base == triangle.base) {
			return true;
		}
		return false;
	}
	
}
