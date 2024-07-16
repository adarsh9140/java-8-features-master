package com.javamultiplex.methodreference.interview.logical;

import java.util.ArrayList;
import java.util.List;

public class FindAllPossibleSubArray {
	
	public static List<List<Integer>> findAllSubarrays(int[] nums) {
		
		List<List<Integer>> result = new ArrayList<>();
		
		for (int start = 0; start < nums.length; start++) {
			for (int end = start; end < nums.length; end++) {
				List<Integer> subarray = new ArrayList<>();
				for (int i = start; i <= end; i++) {
					subarray.add(nums[i]);
				}
				result.add(subarray);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		
		List<List<Integer>> allSubarrays = findAllSubarrays(nums);
		System.err.println("All subarrays:" + allSubarrays);
		
	}
}

