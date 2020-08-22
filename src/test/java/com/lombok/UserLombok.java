package com.lombok;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class UserLombok {
	private final String firstName; // mandatory
	private final String lastName; // mandatory
	private final int age; // optional
	private final String phone; // optional
	private final String address; // optional
}
