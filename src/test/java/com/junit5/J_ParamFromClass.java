package com.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

/**
 * This class will pick test data from TestDataProvider class
 * 
 * @author Sheetal_Singh
 *
 */
public class J_ParamFromClass {

	

	@ParameterizedTest
	@ArgumentsSource(J_TestDataProvider.class)
	void testWithArgumentsSource(String argument) {
		System.out.println(argument);
		Assertions.assertNotNull(argument);
	}
	
	
}
