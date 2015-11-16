package com.lzr.LeetCodeRemember.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.lzr.LeetCodeRemember.DiffWaysToCompute;

public class DiffWaysToComputeTest {

	@Test
	public void testDiffWaysToCompute() {
		ArrayList<Integer> ans = new ArrayList<Integer>(){{add(3);}};
		ArrayList<Integer> ans2 = new ArrayList<Integer>(){{add(0);add(2);}};
		
		assertEquals(ans2, DiffWaysToCompute.diffWaysToCompute("2 - 1 - 1"));
	}

}
