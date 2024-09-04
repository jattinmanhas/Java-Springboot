package com.firstSpringProject.learn_spring_framework.SpringBasics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02GamingBasicJava {
    public static void main(String[] args){
        // 1: Launch a Spring Context
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
            // 2: Configure the things we want spring to manage - @Configuration
            // HelloWorldConfiguration Class
            // name - @Bean

            // 3: Retrieving Beans managed by Spring
            // we are retrieving by name here...
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("personMethodCalls"));
/*
        System.out.println(context.getBean("customAddress"));
*/
            // we can also retrieve by using datatype;
            System.out.println(context.getBean(Person.class));

            System.out.println(context.getBean("personParameters"));

            // sout
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean("personParametersQualifier"));
        }

    }
}
