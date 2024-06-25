package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAverage {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
		
		System.out.println(avg);
		
		List<Integer> square = list.stream().map(e -> e * e).filter(e -> e > 10).collect(Collectors.toList());
		
		System.out.println(square);
		
		list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
		
		List<Integer> list2 = Arrays.asList(1, 22, 29, 32, 4, 5, 2, 3);
		
		list2.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList()).forEach(System.err::println);
		
		Map<Integer, Long> dup = list2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.err.println(dup);
		
		List<Integer> list3 = list2.stream().filter(e -> Collections.frequency(list2, e) > 1).collect(Collectors.toList());
		
		System.out.println(list3);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list2.stream().filter(e -> !set.add(e)).toList().forEach(System.err::println);
		
		System.out.println("max  :: " + list2.stream().max(Comparator.comparing(Integer::valueOf)).get());
		
		System.out.println("second lowest number :: " + list2.stream().sorted().skip(1).findFirst().get());
		
		System.out.println("second highest number :: " + list2.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get());
		
		
	}
}
