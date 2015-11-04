package com.lzr.qumulo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PreOrderToPostOrder {

	public static int[] transfer(int[] preOrder){
		if (preOrder == null || preOrder.length == 0)	return preOrder;
		ArrayList<Integer> ans = new ArrayList<>();
		transfer(preOrder, 0, preOrder.length - 1, ans);
		for (int i = 0; i < preOrder.length; i++){
			preOrder[i] = ans.get(i);
		}
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		return preOrder;
	}
	
	private static void transfer(int[] preOrder, int left, int right, ArrayList<Integer> ans){
		if (right < left)	return;
		if (left == right){
			ans.add(preOrder[left]);
			return;
		}
		int index = find(preOrder, left + 1, right, preOrder[left]);
		transfer(preOrder, left + 1, index - 1, ans);
		transfer(preOrder, index, right, ans);
		ans.add(preOrder[left]);
		return;
	}
	
	private static int find(int[] array, int left, int right, int target){
		if (left < 0 || right >= array.length || right < left)	return -1;
		
		while (left < right){
			int mid = left + (right - left) / 2;
			if (array[mid] < target){
				left = mid;
			}else{
				right = mid;
			}
		}
		
		return left;
	}
}
