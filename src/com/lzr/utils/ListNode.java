package com.lzr.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by yzlzr227 on 9/27/15.
 */
public class ListNode {

    public int val;
    public ListNode next, prev;

    public ListNode(int v) {
        this.val = v;
        this.next = null;
        this.prev = null;
    }
    
    public static ListNode revertArrayToCircul(int[] input){
    	if(input == null || input.length == 0)	return null;
    	
    	ListNode head = new ListNode(input[0]), tail = head;
    	for (int i = 1; i < input.length; i++){
    		tail.next = new ListNode(input[i]);
    		tail = tail.next;
    	}
    	tail.next = head;
    	return head;
    }
    
    public static ListNode revertArrayToList(int[] input){
    	if(input == null || input.length == 0)	return null;
    	
    	ListNode head = new ListNode(input[0]), tail = head;
    	for (int i = 1; i < input.length; i++){
    		tail.next = new ListNode(input[i]);
    		tail = tail.next;
    	}
    	
    	return head;
    }
    
    
    
    public static ArrayList<Integer> reverseCircalToArray(ListNode head){
    	if (head == null)	return null;
    	ArrayList<Integer> list = new ArrayList<>();
    	ListNode p = head;
    	do{
    		list.add(p.val);
    		p = p.next;
    	}while (p != head);
    	Collections.sort(list);
    	
    	return list;
    }
}






















