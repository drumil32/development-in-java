package com.sadhulearning01.demo01.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name,int age,Address address) {}
record Address (String firstLine,String city) {}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Drumil";
	}
	
	@Bean
	public int age() {
		return 21;
	}
	
//	person been is not depended on Address bin BECAUSE it is creating new object of address it's not using the Address bin
	@Bean
	@Primary
	public Person person1() {
		return new Person("drumil", 22,new Address("motimard","mardMoti"));
	}
	
//	what if one been is dependent on other
//	here dependedPerson bin is dependent on name,age,address bin.
	@Bean
	public Person dependedPerson2() {
		return new Person(name(),age(),address());
	}
	
	@Bean
	public Person parameterPerson3(String name,int age,@Qualifier("address3qualifier")Address address3) {
		return new Person(name,age,address3);
	}
	
	@Bean(name="address2")
	@Primary
	public Address address() {
		return new Address("station road","Dhoraji");
	}
	
	@Bean(name="address3")
	@Qualifier("address3qualifier")
	public Address address2() {
		return new Address("123","456");
	}
}
