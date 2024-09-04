package com.firstSpringProject.learn_spring_framework;

import com.firstSpringProject.learn_spring_framework.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpringBeans {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
//            context.getBean(Game.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}
