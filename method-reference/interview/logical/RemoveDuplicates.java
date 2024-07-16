package com.javamultiplex.methodreference.interview.logical;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	
	public static String removeDuplicates(String s) {
		
		LinkedHashSet<Character> set = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.toCollection(LinkedHashSet::new));
		
		return set.stream().map(String::valueOf).collect(Collectors.joining());
	}
	
	public static void main(String[] args) {
		System.out.println(removeDuplicates("aassdfggfttyt"));
	}
	
	
}
