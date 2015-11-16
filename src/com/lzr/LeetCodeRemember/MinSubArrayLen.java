package com.lzr.LeetCodeRemember;

public class MinSubArrayLen {
	public static int minSubArrayLen(int s, int[] nums){
		if (nums == null || nums.length == 0)	return Integer.MAX_VALUE;
		
		int left = 0, right = 0, min = nums.length + 1, sum = 0;
		while (right < nums.length){
			sum += nums[right];
			while (sum >= s){
				min = Math.min(min, right - left + 1);
				sum -= nums[left];
				left++;
			}
			right++;
		}
		return min;
	}
}
