package com.lzr.LeetCodeRemember;

import java.util.Arrays;

public class LongestIncreasingSequence {
	public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0)  return 0;
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = nums[0];
        
        int ans = 1;
        
        for (int i = 1; i < nums.length; i++){
        	dp[0] = Math.min(dp[0], nums[i]);
            for (int j = ans - 1; j >= 0; j--){
                if (dp[j] < nums[i]){
                	dp[j + 1] = Math.min(dp[j + 1], nums[i]);
                	ans = Math.max(j + 2, ans);
                	break;
                }
            }
        }
        
        return ans;
    }
}
