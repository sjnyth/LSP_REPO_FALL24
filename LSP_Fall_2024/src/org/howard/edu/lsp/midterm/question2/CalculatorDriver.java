package org.howard.edu.lsp.midterm.question2;

public class CalculatorDriver {
	 /**
     * The main method is the entry point of the program and runs several tests
     * on the Calculator class. It tests the sum methods with integer values,
     * double values, and an array of integers then prints the expected and actual
     * results to the console
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
    	// Test the sum of two integers
        int result1 = Calculator.sum(5, 10);
        System.out.println("Expected: 15, Got: " + result1);

        // Test the sum of two doubles
        double result2 = Calculator.sum(3.5, 7.8);
        System.out.println("Expected: 11.3, Got: " + result2);

        // Test the sum of an array of integers
        int result3 = Calculator.sum(new int[]{1, 2, 3, 4, 5});
        System.out.println("Expected: 15, Got: " + result3);

        // Test the sum of an empty array (should return 0)
        int result4 = Calculator.sum(new int[]{});
        System.out.println("Expected: 0, Got: " + result4);
    }
}
