package com.lzr.LeetCodeRemember.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lzr.LeetCodeRemember.GasStation;

public class GasStationTest {

	@Test
	public void testCanCompleteCircle() {
		assertEquals(1, GasStation.canCompleteCircuit(new int[]{2, 4},new int[]{3,4}));
	}

}
