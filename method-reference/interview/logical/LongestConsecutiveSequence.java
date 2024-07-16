package com.javamultiplex.methodreference.interview.logical;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	public static int longestConsecutive(int[] nums) {
		
		HashSet<Integer> numSet = new HashSet<>();
		for (int num : nums) {
			numSet.add(num);
		}
		
		int longestStreak = 0;
		
		for (int num : numSet) {
			if (!numSet.contains(num - 1)) {
				int currentNum = num;
				while (numSet.contains(currentNum + 1)) {
					currentNum++;
				}
				longestStreak = Math.max(longestStreak, currentNum - num + 1);
			}
		}
		return longestStreak;
	}
	
	public static void main(String[] args) {
		int[] nums = {100, 4, 200, 1, 3, 2, 5, 6};
		int longest = longestConsecutive(nums);
		System.out.println("Length of longest consecutive sequence: " + longest);
	}
}
