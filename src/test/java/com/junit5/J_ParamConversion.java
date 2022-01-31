package com.junit5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.JavaTimeConversionPattern;
import org.junit.jupiter.params.provider.ValueSource;

public class J_ParamConversion {
	
	// Explicit Convertion
	//@ParameterizedTest
	@ValueSource(strings = { "02.01.2021", "31.12.2021" })
	void testWithExplicitJavaTimeConverter(@JavaTimeConversionPattern("dd.MM.yyyy") LocalDate argument) {
		System.out.println("date: "+argument);
		Assertions.assertEquals(2021, argument.getYear());
	}

	// Implicit Convertion
	//@ParameterizedTest
	@ValueSource(strings = "SECONDS")
	void testWithImplicitArgumentConversion(ChronoUnit argument) {
		System.out.println("Sec: "+argument);
		Assertions.assertNotNull(argument.name());
	}

	@ParameterizedTest
	@ValueSource(strings = "true")
	void testWithImplicitArgumentConversion(boolean argument) {
		if (argument) {
			System.out.println("boolean: "+argument);
		}
	}
}
