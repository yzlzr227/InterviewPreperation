package com.lzr.LeetCodeRemember;

import com.lzr.utils.TrieNode;

public class Trie {
	private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode cur = root;
        int i = 0;
        while (i < word.length()){
            if (cur.search(word.charAt(i)) == null){
                TrieNode tmp = new TrieNode(word.charAt(i));
                cur.children.add(tmp);
                cur = tmp;
            }else{
                TrieNode tmp = cur.search(word.charAt(i));
                cur = tmp;
            }
            i++;
        }
        cur.end = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode cur = root;
        int i = 0;
        while (i < word.length()){
        	cur = cur.search(word.charAt(i));
        	if (cur == null)	return false;
        	i++;
        }
        return cur.end;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
    	TrieNode cur = root;
        int i = 0;
        while (i < prefix.length()){
        	cur = cur.search(prefix.charAt(i));
        	if (cur == null)	return false;
        	i++;
        }
        return !cur.children.isEmpty();
    }
}
