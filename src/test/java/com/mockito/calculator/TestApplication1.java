package com.mockito.calculator;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;

/**
 * Mocking w/o any annotation
 * 
 * @author Sheetal_Singh
 *
 */
public class TestApplication1 {

	static Application application = null;
	
	static CalculatorCloudService service = mock(CalculatorCloudService.class);
	
	@BeforeAll
	public static void setUp() {
		application = new Application(service);
	}
	
	
	@Test
	public void testCentury() {
		//mocking service
		when(service.add(10, 20)).thenReturn((double) 30);
		
		//Testing my application method
		Assertions.assertEquals(130, application.overAndAboveCentury(10, 20));
		
		// verify whether we used service in our method or not
		verify(service).add(10, 20);
	}
	
}
