package com.mockito.calculator;

/**
 * This is our application which we need to test
 * Our application using 3rd party service 'CalculatorCloudService'
 * 
 * @author Sheetal_Singh
 */
public class Application {
	//using 3rd party service in my application
	private CalculatorCloudService calcService;
	
	public Application(CalculatorCloudService calcService) {
		this.calcService = calcService;
	}

	public double overAndAboveCentury(double a, double b) {
		System.out.println("My application function - OverAndAboveCentury ");
		double result = calcService.add(a, b); //calling 3rd party service
		double finalResult = 100 + result;
		return finalResult;
//		return 130;
	}

	
	public double differencesBetweenUs(double a, double b) {
		System.out.println("My application function - Diff ");
		double result = calcService.sub(a, b); //calling 3rd party service
		double finalResult = 10 * result;
		return finalResult;
	}
	
	public boolean iAmBadBoy(double a, double b) {
		System.out.println("Method is WIP so should throw some exception");
		calcService.badMethod(a, b);
		return a > b;
	}

//	public double multiply(double a, double b) {
//		return calcService.mult(a, b);
//	}
//
//	public double divide(double a, double b) {
//		return calcService.div(a, b);
//	}
//	
//	//implementation given
//	public double square(double a) {
//		return a * a;
//	}
}
