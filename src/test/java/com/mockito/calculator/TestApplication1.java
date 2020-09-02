package com.mockito.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import static org.mockito.Mockito.*;

/**
 * Mocking w/o any annotation
 * 
 * @author Sheetal_Singh
 *
 */
public class TestApplication1 {

	Application application = null;
	
	CalculatorCloudService service = mock(CalculatorCloudService.class);
	
	@Before
	public void setUp() {
		application = new Application(service);
	}
	
	
	@Test
	public void testCentury() {
		//mocking service
		when(service.add(10, 20)).thenReturn((double) 30);
		
		//Testing my application method
		Assert.assertEquals(130, application.overAndAboveCentury(10, 20), 0);
		
		// verify whether we used service in our method or not
		verify(service).add(10, 20);
	}
	
}
