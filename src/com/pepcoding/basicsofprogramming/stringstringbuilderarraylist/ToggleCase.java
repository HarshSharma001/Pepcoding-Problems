package com.pepcoding.basicsofprogramming.stringstringbuilderarraylist;

import java.util.Scanner;

public class ToggleCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result="";
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
				result = result.concat(String.valueOf(s.charAt(i)).toLowerCase());
			else if(Character.isLowerCase(s.charAt(i)))
				result = result.concat(String.valueOf(s.charAt(i)).toUpperCase());
		}
		
		System.out.println(result);
	}
}
