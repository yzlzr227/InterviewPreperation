package com.lzr.LeetCodeRemember.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lzr.LeetCodeRemember.LongestIncreasingSequence;

public class LongestIncreasingSequenceTest {

	@Test
	public void testLengthOfLIS() {
		assertEquals(4, LongestIncreasingSequence.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
		assertEquals(6, LongestIncreasingSequence.lengthOfLIS(new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80}));
	}

}
