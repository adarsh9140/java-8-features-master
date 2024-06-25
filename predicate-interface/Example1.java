package com.javamultiplex.predicate;

import com.javamultiplex.methodreference.interview.collectionQuestions.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
	
	public static void main(String[] args) {
		
		
		List<String> strings1 = Arrays.asList("ab", "ssssss", "s", "swsw");
		
		List<String> strings2 = Arrays.asList("abc", "xz", "zx", "ml");
		
		
		List<String> sortedList = Stream.concat(strings1.stream(), strings2.stream())
				.sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()))
				.toList();
		
		
		strings2.stream().sorted(Comparator.comparing(String::length)).toList();
		
		
		System.out.println("Sorted concatenated list: " + sortedList);
		
		List<String> list = strings1.stream().filter(e -> e.startsWith("a")).collect(Collectors.toList());
		
		System.out.println(list);
		
		
		//--------------------------------------------------------------
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		Integer integer = numbers.stream().filter(e -> e % 2 == 0).reduce((a, b) -> a + b).get();
		
		
		System.out.println(integer);
		
		List<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee("Ajay", 35);
		Employee e2 = new Employee("Vijay", 5);
		Employee e3 = new Employee("Zack", 30);
		
		
		List<Employee> employees1 = employees.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge)).toList();
		
		System.err.println(employees1);
		
		
		List<Integer> numbersList = Arrays.asList(5, 2, 8, 1, 3, 2, 5);
		
		List<Integer> sorted = numbersList.stream().distinct().sorted().toList();
		
		System.out.println(sorted);
		
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
		
		String s = strings.stream().max(Comparator.comparing(String::length)).get();
		
		System.out.println(s);
		
		
		//-------------------------------------------------------------------------------------
		
		String str = "programming";
		
		str.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
	}
	
	
}
