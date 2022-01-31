package com.junit5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * create a property with name "junit-platform.properties" under src/test/resources
 * update properties
 * 
 * @author Sheetal_Singh
 */
public class M_ParallelTest {
	
	@BeforeAll
	public static void bAll() {
		System.out.println("All: "+Thread.currentThread().getName());
		
	}
	
	@BeforeEach
	public void bEach() {
		System.out.println("Each:"+ Thread.currentThread().getName());
		
	}
	
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


// Two class C1 = 50 TC , C2 = 60 TC
// 2 threads A, B
//T1 all the 50 cases in seq
//T2 all the 60 cses in seq


//Two class C1 = 50 TC , C2 = 60 TC
// Thread 1
//C1:  50 new child thread
//C2:  60 new child thread





