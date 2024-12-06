package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

public class RandomNumberJava implements RandomNumber {
    private Random random;

    public RandomNumberJava() {
        this.random = new Random();
    }

    public RandomNumberJava(long seed) {
        this.random = new Random(seed);
    }

    @Override
    public int generateRandomNumber() {
        // Generate a random positive integer between 1 and Integer.MAX_VALUE
        return random.nextInt(Integer.MAX_VALUE - 1) + 1;
    }
}
