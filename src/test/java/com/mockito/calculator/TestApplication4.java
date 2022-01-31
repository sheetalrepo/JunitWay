//package com.mockito.calculator;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.junit.Assert;
//import static org.mockito.Mockito.*;
//
///**
// * To check how many times we have called cloud service's methods 
// * 
// * @author Sheetal_Singh
// */
//
//@RunWith(MockitoJUnitRunner.class)
//public class TestApplication4 {
//
//	@Mock
//	CalculatorCloudService service;
//
//	@InjectMocks
//	Application application = new Application(service);
//
//	@Test
//	public void testCentury() {
//		// mocking service
//		when(service.add(10, 20)).thenReturn((double) 30);
//		when(service.add(50, 60)).thenReturn((double) 110);
//
//		// Testing my application method
//		Assert.assertEquals(130, application.overAndAboveCentury(10, 20), 0);
//		Assert.assertEquals(210, application.overAndAboveCentury(50, 60), 0);
//		Assert.assertEquals(210, application.overAndAboveCentury(50, 60), 0);
//
//		// check a minimum 1 call count
//		verify(service, atLeastOnce()).add(10, 20);
//
//		// check if add func is called minimum 2 times with given values
//		verify(service, atLeast(1)).add(50, 60);
//
//		// check if add func is called maximum 2 times with given values
//		verify(service, atMost(2)).add(50, 60);
//
//	}
//
//}
