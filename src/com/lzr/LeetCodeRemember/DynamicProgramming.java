package com.lzr.LeetCodeRemember;

public class DynamicProgramming {
	
	public int minPathSum(int[][] grid){
		if (grid == null || grid.length == 0 || grid[0].length == 0)	return Integer.MAX_VALUE;
		int m = grid.length, n = grid[0].length;
		int[] row = new int[n], col = new int[m];
		row[0] = grid[0][0];
		col[0] = grid[0][0];
		
		for (int i = 1; i < m; i++)	col[i] = col[i - 1] + grid[i][0];
		for (int j = 1; j < n; j++) row[j] = row[j - 1] + grid[0][j];
		
		for (int i = 1; i < m; i++){
			for (int j = 1; j < n; j++){
				int tmp = Math.min(row[j], col[i]) + grid[i][j];
				row[j] = tmp;
				col[i] = tmp;
			}
		}
		return row[n - 1];
	}
}
