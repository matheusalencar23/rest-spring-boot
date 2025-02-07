package io.github.matheusalencar23.services;

import io.github.matheusalencar23.exceptions.UnsupportedMathOperationException;
import io.github.matheusalencar23.utils.MathUtils;

public class MathService {

	public Double sum(String numberOne, String numberTwo) throws Exception {

		if (!MathUtils.isNumeric(numberOne) || !MathUtils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value!");
		}
		return MathUtils.convertToDouble(numberOne) + MathUtils.convertToDouble(numberTwo);
	}

	public Double subtraction(String numberOne, String numberTwo) throws Exception {

		if (!MathUtils.isNumeric(numberOne) || !MathUtils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value!");
		}
		return MathUtils.convertToDouble(numberOne) - MathUtils.convertToDouble(numberTwo);
	}

	public Double multiplication(String numberOne, String numberTwo) throws Exception {

		if (!MathUtils.isNumeric(numberOne) || !MathUtils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value!");
		}
		return MathUtils.convertToDouble(numberOne) * MathUtils.convertToDouble(numberTwo);
	}

	public Double division(String numberOne, String numberTwo) throws Exception {

		if (!MathUtils.isNumeric(numberOne) || !MathUtils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value!");
		}

		if (MathUtils.convertToDouble(numberTwo) == 0) {
			throw new UnsupportedMathOperationException("Please, set a non-zero divisor!");
		}

		return MathUtils.convertToDouble(numberOne) / MathUtils.convertToDouble(numberTwo);
	}

	public Double avarage(String numberOne, String numberTwo) throws Exception {

		if (!MathUtils.isNumeric(numberOne) || !MathUtils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value!");
		}

		return (MathUtils.convertToDouble(numberOne) + MathUtils.convertToDouble(numberTwo)) / 2;
	}

	public Double square(String number) throws Exception {

		if (!MathUtils.isNumeric(number)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value!");
		}

		return Math.sqrt(MathUtils.convertToDouble(number));
	}
}
