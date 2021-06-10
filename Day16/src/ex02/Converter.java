package ex02;

public abstract class Converter {
	
	private String originUnit;
	private String newUnit;
	
	public Converter(String originUnit, String newUnit) {
		this.originUnit = originUnit;
		this.newUnit = newUnit;
	}
	
	public abstract double convert(double input);
	
	public String stringConvertResult(double input) {
		return input + originUnit + "->" + this.convert(input) + newUnit;
	}
}
