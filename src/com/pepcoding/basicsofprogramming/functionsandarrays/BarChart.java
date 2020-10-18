package com.pepcoding.basicsofprogramming.functionsandarrays;/*
	n = 5;
	array[] = {3,1,0,7,5};
*/
import java.util.*;
class BarChart{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0; i<n; i++){
			array[i] = sc.nextInt();
		}

		int max = findMaxElement(array);
		printChart(array, max);
	}

	public static int findMaxElement(int array[]){
		int maxElement=0;
		for(int i: array)
		{
			if(i>maxElement)
				maxElement=i;
		}
		return maxElement;
	}


	public static void printChart(int array[], int n){
		int index=0;
		for(int i=n; i>=1; i--)
		{
			for(int j=0; j<array.length; j++)
			{
				if(i == array[j])
				{
					if(j < array.length-1)
					{
						System.out.print("*\t");						
					}
					else
					{
						System.out.print("*");
					}

					array[j] = array[j]-1;
				}

				else
				{
					System.out.print("\t");
				}

			}

			System.out.println("");	
		}
	}
}