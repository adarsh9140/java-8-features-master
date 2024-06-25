package com.javamultiplex.methodreference.interview.collectionQuestions;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindVowelandDuplicate {
	
	public static void main(String[] args) {
		
		//find vowel
		
		String text = "adarshs";
		
		text.chars().filter(e -> e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u').forEach(e -> System.out.println((char) e));
		
		Long i = text.chars().filter(e -> e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u').count();
		
		System.out.println(i);
		
		
		//find duplicates
		
		Set<Character> seen = new HashSet<>();
		
		// Filter out duplicates and collect them into a string
		
		String duplicates = text.chars()
				.filter(c -> !seen.add((char) c))
				.mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.joining());
		
		
		StringBuilder stringBuilder = new StringBuilder();
		
		text.chars().mapToObj(e -> (char) e).distinct().forEach(stringBuilder::append);
		
		System.err.println(stringBuilder);
		
		System.out.println("Duplicate characters: " + duplicates);
	}
	
}
