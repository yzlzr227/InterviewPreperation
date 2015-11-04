package com.lzr.LeetCodeRemember;

import java.util.*;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9) return false;
        
        boolean[] used = new boolean[9];
        for (int i = 0; i < 9; i++){
            if (checkRow(board, i, used))
                return false;
        }
        
        for (int i = 0; i < 9; i++){
            if (checkCol(board, i, used))
                return false;
        }
        
        for (int i = 0; i < 9; i+=3){
            for (int j = 0; j < 9; j += 3){
                if (checkSquare(board, i, j, used))
                    return false;
            }
        }
        
        return true;
        
    }
    
    private boolean checkSquare(char[][] board, int row, int col, boolean[] used){
        Arrays.fill(used, false);
        for (int i = row; i < row + 3; i++){
            for (int j = col; j < col + 3; j++){
                if (board[i][j] == '.') continue;
                int index = board[i][j] - '0';
                if (used[index])    return false;
                used[index] = true;
            }
        }
        return true;
    }
    
    private boolean checkCol(char[][] board, int col, boolean[] used){
        Arrays.fill(used, false);
        for (int i = 0; i < 9; i++){
            if (board[i][col] == '.')  continue;
            int index = board[i][col] - '0';
            if (used[index])    return false;
            used[index] = true;
        }
        return true;
    }
    
    private boolean checkRow(char[][] board, int row, boolean[] used){
        Arrays.fill(used, false);
        for (int i = 0; i < 9; i++){
            if (board[row][i] == '.')   continue;
            int index = board[row][i] - '0';
            if (used[index])    return false;
            used[index] = true;
        }
        return true;
    }
}
