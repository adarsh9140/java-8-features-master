package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.stream.IntStream;

public class PalindromeCheckJava8 {
	
	
	public static void main(String[] args) {
		String str = "abcabc";
		
		boolean isPalindrome = IntStream.range(0, str.length() / 2)
				.allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
		
		if (isPalindrome) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}
		
		int number = 1234;
		
		int sum = String.valueOf(number).chars()
				.map(Character::getNumericValue)
				.sum();
	}
}