package ex02;

public class FahrenheitConverter extends Converter {

	public FahrenheitConverter(String originUnit, String newUnit) {
		super(originUnit, newUnit);
	}
	
	@Override
	public double convert(double input) {
		// TODO Auto-generated method stub
		return 9 / 5.0 * input + 32;
	}

	@Override
	public String stringConvertResult(double input) {
		// TODO Auto-generated method stub
		return "¼·¾¾" + input + " " + this.convert(input) + " ";
	}

}
