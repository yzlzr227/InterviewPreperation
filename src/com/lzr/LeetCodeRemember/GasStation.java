package com.lzr.LeetCodeRemember;

public class GasStation {
	public static int canCompleteCircuit(int[] gas, int[] cost){
		if (gas == null || cost == null || gas.length != cost.length)
			return -1;
		int totalRemaining = 0, start = 0;
		
		for (int i = 0; i < gas.length; i++){
			int local = gas[i] - cost[i];
			
			if (totalRemaining >= 0){
				totalRemaining += local;
			}else{
				totalRemaining = local;
				start = i;
			}
		}
		
		if (totalRemaining >= 0){
			return start;
		}else{
			return -1;
		}
	}
}
