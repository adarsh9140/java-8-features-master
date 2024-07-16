package com.javamultiplex.methodreference.interview.logical;

public class MaximumProductSubarray {
	
	public static int maxProduct(int[] nums) {
		int maxProduct = nums[0];
		int minProduct = nums[0];
		int result = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			int tempMax = Math.max(nums[i], Math.max(maxProduct * nums[i], minProduct * nums[i]));
			minProduct = Math.min(nums[i], Math.min(maxProduct * nums[i], minProduct * nums[i]));
			maxProduct = tempMax;
			result = Math.max(result, maxProduct);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println(maxProduct(new int[]{1, 2, 4, 5, 0, -1, -5}));
	}
	
	
}
