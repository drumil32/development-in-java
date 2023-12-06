package com.sadhulearning01.demo01.lazyInit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

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
	
	public static void main(String []args) {
		try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)){
//			Arrays.stream(context.getBeanDefinitionNames())
//				.forEach(System.out::println);
			System.out.println("inside main");
			context.getBean(ClassA.class);
			
		}
	}
}
