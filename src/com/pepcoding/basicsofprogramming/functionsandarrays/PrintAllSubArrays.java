package com.pepcoding.basicsofprogramming.functionsandarrays;

import java.util.Scanner;
class PrintAllSubArrays{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int array[] = new int[n];

		for(int i=0; i<n; i++)
		{
			array[i] = sc.nextInt();
		}

		printSubArrays(array, n);
	}


	public static void printSubArrays(int array[], int n){
		String outcome="";
		for(int i=0; i<n; i++)
		{
			for(int j=i; j<n; j++)
			{
				if(j < n-1)
				{
					outcome = outcome.concat(String.valueOf(array[j]));
					outcome = outcome.concat("\t");
				}

				else
				{
					outcome = outcome.concat(String.valueOf(array[j]));					
				}

				System.out.println(outcome);
			}

			outcome = "";
		}
	}
}