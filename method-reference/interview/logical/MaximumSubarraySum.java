package com.javamultiplex.methodreference.interview.logical;

import java.util.Arrays;

public class MaximumSubarraySum {
	
	public static int[] findMaxSubarray(int[] nums) {
		
		int maxEndingHere = nums[0];
		int maxSoFar = nums[0];
		int start = 0;
		int end = 0;
		int tempStart = 0;
		
		for (int i = 1; i < nums.length; i++) {
			if (maxEndingHere + nums[i] < nums[i]) {
				maxEndingHere = nums[i];
				tempStart = i;
			} else {
				maxEndingHere += nums[i];
			}
			
			if (maxEndingHere > maxSoFar) {
				maxSoFar = maxEndingHere;
				start = tempStart;
				end = i;
			}
		}
		
		return Arrays.copyOfRange(nums, start, end + 1);
	}
	
	
	public static int maxSubArraySumOnly(int[] nums) {
		int maxSum = nums[0];
		int currentSum = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			currentSum = Math.max(nums[i], currentSum + nums[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		
		return maxSum;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int[] maxSubarray = findMaxSubarray(nums);
		
		System.err.println(maxSubArraySumOnly(nums));
		
		System.out.println("Maximum sum of subarray: " + Arrays.stream(maxSubarray).sum());
		System.out.println("Subarray with maximum sum: " + Arrays.toString(maxSubarray));
	}
}
