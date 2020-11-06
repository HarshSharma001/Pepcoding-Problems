package com.pepcoding.recursionandbacktracking.recursioninarrays;

import java.io.*;
import java.util.*;

public class DisplayArrayInReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i=0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }
        displayArrayInReverse(array, n-1);
    }

    private static void displayArrayInReverse(int[] array, int i) {
        if(i==-1)
        {
            return;
        }
        System.out.println(array[i]);
        displayArrayInReverse(array, i-1);
    }

}
