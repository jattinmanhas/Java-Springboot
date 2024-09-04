package com.firstSpringProject.learn_spring_framework.game;

public class GameRunner {
    Game game;

    public GameRunner(Game game) {
        this.game = game;
    }

    public void run(){
        System.out.println("Running Game: "+ game);
        game.down();
        game.up();
        game.left();
        game.right();
    }
}
