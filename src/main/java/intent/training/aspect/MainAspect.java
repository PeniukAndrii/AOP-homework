package intent.training.aspect;

import intent.training.services.Checker;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MainAspect {

    @Pointcut("execution(public * revision(..))")
    private void revision() {
        // nothing here
    }

    @Pointcut("execution(public * instruction(..))")
    private void instruction() {
        // nothing here
    }

    @Pointcut("execution(public * engineExist(..))")
    private void engineExistPointcut() {
        // nothing here
    }

    @Before("instruction()")
    public void instructionAdvice(JoinPoint joinPoint){
        System.out.println("instruction for  " + joinPoint.getArgs()[0].getClass().getSuperclass().getSimpleName() + "... Do something, and be ready for take off!");
    }

    @AfterReturning(value = "engineExistPointcut()", returning = "response")
    public void packageAdvice(JoinPoint joinPoint, boolean response){
        if(response){
            System.out.println("Massage for engine mechanism, Hello- " + joinPoint.getSignature().getDeclaringType().getSimpleName() + " have a good one!");
        }
    }

    @AfterReturning(pointcut = "revision()", returning = "response")
    public void auditAfterAdvice(Object response) {
        System.out.println("Status - " + response);
    }


    @Around("args(value0, value1, value2)")
    public void afterGasAccess(ProceedingJoinPoint point,Object value0, int value1, int value2) throws Throwable  {
        if(value2-value1!=0){
            System.out.println("FuelLoader is load " + (value2-value1) + " gas in " + value0.getClass().getSuperclass().getSimpleName() + " and now it's ready to take off");
        }
        point.proceed();
    }

    @Around("args(value0, value1, value2, value3, value4)")
    public void afterGasAccess(ProceedingJoinPoint point,Object value0, int value1, int value2, int value3, int value4) throws Throwable  {
        if(value2-value1!=0 && value3-value4!=0){
            System.out.println("FuelLoader is load " + (value2-value1)+ " & " + (value4-value3) + " gas in " + value0.getClass().getSuperclass().getSimpleName() + " and now it's ready to take off");
        }
        point.proceed();
    }


}
