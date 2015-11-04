package com.lzr.Amazon;

import com.lzr.utils.ListNode;

public class InsertIntoACircularList {
	
	public static ListNode inertIntoCircularList(ListNode head, ListNode node){
		if (head == null){
			node.next = node;
			head = node;
			return head;
		}else if (head.next == head){
			head.next = node;
			node.next = head;
			return head;
		}
		
		ListNode p = head, q = head.next;
		while (true){
			if (p.val <= node.val && node.val <= q.val){
				p.next = node;
				node.next = q;
				return head;
			}else if (p.val > q.val){
				if (node.val > p.val || node.val < q.val){
					p.next = node;
					node.next = q;
					return head;
				}
			}
			p = q;
			q = q.next;
		}
	}
}
