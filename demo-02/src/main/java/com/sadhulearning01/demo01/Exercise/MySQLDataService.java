package com.sadhulearning01.demo01.Exercise;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mySQLDataService@Qualifier")
public class MySQLDataService implements DataService{
	@Override
	public int[] retrieveData() {
		return new int[] { 1, 2, 3, 4, 5 };
	}

}
