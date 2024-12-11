package com.utk.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.utk.services.InputReader;

public class UsernameValidator {
	
	public static void main(String[] args) {
		String[] lineArray = InputReader.readFileWithNewline("UsernameValidator.txt");
		String userNameRegex = "^[a-zA-Z]([_](?![_])|[a-zA-Z0-9]){6,28}[a-zA-Z0-9]";
		for (String line : lineArray) {
			runTest(userNameRegex, line);
		}
		
		
	}
	
	public static void runTest(String regex,String text) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		if(matcher.find()) {
			System.out.println("String : "+text+" is valid!!");
		}else {
			System.out.println("String : "+text+" is invalid!!");
		}
	}

}
