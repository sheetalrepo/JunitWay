package com.junit5;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class L_TimeOutTests {

	@Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void test1() throws InterruptedException {
    	Thread.sleep(5000);
    	System.out.println("Fail if timeout exceeds 1");	
    }
	
    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void test2() throws InterruptedException {
    	Thread.sleep(5000);
    	System.out.println("Fail if timeout exceeds 2");	
    }
    
    
}
