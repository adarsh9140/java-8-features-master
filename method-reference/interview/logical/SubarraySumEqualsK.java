package com.javamultiplex.methodreference.interview.logical;

import java.util.ArrayList;
import java.util.Random;

public class SubarraySumEqualsK {
	
	public static int subarraySum(int[] nums, int k) {
		int count = 0;
		for (int start = 0; start < nums.length; start++) {
			int sum = 0;
			for (int end = start; end < nums.length; end++) {
				sum += nums[end];
				if (sum == k) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 3, 2, 5, 6, 7, 8, 4};
		int k = 5;
		int result = subarraySum(nums, k);
		System.out.println("Number of subarrays with sum equal to " + k + ": " + result);  // Output: 2
		
		
		Random r = new Random();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			
			list.add(r.nextInt(122));
		}
		
		System.out.println(list);
	}
	
	
}
