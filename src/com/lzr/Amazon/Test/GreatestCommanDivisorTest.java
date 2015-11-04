package com.lzr.Amazon.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lzr.Amazon.GreatestCommanDivisor;

import org.junit.Assert;

public class GreatestCommanDivisorTest {

	@Test
	public void testGCD() {
		Assert.assertEquals(2, GreatestCommanDivisor.GCD(2, 4));
		Assert.assertEquals(12, GreatestCommanDivisor.GCD(12, 12));
		Assert.assertEquals(12, GreatestCommanDivisor.GCD(36, 24));
	}

}
