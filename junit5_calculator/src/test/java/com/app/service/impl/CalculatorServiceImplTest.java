package com.app.service.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.app.service.CalculatorService;

class CalculatorServiceImplTest {

	private static CalculatorService service;

	@BeforeAll
	public static void intCali() {
		service = new CalculatorServiceImpl();
	}

	@Test
	void testAdditionBetweenPosetiveNumbers() {
		Assertions.assertEquals(40, service.add(20, 20));
	}

	@RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
	void testAdditionBetweenPosetiveNegetiveNumbers(RepetitionInfo repetitionInfo) {
		Assertions.assertEquals(20 + repetitionInfo.getCurrentRepetition(),
				service.add(20, repetitionInfo.getCurrentRepetition()));
	}

	@Test
	void testAdditionBetweenNegetiveNumbers() {
		Assertions.assertEquals(-40, service.add(-20, -20));
	}

	@Test
	void testSubstractionBetweenPosetiveNumbers() {
		Assertions.assertEquals(30, service.substract(40, 10));
	}

	@Test
	void testMultiplicationBetweenPosetiveNumbers() {
		Assertions.assertEquals(400, service.multiply(20, 20));
	}

	@Test
	void testMultiplicationBetweenNegetiveNumbers() {
		Assertions.assertEquals(400, service.multiply(-20, -20));
	}

	@Nested
	@DisplayName("Tests for the division")
	class A {

		@BeforeEach
		void beforeEach() {
			System.out.println("Before each test method Division");
		}

		@AfterEach
		void afterEach() {
			System.out.println("After each test method of Division");
		}

		@Test
		@DisplayName("Example test for Division")
		void testDivisionBetweenPosetiveNumbers() {
			Assertions.assertEquals(10, service.divide(20, 2));
		}

		@Test
		@DisplayName("Example test for Division")
		void testDivisionBetweenNegetiveNumbers() {
			Assertions.assertEquals(10, service.divide(-20, -2));
		}
	}

	@Test
	void afterCalCiWorkDone(TestInfo testInfo) {
		Assertions.assertEquals("afterCalCiWorkDone(TestInfo)", testInfo.getDisplayName());
	}

}
