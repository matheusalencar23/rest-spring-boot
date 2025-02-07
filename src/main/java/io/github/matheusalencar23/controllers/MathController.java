package io.github.matheusalencar23.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.github.matheusalencar23.services.MathService;

@RestController
public class MathController {
	
	private MathService mathService = new MathService();
	
	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
		return mathService.sum(numberOne, numberTwo);
	}
	
	@GetMapping("/subtraction/{numberOne}/{numberTwo}")
	public Double subtraction(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
		return mathService.subtraction(numberOne, numberTwo);
	}
	
	@GetMapping("/multiplication/{numberOne}/{numberTwo}")
	public Double multiplication(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
		return mathService.multiplication(numberOne, numberTwo);
	}
	
	@GetMapping("/division/{numberOne}/{numberTwo}")
	public Double division(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
		return mathService.division(numberOne, numberTwo);
	}
	
	@GetMapping("/avarage/{numberOne}/{numberTwo}")
	public Double avarage(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
		return mathService.avarage(numberOne, numberTwo);
	}
	
	@GetMapping("/square/{number}")
	public Double square(@PathVariable String number) throws Exception {
		return mathService.square(number);
	}

}
