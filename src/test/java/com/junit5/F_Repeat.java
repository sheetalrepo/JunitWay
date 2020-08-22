package com.junit5;

import org.junit.jupiter.api.*;

public class F_Repeat {

	
	@DisplayName("LongName")
	@RepeatedTest(value = 5, name = RepeatedTest.LONG_DISPLAY_NAME)
	void testLongName(TestInfo testInfo) {
		System.out.println("Apple");
	}
	
	
	@DisplayName("ShortName")
	@RepeatedTest(value = 5, name = RepeatedTest.SHORT_DISPLAY_NAME)
	void testShortName(TestInfo testInfo) {
		System.out.println("Mango");
	}
	
	@DisplayName("RunMe")
	@RepeatedTest(5)
	public void testaddNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println("Count: " + repetitionInfo.getCurrentRepetition());
		Assertions.assertEquals(10, 5+5);
	}
}
