package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sums {
	
	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("aman", "akash", "alok", "mannan", "divya");
		
		List<String> list1 = list.stream().filter(e -> e.startsWith("a")).collect(Collectors.toList());
		
		System.out.println(list1);
		
		
	}
	
}
