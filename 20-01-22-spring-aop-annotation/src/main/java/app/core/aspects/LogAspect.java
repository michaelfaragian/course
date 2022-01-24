package app.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	@Before("logAnnotClass()")
	public void logAdvice (JoinPoint jp) {
		System.out.println(">>>before " + jp);
	}
	@Pointcut("@annotation(app.core.annotations.MyLogAnnotation)")
	public void logAnnotMethod() {
		
	}
	@Pointcut("@target(app.core.annotations.MyLogAnnotation)")
	public void logAnnotClass() {
		
	}
//	
//	@Before("execution(* *.find(..))")
//	public void logAdvice (JoinPoint jp) {
//		System.out.println(">>>before " + jp);
//	}
}
