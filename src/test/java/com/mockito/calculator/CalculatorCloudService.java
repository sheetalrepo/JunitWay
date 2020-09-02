package com.mockito.calculator;

/**
 * 3rd party service which we need to use in our code
 * imp: we don't need to test its function as its 3rd party responsibility
 * 
 * @author Sheetal_Singh
 */
public interface CalculatorCloudService {
	public double add(double a, double b);
	public double sub(double a, double b);
	public double badMethod(double a, double b);
	
//	public double mult(double a, double b);
//	public double div(double a, double b);
//	public double square(double a);
}
