package App.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
//	
//	@Before("execution(* *.*(.., int.. ))")
//	public void logAdviceSpecific(JoinPoint jp) {
//		System.out.println(">>>>>>>>log for method name : " +jp.getSignature());
//	}
////	@Before("execution(* *.*(..))")
////	public void logAdviceAll() {
////		System.out.println("log for all methods");
////	}

}
