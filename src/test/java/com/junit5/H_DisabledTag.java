package com.junit5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;


//@Disabled
public class H_DisabledTag {

	
	@Test
	@Disabled("some work pending")
	void testOne() { 
		System.out.println("Case 1");
	}


	@Test
	void testTwo() { 
		System.out.println("Case 2");
	}
	
	
}
