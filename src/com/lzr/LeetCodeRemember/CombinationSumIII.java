package com.lzr.LeetCodeRemember;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
	
	public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        if (k  < 1) return ans;
        List<Integer> list = new ArrayList<>();
        help(ans, list, k, n, 1);
        return ans;
    }
    
    private static void help(List<List<Integer>> ans, List<Integer> list, int k, int n, int start){
        if (n == 0 && list.size() == k){
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        if (n < 0 || list.size() == k || n < start)  return;
        
        for (int i = start; i <= 9; i++){
            list.add(i);
            help(ans, list, k, n - i, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
