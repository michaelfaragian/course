package a;

import converter.api.currency.CurrencyConverter;
import converter.api.temprature.TempratureConverter;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("start test");
		
	double nis = 100;
	double dollar = CurrencyConverter.convertNISToDollar(nis);
		System.out.println(dollar);
	
		double celsius = 101;
		double faren = TempratureConverter.convertCelsiusToFaren(celsius);
		System.out.println(faren);
			
		// to print in a formatted style
		System.out.format("dollars: %.2f" , dollar);
	}
	
	
	}
	

