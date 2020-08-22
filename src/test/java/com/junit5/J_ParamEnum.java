package com.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;
import java.util.stream.Stream;

/**
 * Reading Data From ENUM
 * @author Sheetal_Singh
 */
enum DIRECTION {
    EAST(1),
    WEST(2),
	NORTH(3),
    SOUTH(4);

	DIRECTION(int i) {
	}
}

public class J_ParamEnum {

	@ParameterizedTest
	@EnumSource(Month.class) 
	void getValueForAMonth_IsAlwaysBetweenOneAndTwelve(Month month) {
		System.out.println(month);
	    int monthNumber = month.getValue();
	    assertTrue(monthNumber >= 1 && monthNumber <= 12);
	}
	
	
	@ParameterizedTest
	@EnumSource(DIRECTION.class) 
	void getValueForAMonth_IsAlwaysBetweenOneAndTwelve(DIRECTION direction) {
		System.out.println(direction);
	}
	
	@ParameterizedTest
	@EnumSource(value = DIRECTION.class, names = {"EAST", "WEST"})
	void abc(DIRECTION direction) {
		System.out.println(direction);
	}
	
	
	//Data Source for J_ParamMethodSourceTest class
	static Stream<String> tinyStrings() {
        return Stream.of("a", "b", "c");
    }
	
}
