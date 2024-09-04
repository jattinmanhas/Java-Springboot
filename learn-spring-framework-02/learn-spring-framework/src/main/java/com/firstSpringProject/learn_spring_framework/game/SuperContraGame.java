package com.firstSpringProject.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements Game {
    @Override
    public void up(){
        System.out.println("UP");
    }

    @Override
    public void down(){
        System.out.println("DOWN");
    }

    @Override
    public void left(){
        System.out.println("Go Back");
    }

    @Override
    public void right(){
        System.out.println("Shoot bullet");
    }
}
