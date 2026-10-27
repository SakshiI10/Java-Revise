package com.testing.JUnit.swing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	Calculator cal=new Calculator();
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Starting Calculator Test");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Starting new Test");
	}
	
	@Test
	void Addition() {
		assertEquals(4, cal.add(2, 2));
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Test Completed");
	}
	
	@Test
    void ArithmeticException() {
        Exception exception=assertThrows(ArithmeticException.class,() -> {
        	cal.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
	
	@Test
    void checkEvenNumber() {
		int[] numbers= {2,4,6,8,10};
		
		for(int num: numbers) {
			assertTrue(cal.isEven(num));
		}
    }
	
	@Test
    void negativeSquareRoot() {
		Exception exception=assertThrows(IllegalArgumentException.class, 
            () -> cal.squareRoot(-4)
        );
		assertEquals("Number must be non-negative", exception.getMessage());
    }
	
	@AfterAll
	static void afterAll() {
		System.out.println("Completed All Tests");
	}

}