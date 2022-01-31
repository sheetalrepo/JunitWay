package com.junit5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class J_ParamMethodSourceTest {

	static Stream<String> fruitSeller() {
		return Stream.of("apple", "banana");
	}

	//@ParameterizedTest
	@MethodSource("fruitSeller")
	void testWithExplicitLocalMethodSource(String argument) {
		System.out.println(argument);
		Assertions.assertNotNull(argument);
	}

	
	
	
	
	// ---------------------------------------------//

	static IntStream range() {
		return IntStream.range(0, 5);
	}

	//@ParameterizedTest
	@MethodSource("range")
	void testWithRangeMethodSource(int argument) {
		System.out.println(argument);
	}

	
	
	// ---------------------------------------------//

	static Stream<Arguments> stringIntAndListProvider() {
		return Stream.of(
				Arguments.of("apple", 1, Arrays.asList("a", "b")),
				Arguments.of("lemon", 2, Arrays.asList("x", "y")))
		;
	}

	//@ParameterizedTest
	@MethodSource("stringIntAndListProvider")
	void testWithMultiArgMethodSource(String str, int num, List<String> list) {
		System.out.println(str);
		System.out.println(num);
		System.out.println(list.toString());
		System.out.println("");
	}
	
	

	@ParameterizedTest
	@MethodSource("com.junit5.J_ParamEnum#tinyStrings")
	void testWithExternalMethodSource(String tinyString) {
		System.out.println(">>" + tinyString);
	}

}
