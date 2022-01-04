package converter.api.temprature;

public class TempratureConverter {
	
	public static double convertCelsiusToFaren(double celsius) {
		double faren = celsius * 1.8 + 32;
		return faren;
	}

	public static double convertFarenToCelsius(double faren) {
		double celsius = (faren - 32) * 0.5556;
		return celsius;
	}
}
