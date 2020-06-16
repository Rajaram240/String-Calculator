package com.stringCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
	private final static String delimeter =",|\n";
	
	
public static int add(String num) throws Exception
{if(num.isEmpty())
{
	return 0;
}else if(num.contains(","))
{
	String[] s1=num.split(delimeter);
	int results=0;
	//for negative inputs
	for(String s11:s1)
		{
		if(num.contains(","));
	
	else if(StringtoInt(s11)<0)
		{
			throw new Exception ("Negative input!");
		}
	}
	for(String s11: s1)
	{
		if(StringtoInt(s11) > 1000)
			continue;
			
	results+=StringtoInt(s11);
	}	
	return results;
}
else {
	return StringtoInt(num);
}
}
private static int StringtoInt(String input)
{
	return Integer.parseInt(input);
}
}
