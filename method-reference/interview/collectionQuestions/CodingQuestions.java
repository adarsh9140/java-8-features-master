package com.javamultiplex.methodreference.interview.collectionQuestions;


public class CodingQuestions {
	
	public static void main(String[] args) {
		
		String text = "adarsh";
		
		StringBuilder uniqueChars = new StringBuilder();
		
		text.chars()
				.mapToObj(e -> (char) e)
				.distinct()
				.forEach(uniqueChars::append);
		
		System.out.println(uniqueChars);
		
	}
}
