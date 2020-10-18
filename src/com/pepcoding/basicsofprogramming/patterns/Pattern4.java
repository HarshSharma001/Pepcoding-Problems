package com.pepcoding.basicsofprogramming.patterns;

import java.util.*;

public class Pattern4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++)
        {
        int counter=i;
        while(counter>0)
        {
        System.out.print("	");
        counter = counter-1;
        }
       
        for(int j=i; j<n; j++)
        {
        if(j < n-1)
        System.out.print("*	");
        else if(j == n-1)
        System.out.print("*");
        }
       
        if(i < n-1)
        {
        System.out.println("");
        }
        }
    }
}