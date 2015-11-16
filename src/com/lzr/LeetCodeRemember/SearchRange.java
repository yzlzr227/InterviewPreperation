package com.lzr.LeetCodeRemember;

import java.util.Arrays;

public class SearchRange {
	public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1,-1};
        if (nums == null || nums.length == 0)   return ans;
        
        int l = 0, r = nums.length - 1;
        
        while (l < r){
            int mid = l + (r - l) / 2;
            if (nums[mid] == target){
                r = mid;
            }else if (nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        
        if (nums[l] != target)  return ans;
        Arrays.fill(ans, l);
        r = nums.length - 1;
        
        while (l < r){
            int mid = l + (r + 1 - l)  / 2;
            if (nums[mid] == target){
                l = mid;
            }else{
                r = mid - 1;
            }
        }
        ans[1] = r;
        return ans;
    }
}
