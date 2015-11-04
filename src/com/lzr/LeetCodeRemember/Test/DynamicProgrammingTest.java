package com.lzr.LeetCodeRemember.Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;

import com.lzr.LeetCodeRemember.DynamicProgramming;

public class DynamicProgrammingTest {

	@Test
	public void test() {
		DynamicProgramming dynamicProgramming = new DynamicProgramming();
		int[][] input = new int[][] {{1,2,5},{3,2,1}};
		Assert.assertEquals(6, dynamicProgramming.minPathSum(input));
	}

}
