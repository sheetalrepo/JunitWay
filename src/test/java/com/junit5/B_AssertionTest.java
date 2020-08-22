package com.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class B_AssertionTest {

	@Test
	void testAssertEqual() {
		assertEquals("ABC", "ABC");
		assertEquals(50, 50, "optional assertion message");
		assertEquals(3 + 3, 6);
	}
}
