package com.sadhulearning01.demo01.lazyInit;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.sadhulearning01.demo01.game.GameRunner;

@Component
class ClassA{
	
}

@Component
@Lazy
class ClassB{
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("hello");
		this.classA = classA;
	}
}

@ComponentScan
public class LazyInitializationLauncherApplication {
	
	GameRunner game;
	public static void main(String []args) {
		try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)){
//			Arrays.stream(context.getBeanDefinitionNames())
//				.forEach(System.out::println);
			System.out.println("inside main");
			context.getBean(ClassA.class);
			
		}
	}
}
