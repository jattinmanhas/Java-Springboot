package com.Spring.LearnSpringAOP.AOPExample.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Controller;


public class CommonPointCutConfig {
    @Pointcut("execution(* com.Spring.LearnSpringAOP.AOPExample.*..*(..))")
    public void businessAndDataPackageConfig(){

    }

    @Pointcut("execution(* com.Spring.LearnSpringAOP.AOPExample.Business..*(..))")
    public void businessPackageConfig(){

    }

    @Pointcut("execution(* com.Spring.LearnSpringAOP.AOPExample.Data..*(..))")
    public void dataPackageConfig(){

    }

    @Pointcut("bean(*Service*)")
    public void dataPackageConfigUsingBeans(){

    }

    @Pointcut("@annotation(com.Spring.LearnSpringAOP.AOPExample.Annotations.TrackTime)")
    public void trackTimeAnnotation(){

    }

}
