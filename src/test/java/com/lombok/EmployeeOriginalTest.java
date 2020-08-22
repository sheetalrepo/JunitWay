package com.lombok;

import org.apache.log4j.Logger;

public class EmployeeOriginalTest {

	private static final Logger log = Logger.getLogger(EmployeeOriginalTest.class);
	
	public static void testEmpOrig() {
		EmployeeOriginal obj = new EmployeeOriginal(20, "Albert", "Alpha");
		log.info(obj);
	}
	
	public static void main(String[] args) {
		testEmpOrig();
	}

}
