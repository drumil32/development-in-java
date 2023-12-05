package com.sadhulearning01.demo01.Exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class DepInjectionLauncherApplication {
	
	public static void main(String []args) {
		try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)){
//			Arrays.stream(context.getBeanDefinitionNames())
//				.forEach(System.out::println);
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}
}
