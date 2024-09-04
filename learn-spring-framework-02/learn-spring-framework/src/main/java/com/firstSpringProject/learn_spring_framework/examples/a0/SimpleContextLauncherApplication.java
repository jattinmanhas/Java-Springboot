package com.firstSpringProject.learn_spring_framework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
//@ComponentScan("com.firstSpringProject.learn_spring_framework.examples.a1")
@ComponentScan
public class SimpleContextLauncherApplication {

    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(SimpleContextLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }
}
