package com.firstSpringProject.learn_spring_framework.examples.XMLConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XMLConfigrationContextLauncherApplication {

    public static void main(String[] args){
        try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean("name"));
        }

    }
}
