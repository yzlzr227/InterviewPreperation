package com.lzr.Amazon;

import java.util.HashMap;

import com.lzr.utils.ListNode;

public class LRU {

	
	public static int miss(int[] input, int size){
		if (size ==  0)	return input.length;
		if (input == null || input.length == 0)	return 0;
		
		int miss = 0, curSize = 0;
		ListNode head = null, tail = null;
		HashMap<Integer, ListNode> map = new HashMap<>();
		for (int i = 0; i < input.length; i++){
			if (map.containsKey(input[i])){
				ListNode node = map.get(input[i]);
				if (node == head){
					continue;
				}else if(node == tail){
					tail.prev.next = null;
					tail = tail.prev;
					node.prev = null;
					node.next = head;
					head.prev = node;
					head = node;
				}else{
					node.prev.next = node.next;
					node.prev = null;
					node.next = head;
					head.prev = node;
					head = node;
				}
			}else{
				miss++;
				curSize++;
				ListNode node = new ListNode(input[i]);
				map.put(input[i], node);
				if (head != null){
					head.prev = node;
					node.next = head;
					head = node;
					if (curSize > size){
						map.remove(tail.val);
						tail = tail.prev;
						tail.next.prev = null;
						tail.next = null;
						curSize--;
					}
				}else{
					head = node;
					tail = node;
				}
				
			}
		}
		
		return miss;
	}
}
