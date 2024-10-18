package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
 * The MapUtilitiesDriver class serves as a test driver to demonstrate the
 * functionality of the MapUtilities class, particularly the commonKeyValuePairs method.
 */
public class MapUtilitiesDriver {

    /**
     * The main method is the entry point of the program and runs several tests
     * on the MapUtilities.commonKeyValuePairs method. 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Test 1
        System.out.println("Test 1: Testing the given example");
        
        // Creating and populating the first HashMap
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Alice", "Healthy");
        map1.put("Mary", "Ecstatic");
        map1.put("Bob", "Happy");
        map1.put("Chuck", "Fine");
        map1.put("Felix", "Sick");
        
        // Creating and populating the second HashMap
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Mary", "Ecstatic");
        map2.put("Felix", "Healthy");
        map2.put("Ricardo", "Superb");
        map2.put("Tam", "Fine");
        map2.put("Bob", "Happy");
        
        // Test the commonKeyValuePairs method and display results
        int result1 = MapUtilities.commonKeyValuePairs(map1, map2);
        System.out.println("Expected: 2");
        System.out.println("We got: " + result1);
        System.out.println();
        
        
        // Test 2: One of the maps is empty
        HashMap<String, String> map3 = new HashMap<>();
        System.out.println("Test 2: One of the hashes are empty");
        int result2 = MapUtilities.commonKeyValuePairs(map1, map3);
        System.out.println("Expected: 0");
        System.out.println("We got: " + result2);
        System.out.println();
        
        
        // Test 3: Both maps are empty
        System.out.println("Test 3: Both the hashes are empty");
        int result3 = MapUtilities.commonKeyValuePairs(map3, map3);
        System.out.println("Expected: 0");
        System.out.println("We got: " + result3);
    }
}
