package com.pepcoding.basicsofprogramming.stringstringbuilderarraylist;

import java.util.Scanner;

public class StringWithDifferenceOfEveryTwoConsecutiveCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result="";
		for(int i=1; i<s.length(); i++)
		{
			int diff = s.charAt(i) - s.charAt(i-1);
			result = result.concat(String.valueOf(s.charAt(i-1)));
			result = result.concat(String.valueOf(diff));
		}
		
		result = result.concat(String.valueOf(s.charAt(s.length()-1)));
		System.out.println(result);
	}

}
