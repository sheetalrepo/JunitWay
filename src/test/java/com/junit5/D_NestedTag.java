package com.junit5;

import org.junit.jupiter.api.*;

@DisplayName("AnimalClass")
public class D_NestedTag {

	@Test
	public void testMainClass() {
		System.out.println("-- Animal class tests");
	}

	@Nested
	class Dog {

		@Test
		public void testMainClass() {
			System.out.println("---- Dog class tests cases");
		}

		@Nested
		class Labrador {

			@Test
			public void testMainClass() {
				System.out.println("------ Labrador class tests cases");
			}
		}
	}
}
