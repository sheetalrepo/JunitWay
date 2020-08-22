package com.junit5;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

public class B_Assertions {

	@Test
	void testAssertEqual() {
		assertEquals("ABC", "ABC");
		assertEquals(50, 50, "optional assertion message");
		assertEquals(3 + 3, 6);
	}

	@Test
	void testAssertFalse() {
		assertFalse("Abc".length() == 10);
		assertFalse(10 > 20, "assertion failed message");
	}

	@Test
	void testAssertNull() {
		String str1 = null;
		String str2 = "xyz";
		Assertions.assertNull(str1);
		Assertions.assertNotNull(str2);
	}

	@Test
	void testAssertAll() {
		String home = "Hno10";
		String street = "Park Street";
		String city = "Pune";

		assertAll("Checking complete address as a whole", 
				() -> assertEquals(home, "Hno10"),
				() -> assertEquals(street, "Garden Street"), 
				() -> assertEquals(city, "Pune"));
	}


}
