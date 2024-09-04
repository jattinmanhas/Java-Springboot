package com.firstSpringProject.learn_spring_framework.game;

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
