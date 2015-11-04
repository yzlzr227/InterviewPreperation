package com.lzr.Amazon;

import com.lzr.utils.ListNode;
import com.lzr.utils.TreeNode;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Coding {
	public int twoSum(int[] nums, int sum){
		if (nums == null || nums.length < 2){
//			System.out.println('0');
			return 0;
		}
		int ans = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++){
			if (set.contains(nums[i]))    ans++;
            set.add(sum - nums[i]);
		}

//        System.out.println(ans);
		return ans;
    }

    public static ListNode mergeTwoList(ListNode l1, ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = null;
        if (l1.val <= l2.val){
            head = l1;
            l1 = l1.next;
        }else{
            head = l2;
            l2 = l2.next;
        }
        ListNode tail = head.next;

        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                tail.next = l1;
                l1 = l1.next;
            }else{
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 == null) tail.next = l2;
        if (l2 == null) tail.next = l1;

        return head;
    }

    public boolean isSubTree(TreeNode tree1, TreeNode tree2){
        if (tree1 == tree2) return true;
        return isSubTree(tree1.left, tree2) || isSubTree(tree1.right, tree2);
    }

    public boolean isValidParenthes(String s){
        if (s == null || s.length() == 0)   return true;
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if ("{[(".contains(String.valueOf(c))){
                stack.push(c);
            }else{
                if (stack.isEmpty())    return false;
                char prev = stack.pop();
                if ((prev == '(' && c == ')') || (prev == '[' && c == ']') || (prev == '{' && c == '}'))
                    continue;
                return false;
            }
        }

        return stack.isEmpty();
    }

    public int longestPalindorm(String s){
        if (s == null || s.length() == 0)   return 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++){
        	max = Math.max(max, longestPalindorm(s, i, i));
        	max = Math.max(max, longestPalindorm(s, i, i + 1));
        }
        
        return max;
    }
    
    private int longestPalindorm(String s, int left, int right){
    	if (left < 0 || right >= s.length() || left > right || s.charAt(left) != s.charAt(right))	return 0;
    	while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
    		left--;right++;
    	}
    	return right - left - 1;
    }

    public int longestPalindorm2(String s){
    	if (s == null || s.length() == 0)	return 0;
    	
    	int n = s.length();
    	boolean[][] dp = new boolean[n][n];
    	
    	int maxLength = 1;
    	for(int i = 0; i < n; i++){
    		dp[i][i] = true;
    	}
    	
    	int start = 0;
    	for (int i = 0; i < n - 1; i++){
    		if (s.charAt(i) == s.charAt(i + 1)){
    			maxLength = 2;
    			start = i;
    			dp[i][i + 1] = true;
    		}
    	}
    	
    	for (int k = 3; k <= n; k++){
    		for (int i = 0; i <= n - k; i++){
    			int j = i + k - 1;
    			
    			if (dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j)){
    				dp[i][j] = true;
    				
    				if (k > maxLength){
    					maxLength = k;
    					start = i;
    				}
    			}
    		}
    	}
    	
//    	return s.substring(start, start + maxLength - 1);
    	return maxLength;
    }
}
