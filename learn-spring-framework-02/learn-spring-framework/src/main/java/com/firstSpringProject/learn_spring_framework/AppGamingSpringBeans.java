package com.firstSpringProject.learn_spring_framework;

import com.firstSpringProject.learn_spring_framework.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.firstSpringProject.learn_spring_framework.game.Game;
import com.firstSpringProject.learn_spring_framework.game.GameRunner;
import com.firstSpringProject.learn_spring_framework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com/firstSpringProject/learn_spring_framework/game")
public class AppGamingSpringBeans {

    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(AppGamingSpringBeans.class)){
            context.getBean(Game.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}
