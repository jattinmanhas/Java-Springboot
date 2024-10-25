package com.Spring.LearnSpringAOP.AOPExample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// 1: Configuration
// AOP
@Configuration
@Aspect
public class LogginAspect {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    // Point Cut = when?
    // execution(* PACKAGE.*.*(..)) -> syntax how to define pointcut
    // execution(* com.Spring.LearnSpringAOP.AOPExample.Business.*.*.(..))
//    @Before("execution(* com.Spring.LearnSpringAOP.AOPExample.Business..*(..))")
//    @Before("execution(* com.Spring.LearnSpringAOP.AOPExample.*..*(..))")
//    @Before("com.Spring.LearnSpringAOP.AOPExample.aspects.CommonPointCutConfig.businessAndDataPackageConfig()")
    @Before("com.Spring.LearnSpringAOP.AOPExample.aspects.CommonPointCutConfig.dataPackageConfigUsingBeans()")
    public void logMethodCallBeforeExecution(JoinPoint joinPoint){
        //Logic = what?
        logger.info("Before Aspect - Method is called - {}", joinPoint);
    }

    @After("com.Spring.LearnSpringAOP.AOPExample.aspects.CommonPointCutConfig.businessPackageConfig()")
    public void logMethodCallAfterExecution(JoinPoint joinPoint){
        //Logic = what?
        logger.info("After Aspect - Method is called - {} - has executed", joinPoint);
    }

    @AfterThrowing(
            value = "com.Spring.LearnSpringAOP.AOPExample.aspects.CommonPointCutConfig.businessAndDataPackageConfig()",
            throwing = "exception"
    )
    public void logMethodCallAfterThrowingExecution(JoinPoint joinPoint, Exception exe){
        //Logic = what?
        logger.info("After Throwing Aspect -  {} has executed and thrown exception {}", joinPoint, exe);
    }

    @AfterReturning(
            value = "com.Spring.LearnSpringAOP.AOPExample.aspects.CommonPointCutConfig.dataPackageConfig()",
            returning = "resultValue"
    )
    public void logMethodCallAfterReturningExecution(JoinPoint joinPoint, Object resultValue){
        //Logic = what?
        logger.info("After Returning Aspect -  {} has successfully executed and returned {}", joinPoint, resultValue);
    }


}
