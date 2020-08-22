package com.junit5;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class L_TimeOutTests {

	
	@BeforeEach
    @Timeout(2)
    void setUp() {
        // fails if execution time exceeds 5 seconds
    }

	@Test
    void testBeforeEachTimeout() throws InterruptedException {
    	Thread.sleep(5000);
    	System.out.println("Fail if timeout exceeds");	
    }
	
    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testTimeout() throws InterruptedException {
    	Thread.sleep(5000);
    	System.out.println("Fail if timeout exceeds");	
    }
    
    
}
