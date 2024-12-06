package org.howard.edu.lsp.finalexam.question1;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.DisplayName;


public class MathUtilsTest {
	
		private final MathUtils mathUtils = new MathUtils();
		
		// Test for factorial
		@Test
		@DisplayName("Factorial test for non negative number")
	    public void testFactorialNonNegativeNumberl() {
	        assertEquals(120, mathUtils.factorial(5));
	        assertEquals(1, mathUtils.factorial(0)); // Edge case
	        assertEquals(1, mathUtils.factorial(1)); // Edge case
	    }

	    @Test
	    @DisplayName("Factorial test for non negative number - exception thrown")
	    public void testFactorialNegativeNumberException() {
	        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-5));
	    }

	    @Test
	    @DisplayName("Factorial test for large number")
	    public void testFactorialLargeNumber() {
	        assertEquals(3628800, mathUtils.factorial(10));
	    }

	    // Tests for isPrime method
	    @Test
	    @DisplayName("Test to check prime number. Returns True")
	    public void testPrime_smallPrimeNumbers_returnsTrue() {
	        assertTrue(mathUtils.isPrime(2));
	        assertTrue(mathUtils.isPrime(3));
	        assertTrue(mathUtils.isPrime(13));
	    }

	    @Test
	    @DisplayName("Test to check prime number with not primes. Returns False")
	    public void testIsPrime() {
	        assertFalse(mathUtils.isPrime(0)); // Edge case
	        assertFalse(mathUtils.isPrime(1)); // Edge case
	        assertFalse(mathUtils.isPrime(4));
	        assertFalse(mathUtils.isPrime(9));
	    }

	    @Test
	    @DisplayName("Test to check large prime number. Returns True")
	    public void testIsPrimeLargeNumber() {
	        assertTrue(mathUtils.isPrime(4639));
	        assertTrue(mathUtils.isPrime(4999));
	        assertTrue(mathUtils.isPrime(7919));
	    }

	    // Test for GCD
	    @Test
	    @DisplayName("Test to check GCD to 2 positive numbers")
	    public void testGCDPositiveNumbers() {
	        assertEquals(6, mathUtils.gcd(54, 24));
	        assertEquals(1, mathUtils.gcd(17, 13));
	    }
	    
	    //Edge case for 0's GCD
	    @Test
	    @DisplayName("Test to check GCD of 0 and others")
	    public void testGCDZeros() {
	        assertEquals(8, mathUtils.gcd(0, 8));
	        assertEquals(8, mathUtils.gcd(8, 0));
	    }

	    @Test
	    @DisplayName("Test to check GCD of 0 and 0. Throws Exception")
	    public void testGCDException() {
	        assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0));
	    }

	    @Test
	    @DisplayName("Test to check GCD of negative numbers.")
	    public void testGCDNegativeNumber() {
	        assertEquals(4, mathUtils.gcd(-8, -12));
	        assertEquals(3, mathUtils.gcd(-9, 6));
	        assertEquals(1, mathUtils.gcd(-17, -13));
	        assertEquals(12, mathUtils.gcd(-60, -48));
	    }
}