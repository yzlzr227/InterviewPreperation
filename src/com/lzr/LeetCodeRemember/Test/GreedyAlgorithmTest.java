package com.lzr.LeetCodeRemember.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lzr.LeetCodeRemember.GreedyAlgorithm;

public class GreedyAlgorithmTest {

	@Test
	public void testCandy() {
		int[] ratings = new int[]{4,2,3,4,1};
		assertEquals(9, GreedyAlgorithm.candy(ratings));
	}

}
