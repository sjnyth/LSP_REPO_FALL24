package org.howard.edu.lsp.finalexam.question2;

public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        service.setStrategy(new RandomNumberJava());
        System.out.println("Java Random Numbers:");
        for (int i = 0; i < 3; i++) { // Generate multiple random numbers
            System.out.println("  " + service.generateRandomNumber());
        }

        // Using CustomRandomNumber strategy with additive congruential generator
        int seed = 10; // Seed for the generator
        service.setStrategy(new CustomRandomNumber(seed));
        System.out.println("\nCustom Random Numbers (Additive Congruential Generator):");
        for (int i = 0; i < 3; i++) { // Generate multiple random numbers 
            System.out.println("  " + service.generateRandomNumber());
        }
    }
}
