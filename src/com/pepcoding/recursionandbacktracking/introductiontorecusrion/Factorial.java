package com.pepcoding.recursionandbacktracking.introductiontorecusrion;

import java.io.*;
import java.util.*;

public class Factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    static int result = 1;
    public static int factorial(int n){
        result = result*n;
        if(n>1)
        {
            factorial(n-1);
        }
        return result;
    }

}
