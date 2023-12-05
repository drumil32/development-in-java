package com.sadhulearning01.demo01;

import com.sadhulearning01.demo01.game.GameRunner;
import com.sadhulearning01.demo01.game.MarioGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		var game = new MarioGame(); // 1: Object Creation
//		var game = new SuperCotraGame(); // 1: Object Creation
		
		var gameRunner = new GameRunner(game); 
			// 2: Object Creation + Wiring of Dependencies
			// Game is dependency of GameRunner class
		
//		var gameRunner = new GameRunner(game);
		gameRunner.run();
		
	}

}
