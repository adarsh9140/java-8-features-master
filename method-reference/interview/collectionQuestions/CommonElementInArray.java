package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonElementInArray {
	
	public static void main(String[] args) {
		
		List<Integer> integers1 = Arrays.asList(4, 5, 6, 10, 111, 2, 33);
		List<Integer> integers2 = Arrays.asList(4, 5, 55, 2, 33);
		
		
		List<Integer> collect = integers1.stream().filter(integers2::contains).collect(Collectors.toList());
		
		System.out.println(collect);
		
		String original = "Hello, world!";
		
		
		String reversed = original.chars()
				.mapToObj(c -> String.valueOf((char) c))
				.reduce("", (s1, s2) -> s2 + s1);
		
		System.out.println("Original: " + original);
		System.out.println("Reversed: " + reversed);
		
		int sum = IntStream.range(1, 11).sum();
		
		System.out.println(sum);
	}
}
