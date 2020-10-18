package com.pepcoding.recursionandbacktracking.introductiontorecusrion;

import java.io.*;
import java.util.*;

public class PrintIncreasingDecreasing {
    private static int value;
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        value = n;
        printIncreasingDecreasing(n);
    }

    static boolean status = false;
    public static void printIncreasingDecreasing(int n){
        System.out.println(n);

        if(n==1)
        {
            System.out.println(n);
            status = true;
        }

        if(n > 1 && status==false)
        {
            printIncreasingDecreasing(n-1);
        }

        else if(status == true && n<value)
        {
            printIncreasingDecreasing(n+1);
        }
    }

}
