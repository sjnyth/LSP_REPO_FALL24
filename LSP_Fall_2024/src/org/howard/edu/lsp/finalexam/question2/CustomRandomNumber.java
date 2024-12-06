package org.howard.edu.lsp.finalexam.question2;

//Additive congruential generator: https://www.geeksforgeeks.org/additive-congruence-method-for-generating-pseudo-random-numbers/

public class CustomRandomNumber implements RandomNumber {
    private int m = 30239100;
    private int c = 39;    
    private int current;  
    
    // Constructor with seed
    public CustomRandomNumber(int seed) {
        if (seed <= 0) {
            throw new IllegalArgumentException("Seed must be a positive integer.");
        }
        this.current = seed;
    }

    @Override
    public int generateRandomNumber() {
        // Additive congruential formula: Xn+1 = (Xn + c) % m
        current = (current + c) % m;
        return current;
    }
}
