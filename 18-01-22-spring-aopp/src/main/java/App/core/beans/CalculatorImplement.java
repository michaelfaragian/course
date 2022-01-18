package App.core.beans;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImplement implements CalculatorBeanInterface {

	@Override
	public String div(int a, int b) throws RuntimeException {
		String str =  a + " / " + b+ " = " + (a+b) + " rem: " + (a%b);
		System.out.println(str);
		return str;
	}

}
