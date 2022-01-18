package App.core.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component 
@Aspect
public class StatisticsAspect {
	
	private int numberOfCalls;
	
	// match on any method that accept company parameter
	@Before("companyParam()") 
	public void counterAdvice() {
		numberOfCalls++;
	}

	public int getNumberOfCalls() {
		return numberOfCalls;
	}
	@Pointcut("execution(* *.*(App.core.dao.company.Company))")
	public void companyParam() {
		
	}

	
	
}
