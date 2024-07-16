package com.javamultiplex.methodreference.interview.logical;

public class FirstUniqChar {
	
	public static int firstUniqChar(String s) {
		int[] count = new int[26]; // Assuming lowercase English letters only
		
		// Count occurrences of each character
		for (char c : s.toCharArray()) {
			count[c - 'a']++;
		}
		
		// Find the index of the first unique character
		for (int i = 0; i < s.length(); i++) {
			if (count[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}
		
		
		return -1; // If no unique character found
	}
	
	public static void main(String[] args) {
		System.out.println(firstUniqChar("swiss	"));
	}
	
}
