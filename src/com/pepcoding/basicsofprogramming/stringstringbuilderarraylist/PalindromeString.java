package com.pepcoding.basicsofprogramming.stringstringbuilderarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeString 	{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char array[] = s.toCharArray();
		List<String> subStringsList = findAllSubstrings(array);
		
		for(String subString : subStringsList)
		{
			Stack<Character> stack = new Stack<>();
			int length = subString.length()/2;
			
			if(subString.length()%2==0)
			{
				for(int i=0; i<length; i++)
				{
					stack.push(subString.charAt(i));
				}
			}
			else
			{
				for(int i=0; i<=length; i++)
				{
					stack.push(subString.charAt(i));
				}
			}

			
			
			for(int i=length; i<subString.length(); i++)
			{
				if(stack.peek()==subString.charAt(i))
				{
					stack.pop();
				}
			}
			
			if(stack.isEmpty())
			{
				System.out.println(subString);
			}
		}
		
	}
	
	public static List<String> findAllSubstrings(char array[]) {
		List<String> substringList = new ArrayList<>();
		String subString="";
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=i; j<array.length; j++)
			{
				subString = subString.concat(String.valueOf(array[j]));
				substringList.add(subString);
			}
			subString="";
		}
		
		return substringList;
	}
	
}
