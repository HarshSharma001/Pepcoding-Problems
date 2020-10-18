package com.pepcoding.basicsofprogramming.functionsandarrays;

import java.util.*;
class SumOfTwoArrays{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int array1[] = new int[n1];
		for(int i=0; i<n1; i++)
		{
			array1[i] = sc.nextInt();
		}

		int n2 = sc.nextInt();
		int array2[] = new int[n2];
		for(int i=0; i<n2; i++)
		{
			array2[i] = sc.nextInt();
		}

		if(n1>n2 || n1==n2)
		{
			printSumOfTwoArrays(array1, array2);
		}

		else if(n2>n1)
		{
			printSumOfTwoArrays(array2, array1);
		}

	}


	public static void printSumOfTwoArrays(int array1[], int array2[]){
		int size1 = array1.length-1;
		int size2 = array2.length-1;
		int index=size2, carry=0;
		
		String answer="";

		for(int i=size1; i>=0; i--)
		{
			if(index>=0)
			{
				int sum = array1[i]+array2[index]+carry;
				String s = String.valueOf(sum);

				if(s.length() > 1)
				{
					carry = Integer.parseInt(s.substring(0,1));
					sum = Integer.parseInt(s.substring(1,2));
				}

				else if(s.length()==1)
				{
					carry=0;
				}

				//System.out.print(sum);
				answer = answer.concat(String.valueOf(sum));
				index = index-1;
			}

			else if(i>=0 && index<0)
			{
				int sum = array1[i]+carry;
				String s = String.valueOf(sum);

				if(s.length() > 1)
				{
					carry = Integer.parseInt(s.substring(0,1));
					sum = Integer.parseInt(s.substring(1,2));
				}

				else if(s.length()==1)
				{
					carry=0;
				}

//				System.out.print(sum);
				answer = answer.concat(String.valueOf(sum));
			}
		}

		if(carry>0)
		{
			String newAnswer = String.valueOf(carry);
			char array[] = answer.toCharArray();
			for(int i=array.length-1; i>=0; i--)
			{
				newAnswer = newAnswer.concat(String.valueOf(array[i]));
			}
			
			array = newAnswer.toCharArray();
            
            for(char c: array)
            {
    			System.out.println(c);                
            }

		}

		else
		{
			String newAnswer="";
			char array[] = answer.toCharArray();
			for(int i=array.length-1; i>=0; i--)
			{
				newAnswer = newAnswer.concat(String.valueOf(array[i]));
			}
			
			array = newAnswer.toCharArray();
            
            for(char c: array)
            {
    			System.out.println(c);                
            }	
		}
	}
}