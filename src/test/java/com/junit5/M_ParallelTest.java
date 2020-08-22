package com.junit5;

import org.junit.jupiter.api.Test;


/**
 * create a property with name "junit-platform.properties" under src/test/resources
 * update properties
 * 
 * @author Sheetal_Singh
 */
public class M_ParallelTest {
	@Test
	void testA() {
		System.out.println(Thread.currentThread().getName() + " => testA");
	}

	@Test
	void testB() {
		System.out.println(Thread.currentThread().getName() + " => testB");
	}

	@Test
	void testC() {
		System.out.println(Thread.currentThread().getName() + " => testC");
	}
}
