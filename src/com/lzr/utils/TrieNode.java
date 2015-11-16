package com.lzr.utils;

import java.util.HashSet;
import java.util.Set;

public class TrieNode {
	public char val;
    public boolean end;
    public Set<TrieNode> children;
    // Initialize your data structure here.
    public TrieNode() {
        children = new HashSet<TrieNode>();
    }
    
    public TrieNode(char c){
        this.val = c;
        children = new HashSet<TrieNode>();
    }
    
    public TrieNode search(char c){
        for (TrieNode node : children){
            if (node.val == c)  return node;
        }
        return null;
    }
}
