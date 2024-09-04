package com.firstSpringProject.learn_spring_framework.SpringBasics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address){};
record Address(String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Jattin";
    }

    @Bean
    public int age(){
        return 23;
    }

    @Bean
    public Person person(){
        Person per =  new Person("De Ligt", 25, new Address("Main Street", "Utrecht"));
        return per;
    }

    @Bean
    public Person personMethodCalls(){
        return new Person(name(), age(), address());
    }

    @Bean
    @Primary
    public Person personParameters(String name, int age, Address customAddress){ // name, age, customAddress
        return new Person(name, age, customAddress);
    }

    @Bean
    public Person personParametersQualifier(String name, int age, @Qualifier("addressQualifier") Address address){ // name, age, customAddress
        return new Person(name, age, address);
    }

    @Bean(name = "customAddress")
    public Address address(){
        Address add = new Address("Old Trafford", "Manchester");
        return add;
    }

    @Bean(name = "address2")
    @Qualifier("addressQualifier")
    public Address address2(){
        return new Address("Baker Street", "London");
    }
}
