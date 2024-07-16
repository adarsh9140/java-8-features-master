package com.javamultiplex.methodreference.interview.collectionQuestions;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringJoinerExample {
	
	public static void main(String[] args) {
		
		String text = "hello how are you";
		
		String[] stringArr = text.split(" ");
		
		StringJoiner joiner = new StringJoiner("-", "[", "]");
		
		
		Arrays.asList(stringArr).stream().forEach(e -> joiner.add(e));
		
		System.out.println(joiner);
	}
}
