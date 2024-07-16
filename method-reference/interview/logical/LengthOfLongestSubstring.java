package com.javamultiplex.methodreference.interview.logical;

import java.util.HashSet;

public class LengthOfLongestSubstring {
	
	public static int lengthOfLongestSubstring(String s) {
		
		int n = s.length();
		int maxLength = 0;
		int i = 0, j = 0;
		
		HashSet<Character> set = new HashSet<>();
		
		
		while (i < n && j < n) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				maxLength = Math.max(maxLength, j - i);
			} else {
				set.remove(s.charAt(i++));
			}
		}
		
		return maxLength;
	}
	
	
	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println("The length of the longest substring without repeating characters is: " + lengthOfLongestSubstring(s)); // Output: 3
		
		s = "bbbbb";
		System.out.println("The length of the longest substring without repeating characters is: " + lengthOfLongestSubstring(s)); // Output: 1
		
		s = "pwwkewsxz";
		System.out.println("The length of the longest substring without repeating characters is: " + lengthOfLongestSubstring(s)); // Output: 3
	}
}
