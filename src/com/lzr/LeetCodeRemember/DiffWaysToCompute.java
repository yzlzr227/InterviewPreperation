package com.lzr.LeetCodeRemember;

import java.util.ArrayList;
import java.util.List;

public class DiffWaysToCompute {
	public static List<Integer> diffWaysToCompute(String input) {
        List<Integer> ans = new ArrayList<>();
        input = input.replaceAll("\\s+", "");
        if (input == null || input.length() == 0)   return ans;
        int left = 0, right = left + 1;
        List<Integer> nums = new ArrayList<>();
        List<Character> ops = new ArrayList<>();
        while (left < input.length()){
            while (right < input.length() && input.charAt(right) != '+' && input.charAt(right) != '-'&& input.charAt(right) != '*')
                right++;
            if (right != input.length())    ops.add(input.charAt(right));
            nums.add(Integer.parseInt(input.substring(left, right)));
            left = right + 1;
            right = left + 1;
        }
        help(ans, nums, ops);
        return ans;
    }
    
    private static void help(List<Integer> ans, List<Integer> operands, List<Character> operation){
        if (operation.size() == 1){
            if (operands.size() != 2)   return;
            ans.add(calculate(operands.get(0), operands.get(1), operation.get(0)));
            return;
        }
        if (operation.size() + 1 != operands.size())    return;
        for (int i = 0; i < operation.size(); i++){
            List<Integer> nums = new ArrayList<Integer>(operands);
            List<Character> ops = new ArrayList<Character>(operation);
            nums.set(i + 1, calculate(nums.get(i), nums.get(i + 1), ops.get(i)));
            nums.remove(i);
            ops.remove(i);
            help(ans, nums, ops);
        }
    }
    
    private static int calculate(int num1, int num2, char op){
        switch(op){
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
        }
        return 0;
    }
}
