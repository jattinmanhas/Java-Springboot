package com.firstSpringProject.learn_spring_framework.examples.BeanScopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class NormalClass{

}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass{

}

@Configuration
@ComponentScan
public class BeanScopesApplicationLauncher {

    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(BeanScopesApplicationLauncher.class)){
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            // So, whenever we call for prototype class, a new instance will be created
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));

            // whenever we call for normal class same instance will be returned
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
        }

    }
}
