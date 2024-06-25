package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int count = 10;
		
		Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
				.limit(count)
				.mapToInt(fib -> fib[0])
				.forEach(System.out::println);
		
		
		List<String> myList = List.of("apple", "a", "cat", "banana", "dog", "mango", "cat");
		
		
		List<String> collect = myList.stream()
				.filter(s -> myList.stream().filter(str -> str.length() == s.length()).count() == 1)
				.collect(Collectors.toList());
		
		System.out.println("collect " + collect);
		
		
		int[] arr = {-5, 1, -40, 20, 6, 8, 7, -15, 30};
		int targetSum = 15;
		
		Arrays.stream(arr)
				.distinct()
				.forEach(num1 ->
						Arrays.stream(arr)
								.filter(num2 -> num1 + num2 == targetSum)
								.distinct()
								.forEach(num2 ->
										System.out.printf("(%d,%d):%s%n", num1, num2, num1 * num2 % targetSum == 0)
								)
				);
	}
	
	
}