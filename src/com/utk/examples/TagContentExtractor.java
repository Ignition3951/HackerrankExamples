package com.utk.examples;

import com.utk.services.InputReader;

public class TagContentExtractor {
	public static void main(String[] args) {

		String[] lineArray = InputReader.readFileWithNewline("Input.txt");
		for (String line : lineArray) {
			
			System.out.println(line);
		}

	}
}
