package com.firstSpringProject.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    Game game;

    public GameRunner(@Qualifier("PacmanGame") Game game) {
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
