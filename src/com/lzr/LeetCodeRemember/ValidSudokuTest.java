package com.lzr.LeetCodeRemember;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidSudokuTest {

	@Test
	public void testIsValidSudoku() {
		ValidSudoku valid = new ValidSudoku();
		char[][] board = new char[9][9];
		board[0] = ".87654321".toCharArray();
		board[1] = "2........".toCharArray();
		board[2] = "3........".toCharArray();
		board[3] = "4........".toCharArray();
		board[4] = "5........".toCharArray();
		board[5] = "6........".toCharArray();
		board[6] = "7........".toCharArray();
		board[7] = "8........".toCharArray();
		board[8] = "9........".toCharArray();
		assertTrue(valid.isValidSudoku(board));
	}

}
