package com.junit5;

import java.time.LocalDateTime;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assumptions;


/**
 * Assumption: 
 * 1. Test executes only if assumptions are true 
 * 2. Test will skip in case assumptions fails 
 * 3. Overall Build will pass in case assumptions fails
 * 
 * @author Sheetal_Singh
 */
public class C_Assumption {

	@Test
	void testAssumeTrue() {
		//code
		boolean b = false;
		Assumptions.assumeTrue(b);
		System.out.println("Print only if above assuption is True");
	}

	@Test
	@DisplayName("DisplayName: Test executes only on Sunday")
	public void testAssumeTrueSunday() {
		LocalDateTime dt = LocalDateTime.now();
		Assumptions.assumeTrue(dt.getDayOfWeek().getValue() == 1);
		System.out.println("Weekend Fun!!!");
	}

	@Test
	void testAssumeFalseEnvProperty() {
		System.setProperty("env", "prod");
		Assumptions.assumeFalse("dev".equals(System.getProperty("env")));
		System.out.println("Code to run for Non Prod env");
	}

	@Test
	void testAssumingThat() {
		System.setProperty("env", "test");
		Assumptions.assumingThat("test".equals(System.getProperty("env")), () -> {
			Assertions.assertEquals(20, 20);
			System.out.println("Test Env Code");
		});

		Assertions.assertEquals(200, 200);
	}
}
