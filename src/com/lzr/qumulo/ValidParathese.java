package com.lzr.qumulo;

import java.util.Stack;

public class ValidParathese {
	public static boolean isValid(String s){
		if (s == null || s.length() == 0)	return false;
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()){
			if (isLeft(c)){
				stack.push(c);
			}else{
				if (!stack.isEmpty() || (!stack.isEmpty() && !match(stack.pop(), c)))
					return false;
			}
		}
		
		return stack.isEmpty();
	}
	
	private static boolean isLeft(char c){
		return	c == '(' || c == '[' || c == '{';
	}
	
	private static boolean match(char c1, char c2){
		return (c1 == '{' && c2 == '}') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
	}
}
