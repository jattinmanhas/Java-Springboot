package com.Spring.LearnSpringAOP.AOPExample.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceTrackingAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

   // @Around("execution(* com.Spring.LearnSpringAOP.AOPExample.*..*(..))")
    @Around("com.Spring.LearnSpringAOP.AOPExample.aspects.CommonPointCutConfig.trackTimeAnnotation()")
    public Object findExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        // Start a timer
        long startTimeMillis = System.currentTimeMillis();
        // Execute the method
        Object returnValue = joinPoint.proceed();

        // Stop the timer.
        long stopTimeMillis = System.currentTimeMillis();

        long executionDuration = stopTimeMillis - startTimeMillis;
        logger.info("Around Aspect - {} Method executed in {}", joinPoint, executionDuration);

        return returnValue;
    }
}
