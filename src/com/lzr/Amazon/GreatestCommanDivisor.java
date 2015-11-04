package com.lzr.Amazon;

public class GreatestCommanDivisor {

	
	public static int GCD(int x, int y){
		
		int a = Math.max(x, y), b = Math.min(x, y), r = b;
		
		while (a % b != 0){
			r = a % b;
			a = b;
			b = r;
		}
		
		return r;
	}
}
