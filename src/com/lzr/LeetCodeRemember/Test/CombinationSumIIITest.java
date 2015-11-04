package com.lzr.LeetCodeRemember.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import org.junit.Test;

import com.lzr.LeetCodeRemember.CombinationSumIII;

public class CombinationSumIIITest {

	@Test
	public void testCombinationSum3() {
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> list = new ArrayList<Integer>(){{add(1);add(2);add(4);}};
		ans.add(list);
		assertEquals(ans, CombinationSumIII.combinationSum3(3, 7));
	}

}
