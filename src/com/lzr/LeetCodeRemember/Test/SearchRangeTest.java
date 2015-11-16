package com.lzr.LeetCodeRemember.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lzr.LeetCodeRemember.SearchRange;

public class SearchRangeTest {

	@Test
	public void testSearchRange() {
		assertArrayEquals(new int[]{3,4}, SearchRange.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
	}

}
