package com.stringcalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.stringCalculator.Calculator;

public class CalculatorTest {

	@Test
	public void  emptyString() throws Exception
	{
		assertEquals(0,Calculator.add(""));
	}
	@Test
	public void  numberString() throws Exception
	{assertEquals(1,Calculator.add("1"));
	}

	@Test
	public void  twoNumberString() throws Exception
	{assertEquals(3,Calculator.add("1,2"));
	}

@Test
public void  multipleNumberString() throws Exception
{assertEquals(10,Calculator.add("1,2,3,4"));
}
@Test
public void  shouldtakeNewlineAsValidDelimiter() throws Exception
{assertEquals(6,Calculator.add("1,2\n3"));
}
@Test
public void negativeReturnException() throws Exception
{
		Calculator.add("-1,-2,3");
		}
@Test
public void numbersBiggerThan1000() throws Exception
{
	assertEquals(30,Calculator.add("10,20,1001"));
}
}