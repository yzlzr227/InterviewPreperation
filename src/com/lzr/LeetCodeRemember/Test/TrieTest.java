package com.lzr.LeetCodeRemember.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lzr.LeetCodeRemember.Trie;

public class TrieTest {

	@Test
	public void testTrie() {
		Trie trie = new Trie();
		trie.insert("hello");
		assertTrue(trie.search("hello"));
		assertFalse(trie.search("helloa"));
//		trie.insert("test2");
		assertTrue(trie.search("hello"));
		assertTrue(trie.startsWith("hell"));
		assertFalse(trie.startsWith("helloa"));
		assertFalse(trie.startsWith("hello"));
	}
}
