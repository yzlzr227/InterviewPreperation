package com.lzr.LeetCodeRemember.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lzr.LeetCodeRemember.MinSubArrayLen;

public class MinSubArrayLenTest {

	@Test
	public void testMinSubArrayLen() {
		assertEquals(2, MinSubArrayLen.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
	}

}
