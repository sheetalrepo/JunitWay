package com.junit5;

import org.junit.jupiter.api.*;

public class A_BasicTags {

	@BeforeAll
	static void beforeAll() {
		System.out.println("--BeforeAll");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("----BeforeEach");
	}

	@Test
	void testMethod1() {
		System.out.println("------Test1");
	}

	@DisplayName("DisplayName Test2")
	@Test
	void testMethod2() {
		System.out.println("------Test2");
	}

	@Test
	@Disabled("Todo pending")
	void testMethod3() {
		System.out.println("------Test3");
	}

	@AfterEach
	void afterEach() {
		System.out.println("----AfterEach");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("--AfterAll");
	}

}
