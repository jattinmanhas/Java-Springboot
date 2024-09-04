package com.firstSpringProject.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacmanGame")
public class PacmanGame implements Game {
    @Override
    public void up(){
        System.out.println("Go Up");
    }

    @Override
    public void down(){
        System.out.println("Go Down");
    }

    @Override
    public void left(){
        System.out.println("Go Left");
    }

    @Override
    public void right(){
        System.out.println("Go Right");
    }

}
