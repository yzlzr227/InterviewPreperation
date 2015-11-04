package com.lzr.Amazon.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.lzr.Amazon.InsertIntoACircularList;
import com.lzr.utils.ListNode;

public class InsertIntoACircularListTest {

	@Test
	public void testInertIntoCircularList() {
		int[] input = new int[]{1,2,4}, output = new int[]{1,2,3,4};
//		int[] output = new int[]{3};
		ListNode head = ListNode.revertArrayToCircul(input), node = new ListNode(3);
//		ListNode head = null, node = new ListNode(3);
		head = head.next.next;
		head = InsertIntoACircularList.inertIntoCircularList(head, node);
		ArrayList<Integer> ans =  ListNode.reverseCircalToArray(head);
		Assert.assertEquals(output.length, ans.size());
		for (int i  = 0; i < output.length; i++){
			Assert.assertEquals(output[i], (int)ans.get(i));
		}
	}

}
