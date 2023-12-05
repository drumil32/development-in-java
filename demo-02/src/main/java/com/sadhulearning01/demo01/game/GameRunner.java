package com.sadhulearning01.demo01.game;

public class GameRunner {
	GamingConsole game;
	public GameRunner(GamingConsole marioGame) {
		this.game = marioGame;
	}
	public void run() {
		System.out.println("we are running this game :- "+game);
		game.up();
		game.right();
		game.left();
		game.down();
	}

}
