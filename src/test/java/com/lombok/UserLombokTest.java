package com.lombok;

public class UserLombokTest {
	
	public static void testWithoutLombok() {
		//user with all fields
		UserWithoutLombok user1 = new UserWithoutLombok.UserBuilder("Sheetal", "Singh")
				.age(35)
				.phone("9911222333")
				.address("Down Town Pune")
				.build();
		System.out.println(user1);

		//user with only mandatory fields
		UserWithoutLombok user3 = new UserWithoutLombok.UserBuilder("Only", "Me")
				.build();
		System.out.println(user3);
	}
	
	public static void testWithLombok() {
		//user with all fields
				UserLombok user1 = UserLombok.builder()
						.firstName("Sheetal")
						.lastName("Singh")
						.age(35)
						.phone("9911222333")
						.address("Down Town Pune")
						.build();
				System.out.println(user1);
				
				//user with only mandatory fields
				UserLombok user2 = UserLombok.builder()
						.firstName("Only")
						.lastName("Me")
						.build();
				System.out.println(user2);
	}
	
	
	
	public static void main(String[] args) {
		testWithoutLombok();
		testWithLombok();
	}
}
