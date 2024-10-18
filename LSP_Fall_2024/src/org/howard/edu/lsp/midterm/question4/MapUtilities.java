package org.howard.edu.lsp.midterm.question4;
import java.util.HashMap;

public class MapUtilities {
    /**
     * This method finds the number of common key-value pairs between two given HashMaps.
     *
     * @param map1 The first HashMap of type <String, String>.
     * @param map2 The second HashMap of type <String, String>.
     * @return The number of key-value pairs that are common between map1 and map2.
     *         A key-value pair is considered common if both maps contain the same key
     *         and the associated values for that key are equal.
     * @throws NullPointerException if either map1 or map2 is null.
     */
    public static int commonKeyValuePairs(
        HashMap<String, String> map1,
        HashMap<String, String> map2){
    	// Variable to keep track of common key-value pairs
        int common_k_vs = 0;
        
        // Iterate through the keys of the first map
        for (String key: map1.keySet()) {
	        if (map2.containsKey(key)) {
		        String val_at_map2 = map2.get(key);
		        if (map1.get(key).equals(val_at_map2)){
                    common_k_vs ++;
                }
            }
        }
        // Return the count of common key-value pairs
        return common_k_vs;
    }
}

