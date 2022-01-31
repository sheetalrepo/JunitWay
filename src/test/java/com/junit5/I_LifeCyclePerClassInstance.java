package com.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

/**
 * PER_CLASS : instance will be shared among all methods (TC failed) 
 * PER_METHOD : instance will not be shared and cases will be passed
 * 
 * @author Sheetal_Singh
 *
 */
//@TestInstance(Lifecycle.PER_CLASS)
@TestInstance(Lifecycle.PER_METHOD)
public class I_LifeCyclePerClassInstance {

	//shared among all methods
	private int result = 5;

	@Test
	void test_Add() {
		result = add(result, 5);
		System.out.println("Add(5,5) => " + result);
		System.out.println(Thread.currentThread().getName());
		Assertions.assertEquals(10, result);
	}

	@Test
	void test_Multiply() {
		result = multiply(result, 5);
		System.out.println("Mult(5,5) => " + result);
		System.out.println(Thread.currentThread().getName());
		Assertions.assertEquals(25, result);
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

}