package com.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Reading data from CSV Files
 * @author Sheetal_Singh
 */
public class J_ParamCSVTest {
	
	@ParameterizedTest
	@CsvSource({
	    "apple, 1",
	    "banana, 2"
	})
	void testWithCsvSource(String fruit, int rank) {
		System.out.println(">>"+fruit+ " "+ rank);
	    Assertions.assertNotNull(fruit);
	    Assertions.assertNotEquals(0, rank);
	}

	
	

	//@ParameterizedTest
	//@CsvFileSource(resources = "/com/junit5/csvsource.csv", numLinesToSkip = 1)
	void testWithCsvFileSource(String country, int reference) {
		System.out.println(country+ ": "+ reference);
	    Assertions.assertNotNull(country);
	    Assertions.assertNotEquals(0, reference);
	}
	
	
	
	@DisplayName("Price Chart")
	//@ParameterizedTest(name = "{index} ==> The Price of ''{0}'' is {1}")
	@CsvSource({
	    "apple, 100",
	    "banana, 50"
	})
	void testWithDisplayName(String fruit, int rank) {
		System.out.println(fruit+ " "+ rank);
	}
	
	
	
}
