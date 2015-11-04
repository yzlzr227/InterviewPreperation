package com.lzr.LeetCodeRemember.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lzr.LeetCodeRemember.LongestCommonPrefix;

public class LongestCommonPrefixTest {

	@Test
	public void testLongestCommonPrefix() {
		String[] strs = new String[]{"122","121"};
		assertEquals("12", LongestCommonPrefix.longestCommonPrefix(strs));
	}

}
