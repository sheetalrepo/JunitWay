//package com.mockito.calculator;
//
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnit;
//import org.mockito.junit.MockitoRule;
//import org.junit.Assert;
//import static org.mockito.Mockito.*;
//
//
///**
// * Using @Mock and @Rule annotations
// * 
// * @author Sheetal_Singh
// *
// */
//public class TestApplication2 {
//
//	Application application = null;
//	
//	@Mock
//	CalculatorCloudService service;
//
//	@Rule public MockitoRule rule = MockitoJUnit.rule();
//	
//	@Before
//	public void setUp() {
//		application = new Application(service);
//	}
//	
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
