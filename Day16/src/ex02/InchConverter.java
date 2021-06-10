package ex02;

public class InchConverter extends Converter {
	
	public InchConverter(String originUnit, String newUnit) {
		super(originUnit, newUnit);
	}
	
	@Override
	public double convert(double input) {
		return input / 2.54;
	}

	@Override
	public String stringConvertResult(double input) {
		// TODO Auto-generated method stub
		return "¼·¾¾ : " + input + " -> È­¾¾" + this.convert(input);
	}
}
