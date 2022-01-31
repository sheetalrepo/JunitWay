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
// * To verify exception
// * 
// * @author Sheetal_Singh
// */
//
//@RunWith(MockitoJUnitRunner.class)
//public class TestApplication5 {
//
//	@Mock
//	CalculatorCloudService service;
//
//	@InjectMocks
//	Application application = new Application(service);
//
//	@Test(expected = RuntimeException.class)
//	public void testExceptionMethods() {
//		// throw exception behavior has been mocked into cloud service function call
//		doThrow(new RuntimeException("Method not implemented"))
//		.when(service).badMethod(1, 2);
//
//		//Assert.assertEquals(10, , 0);
//		Assert.assertTrue(application.iAmBadBoy(1, 2));
//	}
//
//}
