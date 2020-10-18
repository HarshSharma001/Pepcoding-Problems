package com.pepcoding.recursionandbacktracking.introductiontorecusrion;

import java.io.*;
import java.util.*;

public class PrintIncreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }

    static int i=1;

    public static void printDecreasing(int n){
        System.out.println(i);
        if(i < n)
        {
            i=i+1;
            printDecreasing(n);
        }

    }

}
