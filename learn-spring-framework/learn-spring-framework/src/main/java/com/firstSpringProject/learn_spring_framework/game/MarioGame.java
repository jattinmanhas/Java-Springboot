package com.firstSpringProject.learn_spring_framework.game;

public class MarioGame implements Game{
    @Override
    public void up(){
        System.out.println("JUMP");
    }

    @Override
    public void down(){
        System.out.println("Go Inside a Hole");
    }

    @Override
    public void left(){
        System.out.println("Go Back");
    }

    @Override
    public void right(){
        System.out.println("Accelerate");
    }
}
