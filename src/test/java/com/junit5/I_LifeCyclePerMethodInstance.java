package com.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_METHOD)
public class I_LifeCyclePerMethodInstance {

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