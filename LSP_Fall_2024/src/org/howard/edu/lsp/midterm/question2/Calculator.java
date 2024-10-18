package org.howard.edu.lsp.midterm.question2;

/**
 * The Calculator class provides methods to perform summation of integers and doubles.
 * It also includes an overloaded method
 * to sum an array of integers.
 */
public class Calculator {

    /**
     * Returns the sum of two integers.
     *
     * @param a The first integer to be added.
     * @param b The second integer to be added.
     * @return The sum of a and b.
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Returns the sum of two double values.
     *
     * @param a The first double to be added.
     * @param b The second double to be added.
     * @return The sum of a and b.
     */
    
    //overloaded sum for double
    public static double sum(double a, double b) {
        return a + b;
    }

    /**
     * Returns the sum of all integers in an array.
     *
     * @param numbers An array of integers to be summed.
     * @return The sum of all integers in the array. If the array is empty,
     *         the method returns 0.
     */
    
    //overloaded sum for array
    public static int sum(int[] numbers) {
        return java.util.Arrays.stream(numbers).sum();
    }
}
