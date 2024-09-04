package com.firstSpringProject.learn_spring_framework.examples.a1;

import com.firstSpringProject.learn_spring_framework.game.Game;
import com.firstSpringProject.learn_spring_framework.game.GameRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// Your Business Class
/*
THIS IS FOR THE FIELD TYPE OF DEPENDENCY INJECTION

@Component
class YourBusinessClass{
    // This is called Field Injection....
    // we're using reflection by adding @autowired keyword at the top of dependency
    @Autowired
    Dependency1 dependency1;

    @Autowired
    Dependency2 dependency2;

    @Override
    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }

}
*/

/*
This is the example of Setting Dependency Injection Using Setters
@Component
class YourBusinessClass{
    Dependency1 dependency1;

    Dependency2 dependency2;

    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("Setting Dependency - 1");
        this.dependency1 = dependency1;
    }

    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("Setting Dependency - 2");
        this.dependency2 = dependency2;
    }

    @Override
    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }

}*/

@Component
class YourBusinessClass{
    Dependency1 dependency1;

    Dependency2 dependency2;

    // @Autowired // Autowired is not mandatory in constructor Injection
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor Injection in Business Class");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    @Override
    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }

}
// Dependency 1
@Component
class Dependency1{

}
// Dependency 2
@Component
class Dependency2{

}

@Configuration
//@ComponentScan("com.firstSpringProject.learn_spring_framework.examples.a1")
@ComponentScan
public class DependencyInjectionLauncherApplication {

    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));
        }

    }
}
