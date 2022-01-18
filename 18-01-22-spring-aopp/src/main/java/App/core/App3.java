package App.core;

import javax.swing.JOptionPane;

import org.aspectj.lang.JoinPoint;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import App.core.beans.CalculatorBeanInterface;

public class App3 {
	public static void main(String[] args) {
		
//		int b = Integer.parseInt(JOptionPane.showInputDialog("enter 1st number"));
//		int c = Integer.parseInt(JOptionPane.showInputDialog("enter 2nd number"));
			
			int b = 10;
			int c = 4;
				
			try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
				CalculatorBeanInterface a = ctx.getBean(CalculatorBeanInterface.class);
			
			System.out.println(a.div(b, c));
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
