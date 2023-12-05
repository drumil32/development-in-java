package com.sadhulearning01.demo01.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("superCotraGameQualifier")
public class SuperCotraGame implements GamingConsole{
	public void up() {
		System.out.println("moving up superContra");
	}

	public void down() {
		System.out.println("moving down superContra");
	}
	
	public void left() {
		System.out.println("moving left superContra");
	}
	
	public void right() {
		System.out.println("moving right superContra");
	}
}
