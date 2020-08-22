package com.junit5;

import org.junit.jupiter.api.*;

@Tag("smoke")
public class G_TestPlanTagsTest {

	@Test
	@Tag("prod")
	@Tag("dev")
	@Tag("qa")
	void testOne(TestInfo testInfo) { 
		System.out.println("Prod Dev QA Case");
	}


	@Test
	@Tag("prod")
	void testTwo(TestInfo testInfo) { 
		System.out.println("Prod Only Case");
	}

	
	@Test
	@Tag("dev")
	void testThree(TestInfo testInfo) { 
		System.out.println("Dev Only Case");
	}
	
	@Test
	@Tag("qa")
	void testFour(TestInfo testInfo) { 
		System.out.println("=========================>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("QA Only Case");
	}
	
}
