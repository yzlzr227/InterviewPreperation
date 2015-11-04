package com.lzr.LeetCodeRemember;

import java.util.Arrays;

public class GreedyAlgorithm {

	public static int candy(int[] ratings){
		
		if (ratings == null || ratings.length == 0)	return 0;
		if (ratings.length == 1)	return 1;
		int[] candies = new int[ratings.length];
		Arrays.fill(candies, 1);
		
		for (int i = 1; i < ratings.length; i++){
			if (ratings[i] > ratings[i - 1])
				candies[i] = candies[i - 1] + 1;
		}
		
		for (int i = ratings.length - 2; i >= 0; i--){
			if (ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1])
				candies[i] = candies[i + 1] + 1;
		}
		
		int count = 0;
		for (int candy : candies)	count += candy;
		
		return count;
	}
}
