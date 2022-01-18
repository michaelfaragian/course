package App.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	
	//Advice type 1 - before
	@Before("div()")
	public void beforeDivAdvice(JoinPoint jp) {
		System.out.println("beforeDivAdvice " + jp);
	}
	
	//Advice type 2 - after
	@After("div()")
	public void afterDivAdvice(JoinPoint jp) {
		System.out.println("afterDivAdvice " + jp);
	}
	
	//Advice type 3 - after return
	@AfterReturning(pointcut = "div()", returning = "res")
	public void afterReturnDivAdvice(JoinPoint jp, String res) {
		System.out.println("afterReturnDivAdvice " + jp+ " [result : " + res +"]");
	}
	//Advice type 4 - after throwing
	@AfterThrowing(pointcut = "div()",throwing =  "e")
	public void afterThrowDivAdvice(JoinPoint jp, Throwable e) {
		System.out.println("@AfterThrowing " + jp+ " [exception : " + e +"]");
	}
	//Advice type 4 - around
	@Around("div()")
	public void aroundDivAdvice(ProceedingJoinPoint pjp) {
		System.out.println("@Around - before" + pjp);
		// run the join point (business method)
	    try {
			Object res = pjp.proceed();
			System.out.println("around after return : "  + res);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("@Around - after " + pjp);
	}
	
	
	
	@Pointcut("execution(* *.div(..))")
	public void div() {
		
	}
}
