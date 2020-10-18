package com.pepcoding.basicsofprogramming.stringstringbuilderarraylist;

import java.util.Scanner;

public class StringCompression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(firstCompression(s));
		System.out.println(secondCompression(s));
	}
	
	public static String firstCompression(String s) {
		String result = String.valueOf(s.charAt(0));
		for(int i=1; i<s.length(); i++)
		{
			if(s.charAt(i-1) != s.charAt(i))
			{
				result = result.concat(String.valueOf(s.charAt(i)));
			}
		}
		return result;
	}
	
	public static String secondCompression(String s) {
		int count=0;
		String result = "";
		for(int i=0; i<s.length(); i++)
		{
			//System.out.println("i char = "+s.charAt(i));
			for(int j=i; j<s.length(); j++)
			{
				if(s.charAt(i) == s.charAt(j))
					count = count+1;
				else
					break;
			}
			
			if(count > 1)
			{
				result = result.concat(String.valueOf(s.charAt(i)));
				result = result.concat(String.valueOf(count));
			}
			
			else {
				result = result.concat(String.valueOf(s.charAt(i)));
			}
			
			i=i+count-1;
			count=0;
		}
		
		return result;
	}
}
