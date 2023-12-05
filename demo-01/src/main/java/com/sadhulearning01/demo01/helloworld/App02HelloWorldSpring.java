package com.sadhulearning01.demo01.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {

//		1: Launch a Spring Context
		
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
		
	//		2: Configure the things that we want Spring to manage - @Configuration
			
	//		3: Retrieving beans managed by Spring
			
	//		System.out.println(context.getBean("name"));
	//		
	//		System.out.println(context.getBean("age"));
	//		
	//		System.out.println(context.getBean("person1"));
	//		
	//		System.out.println(context.getBean("address2"));
			
	//		System.out.println(context.getBean(Address.class));
			
	//		System.out.println(context.getBean("dependedPerson2"));
			
	//		var temp = context.getBean("person1");
	//		System.out.println(temp);
	//		var temp1 = context.getBean("dependedPerson2");
	//		System.out.println(temp1);
	//		
	//		if( temp==temp1 ) {
	//			System.out.println("yes it is");
	//		}else
	//			System.out.println("no it's not");
	//		
	//		var temp2 = context.getBean("parameterPerson3");
	//		System.out.println(temp2);
			
	//		System.out.println("========================================================================");
	//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	//		
	//		System.out.println(context.getBean(Address.class));
	//		System.out.println(context.getBean(Person.class));
			
			System.out.println(context.getBean("parameterPerson3"));
		}
	}
}
