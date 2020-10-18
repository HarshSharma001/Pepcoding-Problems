package com.pepcoding.recursionandbacktracking.introductiontorecusrion;

import java.io.*;
import java.util.*;

public class PrintDecreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        System.out.println(n);
        if(n>1)
        {
            printDecreasing(n-1);
        }

    }

}
