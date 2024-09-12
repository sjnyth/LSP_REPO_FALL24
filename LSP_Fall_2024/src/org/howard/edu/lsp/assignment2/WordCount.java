/**
*  Name: Saujanya Thapaliya
*/

package org.howard.edu.lsp.assignment2;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public static void main(String[] args) {
		FileReader fileReader = new FileReader();
		try {
			String fileText = fileReader.convertFileToString("main/java/resources/words.txt");
			calculateWordFrequency(fileText);
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open file");
		}
	}
	
	static void calculateWordFrequency(String fileText) {
		HashMap<String, Integer> wordCountMap = new HashMap<>();
		
		String cleanedText = fileText.replaceAll("[^a-zA-Z0-9\\s]", "");  
        String[] wordArray = cleanedText.split("\\s+");
        
        for (String word : wordArray) {
        	word = word.toLowerCase();
        	boolean isNumber = word.chars().allMatch(Character::isDigit);
        	if (!isNumber && word.length() > 3) {
                if (wordCountMap.containsKey(word)) {
                    wordCountMap.put(word, wordCountMap.get(word) + 1);
                } else {
                    wordCountMap.put(word, 1);
                }
        	}
        }
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            String wordKey = entry.getKey();
            int wordCount = entry.getValue();
            System.out.println(wordKey + " " + wordCount);
        }
	}
}
