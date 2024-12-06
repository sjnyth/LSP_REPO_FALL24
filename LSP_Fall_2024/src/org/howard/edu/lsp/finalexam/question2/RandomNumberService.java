package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton service for generating random numbers using different strategies.
 */
public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumber strategy;

    private RandomNumberService() {}
    
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    public void setStrategy(RandomNumber strategy) {
        this.strategy = strategy;
    }


    public int generateRandomNumber() {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set");
        }
        return strategy.generateRandomNumber();
    }
}