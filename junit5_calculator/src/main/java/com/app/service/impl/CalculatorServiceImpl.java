package com.app.service.impl;

import com.app.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public int add(int num1, int num2) {
		try {
			return num1 + num2;
		} catch (ArithmeticException exception) {
			return 0;
		}
	}

	@Override
	public int substract(int num1, int num2) {
		try {
			return num1 - num2;
		} catch (ArithmeticException exception) {
			return 0;
		}
	}

	@Override
	public int multiply(int num1, int num2) {
		try {
			return num1 * num2;
		} catch (ArithmeticException exception) {
			return 0;
		}
	}

	@Override
	public int divide(int num1, int num2) {
		try {
			return num1 / num2;
		} catch (ArithmeticException exception) {
			return 0;
		}
	}

}
