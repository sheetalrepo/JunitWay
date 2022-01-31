package com.junit5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.MethodOrderer.Random;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


/**
 * 
 * As per the @TestMethodOrder we have three option
 * 1. Run Alphabetically
 * 2. Run as per given Order
 * 3. Run Randomly
 * 
 * @author Sheetal_Singh
 *
 */


//@TestMethodOrder(Alphanumeric.class)
//@TestMethodOrder(MethodName.class)
//@TestMethodOrder(Random.class)
@TestMethodOrder(OrderAnnotation.class)
public class I_OrderSequenceTest {

	@Test
	@Order(3)
	void testY() { 
		System.out.println("Case Y");
	}

	@Test
	@Order(2)
	void testX() { 
		System.out.println("Case X");
	}

	@Test
	@Order(20)
	void testB() { 
		System.out.println("Case B");
	}

	
	@Test
	@Order(1)
	void testZ() { 
		System.out.println("Case Z");
	}
}
