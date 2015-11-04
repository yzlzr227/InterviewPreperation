package com.lzr.Amazon;

public class XOrIntegerArray {
	
	public int[] reverseOneAndZero(int[] input, int time){
		if (input == null || input.length == 0)	return input;
		
		for(int i = 0; i < time; i++){
			int prev = 0;
			for (int j = 0; j < input.length - 1; j++){
				int tmp =input[j];
				input[j] = reverse(prev, input[j + 1]);
				prev = tmp;
			}
			input[input.length - 1] = reverse(prev, 0);
		}
	
		return input;
	}
	
	private int reverse(int left, int right){
		if (left == right)	return 0;
		else 				return 1;
	}
	
}
