package com.sadhulearning01.demo01.beanScope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class SingletonClass{
	public SingletonClass() {
		System.out.println("this is normal OR SCOPE_SINGLETON");
	}
}

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass{
	public PrototypeClass() {
		System.out.println("this is prototype");
	}
}

@ComponentScan
public class BeanScopesLauncherApplication {
	
	public static void main(String []args) {
		try(var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)){
//			Arrays.stream(context.getBeanDefinitionNames())
//				.forEach(System.out::println);
			System.out.println("inside main");
			
			context.getBean(PrototypeClass.class);
			context.getBean(PrototypeClass.class);
			context.getBean(SingletonClass.class);
			context.getBean(SingletonClass.class);
			
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(SingletonClass.class));
			System.out.println(context.getBean(SingletonClass.class));
		}
	}
}
