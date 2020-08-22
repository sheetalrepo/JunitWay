package com.lombok;

import java.util.Date;

public class PersonLombokTest {

	public static void main(String[] args) {
		//Person Without Lombok
		PersonWithoutLombok person = new PersonWithoutLombok.PersonBuilder()
				.withEmpId("12345")
				.withFirstName("Sheetal")
				.withLastName("Singh")
				.withDob(new Date(2000,2,25))
				.build();
		System.out.println(person);

		
		//Person With Lombok
		PersonLombok personLombok = PersonLombok.builder()
				.empId("12345")
				.firstName("Sheetal")
				.lastname("Singh")
				.dob(new Date(2000,2,25))
				.build();
		System.out.println(personLombok);

	}

}
