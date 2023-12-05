package com.sadhulearning01.demo01.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.sadhulearning01.demo01.game.GameRunner;


@Component
class BusinessClass{
	
//	Field based Dependency Injection
//	@Autowired
	Dependency1 dependency1;
//	@Autowired
	Dependency2 dependency2;
	
//	Constructor-based Dependency Injection
	public BusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("constructor is invocked "+this.dependency1);
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

//	Setter based Dependency Injection
	@Autowired
	public void setDependency1(Dependency1 dependency1) {
		System.out.println("setter method is invocked :- "+this.dependency1);
		this.dependency1 = dependency1;
	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		this.dependency2 = dependency2;
//	}
	
	public String toString() {
		return "using " + dependency1 + " and " + dependency2;
	}
}

@Component
class Dependency1{
	public String toString() {
		return "Dependency1";
	}
}

@Component
class Dependency2{
	public String toString() {
		return "Dependency2";
	}
}

@ComponentScan
public class DepInjectionLauncherApplication {
	
	GameRunner game;
	public static void main(String []args) {
		try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			System.out.println(context.getBean(BusinessClass.class));
		}
	}
}
