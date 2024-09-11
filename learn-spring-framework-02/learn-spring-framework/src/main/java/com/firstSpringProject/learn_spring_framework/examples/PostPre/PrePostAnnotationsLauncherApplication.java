package com.firstSpringProject.learn_spring_framework.examples.PostPre;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
    private  SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency){
        super();
        this.someDependency = someDependency;
        System.out.println("All Dependencies are ready...");
    }

    @PostConstruct
    public void initialization(){
        someDependency.getReady();
    }

    @PreDestroy
    public void CleanUp(){
        System.out.println("Clean Up");
    }
}

@Component
class SomeDependency{
    public void getReady(){
        System.out.println("Some Logic Using SomeDependency");
    }
}

@Configuration
//@ComponentScan("com.firstSpringProject.learn_spring_framework.examples.a1")
@ComponentScan
public class PrePostAnnotationsLauncherApplication {

    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationsLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }
}
