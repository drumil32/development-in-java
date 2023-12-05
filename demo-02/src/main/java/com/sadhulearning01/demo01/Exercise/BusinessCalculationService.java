package com.sadhulearning01.demo01.Exercise;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
	DataService dataService;
	
	BusinessCalculationService(DataService dataService){
		super();
		this.dataService = dataService;
	}
	
	public int findMax() {
		return Arrays.stream(dataService.retrieveData())
				.max().orElse(0);
	}

}
