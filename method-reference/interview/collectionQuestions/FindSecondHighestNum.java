package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHighestNum {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(9, 1, 2, 3, 4, 5, 6, 7, 7, 9);
		
		int i = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		
		System.out.println(i);
	}
	
}
