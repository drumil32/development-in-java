package com.sadhulearning01.demo01.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{

	public void up() {
		System.out.println("moving up mario");
	}

	public void down() {
		System.out.println("moving down mario");
	}
	
	public void left() {
		System.out.println("moving left mario");
	}
	
	public void right() {
		System.out.println("moving right mario");
	}
}
