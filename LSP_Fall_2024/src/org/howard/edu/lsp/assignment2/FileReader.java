/**
*  Name: Saujanya Thapaliya
*/

package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class FileReader {

	public String convertFileToString(String fileName) throws FileNotFoundException {
		URL fileUrl = getClass().getClassLoader().getResource(fileName);
		
		if (fileUrl != null) {
			File filePath = new File(fileUrl.getPath());
			Scanner fileScanner = null;
			try {
				fileScanner = new Scanner(filePath);
				String fileContent = "";
				while (fileScanner.hasNextLine()) {
					fileContent = fileContent + fileScanner.nextLine() + " ";
				}
				return fileContent.trim();
			} finally {
				fileScanner.close();
			} 
		}
		throw new FileNotFoundException();
	}
}
