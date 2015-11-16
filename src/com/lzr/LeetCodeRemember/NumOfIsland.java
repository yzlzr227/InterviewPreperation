package com.lzr.LeetCodeRemember;

public class NumOfIsland {
	public static int count(char[][] grid){
		if (grid == null || grid.length == 0 || grid[0].length == 0)	return 0;
		int count = 0;
		
		for (int i = 0; i < grid.length; i++){
			for (int j = 0; j < grid[0].length; j++){
				if (grid[i][j] != 1)	continue;
				dfs(grid, i , j);
				count++;
			}
		}
		
		return count;
	}
	
	public static void dfs(char[][] grid, int i, int j){
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)	return;
		if (grid[i][j] != 1)	return;
		
		grid[i][j] = 1;
		dfs(grid, i + 1, j);
		dfs(grid, i - 1, j);
		dfs(grid, i, j + 1);
		dfs(grid, i, j - 1);
	}
}
