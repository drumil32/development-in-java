package com.sadhulearning01.demo01.examples.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.sadhulearning01.demo01.game.GameRunner;

@ComponentScan
public class DepInjectionLauncherApplication {
	
	GameRunner game;
	public static void main(String []args) {
		try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
		}
	}
}
