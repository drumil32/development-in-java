package com.sadhulearning01.demo01;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import com.sadhulearning01.demo01.game.GameRunner;
import com.sadhulearning01.demo01.game.GamingConsole;
import com.sadhulearning01.demo01.game.MarioGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		return new MarioGame();
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	}
}
