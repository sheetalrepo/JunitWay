package com.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Custom Aggregator Example:
 * 
 * With Large CSV we need to fetch data and then need to call setters/getters
 * 
 * With following approach we don't need to call setters
 * 
 * @author Sheetal_Singh
 */
public class K_PersonTestClass {

	@ParameterizedTest
	@CsvSource({ 
		"Albert, 25, Pune", 
		"John, 30, Malaga" 
	})
	void testWithArgumentsAggregator(@AggregateWith(K_PersonAggregator.class) K_Person person) {

		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		System.out.println("City: " + person.getCity());
		System.out.println("==== * ==== * ====");
	}
}
