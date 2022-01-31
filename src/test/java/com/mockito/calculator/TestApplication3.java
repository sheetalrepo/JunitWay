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
//
///**
// * Using @InjectMock annotation
// * 
// * @author Sheetal_Singh
// *
// */
//
//
////@RunWith attaches a runner with the test class to initialize the test data
//@RunWith(MockitoJUnitRunner.class)
//public class TestApplication3 {
//
//	//create the mock object to be injected
//	@Mock
//	CalculatorCloudService service;
//
//	//inject the mock object
//	@InjectMocks  
//	Application application = new Application(service);
//	
//	@Test
//	public void testCentury() {
//		//mocking service
//		when(service.add(10, 20)).thenReturn((double) 30);
//		
//		//Testing my application method
//		Assert.assertEquals(130, application.overAndAboveCentury(10, 20), 0);
//		
//		// verify whether we used service in our method or not
//		verify(service).add(10, 20);
//	}
//	
//}
