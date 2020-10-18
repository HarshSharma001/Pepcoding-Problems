package com.pepcoding.recursionandbacktracking.recursioninarrays;

import java.io.*;
import java.util.*;

public class DisplayArrayInReverse {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x,n));
    }

    private static int result=1;
    public static int power(int x, int n){
        if(n==0)
        {
            result = 1;
        }
        else
        {
            result=result*x;
            if(n>1)
            {
                power(x,n-1);
            }
        }
        return result;
    }

}
