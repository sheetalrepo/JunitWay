package com.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Argument Aggregation Example:
 * 
 * What if CSV has too many columns then our method argument will become too
 * large which will be non readable
 * 
 * @author Sheetal_Singh
 */
public class K_LargeCSVParam {

	//Problem
	@ParameterizedTest
	@CsvSource({ 
		"apple, 1", 
		"banana, 2" 
	})
	void testWithCsvSource(String fruit, int rank) {
		System.out.println(">>" + fruit + " " + rank);
	}

	
	//Solution
	@ParameterizedTest
	@CsvSource({ 
		"Sheetal, Singh, M, 1990-05-25, A1, B1, C1, D1, E1", 
		"Awesome, Junit, F, 1990-10-20, A2, B2, C2, D2, E2" 
	})
	void testWithArgumentsAccessor(ArgumentsAccessor arg) {
		System.out.println("==== * ==== * ====");
		System.out.println("Fname:"+arg.getString(0));
		System.out.println("Lname:"+arg.getString(1));
		System.out.println("Gender:"+arg.getString(2));
		System.out.println("Date:"+arg.getString(3));
		System.out.println("Element:"+arg.getString(8));
		
		//TODO: Call getters/setters of any class in case need to initialize it
		System.out.println("==== * ==== * ====");
	}

}
