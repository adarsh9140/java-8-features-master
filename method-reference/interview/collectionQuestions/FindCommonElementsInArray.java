package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElementsInArray {
	
	public static void main(String[] args) {
		
		List<String> firstList = Arrays.asList("amam", "jay", "anil", "akash");
		
		List<String> secondList = Arrays.asList("amam1", "jay", "anil1", "akash1");
		
		firstList.stream()
				.filter(secondList::contains)
				.forEach(System.out::println);
		
		List<Integer> n1 = Arrays.asList(3, 1, 44, 4, 22, 4, 5);
		
		List<Integer> n2 = Arrays.asList(3, 9, 8, 5, 4, 4, 5);
		
		n1.stream().filter(n2::contains).collect(Collectors.toList());
		
		
	}
}
