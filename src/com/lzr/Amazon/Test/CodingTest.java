package com.lzr.Amazon.Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.lzr.Amazon.Coding;

public class CodingTest {

	@Test
	public void shouldResurnZeroOnEmptyString(){
		Coding coding  = new Coding();
		Assert.assertEquals(coding.longestPalindorm2(""), 0);
	}
	
	@Test
	public void shouldResurnOneOnStringWithSingleCharacter(){
		Coding coding  = new Coding();
		Assert.assertEquals(coding.longestPalindorm2("a"), 1);
	}
	
	@Test
	public void shouldResurnCorrespondNumber(){
		Coding coding  = new Coding();
		Assert.assertEquals(2, coding.longestPalindorm2("aa"));
		Assert.assertEquals(3,coding.longestPalindorm2("aabbb"));
	}

	@Test
	public void shouldReturenZeronOnEmptyList(){
		Coding coding = new Coding();
		Assert.assertEquals(0, coding.twoSum(new int[7], 2));
		Assert.assertEquals(0, coding.twoSum(null, 2));
	}

	@Test
	public void shouldReturnCorrespondAnswer(){
		Coding coding = new Coding();
		Assert.assertEquals(1, coding.twoSum(new int[]{1,2,3}, 3));
		Assert.assertEquals(2, coding.twoSum(new int[]{2,4,6,8}, 10));
	}

	@Test
	public void shouldReturnTrueOnEmptyStringOrNull(){
		Coding coding = new Coding();
		Assert.assertTrue(coding.isValidParenthes(""));
		Assert.assertTrue(coding.isValidParenthes(null));
	}
	
	@Test
	public void shouldReturnTrueOnValidInput(){
		Coding coding = new Coding();
		Assert.assertTrue(coding.isValidParenthes("{}[]()"));
		Assert.assertTrue(coding.isValidParenthes("{[()]}"));
		Assert.assertTrue(coding.isValidParenthes("{()}[]"));
	}
	
	@Test
	public void shouldReturnFalseOnInvalidInput(){
		Coding coding = new Coding();
		Assert.assertFalse(coding.isValidParenthes("{[}]()"));
		Assert.assertFalse(coding.isValidParenthes("{[(]}"));
		Assert.assertFalse(coding.isValidParenthes("{(}[)]"));
	}
}
