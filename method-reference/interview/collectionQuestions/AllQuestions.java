package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AllQuestions {
	
	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(4, 5, 6, 10, 111, 2, 33);
		
		Map<Boolean, List<Integer>> collect = integers.stream().collect(Collectors.partitioningBy(e -> e > 2));
		
		System.out.println(collect);
		
		List<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("apple");
		list.add("banana");
		list.add("grape");
		
		Set<String> duplicates = list.stream().filter(i -> list.stream().filter(j -> j.equals(i)).count() > 1).collect(Collectors.toSet());
		
		System.out.println("dup : " + duplicates);
		
		List<String> integers22 = Arrays.asList("2", "2", "1", "1");
		
		integers22.stream().filter(i -> integers22.stream().filter(j -> j.equals(i)).count() > 1).collect(Collectors.toSet()).forEach(System.err::println);
		
		int[] arr1 = {5, 3, 8, 2, 9, 1};
		int[] arr2 = {7, 6, 4, 2, 9};
		
		
		Arrays.stream(arr1).sum();
		Arrays.stream(arr1).average();
		
		int[] ints = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted().toArray();
		System.out.println(Arrays.toString(ints));
		
		
		int[] reversedArray1 = IntStream.range(0, arr1.length).map(i -> arr1[arr1.length - i - 1]).toArray();
		
		System.out.println("rev " + Arrays.toString(reversedArray1));
		
		String text = "hello";
		
		Map<Character, Long> collect1 = text.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(collect1);
		
		List<Integer> sorted = integers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(sorted);
		
		List<Integer> collect2 = integers.stream().filter(e -> e % 5 == 0).collect(Collectors.toList());
		
		System.out.println(collect2);
		
		List<Integer> collect3 = integers.stream().sorted().limit(3).collect(Collectors.toList());
		
		List<Integer> collect4 = integers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		
		System.out.println(collect3);
		System.out.println(collect4);
		
		List<String> strings = Arrays.asList("abcde", "ab", "oiuo", "aax");
		
		List<String> sorted1 = strings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
		
		System.err.println("collect5 " + sorted1);
		
		
	}
	
}
