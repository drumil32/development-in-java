package com.sadhulearning01.demo01.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
//	field base Dependency Injection
	@Autowired
	@Qualifier("superCotraGameQualifier")
	GamingConsole game;
	
//	Constructor base Dependency Injection
//	public GameRunner(@Qualifier("superCotraGameQualifier") GamingConsole game) {
//		this.game = game;
//	}
	
	public void run() {
		System.out.println("we are running this game :- "+game);
		game.up();
		game.right();
		game.left();
		game.down();
	}

}
