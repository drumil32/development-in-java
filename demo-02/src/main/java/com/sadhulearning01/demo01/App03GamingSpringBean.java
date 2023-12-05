package com.sadhulearning01.demo01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sadhulearning01.demo01.game.GameRunner;
import com.sadhulearning01.demo01.game.GamingConsole;
import com.sadhulearning01.demo01.game.MarioGame;

@Configuration
@ComponentScan("com.sadhulearning01.demo01.game")
public class App03GamingSpringBean {
	
//	@Bean
//	public GamingConsole game() {
//		return new MarioGame();
//	}
	
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		return new GameRunner(game);
//	}
	
	public static void main(String []args) {
		try(var context = new AnnotationConfigApplicationContext(App03GamingSpringBean.class)){
//			System.out.println(context.getBean("game").getClass());
//			((GamingConsole)context.getBean("game")).up();
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}
}
