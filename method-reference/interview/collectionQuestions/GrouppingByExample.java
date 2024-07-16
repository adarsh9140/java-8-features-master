package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GrouppingByExample {
	
	public static void main(String[] args) {
		
		List<Person> person = new ArrayList<Person>();
		
		insertData(person);
		
		Map<String, List<Person>> groupPerson = person.stream().collect(Collectors.groupingBy(Person::getCity));
		
		System.err.println(groupPerson);
		
		String text = "hello";
		
		text.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(text.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		
		Set<Character> set = new HashSet<>();
		
		System.err.println("duplicate " + text.chars().mapToObj(e -> (char) e).filter(e -> !set.add(e)).collect(Collectors.toList()));
		
	}
	
	public static void insertData(List<Person> person) {
		
		Person p1 = new Person();
		
		p1.setCity("kanpur");
		p1.setId(1L);
		p1.setName("adarsh");
		
		
		Person p2 = new Person();
		
		p2.setCity("kanpur");
		p2.setId(41L);
		p2.setName("adarsh3");
		
		
		Person p3 = new Person();
		
		p3.setCity("kanpur");
		p3.setId(21L);
		p3.setName("adarsh2");
		
		
		Person p4 = new Person();
		
		p4.setCity("delhi");
		p4.setId(31L);
		p4.setName("adarsh1");
		
		
		person.add(p1);
		person.add(p2);
		person.add(p3);
		person.add(p4);
	}
	
}
