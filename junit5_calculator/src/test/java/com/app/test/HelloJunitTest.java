package com.app.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloJunitTest {

	@BeforeAll
	public static void helloBeforeAll() {
		System.out.println("Hello from @BeforeALL");
	}

	@BeforeEach
	public void helloBeforeEach() {
		System.out.println("Hello from @BeforeEach");
	}

	@Test
	public void testMethod1() {
		System.out.println("Hello from testMethod1() @Test");
	}

	@Test
	public void testMethod2() {
		System.out.println("Hello from testMethod2() @Test");
	}

	@Test
	public void testMethod3() {
		System.out.println("Hello from testMethod3() @Test");
	}

	@AfterEach
	public void helloAfterEach() {
		System.out.println("Hello from @AfterEach");
	}

	@AfterAll
	public static void helloAfterAll() {
		System.out.println("Hello from @AfterALL");
	}

}
