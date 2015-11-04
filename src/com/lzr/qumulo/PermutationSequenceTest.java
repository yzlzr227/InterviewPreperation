package com.lzr.qumulo;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class PermutationSequenceTest {

	@Test
	public void testGetPermutation() {
		assertEquals("213", PermutationSequence.getPermutation(3, 3));
		assertEquals("4231", PermutationSequence.getPermutation(4,22));
	}

}
