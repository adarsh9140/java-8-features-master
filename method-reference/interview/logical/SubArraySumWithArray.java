package com.javamultiplex.methodreference.interview.logical;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubArraySumWithArray {
	public static void main(String[] args) {
		int[] numbers = {10, 2, 3, 7, 5};
		int targetSum = 12;
		
		int[] result = findSubarrayWithSum(numbers, targetSum);
		
		
		if (result != null) {
			System.out.println("Subarray with sum " + targetSum + ": " + Arrays.toString(Arrays.copyOfRange(numbers, result[0], result[1] + 1)));
		} else {
			System.out.println("No subarray with sum " + targetSum);
		}
	}
	
	public static int[] findSubarrayWithSum(int[] numbers, int targetSum) {
		Map<Integer, Integer> sumMap = new HashMap<>();
		int currentSum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			currentSum += numbers[i];
			
			if (currentSum == targetSum) {
				return new int[]{0, i};
			}
			
			if (sumMap.containsKey(currentSum - targetSum)) {
				return new int[]{sumMap.get(currentSum - targetSum) + 1, i};
			}
			
			sumMap.put(currentSum, i);
		}
		
		return null;
	}
	
	
}
