package com.lombok;

import lombok.extern.log4j.Log4j;

@Log4j
public class EmployeeLombokTest {

	public static void testEmp() {
		EmployeeLombok obj = new EmployeeLombok(10, "Bob", "Bryan");
		log.info(obj);
		
		obj.setId(11);
		log.info(obj);
	}
	
	
	public static void main(String[] args) {
		testEmp();		
	}

}
