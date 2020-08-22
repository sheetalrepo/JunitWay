package com.junit5;

import org.junit.jupiter.api.*;

public class E_Exceptions {

	@Test
	void testExpectedException() {

		Assertions.assertThrows(NumberFormatException.class, () -> {
			Integer.parseInt("Five"); //throw NFE
		});
	}

	@Test
	void testExpectedExceptionWithSuperType() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Integer.parseInt("Five"); // NFE extends IAE 
		});
	}

	@Test
	@DisplayName("Should Fail")
	void testExpectedExceptionFail() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Integer.parseInt("1"); // No exception will be thrown, but we expect an exception
		});
	}
	
	@Test
	@DisplayName("Should Fail")
	void testDifferentException() {
		Assertions.assertThrows(NullPointerException.class, () -> {
			Integer.parseInt("Five"); //throw NFE but we are expecting some other exception
		});
	}

}
