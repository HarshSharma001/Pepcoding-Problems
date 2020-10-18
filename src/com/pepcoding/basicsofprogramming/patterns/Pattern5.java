package com.pepcoding.basicsofprogramming.patterns;

import java.util.*;

public class Pattern5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // write ur code here

        double result = Double.valueOf(String.valueOf(n))/2;

        result = result+0.5;

        int midPoint = (int) result;
    
        int counter = 1;
        boolean status = false;
        
        for(int i=1; i<=n; i++)
        {
        	for(int j=1; j<midPoint; j++)
        	{
        		System.out.print("	");
        	}
        
        	
        	for(int k=1; k<=counter; k++)
        	{
        		if(k < n)
        		{
        			System.out.print("*	");
        		}
        
        		else if(k == n)
        		{
        			System.out.print("*");
        		}
        	}
        
                System.out.println("");
        
        	if(counter < n && status == false)
        	{
        		counter = counter+2;
        		midPoint = midPoint-1;
                        
                        if(counter == n)
                        {
                            status=true;
                        }
        	}
        
        	else
        	{
        		counter = counter-2;
        		midPoint = midPoint+1;
        	}
                
            }
    }
}