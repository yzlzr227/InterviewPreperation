package com.lzr.Amazon.Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.lzr.Amazon.RoundRobin;

public class RoundRobinTest {

	@Test
	public void testRoundRobin() {
		RoundRobin robin = new RoundRobin();
		Assert.assertEquals(7.0 / 3, robin.roundRobin(new int[]{0,1,4}, new int[]{5,2,3}, 3),0.001);
	}

}
