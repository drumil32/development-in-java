package com.sadhulearning01.demo01.JakartaCDI;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BussinessService{
	private DataService dataService;

	public DataService getDataService() {
		return dataService;
	}

//	@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
}

//@Component
@Named
class DataService{
	
}

@ComponentScan
public class CdiContextLauncherApplication {
	
	public static void main(String []args) {
		try(var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			System.out.println("inside main");
		}
	}
}
