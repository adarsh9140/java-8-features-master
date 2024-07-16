package com.javamultiplex.methodreference.interview.logical;


public class MaxProfitInStock {
	
	public static int maxProfit(int[] prices) {
		if (prices == null || prices.length < 2) {
			return 0;
		}
		
		int minPrice = prices[0];
		int maxProfit = 0;
		
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			} else if (prices[i] - minPrice > maxProfit) {
				maxProfit = prices[i] - minPrice;
			}
		}
		
		return maxProfit;
	}
	
	
/*	public static int maxProfitMultipleTransactions(int[] prices) {
		int maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				maxProfit += prices[i] - prices[i - 1];
			}
		}
		return maxProfit;
	}*/
	
	
	public static void main(String[] args) {
		int[] prices = {7, 1, 5, 3, 6, 4};
		int maxProfit = maxProfit(prices);
		
		
		//System.err.println(maxProfitMultipleTransactions(prices));
		
		System.out.println("Maximum profit: " + maxProfit);  // Output: 5
	}
}
