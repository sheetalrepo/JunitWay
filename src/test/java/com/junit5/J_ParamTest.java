package com.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;

import org.junit.jupiter.api.Test;

public class J_ParamTest {

	@ParameterizedTest
	@ValueSource(strings = { "Thanos", "Spidy", "Thor" })
	void palindromes(String word) {
	  System.out.print(word+", ");
	}
	
	
	/*		
	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3 })
	void testWithValueSource(int argument) {
		System.out.print("Ints: "+argument);
	    assertTrue(argument > 0 && argument < 4);
	    System.out.println("");
	}
	
	
	@ParameterizedTest
	@NullSource
	@EmptySource
	@ValueSource(strings = { " ", "   ", "\t", "\n" })
	void nullEmptyAndBlankStrings(String text) {
		System.out.println(">"+text+"<");
	    assertTrue(text == null || text.trim().isEmpty());
	}
	
	
	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = { " ", "   ", "\t", "\n" })
	void nullEmptyAndBlankStringsN(String text) {
		System.out.println("{"+text+"}");
	    assertTrue(text == null || text.trim().isEmpty());
	}
	
	
	
	*/
	
}
