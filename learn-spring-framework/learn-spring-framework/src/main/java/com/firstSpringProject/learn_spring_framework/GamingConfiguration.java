package com.firstSpringProject.learn_spring_framework;

import com.firstSpringProject.learn_spring_framework.game.Game;
import com.firstSpringProject.learn_spring_framework.game.GameRunner;
import com.firstSpringProject.learn_spring_framework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public Game game(){
        Game game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(Game game){
        GameRunner g = new GameRunner(game);
        return g;
    }
}
