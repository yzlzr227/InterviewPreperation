package com.lzr.qumulo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lzr.qumulo.PreOrderToPostOrder;

public class PreOrderToPostOrderTest {

	@Test
	public void testTransfer() {
		int[] test = new int[]{4,2,1,3,6,5,7};
		int[] test2 = new int[]{1};
		int[] test3 = new int[]{3,1};
		assertArrayEquals(new int[]{1,3,2,5,7,6,4}, PreOrderToPostOrder.transfer(test));
		assertArrayEquals(new int[]{1}, PreOrderToPostOrder.transfer(test2));
		assertArrayEquals(new int[]{1,3}, PreOrderToPostOrder.transfer(test3));
	}

}
