package com.sadhulearning01.demo01.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.sadhulearning01.demo01.game")
public class GamingAppLauncherApplication {
	public static void main(String []args) {
		try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){

			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}
}
