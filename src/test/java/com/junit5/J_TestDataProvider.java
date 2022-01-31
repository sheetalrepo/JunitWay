package com.junit5;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

/**
 * 
 * Test Data for J_ParamFromClass.java
 * 
 * @author Sheetal_Singh
 *
 */
public class J_TestDataProvider implements ArgumentsProvider  {

	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext arg0) throws Exception {
		return Stream.of("bike", "car").map(Arguments::of);
	}
	
}
