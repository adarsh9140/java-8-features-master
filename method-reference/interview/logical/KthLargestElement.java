package com.javamultiplex.methodreference.interview.logical;

import java.util.Arrays;

public class KthLargestElement {
	public int findKthLargest(int[] nums, int k) {
		
		// Sort the array in descending order
		Arrays.sort(nums);
		
		// Return the k-th largest element
		return nums[nums.length - k];
	}
	
	public static void main(String[] args) {
		KthLargestElement kthLargest = new KthLargestElement();
		int[] nums = {3, 2, 1, 5, 6, 4};
		int k = 2;
		System.out.println(kthLargest.findKthLargest(nums, k));  // Output: 5
	}
}
