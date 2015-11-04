package com.lzr.qumulo;

import java.util.ArrayList;

import javafx.geometry.Point2D;

public class PermutationSequence {

	public static String getPermutation(int n, int k){
		if (n == 0)	return "";
		if (n == 1)	return "1";
		int[] help = new int[n + 1];
		help[0] = 1;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++){
			list.add(i);
			help[i] = help[i - 1] * i;
		}
		StringBuffer sb = new StringBuffer();
		
		while (list.size() > 0){
			int index = k / help[list.size() - 1];
			int carry = k % help[list.size() - 1];
			if (carry == 0){
				index--;
				carry = help[list.size() - 1];
			}
			sb.append(list.get(index));
			list.remove(index);
			k = carry;
		}
		return sb.toString();
	}
	
	class Point{
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}
	}
}
