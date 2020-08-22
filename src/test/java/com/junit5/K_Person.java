package com.junit5;

//POJOs
public class K_Person {

	String name;
	int age;
	String city;

	public K_Person(String name, Integer age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

}
