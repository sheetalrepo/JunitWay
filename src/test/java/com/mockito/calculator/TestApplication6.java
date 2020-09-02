package com.mockito.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;
import static org.mockito.Mockito.*;

/**
 * To make sure 3rd party services method called in a particular order
 * 
 * @author Sheetal_Singh
 */

@RunWith(MockitoJUnitRunner.class)
public class TestApplication6 {

	@Mock
	CalculatorCloudService service;

	@InjectMocks
	Application application = new Application(service);

	@Test
	public void testServiceMethodOrder() {
		when(service.add(10, 20)).thenReturn((double) 30);
		when(service.sub(70, 50)).thenReturn((double) 20);

		//add method called before sub
		Assert.assertEquals(130, application.overAndAboveCentury(10, 20), 0);
		Assert.assertEquals(200, application.differencesBetweenUs(70, 50), 0);


		//we need to make sure add method called first
		InOrder inOrder = inOrder(service);
		inOrder.verify(service).add(10, 20);
		inOrder.verify(service).sub(70, 50);
//		inOrder.verify(service).add(10, 20);

	}

}
