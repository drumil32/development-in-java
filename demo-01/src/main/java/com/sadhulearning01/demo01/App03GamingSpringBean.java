package com.sadhulearning01.demo01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sadhulearning01.demo01.game.GameRunner;
import com.sadhulearning01.demo01.game.GamingConsole;

public class App03GamingSpringBean {

	public static void main(String []args) {
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			System.out.println(context.getBean("game").getClass());
			((GamingConsole)context.getBean("game")).up();
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}
}
