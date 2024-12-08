package com.utk.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface InputReader {

	static List<String> readFileWithDelimiter(String inputFilename, String delimiter) {
		List<String> listOfStrings = new ArrayList<>();
		try (Scanner sc = new Scanner(new File(inputFilename))) {
			sc.useDelimiter(delimiter);
			while (sc.hasNext()) {
				listOfStrings.add(sc.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return listOfStrings;
	}
	
	static String[] readFileWithNewline(String inputFilename) {
		List<String>  strings = new ArrayList<String>();
		try {
			
			BufferedReader br = new BufferedReader( 
			        new FileReader(inputFilename));
			String line;
			while((line = br.readLine()) != null) {
				strings.add(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		 String[] array = strings.toArray(new String[0]);
		 return array;
	}

}
