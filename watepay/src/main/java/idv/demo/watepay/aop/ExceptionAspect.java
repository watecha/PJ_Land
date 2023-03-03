package idv.demo.watepay.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExceptionAspect {

    @Pointcut("within(idv.demo..*) && execution(* *(..))")
    public void matchAllMyMethods() {}

    @Around(value = "matchAllMyMethods()")
    public Object handleWithException(ProceedingJoinPoint joinPoint) throws Throwable {
        Logger logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass().getName());
        logger.info("around");

        try {
            // continue the original method execution
            return joinPoint.proceed();
        } catch (Exception exception) {
            // custom aspect logic
            logger.error("exception:" + exception);
            throw exception;
        } finally {
            // custom aspect logic
        }
    }
}
