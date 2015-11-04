package com.lzr.Amazon.Test;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

import com.lzr.Amazon.LRU;

public class LRUTest {

	@Test
	public void testMiss() {
		Assert.assertEquals(3, LRU.miss(new int[]{2,3,2,3,4}, 2));
	}

}
