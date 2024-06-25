package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeChecker {
	
	public static boolean isPalindrome(String str) {
		
		//String normalizedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		String reversedStr = IntStream.rangeClosed(1, str.length())
				.mapToObj(i -> str.charAt(str.length() - i))
				.map(String::valueOf)
				.collect(Collectors.joining());
		
		return str.equals(reversedStr);
	}
	
	public static void main(String[] args) {
		String testString1 = "A man, a plan, a canal, Panama";
		
		System.out.println(testString1 + " is palindrome? " + isPalindrome(testString1)); // true
	}
}
