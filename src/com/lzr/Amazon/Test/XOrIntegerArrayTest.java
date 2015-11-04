package com.lzr.Amazon.Test;

import org.junit.Test;
import com.lzr.Amazon.XOrIntegerArray;
import org.junit.Assert;

public class XOrIntegerArrayTest {

	@Test
	public void ShouldReturnNullOnNullInput() {
		XOrIntegerArray test = new XOrIntegerArray();
		Assert.assertNull(test.reverseOneAndZero(null, 10));
	}
	
	@Test
	public void ShouldReturnEmptyOnEmptyInput() {
		XOrIntegerArray test = new XOrIntegerArray();
		int[] input = new int[0], output = test.reverseOneAndZero(input, 1);
		Assert.assertEquals(0, output.length);
	}
	
	@Test
	public void ShouldReturnRightAnswer() {
		XOrIntegerArray test = new XOrIntegerArray();
		int[] input = new int[]{0,0,1,1,1,0,0,1}, output = test.reverseOneAndZero(input, 1);
		Assert.assertNotNull(output);
		Assert.assertArrayEquals(new int[]{0,1,1,0,1,1,1,0}, output);
	}

}
