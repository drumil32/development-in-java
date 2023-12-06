package com.sadhulearning01.demo01.prePost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("someClass");
	}
	
	@PostConstruct
	public void getReady() {
		System.out.println("get ready method of SomeClass");
		this.someDependency.fetchData();
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("we are cleaning up the data of SomeClass");
	}
}

@Component
class SomeDependency{
	
	public SomeDependency() {
		System.out.println("SomeDependency");
	}

	public void fetchData() {
		System.out.println("we are fetching data in SomeDependency class");
	}
	
	@PostConstruct
	public void getReady() {
		System.out.println("get ready method of SomeDependency");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("we are cleaning up the data of SomeDependency");
	}
	
}

@ComponentScan
public class PrePostContextLauncherApplication {
	
	public static void main(String []args) {
		try(var context = new AnnotationConfigApplicationContext(PrePostContextLauncherApplication.class)){
//			Arrays.stream(context.getBeanDefinitionNames())
//				.forEach(System.out::println);
			System.out.println("inside main");
		}
	}
}
